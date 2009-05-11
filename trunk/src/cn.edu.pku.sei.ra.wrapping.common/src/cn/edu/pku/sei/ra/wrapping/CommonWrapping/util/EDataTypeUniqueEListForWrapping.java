/**
 * Copyright (c) 2008, Song Hui, Peking University, All rights
 * reserved.
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;

/**
 * 
 */
public class EDataTypeUniqueEListForWrapping<E> extends EDataTypeUniqueEList<E> {
	WrappingEObject container=null;
	/**
	 * @param dataClass
	 * @param owner
	 * @param featureID
	 */
	public EDataTypeUniqueEListForWrapping(Class<?> dataClass,
			InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
		container=(WrappingEObject)owner;
		// TODO Auto-generated constructor stub
	}
	
	public void didAdd(int index, E newObject){
		super.didAdd(index, newObject);
		container.addAttribute(newObject, index, featureID);
	}
	
	public void didRemove(int index, E oldObject){
		super.didRemove(index, oldObject);
		container.removeAttribute(oldObject, index, featureID);
	}

}
