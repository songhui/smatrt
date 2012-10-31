/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Scope;

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
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl#isEnforce <em>Enforce</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.ScopeImpl#getRealtype <em>Realtype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope
{
  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected XExpression expr;

  /**
   * The default value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnforce()
   * @generated
   * @ordered
   */
  protected static final boolean ENFORCE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEnforce() <em>Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEnforce()
   * @generated
   * @ordered
   */
  protected boolean enforce = ENFORCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRealtype() <em>Realtype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealtype()
   * @generated
   * @ordered
   */
  protected JvmTypeReference realtype;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopeImpl()
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
    return EveDescPackage.Literals.SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(XExpression newExpr, NotificationChain msgs)
  {
    XExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.SCOPE__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(XExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SCOPE__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SCOPE__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SCOPE__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEnforce()
  {
    return enforce;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnforce(boolean newEnforce)
  {
    boolean oldEnforce = enforce;
    enforce = newEnforce;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SCOPE__ENFORCE, oldEnforce, enforce));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getRealtype()
  {
    return realtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRealtype(JvmTypeReference newRealtype, NotificationChain msgs)
  {
    JvmTypeReference oldRealtype = realtype;
    realtype = newRealtype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.SCOPE__REALTYPE, oldRealtype, newRealtype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealtype(JvmTypeReference newRealtype)
  {
    if (newRealtype != realtype)
    {
      NotificationChain msgs = null;
      if (realtype != null)
        msgs = ((InternalEObject)realtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SCOPE__REALTYPE, null, msgs);
      if (newRealtype != null)
        msgs = ((InternalEObject)newRealtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.SCOPE__REALTYPE, null, msgs);
      msgs = basicSetRealtype(newRealtype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SCOPE__REALTYPE, newRealtype, newRealtype));
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
      case EveDescPackage.SCOPE__EXPR:
        return basicSetExpr(null, msgs);
      case EveDescPackage.SCOPE__REALTYPE:
        return basicSetRealtype(null, msgs);
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
      case EveDescPackage.SCOPE__EXPR:
        return getExpr();
      case EveDescPackage.SCOPE__ENFORCE:
        return isEnforce();
      case EveDescPackage.SCOPE__REALTYPE:
        return getRealtype();
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
      case EveDescPackage.SCOPE__EXPR:
        setExpr((XExpression)newValue);
        return;
      case EveDescPackage.SCOPE__ENFORCE:
        setEnforce((Boolean)newValue);
        return;
      case EveDescPackage.SCOPE__REALTYPE:
        setRealtype((JvmTypeReference)newValue);
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
      case EveDescPackage.SCOPE__EXPR:
        setExpr((XExpression)null);
        return;
      case EveDescPackage.SCOPE__ENFORCE:
        setEnforce(ENFORCE_EDEFAULT);
        return;
      case EveDescPackage.SCOPE__REALTYPE:
        setRealtype((JvmTypeReference)null);
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
      case EveDescPackage.SCOPE__EXPR:
        return expr != null;
      case EveDescPackage.SCOPE__ENFORCE:
        return enforce != ENFORCE_EDEFAULT;
      case EveDescPackage.SCOPE__REALTYPE:
        return realtype != null;
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
    result.append(" (enforce: ");
    result.append(enforce);
    result.append(')');
    return result.toString();
  }

} //ScopeImpl
