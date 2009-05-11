/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ImportClassImpl#getFullClassName <em>Full Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportClassImpl extends EObjectImpl implements ImportClass {
	/**
	 * The cached value of the '{@link #getFullClassName() <em>Full Class Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullClassName()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fullClassName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.IMPORT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFullClassName() {
		if (fullClassName == null) {
			fullClassName = new EDataTypeUniqueEList<String>(String.class, this, DecModelPackage.IMPORT_CLASS__FULL_CLASS_NAME);
		}
		return fullClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecModelPackage.IMPORT_CLASS__FULL_CLASS_NAME:
				return getFullClassName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecModelPackage.IMPORT_CLASS__FULL_CLASS_NAME:
				getFullClassName().clear();
				getFullClassName().addAll((Collection<? extends String>)newValue);
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
			case DecModelPackage.IMPORT_CLASS__FULL_CLASS_NAME:
				getFullClassName().clear();
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
			case DecModelPackage.IMPORT_CLASS__FULL_CLASS_NAME:
				return fullClassName != null && !fullClassName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fullClassName: ");
		result.append(fullClassName);
		result.append(')');
		return result.toString();
	}

} //ImportClassImpl
