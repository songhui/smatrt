/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Map For Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapForAbstractClassImpl#getClass2eclass <em>Class2eclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureMapForAbstractClassImpl extends FeatureMapImpl implements FeatureMapForAbstractClass {
	/**
	 * The cached value of the '{@link #getClass2eclass() <em>Class2eclass</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass2eclass()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> class2eclass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureMapForAbstractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.FEATURE_MAP_FOR_ABSTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getClass2eclass() {
		if (class2eclass == null) {
			class2eclass = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS);
		}
		return class2eclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS:
				return ((InternalEList<?>)getClass2eclass()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS:
				if (coreType) return getClass2eclass();
				else return getClass2eclass().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS:
				((EStructuralFeature.Setting)getClass2eclass()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS:
				getClass2eclass().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS:
				return class2eclass != null && !class2eclass.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureMapForAbstractClassImpl
