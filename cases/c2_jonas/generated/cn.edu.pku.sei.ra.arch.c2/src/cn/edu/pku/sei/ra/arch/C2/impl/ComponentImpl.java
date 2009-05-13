/**
 * <copyright>
 * </copyright>
 *
 * $Id: ComponentImpl.java,v 1.2 2008/11/13 05:53:00 song Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getFilePath <em>File Path</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getMinPool <em>Min Pool</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getMaxPool <em>Max Pool</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getAbove <em>Above</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getBelow <em>Below</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getInnerArch <em>Inner Arch</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl#getInstanceLife <em>Instance Life</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends EObjectImpl implements Component {
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
	 * The default value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilePath() <em>File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilePath()
	 * @generated
	 * @ordered
	 */
	protected String filePath = FILE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POOL_SIZE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getPoolSize() <em>Pool Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoolSize()
	 * @generated
	 * @ordered
	 */
	protected int poolSize = POOL_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinPool() <em>Min Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPool()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_POOL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMinPool() <em>Min Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPool()
	 * @generated
	 * @ordered
	 */
	protected int minPool = MIN_POOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxPool() <em>Max Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPool()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_POOL_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getMaxPool() <em>Max Pool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPool()
	 * @generated
	 * @ordered
	 */
	protected int maxPool = MAX_POOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAbove() <em>Above</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbove()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> above;

	/**
	 * The cached value of the '{@link #getBelow() <em>Below</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelow()
	 * @generated
	 * @ordered
	 */
	protected Connector below;

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
	 * The cached value of the '{@link #getInnerArch() <em>Inner Arch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerArch()
	 * @generated
	 * @ordered
	 */
	protected Architecture innerArch;

	/**
	 * The default value of the '{@link #getInstanceLife() <em>Instance Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLife()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTANCE_LIFE_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getInstanceLife() <em>Instance Life</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceLife()
	 * @generated
	 * @ordered
	 */
	protected int instanceLife = INSTANCE_LIFE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return C2Package.Literals.COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilePath(String newFilePath) {
		String oldFilePath = filePath;
		filePath = newFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__FILE_PATH, oldFilePath, filePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoolSize() {
		return poolSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolSize(int newPoolSize) {
		int oldPoolSize = poolSize;
		poolSize = newPoolSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__POOL_SIZE, oldPoolSize, poolSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinPool() {
		return minPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPool(int newMinPool) {
		int oldMinPool = minPool;
		minPool = newMinPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__MIN_POOL, oldMinPool, minPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxPool() {
		return maxPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPool(int newMaxPool) {
		int oldMaxPool = maxPool;
		maxPool = newMaxPool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__MAX_POOL, oldMaxPool, maxPool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getAbove() {
		if (above == null) {
			above = new EObjectWithInverseResolvingEList.ManyInverse<Connector>(Connector.class, this, C2Package.COMPONENT__ABOVE, C2Package.CONNECTOR__BELOW);
		}
		return above;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBelow() {
		if (below != null && below.eIsProxy()) {
			InternalEObject oldBelow = (InternalEObject)below;
			below = (Connector)eResolveProxy(oldBelow);
			if (below != oldBelow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, C2Package.COMPONENT__BELOW, oldBelow, below));
			}
		}
		return below;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBelow() {
		return below;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBelow(Connector newBelow, NotificationChain msgs) {
		Connector oldBelow = below;
		below = newBelow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__BELOW, oldBelow, newBelow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBelow(Connector newBelow) {
		if (newBelow != below) {
			NotificationChain msgs = null;
			if (below != null)
				msgs = ((InternalEObject)below).eInverseRemove(this, C2Package.CONNECTOR__ABOVE, Connector.class, msgs);
			if (newBelow != null)
				msgs = ((InternalEObject)newBelow).eInverseAdd(this, C2Package.CONNECTOR__ABOVE, Connector.class, msgs);
			msgs = basicSetBelow(newBelow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__BELOW, newBelow, newBelow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getParent() {
		if (eContainerFeatureID != C2Package.COMPONENT__PARENT) return null;
		return (Architecture)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Architecture newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, C2Package.COMPONENT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Architecture newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID != C2Package.COMPONENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, C2Package.ARCHITECTURE__COMPONENT, Architecture.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Architecture getInnerArch() {
		return innerArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInnerArch(Architecture newInnerArch, NotificationChain msgs) {
		Architecture oldInnerArch = innerArch;
		innerArch = newInnerArch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__INNER_ARCH, oldInnerArch, newInnerArch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerArch(Architecture newInnerArch) {
		if (newInnerArch != innerArch) {
			NotificationChain msgs = null;
			if (innerArch != null)
				msgs = ((InternalEObject)innerArch).eInverseRemove(this, C2Package.ARCHITECTURE__PARENT, Architecture.class, msgs);
			if (newInnerArch != null)
				msgs = ((InternalEObject)newInnerArch).eInverseAdd(this, C2Package.ARCHITECTURE__PARENT, Architecture.class, msgs);
			msgs = basicSetInnerArch(newInnerArch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__INNER_ARCH, newInnerArch, newInnerArch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstanceLife() {
		return instanceLife;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceLife(int newInstanceLife) {
		int oldInstanceLife = instanceLife;
		instanceLife = newInstanceLife;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, C2Package.COMPONENT__INSTANCE_LIFE, oldInstanceLife, instanceLife));
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
			case C2Package.COMPONENT__ABOVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbove()).basicAdd(otherEnd, msgs);
			case C2Package.COMPONENT__BELOW:
				if (below != null)
					msgs = ((InternalEObject)below).eInverseRemove(this, C2Package.CONNECTOR__ABOVE, Connector.class, msgs);
				return basicSetBelow((Connector)otherEnd, msgs);
			case C2Package.COMPONENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Architecture)otherEnd, msgs);
			case C2Package.COMPONENT__INNER_ARCH:
				if (innerArch != null)
					msgs = ((InternalEObject)innerArch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - C2Package.COMPONENT__INNER_ARCH, null, msgs);
				return basicSetInnerArch((Architecture)otherEnd, msgs);
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
			case C2Package.COMPONENT__ABOVE:
				return ((InternalEList<?>)getAbove()).basicRemove(otherEnd, msgs);
			case C2Package.COMPONENT__BELOW:
				return basicSetBelow(null, msgs);
			case C2Package.COMPONENT__PARENT:
				return basicSetParent(null, msgs);
			case C2Package.COMPONENT__INNER_ARCH:
				return basicSetInnerArch(null, msgs);
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
			case C2Package.COMPONENT__PARENT:
				return eInternalContainer().eInverseRemove(this, C2Package.ARCHITECTURE__COMPONENT, Architecture.class, msgs);
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
			case C2Package.COMPONENT__NAME:
				return getName();
			case C2Package.COMPONENT__FILE_PATH:
				return getFilePath();
			case C2Package.COMPONENT__ADDRESS:
				return getAddress();
			case C2Package.COMPONENT__VERSION:
				return getVersion();
			case C2Package.COMPONENT__POOL_SIZE:
				return new Integer(getPoolSize());
			case C2Package.COMPONENT__MIN_POOL:
				return new Integer(getMinPool());
			case C2Package.COMPONENT__MAX_POOL:
				return new Integer(getMaxPool());
			case C2Package.COMPONENT__ABOVE:
				return getAbove();
			case C2Package.COMPONENT__BELOW:
				if (resolve) return getBelow();
				return basicGetBelow();
			case C2Package.COMPONENT__PARENT:
				return getParent();
			case C2Package.COMPONENT__TYPE:
				return getType();
			case C2Package.COMPONENT__COMMENT:
				return getComment();
			case C2Package.COMPONENT__INNER_ARCH:
				return getInnerArch();
			case C2Package.COMPONENT__INSTANCE_LIFE:
				return new Integer(getInstanceLife());
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
			case C2Package.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case C2Package.COMPONENT__FILE_PATH:
				setFilePath((String)newValue);
				return;
			case C2Package.COMPONENT__ADDRESS:
				setAddress((String)newValue);
				return;
			case C2Package.COMPONENT__VERSION:
				setVersion((String)newValue);
				return;
			case C2Package.COMPONENT__POOL_SIZE:
				setPoolSize(((Integer)newValue).intValue());
				return;
			case C2Package.COMPONENT__MIN_POOL:
				setMinPool(((Integer)newValue).intValue());
				return;
			case C2Package.COMPONENT__MAX_POOL:
				setMaxPool(((Integer)newValue).intValue());
				return;
			case C2Package.COMPONENT__ABOVE:
				getAbove().clear();
				getAbove().addAll((Collection<? extends Connector>)newValue);
				return;
			case C2Package.COMPONENT__BELOW:
				setBelow((Connector)newValue);
				return;
			case C2Package.COMPONENT__PARENT:
				setParent((Architecture)newValue);
				return;
			case C2Package.COMPONENT__TYPE:
				setType((String)newValue);
				return;
			case C2Package.COMPONENT__COMMENT:
				setComment((String)newValue);
				return;
			case C2Package.COMPONENT__INNER_ARCH:
				setInnerArch((Architecture)newValue);
				return;
			case C2Package.COMPONENT__INSTANCE_LIFE:
				setInstanceLife(((Integer)newValue).intValue());
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
			case C2Package.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case C2Package.COMPONENT__FILE_PATH:
				setFilePath(FILE_PATH_EDEFAULT);
				return;
			case C2Package.COMPONENT__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case C2Package.COMPONENT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case C2Package.COMPONENT__POOL_SIZE:
				setPoolSize(POOL_SIZE_EDEFAULT);
				return;
			case C2Package.COMPONENT__MIN_POOL:
				setMinPool(MIN_POOL_EDEFAULT);
				return;
			case C2Package.COMPONENT__MAX_POOL:
				setMaxPool(MAX_POOL_EDEFAULT);
				return;
			case C2Package.COMPONENT__ABOVE:
				getAbove().clear();
				return;
			case C2Package.COMPONENT__BELOW:
				setBelow((Connector)null);
				return;
			case C2Package.COMPONENT__PARENT:
				setParent((Architecture)null);
				return;
			case C2Package.COMPONENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case C2Package.COMPONENT__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case C2Package.COMPONENT__INNER_ARCH:
				setInnerArch((Architecture)null);
				return;
			case C2Package.COMPONENT__INSTANCE_LIFE:
				setInstanceLife(INSTANCE_LIFE_EDEFAULT);
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
			case C2Package.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case C2Package.COMPONENT__FILE_PATH:
				return FILE_PATH_EDEFAULT == null ? filePath != null : !FILE_PATH_EDEFAULT.equals(filePath);
			case C2Package.COMPONENT__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case C2Package.COMPONENT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case C2Package.COMPONENT__POOL_SIZE:
				return poolSize != POOL_SIZE_EDEFAULT;
			case C2Package.COMPONENT__MIN_POOL:
				return minPool != MIN_POOL_EDEFAULT;
			case C2Package.COMPONENT__MAX_POOL:
				return maxPool != MAX_POOL_EDEFAULT;
			case C2Package.COMPONENT__ABOVE:
				return above != null && !above.isEmpty();
			case C2Package.COMPONENT__BELOW:
				return below != null;
			case C2Package.COMPONENT__PARENT:
				return getParent() != null;
			case C2Package.COMPONENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case C2Package.COMPONENT__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case C2Package.COMPONENT__INNER_ARCH:
				return innerArch != null;
			case C2Package.COMPONENT__INSTANCE_LIFE:
				return instanceLife != INSTANCE_LIFE_EDEFAULT;
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
		result.append(", filePath: ");
		result.append(filePath);
		result.append(", address: ");
		result.append(address);
		result.append(", version: ");
		result.append(version);
		result.append(", poolSize: ");
		result.append(poolSize);
		result.append(", minPool: ");
		result.append(minPool);
		result.append(", maxPool: ");
		result.append(maxPool);
		result.append(", type: ");
		result.append(type);
		result.append(", comment: ");
		result.append(comment);
		result.append(", instanceLife: ");
		result.append(instanceLife);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
