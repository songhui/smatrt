/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt.impl;

import cn.edu.pku.sei.ra.dt.DtPackage;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.PlaceType;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;

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
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getStatementOrMethod <em>Statement Or Method</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#isInvolved <em>Involved</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getInputOf <em>Input Of</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getOutputOf <em>Output Of</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getParaOrder <em>Para Order</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl#getTypefull <em>Typefull</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends EObjectImpl implements Place {
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
	 * The default value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected static final IJavaElement VARIABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected IJavaElement variable = VARIABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatementOrMethod() <em>Statement Or Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOrMethod()
	 * @generated
	 * @ordered
	 */
	protected static final ASTNode STATEMENT_OR_METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatementOrMethod() <em>Statement Or Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementOrMethod()
	 * @generated
	 * @ordered
	 */
	protected ASTNode statementOrMethod = STATEMENT_OR_METHOD_EDEFAULT;

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
	 * The cached value of the '{@link #getInputOf() <em>Input Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> inputOf;

	/**
	 * The cached value of the '{@link #getOutputOf() <em>Output Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outputOf;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PlaceType TYPE_EDEFAULT = PlaceType.LOCAL_VARIABLE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PlaceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParaOrder() <em>Para Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParaOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int PARA_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getParaOrder() <em>Para Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParaOrder()
	 * @generated
	 * @ordered
	 */
	protected int paraOrder = PARA_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypefull() <em>Typefull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypefull()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPEFULL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypefull() <em>Typefull</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypefull()
	 * @generated
	 * @ordered
	 */
	protected String typefull = TYPEFULL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DtPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getId() {
		id=((Repository)this.eContainer()).getPlace().indexOf(this);
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
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IJavaElement getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(IJavaElement newVariable) {
		IJavaElement oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__VARIABLE, oldVariable, variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASTNode getStatementOrMethod() {
		return statementOrMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementOrMethod(ASTNode newStatementOrMethod) {
		ASTNode oldStatementOrMethod = statementOrMethod;
		statementOrMethod = newStatementOrMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__STATEMENT_OR_METHOD, oldStatementOrMethod, statementOrMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__INVOLVED, oldInvolved, involved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getInputOf() {
		if (inputOf == null) {
			inputOf = new EObjectWithInverseResolvingEList.ManyInverse<Transition>(Transition.class, this, DtPackage.PLACE__INPUT_OF, DtPackage.TRANSITION__INPUT);
		}
		return inputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutputOf() {
		if (outputOf == null) {
			outputOf = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, DtPackage.PLACE__OUTPUT_OF, DtPackage.TRANSITION__OUTPUT);
		}
		return outputOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PlaceType newType) {
		PlaceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getParaOrder() {
		return paraOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParaOrder(int newParaOrder) {
		int oldParaOrder = paraOrder;
		paraOrder = newParaOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__PARA_ORDER, oldParaOrder, paraOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypefull() {
		return typefull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypefull(String newTypefull) {
		String oldTypefull = typefull;
		typefull = newTypefull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DtPackage.PLACE__TYPEFULL, oldTypefull, typefull));
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
			case DtPackage.PLACE__INPUT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputOf()).basicAdd(otherEnd, msgs);
			case DtPackage.PLACE__OUTPUT_OF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputOf()).basicAdd(otherEnd, msgs);
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
			case DtPackage.PLACE__INPUT_OF:
				return ((InternalEList<?>)getInputOf()).basicRemove(otherEnd, msgs);
			case DtPackage.PLACE__OUTPUT_OF:
				return ((InternalEList<?>)getOutputOf()).basicRemove(otherEnd, msgs);
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
			case DtPackage.PLACE__ID:
				return new Integer(getId());
			case DtPackage.PLACE__NAME:
				return getName();
			case DtPackage.PLACE__VARIABLE:
				return getVariable();
			case DtPackage.PLACE__STATEMENT_OR_METHOD:
				return getStatementOrMethod();
			case DtPackage.PLACE__INVOLVED:
				return isInvolved() ? Boolean.TRUE : Boolean.FALSE;
			case DtPackage.PLACE__INPUT_OF:
				return getInputOf();
			case DtPackage.PLACE__OUTPUT_OF:
				return getOutputOf();
			case DtPackage.PLACE__TYPE:
				return getType();
			case DtPackage.PLACE__PARA_ORDER:
				return new Integer(getParaOrder());
			case DtPackage.PLACE__TYPEFULL:
				return getTypefull();
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
			case DtPackage.PLACE__ID:
				setId(((Integer)newValue).intValue());
				return;
			case DtPackage.PLACE__NAME:
				setName((String)newValue);
				return;
			case DtPackage.PLACE__VARIABLE:
				setVariable((IJavaElement)newValue);
				return;
			case DtPackage.PLACE__STATEMENT_OR_METHOD:
				setStatementOrMethod((ASTNode)newValue);
				return;
			case DtPackage.PLACE__INVOLVED:
				setInvolved(((Boolean)newValue).booleanValue());
				return;
			case DtPackage.PLACE__INPUT_OF:
				getInputOf().clear();
				getInputOf().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtPackage.PLACE__OUTPUT_OF:
				getOutputOf().clear();
				getOutputOf().addAll((Collection<? extends Transition>)newValue);
				return;
			case DtPackage.PLACE__TYPE:
				setType((PlaceType)newValue);
				return;
			case DtPackage.PLACE__PARA_ORDER:
				setParaOrder(((Integer)newValue).intValue());
				return;
			case DtPackage.PLACE__TYPEFULL:
				setTypefull((String)newValue);
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
			case DtPackage.PLACE__ID:
				setId(ID_EDEFAULT);
				return;
			case DtPackage.PLACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DtPackage.PLACE__VARIABLE:
				setVariable(VARIABLE_EDEFAULT);
				return;
			case DtPackage.PLACE__STATEMENT_OR_METHOD:
				setStatementOrMethod(STATEMENT_OR_METHOD_EDEFAULT);
				return;
			case DtPackage.PLACE__INVOLVED:
				setInvolved(INVOLVED_EDEFAULT);
				return;
			case DtPackage.PLACE__INPUT_OF:
				getInputOf().clear();
				return;
			case DtPackage.PLACE__OUTPUT_OF:
				getOutputOf().clear();
				return;
			case DtPackage.PLACE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DtPackage.PLACE__PARA_ORDER:
				setParaOrder(PARA_ORDER_EDEFAULT);
				return;
			case DtPackage.PLACE__TYPEFULL:
				setTypefull(TYPEFULL_EDEFAULT);
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
			case DtPackage.PLACE__ID:
				return id != ID_EDEFAULT;
			case DtPackage.PLACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DtPackage.PLACE__VARIABLE:
				return VARIABLE_EDEFAULT == null ? variable != null : !VARIABLE_EDEFAULT.equals(variable);
			case DtPackage.PLACE__STATEMENT_OR_METHOD:
				return STATEMENT_OR_METHOD_EDEFAULT == null ? statementOrMethod != null : !STATEMENT_OR_METHOD_EDEFAULT.equals(statementOrMethod);
			case DtPackage.PLACE__INVOLVED:
				return involved != INVOLVED_EDEFAULT;
			case DtPackage.PLACE__INPUT_OF:
				return inputOf != null && !inputOf.isEmpty();
			case DtPackage.PLACE__OUTPUT_OF:
				return outputOf != null && !outputOf.isEmpty();
			case DtPackage.PLACE__TYPE:
				return type != TYPE_EDEFAULT;
			case DtPackage.PLACE__PARA_ORDER:
				return paraOrder != PARA_ORDER_EDEFAULT;
			case DtPackage.PLACE__TYPEFULL:
				return TYPEFULL_EDEFAULT == null ? typefull != null : !TYPEFULL_EDEFAULT.equals(typefull);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", involved: ");
		result.append(involved);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
