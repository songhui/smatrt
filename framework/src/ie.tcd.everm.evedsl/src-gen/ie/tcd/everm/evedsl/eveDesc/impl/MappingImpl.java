/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Mapping;
import ie.tcd.everm.evedsl.eveDesc.SubType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#getMType <em>MType</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#getSType <em>SType</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#isUnique <em>Unique</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#getIdentify <em>Identify</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.MappingImpl#getNewImage <em>New Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getMType() <em>MType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference mType;

  /**
   * The cached value of the '{@link #getSType() <em>SType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference sType;

  /**
   * The default value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected static final boolean UNIQUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnique() <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnique()
   * @generated
   * @ordered
   */
  protected boolean unique = UNIQUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdentify() <em>Identify</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentify()
   * @generated
   * @ordered
   */
  protected XExpression identify;

  /**
   * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubType()
   * @generated
   * @ordered
   */
  protected EList<SubType> subType;

  /**
   * The cached value of the '{@link #getNewImage() <em>New Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewImage()
   * @generated
   * @ordered
   */
  protected XExpression newImage;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EveDescPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getMType()
  {
    return mType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMType(JvmTypeReference newMType, NotificationChain msgs)
  {
    JvmTypeReference oldMType = mType;
    mType = newMType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__MTYPE, oldMType, newMType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMType(JvmTypeReference newMType)
  {
    if (newMType != mType)
    {
      NotificationChain msgs = null;
      if (mType != null)
        msgs = ((InternalEObject)mType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__MTYPE, null, msgs);
      if (newMType != null)
        msgs = ((InternalEObject)newMType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__MTYPE, null, msgs);
      msgs = basicSetMType(newMType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__MTYPE, newMType, newMType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getSType()
  {
    return sType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSType(JvmTypeReference newSType, NotificationChain msgs)
  {
    JvmTypeReference oldSType = sType;
    sType = newSType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__STYPE, oldSType, newSType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSType(JvmTypeReference newSType)
  {
    if (newSType != sType)
    {
      NotificationChain msgs = null;
      if (sType != null)
        msgs = ((InternalEObject)sType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__STYPE, null, msgs);
      if (newSType != null)
        msgs = ((InternalEObject)newSType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__STYPE, null, msgs);
      msgs = basicSetSType(newSType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__STYPE, newSType, newSType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnique()
  {
    return unique;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnique(boolean newUnique)
  {
    boolean oldUnique = unique;
    unique = newUnique;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__UNIQUE, oldUnique, unique));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getIdentify()
  {
    return identify;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIdentify(XExpression newIdentify, NotificationChain msgs)
  {
    XExpression oldIdentify = identify;
    identify = newIdentify;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__IDENTIFY, oldIdentify, newIdentify);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentify(XExpression newIdentify)
  {
    if (newIdentify != identify)
    {
      NotificationChain msgs = null;
      if (identify != null)
        msgs = ((InternalEObject)identify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__IDENTIFY, null, msgs);
      if (newIdentify != null)
        msgs = ((InternalEObject)newIdentify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__IDENTIFY, null, msgs);
      msgs = basicSetIdentify(newIdentify, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__IDENTIFY, newIdentify, newIdentify));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SubType> getSubType()
  {
    if (subType == null)
    {
      subType = new EObjectContainmentEList<SubType>(SubType.class, this, EveDescPackage.MAPPING__SUB_TYPE);
    }
    return subType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getNewImage()
  {
    return newImage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNewImage(XExpression newNewImage, NotificationChain msgs)
  {
    XExpression oldNewImage = newImage;
    newImage = newNewImage;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__NEW_IMAGE, oldNewImage, newNewImage);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewImage(XExpression newNewImage)
  {
    if (newNewImage != newImage)
    {
      NotificationChain msgs = null;
      if (newImage != null)
        msgs = ((InternalEObject)newImage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__NEW_IMAGE, null, msgs);
      if (newNewImage != null)
        msgs = ((InternalEObject)newNewImage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.MAPPING__NEW_IMAGE, null, msgs);
      msgs = basicSetNewImage(newNewImage, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.MAPPING__NEW_IMAGE, newNewImage, newNewImage));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EveDescPackage.MAPPING__MTYPE:
        return basicSetMType(null, msgs);
      case EveDescPackage.MAPPING__STYPE:
        return basicSetSType(null, msgs);
      case EveDescPackage.MAPPING__IDENTIFY:
        return basicSetIdentify(null, msgs);
      case EveDescPackage.MAPPING__SUB_TYPE:
        return ((InternalEList<?>)getSubType()).basicRemove(otherEnd, msgs);
      case EveDescPackage.MAPPING__NEW_IMAGE:
        return basicSetNewImage(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EveDescPackage.MAPPING__MTYPE:
        return getMType();
      case EveDescPackage.MAPPING__STYPE:
        return getSType();
      case EveDescPackage.MAPPING__UNIQUE:
        return isUnique();
      case EveDescPackage.MAPPING__IDENTIFY:
        return getIdentify();
      case EveDescPackage.MAPPING__SUB_TYPE:
        return getSubType();
      case EveDescPackage.MAPPING__NEW_IMAGE:
        return getNewImage();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EveDescPackage.MAPPING__MTYPE:
        setMType((JvmTypeReference)newValue);
        return;
      case EveDescPackage.MAPPING__STYPE:
        setSType((JvmTypeReference)newValue);
        return;
      case EveDescPackage.MAPPING__UNIQUE:
        setUnique((Boolean)newValue);
        return;
      case EveDescPackage.MAPPING__IDENTIFY:
        setIdentify((XExpression)newValue);
        return;
      case EveDescPackage.MAPPING__SUB_TYPE:
        getSubType().clear();
        getSubType().addAll((Collection<? extends SubType>)newValue);
        return;
      case EveDescPackage.MAPPING__NEW_IMAGE:
        setNewImage((XExpression)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EveDescPackage.MAPPING__MTYPE:
        setMType((JvmTypeReference)null);
        return;
      case EveDescPackage.MAPPING__STYPE:
        setSType((JvmTypeReference)null);
        return;
      case EveDescPackage.MAPPING__UNIQUE:
        setUnique(UNIQUE_EDEFAULT);
        return;
      case EveDescPackage.MAPPING__IDENTIFY:
        setIdentify((XExpression)null);
        return;
      case EveDescPackage.MAPPING__SUB_TYPE:
        getSubType().clear();
        return;
      case EveDescPackage.MAPPING__NEW_IMAGE:
        setNewImage((XExpression)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EveDescPackage.MAPPING__MTYPE:
        return mType != null;
      case EveDescPackage.MAPPING__STYPE:
        return sType != null;
      case EveDescPackage.MAPPING__UNIQUE:
        return unique != UNIQUE_EDEFAULT;
      case EveDescPackage.MAPPING__IDENTIFY:
        return identify != null;
      case EveDescPackage.MAPPING__SUB_TYPE:
        return subType != null && !subType.isEmpty();
      case EveDescPackage.MAPPING__NEW_IMAGE:
        return newImage != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (unique: ");
    result.append(unique);
    result.append(')');
    return result.toString();
  }

} //MappingImpl
