package cn.edu.pku.sei.extocl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.OCLExpression;


public class ExtOCL {
	OCL ocl=OCL.newInstance();
	OCL.Helper helper=ocl.createOCLHelper();
	String situation="";
	String target="";
	String attribute="";
	String value="";
	String action="";
	boolean isAssign=true;
	
	public ExtOCL(){
		
	}
	
	public ExtOCL(String sentence){
		int ion=sentence.indexOf(" on ");
		int ido=sentence.indexOf(" do ");
		situation=sentence.substring(ion+4,ido).trim();
		action=sentence.substring(ido+4);
		int iassign=action.indexOf("<-");
		if(iassign==0){
			isAssign=false;
			return;
		}
		String left=action.substring(0,iassign);
		int dot=left.lastIndexOf(".");
		target=left.substring(0,dot);
		attribute=left.substring(dot+1).trim();
		value=action.substring(iassign+2).trim();
	}
	
	public void execute(EObject obj){
		try{
			Boolean guard=(Boolean)evaluate(obj,situation);
			if(!guard.booleanValue())
				return;
			if(!isAssign){
				evaluate(obj,action);
				return;
			}
			EObject tgt=(EObject)evaluate(obj,target);
			Object v=evaluate(obj,value);
			tgt.eSet(tgt.eClass().getEStructuralFeature(attribute), v);
			return;
		}
		catch(Exception e){
			e.printStackTrace();
			//throw new ExtOCLException(e);
		}
		
	}
	
	public Object evaluate(EObject obj,String oclText) throws ParserException{
		helper.setContext(obj.eClass());
		OCLExpression expr=helper.createQuery(oclText);
		OCL.Query query=ocl.createQuery(expr);
		return query.evaluate(obj);
	}
	
	public static class ExtOCLException extends RuntimeException{
		public ExtOCLException(String s){
			super(s);
		}
		public ExtOCLException(Exception e){
			super(e);
		}
	}
	
	
	
	
}
