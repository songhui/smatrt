/**
 * <copyright>
 * </copyright>
 *
 * $Id: ArchitectureImpl.java,v 1.2 2008/11/13 05:53:00 song Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getDeployedHost <em>Deployed Host</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArchitectureImpl extends EObjectImpl implements Architecture {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

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
	 * The default value of the '{@link #getDeployedHost() <em>Deployed Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedHost()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYED_HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployedHost() <em>Deployed Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedHost()
	 * @generated
	 * @ordered
	 */
	protected String deployedHost = DEPLOYED_HOST_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArchitectureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2Package.Literals.ARCHITECTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectContainmentWithInverseEList<Component>(Component.class, this, C2Package.ARCHITECTURE__COMPONENT, C2Package.COMPONENT__PARENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectContainmentWithInverseEList<Connector>(Connector.class, this, C2Package.ARCHITECTURE__CONNECTOR, C2Package.CONNECTOR__PARENT);
		}
		return connector;
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.ARCHITECTURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeployedHost() {
		return deployedHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployedHost(String newDeployedHost) {
		String oldDeployedHost = deployedHost;
		deployedHost = newDeployedHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.ARCHITECTURE__DEPLOYED_HOST, oldDeployedHost, deployedHost));
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.ARCHITECTURE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getParent() {
		if (eContainerFeatureID != C2Package.ARCHITECTURE__PARENT) return null;
		return (Component)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Component newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, C2Package.ARCHITECTURE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Component newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != C2Package.ARCHITECTURE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, C2Package.COMPONENT__INNER_ARCH, Component.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.ARCHITECTURE__PARENT, newParent, newParent));
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
			case C2Package.ARCHITECTURE__COMPONENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getComponent()).basicAdd(otherEnd, msgs);
			case C2Package.ARCHITECTURE__CONNECTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnector()).basicAdd(otherEnd, msgs);
			case C2Package.ARCHITECTURE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Component)otherEnd, msgs);
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
			case C2Package.ARCHITECTURE__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case C2Package.ARCHITECTURE__CONNECTOR:
				return ((InternalEList<?>)getConnector()).basicRemove(otherEnd, msgs);
			case C2Package.ARCHITECTURE__PARENT:
				return basicSetParent(null, msgs);
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
			case C2Package.ARCHITECTURE__PARENT:
				return eInternalContainer().eInverseRemove(this, C2Package.COMPONENT__INNER_ARCH, Component.class, msgs);
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
			case C2Package.ARCHITECTURE__COMPONENT:
				return getComponent();
			case C2Package.ARCHITECTURE__CONNECTOR:
				return getConnector();
			case C2Package.ARCHITECTURE__NAME:
				return getName();
			case C2Package.ARCHITECTURE__DEPLOYED_HOST:
				return getDeployedHost();
			case C2Package.ARCHITECTURE__COMMENT:
				return getComment();
			case C2Package.ARCHITECTURE__PARENT:
				return getParent();
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
			case C2Package.ARCHITECTURE__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case C2Package.ARCHITECTURE__CONNECTOR:
				getConnector().clear();
				getConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case C2Package.ARCHITECTURE__NAME:
				setName((String)newValue);
				return;
			case C2Package.ARCHITECTURE__DEPLOYED_HOST:
				setDeployedHost((String)newValue);
				return;
			case C2Package.ARCHITECTURE__COMMENT:
				setComment((String)newValue);
				return;
			case C2Package.ARCHITECTURE__PARENT:
				setParent((Component)newValue);
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
			case C2Package.ARCHITECTURE__COMPONENT:
				getComponent().clear();
				return;
			case C2Package.ARCHITECTURE__CONNECTOR:
				getConnector().clear();
				return;
			case C2Package.ARCHITECTURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case C2Package.ARCHITECTURE__DEPLOYED_HOST:
				setDeployedHost(DEPLOYED_HOST_EDEFAULT);
				return;
			case C2Package.ARCHITECTURE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case C2Package.ARCHITECTURE__PARENT:
				setParent((Component)null);
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
			case C2Package.ARCHITECTURE__COMPONENT:
				return component != null && !component.isEmpty();
			case C2Package.ARCHITECTURE__CONNECTOR:
				return connector != null && !connector.isEmpty();
			case C2Package.ARCHITECTURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case C2Package.ARCHITECTURE__DEPLOYED_HOST:
				return DEPLOYED_HOST_EDEFAULT == null ? deployedHost != null : !DEPLOYED_HOST_EDEFAULT.equals(deployedHost);
			case C2Package.ARCHITECTURE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case C2Package.ARCHITECTURE__PARENT:
				return getParent() != null;
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
		result.append(", deployedHost: ");
		result.append(deployedHost);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //ArchitectureImpl
