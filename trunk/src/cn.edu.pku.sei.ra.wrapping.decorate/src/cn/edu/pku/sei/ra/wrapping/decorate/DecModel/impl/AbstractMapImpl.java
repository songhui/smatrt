/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl#getSpecType <em>Spec Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl#getSpecCode <em>Spec Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractMapImpl extends EObjectImpl implements AbstractMap {
	/**
	 * The default value of the '{@link #getSpecType() <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEC_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecType() <em>Spec Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecType()
	 * @generated
	 * @ordered
	 */
	protected String specType = SPEC_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSpecCode() <em>Spec Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecCode()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecCode> specCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.ABSTRACT_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecType() {
		return specType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecType(String newSpecType) {
		String oldSpecType = specType;
		specType = newSpecType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.ABSTRACT_MAP__SPEC_TYPE, oldSpecType, specType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecCode> getSpecCode() {
		if (specCode == null) {
			specCode = new EObjectContainmentEList<SpecCode>(SpecCode.class, this, DecModelPackage.ABSTRACT_MAP__SPEC_CODE);
		}
		return specCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				return ((InternalEList<?>)getSpecCode()).basicRemove(otherEnd, msgs);
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
			case DecModelPackage.ABSTRACT_MAP__SPEC_TYPE:
				return getSpecType();
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				return getSpecCode();
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
			case DecModelPackage.ABSTRACT_MAP__SPEC_TYPE:
				setSpecType((String)newValue);
				return;
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				getSpecCode().clear();
				getSpecCode().addAll((Collection<? extends SpecCode>)newValue);
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
			case DecModelPackage.ABSTRACT_MAP__SPEC_TYPE:
				setSpecType(SPEC_TYPE_EDEFAULT);
				return;
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				getSpecCode().clear();
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
			case DecModelPackage.ABSTRACT_MAP__SPEC_TYPE:
				return SPEC_TYPE_EDEFAULT == null ? specType != null : !SPEC_TYPE_EDEFAULT.equals(specType);
			case DecModelPackage.ABSTRACT_MAP__SPEC_CODE:
				return specCode != null && !specCode.isEmpty();
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
		result.append(" (specType: ");
		result.append(specType);
		result.append(')');
		return result.toString();
	}

} //AbstractMapImpl
