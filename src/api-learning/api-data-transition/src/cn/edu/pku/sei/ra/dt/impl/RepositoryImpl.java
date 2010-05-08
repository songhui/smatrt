/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt.impl;

import cn.edu.pku.sei.ra.dt.DtPackage;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.core.IJavaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl#getTracerBuilder <em>Tracer Builder</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RepositoryImpl extends EObjectImpl implements Repository {
	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getTracerBuilder() <em>Tracer Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracerBuilder()
	 * @generated
	 * @ordered
	 */
	protected static final Object TRACER_BUILDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTracerBuilder() <em>Tracer Builder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracerBuilder()
	 * @generated
	 * @ordered
	 */
	protected Object tracerBuilder = TRACER_BUILDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final IJavaElement METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected IJavaElement method = METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtPackage.Literals.REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getPlace() {
		if (place == null) {
			place = new EObjectContainmentEList<Place>(Place.class, this, DtPackage.REPOSITORY__PLACE);
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, DtPackage.REPOSITORY__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getTracerBuilder() {
		return tracerBuilder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTracerBuilder(Object newTracerBuilder) {
		Object oldTracerBuilder = tracerBuilder;
		tracerBuilder = newTracerBuilder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.REPOSITORY__TRACER_BUILDER, oldTracerBuilder, tracerBuilder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IJavaElement getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(IJavaElement newMethod) {
		IJavaElement oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.REPOSITORY__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Place> getPlaceByJavaElement(IJavaElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		EList<Place> res= new BasicEList<Place>();
		for(Place place:this.place){
			if(element==null)
				element=null;
			if(element.equals(place.getVariable()))
				res.add(place);				
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void clearTemp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		this.setTracerBuilder(null);
		for(Place place:this.place){
			place.setStatementOrMethod(null);
			//place.setVariable(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtPackage.REPOSITORY__PLACE:
				return ((InternalEList<?>)getPlace()).basicRemove(otherEnd, msgs);
			case DtPackage.REPOSITORY__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
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
			case DtPackage.REPOSITORY__PLACE:
				return getPlace();
			case DtPackage.REPOSITORY__TRANSITION:
				return getTransition();
			case DtPackage.REPOSITORY__TRACER_BUILDER:
				return getTracerBuilder();
			case DtPackage.REPOSITORY__METHOD:
				return getMethod();
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
			case DtPackage.REPOSITORY__PLACE:
				getPlace().clear();
				getPlace().addAll((Collection<? extends Place>)newValue);
				return;
			case DtPackage.REPOSITORY__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtPackage.REPOSITORY__TRACER_BUILDER:
				setTracerBuilder(newValue);
				return;
			case DtPackage.REPOSITORY__METHOD:
				setMethod((IJavaElement)newValue);
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
			case DtPackage.REPOSITORY__PLACE:
				getPlace().clear();
				return;
			case DtPackage.REPOSITORY__TRANSITION:
				getTransition().clear();
				return;
			case DtPackage.REPOSITORY__TRACER_BUILDER:
				setTracerBuilder(TRACER_BUILDER_EDEFAULT);
				return;
			case DtPackage.REPOSITORY__METHOD:
				setMethod(METHOD_EDEFAULT);
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
			case DtPackage.REPOSITORY__PLACE:
				return place != null && !place.isEmpty();
			case DtPackage.REPOSITORY__TRANSITION:
				return transition != null && !transition.isEmpty();
			case DtPackage.REPOSITORY__TRACER_BUILDER:
				return TRACER_BUILDER_EDEFAULT == null ? tracerBuilder != null : !TRACER_BUILDER_EDEFAULT.equals(tracerBuilder);
			case DtPackage.REPOSITORY__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
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
		result.append(" (tracerBuilder: ");
		result.append(tracerBuilder);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //RepositoryImpl
