/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.SubType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.SubTypeImpl#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubTypeImpl extends MinimalEObjectImpl.Container implements SubType
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference type;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected XExpression pre;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubTypeImpl()
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
    return EveDescPackage.Literals.SUB_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(JvmTypeReference newType, NotificationChain msgs)
  {
    JvmTypeReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.SUB_TYPE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(JvmTypeReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SUB_TYPE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SUB_TYPE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SUB_TYPE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPre()
  {
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPre(XExpression newPre, NotificationChain msgs)
  {
    XExpression oldPre = pre;
    pre = newPre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.SUB_TYPE__PRE, oldPre, newPre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPre(XExpression newPre)
  {
    if (newPre != pre)
    {
      NotificationChain msgs = null;
      if (pre != null)
        msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SUB_TYPE__PRE, null, msgs);
      if (newPre != null)
        msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SUB_TYPE__PRE, null, msgs);
      msgs = basicSetPre(newPre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SUB_TYPE__PRE, newPre, newPre));
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
      case EveDescPackage.SUB_TYPE__TYPE:
        return basicSetType(null, msgs);
      case EveDescPackage.SUB_TYPE__PRE:
        return basicSetPre(null, msgs);
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
      case EveDescPackage.SUB_TYPE__TYPE:
        return getType();
      case EveDescPackage.SUB_TYPE__PRE:
        return getPre();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EveDescPackage.SUB_TYPE__TYPE:
        setType((JvmTypeReference)newValue);
        return;
      case EveDescPackage.SUB_TYPE__PRE:
        setPre((XExpression)newValue);
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
      case EveDescPackage.SUB_TYPE__TYPE:
        setType((JvmTypeReference)null);
        return;
      case EveDescPackage.SUB_TYPE__PRE:
        setPre((XExpression)null);
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
      case EveDescPackage.SUB_TYPE__TYPE:
        return type != null;
      case EveDescPackage.SUB_TYPE__PRE:
        return pre != null;
    }
    return super.eIsSet(featureID);
  }

} //SubTypeImpl
