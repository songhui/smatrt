/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.JOnASPackage;
import JOnAS.JVM;
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
 * An implementation of the model object '<em><b>JVM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.JVMImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link JOnAS.impl.JVMImpl#getJavaVendor <em>Java Vendor</em>}</li>
 *   <li>{@link JOnAS.impl.JVMImpl#getAllThreadsCount <em>All Threads Count</em>}</li>
 *   <li>{@link JOnAS.impl.JVMImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JVMImpl  extends J2EEManagedObjectImpl implements JVM
{
  /**
   * The default value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaVersion()
   * @generated
   * @ordered
   */
  protected static final String JAVA_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaVersion()
   * @generated
   * @ordered
   */
  protected String javaVersion = JAVA_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getJavaVendor() <em>Java Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaVendor()
   * @generated
   * @ordered
   */
  protected static final String JAVA_VENDOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJavaVendor() <em>Java Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJavaVendor()
   * @generated
   * @ordered
   */
  protected String javaVendor = JAVA_VENDOR_EDEFAULT;

  /**
   * The default value of the '{@link #getAllThreadsCount() <em>All Threads Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllThreadsCount()
   * @generated
   * @ordered
   */
  protected static final int ALL_THREADS_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAllThreadsCount() <em>All Threads Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllThreadsCount()
   * @generated
   * @ordered
   */
  protected int allThreadsCount = ALL_THREADS_COUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JVMImpl()
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
    return JOnASPackage.Literals.JVM;
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
  public String getJavaVersion()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return javaVersion;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "javaVersion");
    } catch (Exception e) {
      e.printStackTrace();
      return javaVersion;
    }
if(result==null)
  return javaVersion;
javaVersion=result.toString();
    return javaVersion; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaVersion(String newJavaVersion)
  {
    String oldJavaVersion = javaVersion;
    javaVersion = newJavaVersion;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JVM__JAVA_VERSION, oldJavaVersion, javaVersion));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJavaVendor()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return javaVendor;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "javaVendor");
    } catch (Exception e) {
      e.printStackTrace();
      return javaVendor;
    }
if(result==null)
  return javaVendor;
javaVendor=result.toString();
    return javaVendor; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJavaVendor(String newJavaVendor)
  {
    String oldJavaVendor = javaVendor;
    javaVendor = newJavaVendor;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JVM__JAVA_VENDOR, oldJavaVendor, javaVendor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAllThreadsCount()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return allThreadsCount;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "allThreadsCount");
    } catch (Exception e) {
      e.printStackTrace();
      return allThreadsCount;
    }
if(result==null)
  return allThreadsCount;
allThreadsCount=((Integer)result).intValue();
    return allThreadsCount; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllThreadsCount(int newAllThreadsCount)
  {
    int oldAllThreadsCount = allThreadsCount;
    allThreadsCount = newAllThreadsCount;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JVM__ALL_THREADS_COUNT, oldAllThreadsCount, allThreadsCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBeanServer getParent()
  {
    if (eContainerFeatureID != JOnASPackage.JVM__PARENT) return null;
    return (MBeanServer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(MBeanServer newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, JOnASPackage.JVM__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(MBeanServer newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != JOnASPackage.JVM__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, JOnASPackage.MBEAN_SERVER__JVM, MBeanServer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JVM__PARENT, newParent, newParent));
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
      case JOnASPackage.JVM__PARENT:
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
      case JOnASPackage.JVM__PARENT:
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
      case JOnASPackage.JVM__PARENT:
        return eInternalContainer().eInverseRemove(this, JOnASPackage.MBEAN_SERVER__JVM, MBeanServer.class, msgs);
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
      case JOnASPackage.JVM__JAVA_VERSION:
        return getJavaVersion();
      case JOnASPackage.JVM__JAVA_VENDOR:
        return getJavaVendor();
      case JOnASPackage.JVM__ALL_THREADS_COUNT:
        return new Integer(getAllThreadsCount());
      case JOnASPackage.JVM__PARENT:
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
      case JOnASPackage.JVM__JAVA_VERSION:
        setJavaVersion((String)newValue);
        return;
      case JOnASPackage.JVM__JAVA_VENDOR:
        setJavaVendor((String)newValue);
        return;
      case JOnASPackage.JVM__ALL_THREADS_COUNT:
        setAllThreadsCount(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JVM__PARENT:
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
      case JOnASPackage.JVM__JAVA_VERSION:
        setJavaVersion(JAVA_VERSION_EDEFAULT);
        return;
      case JOnASPackage.JVM__JAVA_VENDOR:
        setJavaVendor(JAVA_VENDOR_EDEFAULT);
        return;
      case JOnASPackage.JVM__ALL_THREADS_COUNT:
        setAllThreadsCount(ALL_THREADS_COUNT_EDEFAULT);
        return;
      case JOnASPackage.JVM__PARENT:
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
      case JOnASPackage.JVM__JAVA_VERSION:
        return JAVA_VERSION_EDEFAULT == null ? javaVersion != null : !JAVA_VERSION_EDEFAULT.equals(javaVersion);
      case JOnASPackage.JVM__JAVA_VENDOR:
        return JAVA_VENDOR_EDEFAULT == null ? javaVendor != null : !JAVA_VENDOR_EDEFAULT.equals(javaVendor);
      case JOnASPackage.JVM__ALL_THREADS_COUNT:
        return allThreadsCount != ALL_THREADS_COUNT_EDEFAULT;
      case JOnASPackage.JVM__PARENT:
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
    result.append(" (javaVersion: ");
    result.append(javaVersion);
    result.append(", javaVendor: ");
    result.append(javaVendor);
    result.append(", allThreadsCount: ");
    result.append(allThreadsCount);
    result.append(')');
    return result.toString();
  }

} //JVMImpl
