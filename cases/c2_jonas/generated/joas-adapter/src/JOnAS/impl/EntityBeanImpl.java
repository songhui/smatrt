/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.EntityBean;
import JOnAS.JOnASPackage;
import JOnAS.MBeanServer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import javax.management.j2ee.Management;
import javax.management.j2ee.ManagementHome;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;
import javax.management.ObjectName;
import javax.management.Attribute;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xerces.dom.DOMImplementationImpl;
import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.traversal.NodeIterator;
import org.w3c.dom.*;
import java.util.Hashtable;
import java.io.*;
import java.util.Iterator;
import java.util.Properties;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.EntityBeanImpl#getPassivationTimeOut <em>Passivation Time Out</em>}</li>
 *   <li>{@link JOnAS.impl.EntityBeanImpl#getInactivityTimeOut <em>Inactivity Time Out</em>}</li>
 *   <li>{@link JOnAS.impl.EntityBeanImpl#getDeadlockTimeOut <em>Deadlock Time Out</em>}</li>
 *   <li>{@link JOnAS.impl.EntityBeanImpl#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link JOnAS.impl.EntityBeanImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityBeanImpl  extends EJBImpl implements EntityBean
{
  /**
   * The default value of the '{@link #getPassivationTimeOut() <em>Passivation Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassivationTimeOut()
   * @generated
   * @ordered
   */
  protected static final int PASSIVATION_TIME_OUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPassivationTimeOut() <em>Passivation Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassivationTimeOut()
   * @generated
   * @ordered
   */
  protected int passivationTimeOut = PASSIVATION_TIME_OUT_EDEFAULT;

  /**
   * The default value of the '{@link #getInactivityTimeOut() <em>Inactivity Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInactivityTimeOut()
   * @generated
   * @ordered
   */
  protected static final int INACTIVITY_TIME_OUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInactivityTimeOut() <em>Inactivity Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInactivityTimeOut()
   * @generated
   * @ordered
   */
  protected int inactivityTimeOut = INACTIVITY_TIME_OUT_EDEFAULT;

  /**
   * The default value of the '{@link #getDeadlockTimeOut() <em>Deadlock Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeadlockTimeOut()
   * @generated
   * @ordered
   */
  protected static final int DEADLOCK_TIME_OUT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDeadlockTimeOut() <em>Deadlock Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeadlockTimeOut()
   * @generated
   * @ordered
   */
  protected int deadlockTimeOut = DEADLOCK_TIME_OUT_EDEFAULT;

  /**
   * The default value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockPolicy()
   * @generated
   * @ordered
   */
  protected static final String LOCK_POLICY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLockPolicy() <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLockPolicy()
   * @generated
   * @ordered
   */
  protected String lockPolicy = LOCK_POLICY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityBeanImpl()
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
    return JOnASPackage.Literals.ENTITY_BEAN;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
    if(core!=null && core.equals(arg0))
  result=true;
else
  result=false;
    return result;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
    switch(featureID){
  
  
  
  
  
  }
    return result;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPassivationTimeOut()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return passivationTimeOut;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "passivationTimeOut");
    } catch (Exception e) {
      e.printStackTrace();
      return passivationTimeOut;
    }
if(result==null)
  return passivationTimeOut;
passivationTimeOut=((Integer)result).intValue();
    return passivationTimeOut; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassivationTimeOut(int newPassivationTimeOut)
  {
    int oldPassivationTimeOut = passivationTimeOut;
    passivationTimeOut = newPassivationTimeOut;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.ENTITY_BEAN__PASSIVATION_TIME_OUT, oldPassivationTimeOut, passivationTimeOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInactivityTimeOut()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return inactivityTimeOut;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "inactivityTimeOut");
    } catch (Exception e) {
      e.printStackTrace();
      return inactivityTimeOut;
    }
if(result==null)
  return inactivityTimeOut;
inactivityTimeOut=((Integer)result).intValue();
    return inactivityTimeOut; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInactivityTimeOut(int newInactivityTimeOut)
  {
    int oldInactivityTimeOut = inactivityTimeOut;
    inactivityTimeOut = newInactivityTimeOut;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.ENTITY_BEAN__INACTIVITY_TIME_OUT, oldInactivityTimeOut, inactivityTimeOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDeadlockTimeOut()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return deadlockTimeOut;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "deadlockTimeOut");
    } catch (Exception e) {
      e.printStackTrace();
      return deadlockTimeOut;
    }
if(result==null)
  return deadlockTimeOut;
deadlockTimeOut=((Integer)result).intValue();
    return deadlockTimeOut; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeadlockTimeOut(int newDeadlockTimeOut)
  {
    int oldDeadlockTimeOut = deadlockTimeOut;
    deadlockTimeOut = newDeadlockTimeOut;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.ENTITY_BEAN__DEADLOCK_TIME_OUT, oldDeadlockTimeOut, deadlockTimeOut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLockPolicy()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return lockPolicy;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "lockPolicy");
    } catch (Exception e) {
      e.printStackTrace();
      return lockPolicy;
    }
