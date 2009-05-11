/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl#getFeatureMap <em>Feature Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassMapImpl extends AbstractMapImpl implements ClassMap {
	/**
	 * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassRef()
	 * @generated
	 * @ordered
	 */
	protected EClass classRef;

	/**
	 * The cached value of the '{@link #getFeatureMap() <em>Feature Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureMap()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMap> featureMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.CLASS_MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassRef() {
		if (classRef != null && classRef.eIsProxy()) {
			InternalEObject oldClassRef = (InternalEObject)classRef;
			classRef = (EClass)eResolveProxy(oldClassRef);
			if (classRef != oldClassRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecModelPackage.CLASS_MAP__CLASS_REF, oldClassRef, classRef));
			}
		}
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetClassRef() {
		return classRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassRef(EClass newClassRef) {
		EClass oldClassRef = classRef;
		classRef = newClassRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.CLASS_MAP__CLASS_REF, oldClassRef, classRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMap> getFeatureMap() {
		if (featureMap == null) {
			featureMap = new EObjectContainmentEList<FeatureMap>(FeatureMap.class, this, DecModelPackage.CLASS_MAP__FEATURE_MAP);
		}
		return featureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecModelPackage.CLASS_MAP__FEATURE_MAP:
				return ((InternalEList<?>)getFeatureMap()).basicRemove(otherEnd, msgs);
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
			case DecModelPackage.CLASS_MAP__CLASS_REF:
				if (resolve) return getClassRef();
				return basicGetClassRef();
			case DecModelPackage.CLASS_MAP__FEATURE_MAP:
				return getFeatureMap();
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
			case DecModelPackage.CLASS_MAP__CLASS_REF:
				setClassRef((EClass)newValue);
				return;
			case DecModelPackage.CLASS_MAP__FEATURE_MAP:
				getFeatureMap().clear();
				getFeatureMap().addAll((Collection<? extends FeatureMap>)newValue);
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
			case DecModelPackage.CLASS_MAP__CLASS_REF:
				setClassRef((EClass)null);
				return;
			case DecModelPackage.CLASS_MAP__FEATURE_MAP:
				getFeatureMap().clear();
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
			case DecModelPackage.CLASS_MAP__CLASS_REF:
				return classRef != null;
			case DecModelPackage.CLASS_MAP__FEATURE_MAP:
				return featureMap != null && !featureMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClassMapImpl
