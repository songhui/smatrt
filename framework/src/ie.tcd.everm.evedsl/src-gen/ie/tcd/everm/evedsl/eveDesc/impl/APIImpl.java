/**
 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.API;
import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Helper;
import ie.tcd.everm.evedsl.eveDesc.Invocation;
import ie.tcd.everm.evedsl.eveDesc.Mapping;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.APIImpl#getInvocation <em>Invocation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APIImpl extends MinimalEObjectImpl.Container implements API
{
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
   * The cached value of the '{@link #getHelper() <em>Helper</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelper()
   * @generated
   * @ordered
   */
  protected EList<Helper> helper;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected EList<Mapping> mapping;

  /**
   * The cached value of the '{@link #getInvocation() <em>Invocation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvocation()
   * @generated
   * @ordered
   */
  protected EList<Invocation> invocation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected APIImpl()
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
    return EveDescPackage.Literals.API;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.API__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Helper> getHelper()
  {
    if (helper == null)
    {
      helper = new EObjectContainmentEList<Helper>(Helper.class, this, EveDescPackage.API__HELPER);
    }
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Mapping> getMapping()
  {
    if (mapping == null)
    {
      mapping = new EObjectContainmentEList<Mapping>(Mapping.class, this, EveDescPackage.API__MAPPING);
    }
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Invocation> getInvocation()
  {
    if (invocation == null)
    {
      invocation = new EObjectContainmentEList<Invocation>(Invocation.class, this, EveDescPackage.API__INVOCATION);
    }
    return invocation;
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
      case EveDescPackage.API__HELPER:
        return ((InternalEList<?>)getHelper()).basicRemove(otherEnd, msgs);
      case EveDescPackage.API__MAPPING:
        return ((InternalEList<?>)getMapping()).basicRemove(otherEnd, msgs);
      case EveDescPackage.API__INVOCATION:
        return ((InternalEList<?>)getInvocation()).basicRemove(otherEnd, msgs);
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
      case EveDescPackage.API__NAME:
        return getName();
      case EveDescPackage.API__HELPER:
        return getHelper();
      case EveDescPackage.API__MAPPING:
        return getMapping();
      case EveDescPackage.API__INVOCATION:
        return getInvocation();
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
      case EveDescPackage.API__NAME:
        setName((String)newValue);
        return;
      case EveDescPackage.API__HELPER:
        getHelper().clear();
        getHelper().addAll((Collection<? extends Helper>)newValue);
        return;
      case EveDescPackage.API__MAPPING:
        getMapping().clear();
        getMapping().addAll((Collection<? extends Mapping>)newValue);
        return;
      case EveDescPackage.API__INVOCATION:
        getInvocation().clear();
        getInvocation().addAll((Collection<? extends Invocation>)newValue);
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
      case EveDescPackage.API__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EveDescPackage.API__HELPER:
        getHelper().clear();
        return;
      case EveDescPackage.API__MAPPING:
        getMapping().clear();
        return;
      case EveDescPackage.API__INVOCATION:
        getInvocation().clear();
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
      case EveDescPackage.API__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EveDescPackage.API__HELPER:
        return helper != null && !helper.isEmpty();
      case EveDescPackage.API__MAPPING:
        return mapping != null && !mapping.isEmpty();
      case EveDescPackage.API__INVOCATION:
        return invocation != null && !invocation.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //APIImpl
