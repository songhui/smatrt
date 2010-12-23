package cn.edu.pku.sei.ra.wrapping.CommonWrapping.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
//import org.eclipse.emf.transaction.impl.TransactionChangeRecorder;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;

public class EObjectResolvingEListForWrapping<E> extends
		EObjectResolvingEList<E> {

	public EObjectResolvingEListForWrapping(Class<?> dataClass,
			InternalEObject owner, int featureID,EClass referenceEClass) {
		super(dataClass, owner, featureID);
		container=(WrappingEObject)owner;
		containFeatureID=featureID;
		this.referenceEClass=referenceEClass;
	}

	
	protected boolean skipRefreshCore=false;
	
	protected WrappingEObject container=null;
	protected int containFeatureID=-1;
	protected EClass referenceEClass=null;

	/**
	 * @param dataClass
	 * @param owner
	 * @param featureID
	 */
	public void refreshWrap(){
		skipRefreshCore=true;

		ArrayList orphanCores=new ArrayList();
		ArrayList<E> orphanWraps=new ArrayList<E>();
		List currentCores=container.listSubCores(containFeatureID);
		for(Iterator<E> it=this.iterator();it.hasNext();){
			WrappingEObject wrap=(WrappingEObject)it.next();
			boolean found=false;
			for(Iterator it2=currentCores.iterator();it2.hasNext();){
				if(wrap.isForCore(it2.next()) || wrap.isNewborn()){
					found=true;
					break;
				}	
			}
			if(!found){
				orphanWraps.add((E)wrap);
			}
		}
		for(Iterator<E> it=orphanWraps.iterator();it.hasNext();){
			this.remove(it.next());
		}
		for(Iterator it=currentCores.iterator();it.hasNext();){
			boolean found=false;
			Object core=it.next();
			for(Iterator it2=this.iterator();it2.hasNext();){
				if(((WrappingEObject)it2.next()).isForCore(core)){
					found=true;
					break;
				}
			}
			if(!found)
				orphanCores.add(core);
		}
		for(Iterator it=orphanCores.iterator();it.hasNext();){
			Object core=it.next();
			WrappingEObject wrap=null;
			wrap=ImagePool.find(core);
			if(wrap!=null){
	/*			try{
					Adapter toremove=null;
					for(Adapter adp:owner.eAdapters()){
						if(adp instanceof TransactionChangeRecorder)
							toremove=adp;
					}
					this.owner.eAdapters().remove(toremove);
				}catch(Exception e){
					;
				}*/
				this.add((E)wrap);
				continue;
			}				
			EClass eClass=null;
			if(referenceEClass.isAbstract()){
				eClass=container.getChildClassMap(core);
			}
			else
				eClass=referenceEClass;
			EObject newObj=eClass.getEPackage().getEFactoryInstance()
				.create(eClass);
			wrap=(WrappingEObject)newObj;
			
			wrap.setCore(core);
			ImagePool.put(wrap);
/*			try{
				Adapter toremove=null;
				for(Adapter adp:owner.eAdapters()){
					if(adp instanceof TransactionChangeRecorder)
						toremove=adp;
				}
				this.owner.eAdapters().remove(toremove);
			}catch(Exception e){
				;
			}
			*/
//			((TransactionChangeRecorder)toremove).pause();
			this.add((E)wrap);
//			((TransactionChangeRecorder)toremove).resume();
//			//this.owner.eAdapters().add(toremove);
		}
		skipRefreshCore=false;
	}
	
	public void didAdd(int index, E newObject){
		if(skipRefreshCore)
			return;
		WrappingEObject newWrapping=(WrappingEObject)newObject;
		newWrapping.setNewborn(true);
		container.addSubCore((WrappingEObject)newObject, featureID);
	}	
	public void didRemove(int index, E newObject){
		if(skipRefreshCore)
			return;
		((WrappingEObject)newObject).setDead(true);
		container.removeSubCore((WrappingEObject)newObject, featureID);
	}	
	public boolean canContainNull(){
		return true;
	}

}
