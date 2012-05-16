/**
 * 
 */
package cn.edu.pku.rm.learnapi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.core.SourceTypeElementInfo;

import cn.edu.pku.sei.ra.dt.DtFactory;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;
import cn.edu.pku.sei.ra.dt.TransitionType;

/**
 * @author hubert
 *
 */
public class Combinator {
	
	List<Repository> origin;
	Repository entry;
	
	
	private class Candidate{
		Repository master;
		Repository slave;
		Transition trans;
	}
	
	public Repository combine() throws JavaModelException{
		int i=5;
		while(true){
			i--;
			List<Candidate> candidates=new ArrayList<Candidate>();
			if(entry==null)
				entry=null;
			for(Transition trans:entry.getTransition()){
				IJavaElement je=trans.getJavaElement();
				if(je==null || !(je instanceof IMethod))
					continue;
				for(Repository found:origin){
					if(found==entry)
						continue;
					if(je.equals(found.getMethod())){
						Candidate cd=new Candidate();
						cd.master=entry;
						cd.slave=found;
						cd.trans=trans;
						candidates.add(cd);
					}
				}
			}
			if(candidates.size()==0 || i==0)
				return this.entry;
			for(Candidate cd:candidates){
				replaceTransition(cd.trans, cd.master, cd.slave);
			}
		}
	}
	
	public Combinator(List<Repository> origin, String entryName) throws JavaModelException{
		this.origin=origin;
		for(Repository rep:origin){
			String temp=rep.getMethod().getElementName();
			if(temp.endsWith(entryName))
				entry=rep;
		}
		
	}

	/**
	 * @throws JavaModelException 
	 * 
	 */
	public Combinator(List<Repository> origin, Repository entry) throws JavaModelException {
		this.origin=origin;
		this.entry=entry;
		
		
	}
	
	

	
	/***
	 * TODO be careful when there are multiple returns
	 * @param trans
	 * @param master
	 * @param slave
	 * @throws JavaModelException 
	 */
	private void replaceTransition(Transition trans, Repository master, Repository orislave) throws JavaModelException{
		List<Place> methodEnds=new ArrayList<Place>();
		Repository slave=(Repository)EcoreUtil.copy(orislave);
		
		if(trans.getSignature().equals("addProperties"))
			System.out.println("for debug");
		
		int start=0;
		if(((IMethod)slave.getMethod()).getParameterNames().length<trans.getInput().size())
			start=1;
		
		for(Place para:slave.getPlace()){
			if(para.getParaOrder()==0)
				continue;
			Transition intertrans=DtFactory.eINSTANCE.createTransition();
			if(start+para.getParaOrder()-1 >= trans.getInput().size()){
				
				System.out.println("for debug");
				continue;
			}
			//String typesig=para.getTypefull();
			//if(SourceSampleUtil.isForAPI(typesig)){
				//intertrans.setSignature(typesig);
				//intertrans.setInvolved(true);
			//}
			intertrans.getInput().add(trans.getInput().get(start+para.getParaOrder()-1));
			intertrans.setType(TransitionType.INTERMEDIATE);
			intertrans.setOutput(para);
			master.getTransition().add(intertrans);
			para.setParaOrder(0);
		}
		trans.getInput().clear();
		for(Place place:slave.getPlace())
			if("MethodEnd".equals(place.getName())){
				Transition intertrans=DtFactory.eINSTANCE.createTransition();
				intertrans.setType(TransitionType.INTERMEDIATE);
				place.setName("inner return");
				intertrans.getInput().add(place);
				intertrans.setOutput(trans.getOutput());
				master.getTransition().add(intertrans);
			}
		trans.getInput().clear();
		trans.setOutput(null);
		
		master.getPlace().addAll(slave.getPlace());
		int i=master.getTransition().indexOf(trans);
		master.getTransition().addAll(i,slave.getTransition());
		master.getTransition().remove(trans);
		
	}
}
