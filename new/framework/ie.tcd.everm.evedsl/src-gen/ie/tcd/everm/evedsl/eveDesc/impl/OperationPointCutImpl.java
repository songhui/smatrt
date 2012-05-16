/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut;
import ie.tcd.everm.evedsl.eveDesc.OperationType;

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
 * An implementation of the model object '<em><b>Operation Point Cut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl#getOpType <em>Op Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.OperationPointCutImpl#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationPointCutImpl extends MinimalEObjectImpl.Container implements OperationPointCut
{
  /**
   * The default value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType()
   * @generated
   * @ordered
   */
  protected static final OperationType OP_TYPE_EDEFAULT = OperationType.GET;

  /**
   * The cached value of the '{@link #getOpType() <em>Op Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpType()
   * @generated
   * @ordered
   */
  protected OperationType opType = OP_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElemType() <em>Elem Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElemType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference elemType;

  /**
   * The default value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected static final String FEATURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFeature() <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFeature()
   * @generated
   * @ordered
   */
  protected String feature = FEATURE_EDEFAULT;

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
  protected OperationPointCutImpl()
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
    return EveDescPackage.Literals.OPERATION_POINT_CUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationType getOpType()
  {
    return opType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpType(OperationType newOpType)
  {
    OperationType oldOpType = opType;
    opType = newOpType == null ? OP_TYPE_EDEFAULT : newOpType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__OP_TYPE, oldOpType, opType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getElemType()
  {
    return elemType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElemType(JvmTypeReference newElemType, NotificationChain msgs)
  {
    JvmTypeReference oldElemType = elemType;
    elemType = newElemType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE, oldElemType, newElemType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElemType(JvmTypeReference newElemType)
  {
    if (newElemType != elemType)
    {
      NotificationChain msgs = null;
      if (elemType != null)
        msgs = ((InternalEObject)elemType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE, null, msgs);
      if (newElemType != null)
        msgs = ((InternalEObject)newElemType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE, null, msgs);
      msgs = basicSetElemType(newElemType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE, newElemType, newElemType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFeature()
  {
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFeature(String newFeature)
  {
    String oldFeature = feature;
    feature = newFeature;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__FEATURE, oldFeature, feature));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__PRE, oldPre, newPre);
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
        msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.OPERATION_POINT_CUT__PRE, null, msgs);
      if (newPre != null)
        msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.OPERATION_POINT_CUT__PRE, null, msgs);
      msgs = basicSetPre(newPre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.OPERATION_POINT_CUT__PRE, newPre, newPre));
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
      case EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE:
        return basicSetElemType(null, msgs);
      case EveDescPackage.OPERATION_POINT_CUT__PRE:
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
      case EveDescPackage.OPERATION_POINT_CUT__OP_TYPE:
        return getOpType();
      case EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE:
        return getElemType();
      case EveDescPackage.OPERATION_POINT_CUT__FEATURE:
        return getFeature();
      case EveDescPackage.OPERATION_POINT_CUT__PRE:
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
      case EveDescPackage.OPERATION_POINT_CUT__OP_TYPE:
        setOpType((OperationType)newValue);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE:
        setElemType((JvmTypeReference)newValue);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__FEATURE:
        setFeature((String)newValue);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__PRE:
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
      case EveDescPackage.OPERATION_POINT_CUT__OP_TYPE:
        setOpType(OP_TYPE_EDEFAULT);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE:
        setElemType((JvmTypeReference)null);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__FEATURE:
        setFeature(FEATURE_EDEFAULT);
        return;
      case EveDescPackage.OPERATION_POINT_CUT__PRE:
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
      case EveDescPackage.OPERATION_POINT_CUT__OP_TYPE:
        return opType != OP_TYPE_EDEFAULT;
      case EveDescPackage.OPERATION_POINT_CUT__ELEM_TYPE:
        return elemType != null;
      case EveDescPackage.OPERATION_POINT_CUT__FEATURE:
        return FEATURE_EDEFAULT == null ? feature != null : !FEATURE_EDEFAULT.equals(feature);
      case EveDescPackage.OPERATION_POINT_CUT__PRE:
        return pre != null;
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
    result.append(" (opType: ");
    result.append(opType);
    result.append(", feature: ");
    result.append(feature);
    result.append(')');
    return result.toString();
  }

} //OperationPointCutImpl
