/**
 * 
 */
package cn.edu.pku.rm.learnapi.visitors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ArrayAccess;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.CharacterLiteral;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NullLiteral;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.QualifiedName;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeLiteral;

import cn.edu.pku.rm.learnapi.SourceSampleUtil;
import cn.edu.pku.rm.learnapi.TraceBuilder;
import cn.edu.pku.rm.learnapi.Tracer;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.PlaceType;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;
import cn.edu.pku.sei.ra.dt.TransitionType;

/**
 * Expect Expressions
 * 
 * @author hubert
 * 
 */
public class RightHandSideExpVisitor extends AbstractVisitor {
	
	private Transition trans=null;

	/**
	 * 
	 */
	public RightHandSideExpVisitor(Repository repository, Transition transition) {
		super(repository);
		this.trans=transition;		
	}

	/**
	 * @param visitDocTags
	 */
	public RightHandSideExpVisitor(boolean visitDocTags) {
		super(visitDocTags);
		// TODO Auto-generated constructor stub
	}
	
	public boolean visit(StringLiteral node){
		handleConstant(node,trans);
		return false;
	}
	
	public boolean visit(SimpleName node){
		addInput(node,trans);
		return false;
	}
	
	public boolean visit(QualifiedName node){
		addInput(node,trans);
		return false;
	}
	
	public boolean visit(CastExpression node){
		Expression expr=node.getExpression();
		expr.accept(this);
		return false;
	}
	
	public boolean visit(ClassInstanceCreation node){
		
		handleClassInstanceCreation(node,this.trans);
		
		return false;
		
	}
	
	public boolean visit(MethodInvocation node){
		
		handleMethodInvocation(node,this.trans);		
		return false;
		
	}
	
	public void handleExpression(Expression expr, Transition trans, boolean invocationChain){
		if(expr instanceof Name){
			addInput((Name)expr,trans);
			return;
		}
		
		if(expr instanceof MethodInvocation){
			Place place=factory.createPlace();
			place.setType(PlaceType.INVISIBLE);
			IMethodBinding mb=((MethodInvocation)expr).resolveMethodBinding();
			if(mb==null)
				mb=null;
			place.setName(mb.getReturnType().getName());
			trans.getInput().add(place);
			repository.getPlace().add(place);
			
			Transition newTrans=factory.createTransition();
			newTrans.setOutput(place);
			newTrans.setInvokechain(invocationChain);
			handleMethodInvocation((MethodInvocation)expr, newTrans); 
			repository.getTransition().add(newTrans);
			
		}
		else if(expr instanceof ClassInstanceCreation){
			Place place=factory.createPlace();
			place.setType(PlaceType.INVISIBLE);
			if(((ClassInstanceCreation)expr).resolveTypeBinding()==null)
				System.out.println("for debug");
			place.setName(((ClassInstanceCreation)expr).resolveTypeBinding().getName());
			trans.getInput().add(place);
			repository.getPlace().add(place);
			
			Transition newTrans=factory.createTransition();
			newTrans.setOutput(place);
			newTrans.setInvokechain(invocationChain);
			handleClassInstanceCreation((ClassInstanceCreation)expr, newTrans);
			repository.getTransition().add(newTrans);			
			
		}
		else if(expr instanceof ArrayAccess){
			handleExpression(((ArrayAccess)expr).getArray(),trans,invocationChain);
		}
		else{
			handleConstant(expr,trans);
		}
	}

	private void handleArguments(List arguments, Transition trans) {
		for(Object obj:arguments){
			handleExpression((Expression)obj,trans,false);
		}
	}

