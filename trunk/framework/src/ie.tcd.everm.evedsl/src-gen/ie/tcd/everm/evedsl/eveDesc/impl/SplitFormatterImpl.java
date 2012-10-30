/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.SplitFormatter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Split Formatter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.SplitFormatterImpl#getSpliter <em>Spliter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplitFormatterImpl extends TextFormatterImpl implements SplitFormatter
{
  /**
   * The default value of the '{@link #getSpliter() <em>Spliter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpliter()
   * @generated
   * @ordered
   */
  protected static final String SPLITER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSpliter() <em>Spliter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpliter()
   * @generated
   * @ordered
   */
  protected String spliter = SPLITER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SplitFormatterImpl()
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
    return EveDescPackage.Literals.SPLIT_FORMATTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSpliter()
  {
    return spliter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpliter(String newSpliter)
  {
    String oldSpliter = spliter;
    spliter = newSpliter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.SPLIT_FORMATTER__SPLITER, oldSpliter, spliter));
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
      case EveDescPackage.SPLIT_FORMATTER__SPLITER:
        return getSpliter();
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
      case EveDescPackage.SPLIT_FORMATTER__SPLITER:
        setSpliter((String)newValue);
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
      case EveDescPackage.SPLIT_FORMATTER__SPLITER:
        setSpliter(SPLITER_EDEFAULT);
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
      case EveDescPackage.SPLIT_FORMATTER__SPLITER:
        return SPLITER_EDEFAULT == null ? spliter != null : !SPLITER_EDEFAULT.equals(spliter);
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
    result.append(" (spliter: ");
    result.append(spliter);
    result.append(')');
    return result.toString();
  }

} //SplitFormatterImpl
