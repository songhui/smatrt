/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.GlobalMap;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea;

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
 * An implementation of the model object '<em><b>Map Area</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl#getGlobalMap <em>Global Map</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl#getClassMap <em>Class Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapAreaImpl extends EObjectImpl implements MapArea {
	/**
	 * The cached value of the '{@link #getGlobalMap() <em>Global Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalMap()
	 * @generated
	 * @ordered
	 */
	protected GlobalMap globalMap;
	/**
	 * The cached value of the '{@link #getClassMap() <em>Class Map</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassMap()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassMap> classMap;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapAreaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.MAP_AREA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMap getGlobalMap() {
		return globalMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlobalMap(GlobalMap newGlobalMap, NotificationChain msgs) {
		GlobalMap oldGlobalMap = globalMap;
		globalMap = newGlobalMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecModelPackage.MAP_AREA__GLOBAL_MAP, oldGlobalMap, newGlobalMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalMap(GlobalMap newGlobalMap) {
		if (newGlobalMap != globalMap) {
			NotificationChain msgs = null;
			if (globalMap != null)
				msgs = ((InternalEObject)globalMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.MAP_AREA__GLOBAL_MAP, null, msgs);
			if (newGlobalMap != null)
				msgs = ((InternalEObject)newGlobalMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.MAP_AREA__GLOBAL_MAP, null, msgs);
			msgs = basicSetGlobalMap(newGlobalMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.MAP_AREA__GLOBAL_MAP, newGlobalMap, newGlobalMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassMap> getClassMap() {
		if (classMap == null) {
			classMap = new EObjectContainmentEList<ClassMap>(ClassMap.class, this, DecModelPackage.MAP_AREA__CLASS_MAP);
		}
		return classMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecModelPackage.MAP_AREA__GLOBAL_MAP:
				return basicSetGlobalMap(null, msgs);
			case DecModelPackage.MAP_AREA__CLASS_MAP:
				return ((InternalEList<?>)getClassMap()).basicRemove(otherEnd, msgs);
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
			case DecModelPackage.MAP_AREA__GLOBAL_MAP:
				return getGlobalMap();
			case DecModelPackage.MAP_AREA__CLASS_MAP:
				return getClassMap();
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
			case DecModelPackage.MAP_AREA__GLOBAL_MAP:
				setGlobalMap((GlobalMap)newValue);
				return;
			case DecModelPackage.MAP_AREA__CLASS_MAP:
				getClassMap().clear();
				getClassMap().addAll((Collection<? extends ClassMap>)newValue);
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
			case DecModelPackage.MAP_AREA__GLOBAL_MAP:
				setGlobalMap((GlobalMap)null);
				return;
			case DecModelPackage.MAP_AREA__CLASS_MAP:
				getClassMap().clear();
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
			case DecModelPackage.MAP_AREA__GLOBAL_MAP:
				return globalMap != null;
			case DecModelPackage.MAP_AREA__CLASS_MAP:
				return classMap != null && !classMap.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapAreaImpl
