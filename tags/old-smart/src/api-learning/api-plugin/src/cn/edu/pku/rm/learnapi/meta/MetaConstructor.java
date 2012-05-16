package cn.edu.pku.rm.learnapi.meta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.JavaModelException;

import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.PlaceType;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;
import cn.edu.pku.sei.ra.dt.TransitionType;

public class MetaConstructor {
	
	Map<EClass,Transition> classTrace=new HashMap<EClass,Transition>();
	Map<Transition,EClass> transTrace=new HashMap<Transition,EClass>();
	
	EcoreFactory factory=EcoreFactory.eINSTANCE;
	EPackage pack=null; 
	
	public MetaConstructor(String packName,String packURI){
		pack = factory.createEPackage();
		pack.setName(packName);
		pack.setNsURI(packURI);
		pack.setNsPrefix(packName);
	}
	
	public String calcClassName(Transition trans) throws JavaModelException{
		String res="";
		Place out=trans.getOutput();
		try{
			while(PlaceType.INVISIBLE.equals(out.getType()) && 
					out.getOutputOf().get(0).isInvokechain() &&
					out.getInputOf().get(0).getOutput()!=null)
				out=out.getInputOf().get(0).getOutput();
		}
		catch(NullPointerException e){;}
		if(out==null)
			System.out.println("for debug");
		if(out.getVariable()!=null){
			IJavaElement v=out.getVariable();
			String typeName="";
			if(v instanceof ILocalVariable)
				typeName=((ILocalVariable)v).getTypeSignature();
			else if(v instanceof IField)
				typeName=((IField)v).getTypeSignature();
			int dot=typeName.lastIndexOf("/");
			if(dot>=0 && dot<typeName.length()-1)
				typeName=typeName.substring(dot+1);
			if(typeName.endsWith(";"))
				typeName=typeName.substring(0,typeName.length()-1);
			res+=headUpper(typeName);
			res+=headUpper(v.getElementName());
		}
		//if(trans.getOutput().getName()!=null)
		//	res+=headUpper(trans.getOutput().getName());
		res+=String.valueOf(trans.getId());
		return res;
	}
		
	public String headUpper(String s){
		if(s==null || s.length()==0)
			return s;
		return s.substring(0,1).toUpperCase()+s.substring(1);
	}
	
	public void parse(Repository rep) throws JavaModelException{
		classTrace.clear();
		EClass root=newClass("Root");
		for(Transition trans: rep.getTransition()){
			
			if(!trans.isInvolved() || trans.getOutput()==null)
				continue;
			
			List<List<Place>> currlist=new ArrayList<List<Place>>();
			currlist.add(trans.getInput());
			
			boolean pure=false;
			while(!pure){
				pure=true;
				List<List<Place>> finalnextlist=new ArrayList<List<Place>>();
				for(List<Place> curr:currlist){
					List<List<Place>> nextlist=new ArrayList<List<Place>>();
					nextlist.add(new ArrayList<Place>());
					for(Place pin:curr){						
						List<Transition> froms = pin.getOutputOf();
						if(froms.size()==0)
							for(List<Place> next:nextlist)
								next.add(pin);
						else if(froms.size()==1)
							if((!froms.get(0).isInvolved()) &&	(!froms.get(0).getInput().isEmpty())){
								for(List<Place> next:nextlist)
									next.addAll(froms.get(0).getInput());
								pure=false;
							}
							else{
								for(List<Place> next:nextlist)
									next.add(pin);
							}
						else{
							int fromsize=froms.size();
							int nextsize=nextlist.size();
							
							for(int i=1;i<fromsize;i++)
								for(int j=0;j<nextsize;j++){
									ArrayList<Place> clone=new ArrayList<Place>();
									clone.addAll(nextlist.get(j));
									nextlist.add(clone);
								}
							int i=0;		
							for(Transition from:froms){
								if((!from.isInvolved()) &&	(!from.getInput().isEmpty())){
									for(int j=0;j<nextsize;j++)
										nextlist.get(i+j).addAll(from.getInput());
									pure=false;
								}
								else{
									for(int j=0;j<nextsize;j++)
										nextlist.get(i+j).add(pin);
								}
								i++;
							}
						}
					}
					finalnextlist.addAll(nextlist);
				}
				currlist=finalnextlist;
			}
			int tail=-1;
			for(List<Place> v_inputs:currlist){
				tail++;
				EClass clazz=newClass(calcClassName(trans));
				classTrace.put(clazz,trans);
				transTrace.put(trans, clazz);
				
				if(tail!=0)
					clazz.setName(clazz.getName()+"-"+String.valueOf(tail));
				
				List<String> sigs=new ArrayList<String>();
				sigs.add(trans.getSignature());
				
				boolean foundClass=false;
				
				for(Place cons : v_inputs)
					if(PlaceType.CONSTANT.equals(cons.getType()))
						sigs.add(cons.getName());
				for(Place i: v_inputs){
					if(i.getOutputOf().isEmpty())
						continue;
					if(!i.getOutputOf().get(0).isInvolved())
						continue;
					boolean isShielded=false;
					for(Place j: v_inputs){
						if(shielded(j,i)){
							isShielded=true;
							break;
						}						
					}
					if(isShielded)
						continue;
					EClass preclazz=transTrace.get(i.getOutputOf().get(0));	
					if(preclazz!=null){
						foundClass=true;
						EReference ref=factory.createEReference();
						String sigfinal="";
						for(String sig:sigs)
							sigfinal+=sig;
						ref.setName(sigfinal);
						ref.setEType(clazz);
						preclazz.getEStructuralFeatures().add(ref);	
					}
					
					
				}
					
				if(!foundClass){
					EReference ref=factory.createEReference();
					String sigfinal="";
					for(String sig:sigs)
						sigfinal+=sig;
					ref.setName(sigfinal);
					ref.setEType(clazz);
					root.getEStructuralFeatures().add(ref);
				}
			}	
		}
	}
	
	private boolean shielded(Place near, Place far){
		if(near.getOutputOf().isEmpty()){
			return false;
		}
		List<Place> tmp=near.getOutputOf().get(0).getInput();
		for(Place p:tmp){
			if(p==far)
				return true;
			if(shielded(p,far))
				return true;
		}
		return false;
	}
	
	public EPackage getResult(){
		return pack;
	}
	
	private EClass newClass(String name){
		EClass res=factory.createEClass();
		res.setName(name);
		pack.getEClassifiers().add(res);
		return res;
	}

}
