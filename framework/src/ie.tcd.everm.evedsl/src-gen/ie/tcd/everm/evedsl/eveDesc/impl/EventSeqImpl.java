/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Event;
import ie.tcd.everm.evedsl.eveDesc.EventSeq;
import ie.tcd.everm.evedsl.eveDesc.Helper;

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
 * An implementation of the model object '<em><b>Event Seq</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.EventSeqImpl#getEvent <em>Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventSeqImpl extends MinimalEObjectImpl.Container implements EventSeq
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
   * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected EList<Event> event;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventSeqImpl()
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
    return EveDescPackage.Literals.EVENT_SEQ;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.EVENT_SEQ__NAME, oldName, name));
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
      helper = new EObjectContainmentEList<Helper>(Helper.class, this, EveDescPackage.EVENT_SEQ__HELPER);
    }
    return helper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Event> getEvent()
  {
    if (event == null)
    {
      event = new EObjectContainmentEList<Event>(Event.class, this, EveDescPackage.EVENT_SEQ__EVENT);
    }
    return event;
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
      case EveDescPackage.EVENT_SEQ__HELPER:
        return ((InternalEList<?>)getHelper()).basicRemove(otherEnd, msgs);
      case EveDescPackage.EVENT_SEQ__EVENT:
        return ((InternalEList<?>)getEvent()).basicRemove(otherEnd, msgs);
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
      case EveDescPackage.EVENT_SEQ__NAME:
        return getName();
      case EveDescPackage.EVENT_SEQ__HELPER:
        return getHelper();
      case EveDescPackage.EVENT_SEQ__EVENT:
        return getEvent();
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
      case EveDescPackage.EVENT_SEQ__NAME:
        setName((String)newValue);
        return;
      case EveDescPackage.EVENT_SEQ__HELPER:
        getHelper().clear();
        getHelper().addAll((Collection<? extends Helper>)newValue);
        return;
      case EveDescPackage.EVENT_SEQ__EVENT:
        getEvent().clear();
        getEvent().addAll((Collection<? extends Event>)newValue);
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
      case EveDescPackage.EVENT_SEQ__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EveDescPackage.EVENT_SEQ__HELPER:
        getHelper().clear();
        return;
      case EveDescPackage.EVENT_SEQ__EVENT:
        getEvent().clear();
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
      case EveDescPackage.EVENT_SEQ__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EveDescPackage.EVENT_SEQ__HELPER:
        return helper != null && !helper.isEmpty();
      case EveDescPackage.EVENT_SEQ__EVENT:
        return event != null && !event.isEmpty();
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

} //EventSeqImpl
