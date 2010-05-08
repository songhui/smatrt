package cn.edu.pku.rm.learnapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.ForStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SwitchCase;
import org.eclipse.jdt.core.dom.SwitchStatement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.WhileStatement;
/***
 * TODO: Do not support SWITCH YET
 * @author hubert
 *
 */
public class TraceBuilder {
	
	public Map<Integer,Tracer> tracerLib=new TreeMap<Integer,Tracer>();
	
	public void buildTrace(MethodDeclaration node){
		Tracer begin=new Tracer();
		begin.name=Tracer.METHOD_BEGIN;
		begin.start=node.getStartPosition();
		add(begin);
		
		handleStatement(node.getBody(),begin);
		
		clearTracerToReturn();
		
	}
	
	private void clearTracerToReturn(){
		for(Iterator<Tracer> it=tracerLib.values().iterator();it.hasNext();){
			Tracer tracer=it.next();
			List<Tracer> toRemove=new ArrayList<Tracer>();
			for(Tracer prev:tracer.previous){
				if(Tracer.METHOD_END.equals(tracer.name))
					toRemove.add(prev);
			}
			tracer.previous.removeAll(toRemove);
		}
	}
	
	public Tracer handleStatement(Statement statement,Tracer begin){
		if(statement == null)
			return begin;
		if(statement instanceof Block){
			Block block=(Block)statement;
			for(Object obj:block.statements()){
				begin=handleStatement((Statement)obj,begin);
			}
			return begin;
		}
		if(statement instanceof IfStatement){
			IfStatement ifs=(IfStatement)statement;
			
			Tracer newBegin=new Tracer(Tracer.BRANCH_BEGIN);
			newBegin.start=ifs.getStartPosition();
			newBegin.statement=ifs;
			newBegin.previous.add(begin);
			add(newBegin);
			
			Tracer endThen=handleStatement(ifs.getThenStatement(),newBegin);			
			Tracer endElse=handleStatement(ifs.getElseStatement(),newBegin);
			
			Tracer newEnd=new Tracer(Tracer.BRANCH_END);
			newEnd.start=ifs.getStartPosition()+ifs.getLength()-1;
			add(newEnd);			
			newEnd.previous.add(endThen);
			newEnd.previous.add(endElse);
			
			return newEnd;			
		}
		if(statement instanceof WhileStatement){
			WhileStatement whiles=(WhileStatement)statement;
			Tracer newBegin=new Tracer(Tracer.BRANCH_BEGIN);
			newBegin.start=whiles.getStartPosition();
			newBegin.statement=whiles;
			newBegin.previous.add(begin);
			add(newBegin);
			
			Tracer newEnd=new Tracer(Tracer.BRANCH_END);
			newEnd.start=whiles.getStartPosition()+whiles.getLength()-1;
			add(newEnd);
			
			Tracer whileEnd=handleStatement(whiles.getBody(),newBegin);
			
			newEnd.previous.add(whileEnd);
			newEnd.previous.add(newBegin);
			
			return newEnd;
		}
		if(statement instanceof ForStatement){
			ForStatement fors=(ForStatement)statement;
			Tracer newBegin=new Tracer(Tracer.BRANCH_BEGIN);
			newBegin.start=fors.getStartPosition();
			newBegin.statement=fors;
			newBegin.previous.add(begin);
			add(newBegin);
			
			Tracer newEnd=new Tracer(Tracer.BRANCH_END);
			newEnd.start=fors.getStartPosition()+fors.getLength()-1;
			add(newEnd);
			
			Tracer whileEnd=handleStatement(fors.getBody(),newBegin);
			
			newEnd.previous.add(whileEnd);
			newEnd.previous.add(newBegin);
			
			return newEnd;
		}
		if(statement instanceof EnhancedForStatement){
			EnhancedForStatement fors=(EnhancedForStatement)statement;
			Tracer newBegin=new Tracer(Tracer.BRANCH_BEGIN);
			newBegin.start=fors.getStartPosition();
			newBegin.statement=fors;
			newBegin.previous.add(begin);
			add(newBegin);
			
			Tracer newEnd=new Tracer(Tracer.BRANCH_END);
			newEnd.start=fors.getStartPosition()+fors.getLength()-1;
			add(newEnd);
			
			Tracer whileEnd=handleStatement(fors.getBody(),newBegin);
			
			newEnd.previous.add(whileEnd);
			newEnd.previous.add(newBegin);
			
			return newEnd;
		}
		if(statement instanceof SwitchStatement){
			SwitchStatement switchs=(SwitchStatement)statement;
			Tracer newBegin=new Tracer(Tracer.BRANCH_BEGIN);
			newBegin.start=switchs.getStartPosition();
			newBegin.statement=switchs;
			newBegin.previous.add(begin);
			add(newBegin);
			
			Tracer newEnd=new Tracer(Tracer.BRANCH_END);
			newEnd.start=switchs.getStartPosition()+switchs.getLength()-1;
			add(newEnd);
			
			begin=newBegin;
			
			for(Object st:switchs.statements()){
				if(st instanceof SwitchCase)
					continue;
				begin=handleStatement((Statement)st,begin);
			}
			
			newEnd.previous.add(begin);
			return newEnd;
		}
		if(statement instanceof TryStatement){
			TryStatement trys=(TryStatement)statement;
			return handleStatement(trys.getBody(),begin);			
		}
		if(true){
			Tracer newBegin=new Tracer();
			if(statement instanceof ReturnStatement)
				newBegin.name=Tracer.METHOD_END;
			newBegin.start=statement.getStartPosition();
			newBegin.name=statement.toString();
			newBegin.statement=statement;
			newBegin.previous.add(begin);
			add(newBegin);
			return newBegin;
		}	
		return begin;
	}
	
	public void add(Tracer tracer){
		tracerLib.put(new Integer(tracer.start), tracer);
	}

}
