package cn.edu.pku.rm.learnapi;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.Statement;

public class Tracer {
	public static final String METHOD_BEGIN="MethodCall";
	public static final String METHOD_END="MethodEnd";
	public static final String BRANCH_BEGIN="BranchBegin";
	public static final String BRANCH_END="BranchEnd";
	
	public String name;
	public List<Tracer> previous=new ArrayList<Tracer>();
	public Statement statement=null;
	public int start;
	
	public Tracer(){
		
	}
	
	public Tracer(String name){
		this.name=name;
	}
	
	public String toString(){
		String prevs="prevs: ";
		for(Tracer prev:previous)
			prevs=prevs+String.valueOf(prev.start)+", ";
		return String.valueOf(start)+": "+(name==null?"":name)+": "+prevs;
	}
}
