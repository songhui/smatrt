/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConnectorImpl.java,v 1.1 2008/11/09 02:43:02 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2.impl;

import cn.edu.pku.sei.ra.arch.C2.Architecture;
import cn.edu.pku.sei.ra.arch.C2.C2Package;
import cn.edu.pku.sei.ra.arch.C2.Component;
import cn.edu.pku.sei.ra.arch.C2.Connector;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getAbove <em>Above</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl#getBelow <em>Below</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectorImpl extends EObjectImpl implements Connector {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbove() <em>Above</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbove()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> above;

	/**
	 * The cached value of the '{@link #getBelow() <em>Below</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelow()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> below;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2Package.Literals.CONNECTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.CONNECTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getParent() {
		if (eContainerFeatureID != C2Package.CONNECTOR__PARENT) return null;
		return (Architecture)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Architecture newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, C2Package.CONNECTOR__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Architecture newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != C2Package.CONNECTOR__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, C2Package.ARCHITECTURE__CONNECTOR, Architecture.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.CONNECTOR__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.CONNECTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.CONNECTOR__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getAbove() {
		if (above == null) {
			above = new EObjectWithInverseResolvingEList<Component>(Component.class, this, C2Package.CONNECTOR__ABOVE, C2Package.COMPONENT__BELOW);
		}
		return above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getBelow() {
		if (below == null) {
			below = new EObjectWithInverseResolvingEList.ManyInverse<Component>(Component.class, this, C2Package.CONNECTOR__BELOW, C2Package.COMPONENT__ABOVE);
		}
		return below;
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
			case C2Package.CONNECTOR__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Architecture)otherEnd, msgs);
			case C2Package.CONNECTOR__ABOVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbove()).basicAdd(otherEnd, msgs);
			case C2Package.CONNECTOR__BELOW:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBelow()).basicAdd(otherEnd, msgs);
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
			case C2Package.CONNECTOR__PARENT:
				return basicSetParent(null, msgs);
			case C2Package.CONNECTOR__ABOVE:
				return ((InternalEList<?>)getAbove()).basicRemove(otherEnd, msgs);
			case C2Package.CONNECTOR__BELOW:
				return ((InternalEList<?>)getBelow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID) {
			case C2Package.CONNECTOR__PARENT:
				return eInternalContainer().eInverseRemove(this, C2Package.ARCHITECTURE__CONNECTOR, Architecture.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case C2Package.CONNECTOR__NAME:
				return getName();
			case C2Package.CONNECTOR__PARENT:
				return getParent();
			case C2Package.CONNECTOR__TYPE:
				return getType();
			case C2Package.CONNECTOR__COMMENT:
				return getComment();
			case C2Package.CONNECTOR__ABOVE:
				return getAbove();
			case C2Package.CONNECTOR__BELOW:
				return getBelow();
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
			case C2Package.CONNECTOR__NAME:
				setName((String)newValue);
				return;
			case C2Package.CONNECTOR__PARENT:
				setParent((Architecture)newValue);
				return;
			case C2Package.CONNECTOR__TYPE:
				setType((String)newValue);
				return;
			case C2Package.CONNECTOR__COMMENT:
				setComment((String)newValue);
				return;
			case C2Package.CONNECTOR__ABOVE:
				getAbove().clear();
				getAbove().addAll((Collection<? extends Component>)newValue);
				return;
			case C2Package.CONNECTOR__BELOW:
				getBelow().clear();
				getBelow().addAll((Collection<? extends Component>)newValue);
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
			case C2Package.CONNECTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case C2Package.CONNECTOR__PARENT:
				setParent((Architecture)null);
				return;
			case C2Package.CONNECTOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case C2Package.CONNECTOR__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case C2Package.CONNECTOR__ABOVE:
				getAbove().clear();
				return;
			case C2Package.CONNECTOR__BELOW:
				getBelow().clear();
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
			case C2Package.CONNECTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case C2Package.CONNECTOR__PARENT:
				return getParent() != null;
			case C2Package.CONNECTOR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case C2Package.CONNECTOR__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case C2Package.CONNECTOR__ABOVE:
				return above != null && !above.isEmpty();
			case C2Package.CONNECTOR__BELOW:
				return below != null && !below.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