	private void addInput(Name name,Transition trans) {
		if(name instanceof QualifiedName){
			Transition intertrans=factory.createTransition();
			ITypeBinding tb=((QualifiedName) name).getQualifier().resolveTypeBinding();
			
			
			if(!(((QualifiedName) name).getQualifier().resolveBinding() instanceof ITypeBinding))
				intertrans.setInvolved(SourceSampleUtil.isForAPI(tb.getQualifiedName()));;
			
			intertrans.setSignature(((QualifiedName)name).getName().toString());
			Place newout=factory.createPlace();
			newout.setType(PlaceType.INVISIBLE);
			trans.getInput().add(newout);
			intertrans.setOutput(newout);
			addInput(((QualifiedName) name).getQualifier(),intertrans);
			repository.getPlace().add(newout);
			repository.getTransition().add(intertrans);
			return;
		}
		IJavaElement je=name.resolveBinding().getJavaElement();
		List<Place> samename=repository.getPlaceByJavaElement(je);
		List<Place> validPlaces=this.getValidPlaces(samename,name);
		if(validPlaces.size()>1){
			Place newout=factory.createPlace();
			newout.setStatementOrMethod(SourceSampleUtil.traceStatementOrMethod(name));
			for(Place place:validPlaces){
				Transition intertrans=factory.createTransition();
				intertrans.setType(TransitionType.INTERMEDIATE);
				intertrans.setInvolved(false);
				intertrans.getInput().add(place);
				intertrans.setOutput(newout);
				repository.getTransition().add(intertrans);
			}
			trans.getInput().add(newout);
			repository.getPlace().add(newout);
		}
		else if(validPlaces.size()==1)
			trans.getInput().add(validPlaces.get(0));
		else if(validPlaces.size()==0){
			//TODO: temporary solution, need to deal with field
			Place place=factory.createPlace();
			place.setName("nowhere input");
			trans.getInput().add(place);
			repository.getPlace().add(place);
		}
			
	}
	

	
	public void handleConstant(Expression node,Transition trans){
		String name=null;
		if(node instanceof NullLiteral){
			name="null";
		}
		else if(node instanceof StringLiteral){
			name=((StringLiteral)node).getLiteralValue();
		}
		else if(node instanceof NumberLiteral){
			name=((NumberLiteral)node).getToken();		
		}
		else if(node instanceof CharacterLiteral){
			name=((CharacterLiteral)node).getEscapedValue();
		}
		else if(node instanceof BooleanLiteral){
			name=((BooleanLiteral)node).toString();
		}
		if(name!=null){
			Place place=factory.createPlace();
			place.setName(name);
			place.getInputOf().add(trans);
			place.setType(PlaceType.CONSTANT);
			repository.getPlace().add(place);
		}
	}
	
	public void handleClassInstanceCreation(ClassInstanceCreation node, Transition trans){
		trans.setActivated(true);
		if((node.getType() instanceof SimpleType))
			trans.setSignature(((SimpleType)node.getType()).getName().toString());
		else
			trans.setSignature(node.getType().toString());
		trans.setType(TransitionType.INITIALIZE);		
		ITypeBinding tb=node.getType().resolveBinding();
		trans.setInvolved(SourceSampleUtil.isForAPI(tb.getQualifiedName()));
		
		List arguments=node.arguments();
		
		handleArguments(arguments,trans);
	}
	
	public void handleMethodInvocation(MethodInvocation node, Transition trans){
		
		trans.setActivated(true);
		trans.setSignature(node.getName().toString());
		trans.setType(TransitionType.INSTANCE_CALL);
		trans.setJavaElement(node.resolveMethodBinding().getJavaElement());
		
		
		Expression expr=node.getExpression();  //the caller of an invocation
		if(expr ==null){
			handleArguments(node.arguments(),trans);
			return;
		}
		ITypeBinding tb=expr.resolveTypeBinding();
		trans.setInvolved(SourceSampleUtil.isForAPI(tb.getQualifiedName()));
		while((expr instanceof CastExpression) || (expr instanceof ParenthesizedExpression)){
			if(expr instanceof CastExpression)
				expr=((CastExpression)expr).getExpression();
			if(expr instanceof ParenthesizedExpression)
				expr=((ParenthesizedExpression)expr).getExpression();
		}
		
		if(expr instanceof TypeLiteral){			
			trans.setSignature(
					((TypeLiteral)expr).resolveTypeBinding().getName() +
							trans.getSignature()
					);			
		}
		else{
			handleExpression(expr,trans,true);
		}
		
		handleArguments(node.arguments(),trans);
		
	}
	
	public Transition getTransition(){
		return trans;
	}
	
	
	private List<Place> tempList=new ArrayList<Place>();
	
	private List<Place> getValidPlaces(List<Place> places, Name name){
		if(places.size()==1)
			return places;
		if("mgmt".equals(name.toString()))
			System.out.println("for debug");
		TraceBuilder tb=(TraceBuilder)repository.getTracerBuilder();
		Tracer tr=tb.tracerLib.get(Integer.valueOf(
				SourceSampleUtil.traceStatementOrMethod(name).getStartPosition()));
		if(tr==null)
			return places;
		tempList.clear();
		for(Tracer newTracer:tr.previous){
			recPlaceCheck(places,newTracer);
		}
		return tempList;
	}
	
	

	private void recPlaceCheck(List<Place> places, Tracer tracer){
		boolean found=false;
		for(Place place:places){
			ASTNode stat=place.getStatementOrMethod();
			if(tracer.start==stat.getStartPosition()){
				if(!tempList.contains(place))
					tempList.add(place);
				found=true;
			}			
		}
		if(!found){
			for(Tracer newTracer:tracer.previous)
				recPlaceCheck(places,newTracer);
		}
	}
	
}
