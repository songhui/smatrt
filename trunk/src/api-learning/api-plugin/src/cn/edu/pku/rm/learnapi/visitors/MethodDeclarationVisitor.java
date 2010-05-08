/**
 * 
 */
package cn.edu.pku.rm.learnapi.visitors;

import java.util.Stack;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TryStatement;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;

import cn.edu.pku.rm.learnapi.SourceSampleUtil;
import cn.edu.pku.rm.learnapi.TraceBuilder;
import cn.edu.pku.sei.ra.dt.DtFactory;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.PlaceType;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;
import cn.edu.pku.sei.ra.dt.TransitionType;

/**
 * @author hubert
 *
 */
public class MethodDeclarationVisitor extends AbstractVisitor {
	
	//TracerB
	
	/**
	 * 
	 */
	public MethodDeclarationVisitor() {
		factory=DtFactory.eINSTANCE;
		repository=factory.createRepository();
	}

	/**
	 * @param visitDocTags
	 */
	public MethodDeclarationVisitor(boolean visitDocTags) {
		super(visitDocTags);
		// TODO Auto-generated constructor stub
	}
	
	public Repository getResult(){
		return repository;
	}
	
	public boolean visit(MethodDeclaration node){
		
		repository.setMethod(node.resolveBinding().getJavaElement());
		
		TraceBuilder tb=new TraceBuilder();
		tb.buildTrace(node);
		int order=1;
		for(Object paraobj:node.parameters()){
			SingleVariableDeclaration para=(SingleVariableDeclaration) paraobj;
			Place place=factory.createPlace();
			place.setVariable(para.resolveBinding().getJavaElement());
			place.setStatementOrMethod(SourceSampleUtil.traceStatementOrMethod(para.getName()));
			place.setName(para.getName().toString());
			place.setType(PlaceType.PARAMETER);	
			place.setParaOrder(order++);
			place.setTypefull(para.getType().resolveBinding().getQualifiedName());
			repository.getPlace().add(place);
			
		}
		
		repository.setTracerBuilder(tb);		
		return true;
	}
	
	public boolean visit(Assignment node){
		Transition tr=factory.createTransition();
		tr.setActivated(false);
		Expression lefthand=node.getLeftHandSide();
		handleLeftName(tr, lefthand);
		
		RightHandSideExpVisitor rightvisitor=new RightHandSideExpVisitor(repository,tr);
		node.getRightHandSide().accept(rightvisitor);
		
		repository.getTransition().add(rightvisitor.getTransition());
		
		return false;
	}
	
	public boolean visit(EnhancedForStatement node){
		Transition tr=factory.createTransition();
		tr.setActivated(false);
		tr.setType(TransitionType.ENUMERATE);
		handleLeftName(tr,node.getParameter().getName());
		
		RightHandSideExpVisitor rightvisitor=new RightHandSideExpVisitor(repository,tr);
		node.getExpression().accept(rightvisitor);
		repository.getTransition().add(rightvisitor.getTransition());
		return true;
	}
	
	public boolean visit(ExpressionStatement node){
		Transition tr=factory.createTransition();
		tr.setActivated(false);
		
		RightHandSideExpVisitor rightvisitor=new RightHandSideExpVisitor(repository,tr);
		
		Expression expr=node.getExpression();
		if(expr instanceof Assignment){
			Assignment assign=(Assignment)expr;
			Expression lefthand=assign.getLeftHandSide();
			handleLeftName(tr, lefthand);
			assign.getRightHandSide().accept(rightvisitor);
		}
		else
			expr.accept(rightvisitor);
		
		repository.getTransition().add(rightvisitor.getTransition());
		return false;
	}
	
	public boolean visit(ReturnStatement node){
		Expression right=node.getExpression();
		if(right==null)
			return false;
		if(right instanceof NullLiteral)
			return false;
		Transition tr=factory.createTransition();
		tr.setActivated(true);
		
		Place place=factory.createPlace();
		place.setType(PlaceType.METHOD_END);
		tr.setOutput(place);
		tr.setName("Return");
		place.setName("MethodEnd");	
		repository.getPlace().add(place);
		repository.getTransition().add(tr);
		
		RightHandSideExpVisitor rightvisitor=new RightHandSideExpVisitor(repository,tr);
		right.accept(rightvisitor);
		
		return false;
	}
	
	public boolean visit(VariableDeclarationFragment node){
		if(node.getInitializer()==null)
			return false;
		
		Transition tr=factory.createTransition();
		tr.setActivated(false);
		
		Name variable=node.getName();
		handleLeftName(tr,variable);
		
		RightHandSideExpVisitor rightvisitor=new RightHandSideExpVisitor(repository,tr);
		
		node.getInitializer().accept(rightvisitor);
		
		tr=rightvisitor.getTransition();
		repository.getTransition().add(rightvisitor.getTransition());		
		
		return false;
	}
	
	public boolean visit(TryStatement node){
		node.getBody().accept(this);
		return false;
	}

	private void handleLeftName(Transition tr, Expression lefthand) {
		if(lefthand instanceof Name){
			Name v=(Name)lefthand;
			IJavaElement je=v.resolveBinding().getJavaElement();
			if(je instanceof ILocalVariable){
				Place place=factory.createPlace();
				place.setVariable(je);
				ASTNode stat=SourceSampleUtil.traceStatementOrMethod(v);
				place.setStatementOrMethod(stat);
				place.setType(PlaceType.LOCAL_VARIABLE);
				place.setName(je.getElementName());
				tr.setOutput(place);
				repository.getPlace().add(place);
			}
		}
	}
		
}
