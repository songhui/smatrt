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
import cn.edu.pku.sei.ra.dt.TransitionType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.core.IJavaElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getInput <em>Input</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#isInvolved <em>Involved</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getJavaElement <em>Java Element</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#isActivated <em>Activated</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl#isInvokechain <em>Invokechain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Place> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected Place output;

	/**
	 * The default value of the '{@link #isInvolved() <em>Involved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvolved() <em>Involved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvolved()
	 * @generated
	 * @ordered
	 */
	protected boolean involved = INVOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TransitionType TYPE_EDEFAULT = TransitionType.INITIALIZE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TransitionType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJavaElement() <em>Java Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaElement()
	 * @generated
	 * @ordered
	 */
	protected static final IJavaElement JAVA_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaElement() <em>Java Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaElement()
	 * @generated
	 * @ordered
	 */
	protected IJavaElement javaElement = JAVA_ELEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActivated()
	 * @generated
	 * @ordered
	 */
	protected boolean activated = ACTIVATED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInvokechain() <em>Invokechain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvokechain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVOKECHAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInvokechain() <em>Invokechain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInvokechain()
	 * @generated
	 * @ordered
	 */
	protected boolean invokechain = INVOKECHAIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getId() {
		id=((Repository)eContainer()).getTransition().indexOf(this);
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Place> getInput() {
		if (input == null) {
			input = new EObjectWithInverseResolvingEList.ManyInverse<Place>(Place.class, this, DtPackage.TRANSITION__INPUT, DtPackage.PLACE__INPUT_OF);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (Place)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DtPackage.TRANSITION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(Place newOutput, NotificationChain msgs) {
		Place oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__OUTPUT, oldOutput, newOutput);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(Place newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject)output).eInverseRemove(this, DtPackage.PLACE__OUTPUT_OF, Place.class, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject)newOutput).eInverseAdd(this, DtPackage.PLACE__OUTPUT_OF, Place.class, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__OUTPUT, newOutput, newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvolved() {
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvolved(boolean newInvolved) {
		boolean oldInvolved = involved;
		involved = newInvolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TransitionType newType) {
		TransitionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IJavaElement getJavaElement() {
		return javaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaElement(IJavaElement newJavaElement) {
		IJavaElement oldJavaElement = javaElement;
		javaElement = newJavaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__JAVA_ELEMENT, oldJavaElement, javaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActivated() {
		return activated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(boolean newActivated) {
		boolean oldActivated = activated;
		activated = newActivated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__ACTIVATED, oldActivated, activated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInvokechain() {
		return invokechain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvokechain(boolean newInvokechain) {
		boolean oldInvokechain = invokechain;
		invokechain = newInvokechain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.TRANSITION__INVOKECHAIN, oldInvokechain, invokechain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtPackage.TRANSITION__INPUT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInput()).basicAdd(otherEnd, msgs);
			case DtPackage.TRANSITION__OUTPUT:
				if (output != null)
					msgs = ((InternalEObject)output).eInverseRemove(this, DtPackage.PLACE__OUTPUT_OF, Place.class, msgs);
				return basicSetOutput((Place)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DtPackage.TRANSITION__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case DtPackage.TRANSITION__OUTPUT:
				return basicSetOutput(null, msgs);
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
			case DtPackage.TRANSITION__ID:
				return new Integer(getId());
			case DtPackage.TRANSITION__NAME:
				return getName();
			case DtPackage.TRANSITION__INPUT:
				return getInput();
			case DtPackage.TRANSITION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case DtPackage.TRANSITION__INVOLVED:
				return isInvolved() ? Boolean.TRUE : Boolean.FALSE;
			case DtPackage.TRANSITION__TYPE:
				return getType();
			case DtPackage.TRANSITION__JAVA_ELEMENT:
				return getJavaElement();
			case DtPackage.TRANSITION__SIGNATURE:
				return getSignature();
			case DtPackage.TRANSITION__ACTIVATED:
				return isActivated() ? Boolean.TRUE : Boolean.FALSE;
			case DtPackage.TRANSITION__INVOKECHAIN:
				return isInvokechain() ? Boolean.TRUE : Boolean.FALSE;
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
			case DtPackage.TRANSITION__ID:
				setId(((Integer)newValue).intValue());
				return;
			case DtPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case DtPackage.TRANSITION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Place>)newValue);
				return;
			case DtPackage.TRANSITION__OUTPUT:
				setOutput((Place)newValue);
				return;
			case DtPackage.TRANSITION__INVOLVED:
				setInvolved(((Boolean)newValue).booleanValue());
				return;
			case DtPackage.TRANSITION__TYPE:
				setType((TransitionType)newValue);
				return;
			case DtPackage.TRANSITION__JAVA_ELEMENT:
				setJavaElement((IJavaElement)newValue);
				return;
			case DtPackage.TRANSITION__SIGNATURE:
				setSignature((String)newValue);
				return;
			case DtPackage.TRANSITION__ACTIVATED:
				setActivated(((Boolean)newValue).booleanValue());
				return;
			case DtPackage.TRANSITION__INVOKECHAIN:
				setInvokechain(((Boolean)newValue).booleanValue());
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
			case DtPackage.TRANSITION__ID:
				setId(ID_EDEFAULT);
				return;
			case DtPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DtPackage.TRANSITION__INPUT:
				getInput().clear();
				return;
			case DtPackage.TRANSITION__OUTPUT:
				setOutput((Place)null);
				return;
			case DtPackage.TRANSITION__INVOLVED:
				setInvolved(INVOLVED_EDEFAULT);
				return;
			case DtPackage.TRANSITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DtPackage.TRANSITION__JAVA_ELEMENT:
				setJavaElement(JAVA_ELEMENT_EDEFAULT);
				return;
			case DtPackage.TRANSITION__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case DtPackage.TRANSITION__ACTIVATED:
				setActivated(ACTIVATED_EDEFAULT);
				return;
			case DtPackage.TRANSITION__INVOKECHAIN:
				setInvokechain(INVOKECHAIN_EDEFAULT);
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
			case DtPackage.TRANSITION__ID:
				return id != ID_EDEFAULT;
			case DtPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DtPackage.TRANSITION__INPUT:
				return input != null && !input.isEmpty();
			case DtPackage.TRANSITION__OUTPUT:
				return output != null;
			case DtPackage.TRANSITION__INVOLVED:
				return involved != INVOLVED_EDEFAULT;
			case DtPackage.TRANSITION__TYPE:
				return type != TYPE_EDEFAULT;
			case DtPackage.TRANSITION__JAVA_ELEMENT:
				return JAVA_ELEMENT_EDEFAULT == null ? javaElement != null : !JAVA_ELEMENT_EDEFAULT.equals(javaElement);
			case DtPackage.TRANSITION__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case DtPackage.TRANSITION__ACTIVATED:
				return activated != ACTIVATED_EDEFAULT;
			case DtPackage.TRANSITION__INVOKECHAIN:
				return invokechain != INVOKECHAIN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override 
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (involved: ");
		result.append(involved);
		result.append(", type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", signature: ");
		result.append(signature);
		result.append(", activated: ");
		result.append(activated);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