if(result==null)
  return lockPolicy;
lockPolicy=result.toString();
    return lockPolicy; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLockPolicy(String newLockPolicy)
  {
    String oldLockPolicy = lockPolicy;
    lockPolicy = newLockPolicy;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.ENTITY_BEAN__LOCK_POLICY, oldLockPolicy, lockPolicy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBeanServer getParent()
  {
    if (eContainerFeatureID != JOnASPackage.ENTITY_BEAN__PARENT) return null;
    return (MBeanServer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(MBeanServer newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, JOnASPackage.ENTITY_BEAN__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(MBeanServer newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != JOnASPackage.ENTITY_BEAN__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, JOnASPackage.MBEAN_SERVER__ENTITY_BEAN, MBeanServer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.ENTITY_BEAN__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JOnASPackage.ENTITY_BEAN__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((MBeanServer)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case JOnASPackage.ENTITY_BEAN__PARENT:
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
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case JOnASPackage.ENTITY_BEAN__PARENT:
        return eInternalContainer().eInverseRemove(this, JOnASPackage.MBEAN_SERVER__ENTITY_BEAN, MBeanServer.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case JOnASPackage.ENTITY_BEAN__PASSIVATION_TIME_OUT:
        return new Integer(getPassivationTimeOut());
      case JOnASPackage.ENTITY_BEAN__INACTIVITY_TIME_OUT:
        return new Integer(getInactivityTimeOut());
      case JOnASPackage.ENTITY_BEAN__DEADLOCK_TIME_OUT:
        return new Integer(getDeadlockTimeOut());
      case JOnASPackage.ENTITY_BEAN__LOCK_POLICY:
        return getLockPolicy();
      case JOnASPackage.ENTITY_BEAN__PARENT:
        return getParent();
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
      case JOnASPackage.ENTITY_BEAN__PASSIVATION_TIME_OUT:
        setPassivationTimeOut(((Integer)newValue).intValue());
        return;
      case JOnASPackage.ENTITY_BEAN__INACTIVITY_TIME_OUT:
        setInactivityTimeOut(((Integer)newValue).intValue());
        return;
      case JOnASPackage.ENTITY_BEAN__DEADLOCK_TIME_OUT:
        setDeadlockTimeOut(((Integer)newValue).intValue());
        return;
      case JOnASPackage.ENTITY_BEAN__LOCK_POLICY:
        setLockPolicy((String)newValue);
        return;
      case JOnASPackage.ENTITY_BEAN__PARENT:
        setParent((MBeanServer)newValue);
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
      case JOnASPackage.ENTITY_BEAN__PASSIVATION_TIME_OUT:
        setPassivationTimeOut(PASSIVATION_TIME_OUT_EDEFAULT);
        return;
      case JOnASPackage.ENTITY_BEAN__INACTIVITY_TIME_OUT:
        setInactivityTimeOut(INACTIVITY_TIME_OUT_EDEFAULT);
        return;
      case JOnASPackage.ENTITY_BEAN__DEADLOCK_TIME_OUT:
        setDeadlockTimeOut(DEADLOCK_TIME_OUT_EDEFAULT);
        return;
      case JOnASPackage.ENTITY_BEAN__LOCK_POLICY:
        setLockPolicy(LOCK_POLICY_EDEFAULT);
        return;
      case JOnASPackage.ENTITY_BEAN__PARENT:
        setParent((MBeanServer)null);
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
      case JOnASPackage.ENTITY_BEAN__PASSIVATION_TIME_OUT:
        return passivationTimeOut != PASSIVATION_TIME_OUT_EDEFAULT;
      case JOnASPackage.ENTITY_BEAN__INACTIVITY_TIME_OUT:
        return inactivityTimeOut != INACTIVITY_TIME_OUT_EDEFAULT;
      case JOnASPackage.ENTITY_BEAN__DEADLOCK_TIME_OUT:
        return deadlockTimeOut != DEADLOCK_TIME_OUT_EDEFAULT;
      case JOnASPackage.ENTITY_BEAN__LOCK_POLICY:
        return LOCK_POLICY_EDEFAULT == null ? lockPolicy != null : !LOCK_POLICY_EDEFAULT.equals(lockPolicy);
      case JOnASPackage.ENTITY_BEAN__PARENT:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (passivationTimeOut: ");
    result.append(passivationTimeOut);
    result.append(", inactivityTimeOut: ");
    result.append(inactivityTimeOut);
    result.append(", deadlockTimeOut: ");
    result.append(deadlockTimeOut);
    result.append(", lockPolicy: ");
    result.append(lockPolicy);
    result.append(')');
    return result.toString();
  }

} //EntityBeanImpl
