/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.JOnASPackage;
import JOnAS.MBeanServer;
import JOnAS.StatefulSessionBean;

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
 * An implementation of the model object '<em><b>Stateful Session Bean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.StatefulSessionBeanImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatefulSessionBeanImpl  extends SessionBeanImpl implements StatefulSessionBean
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatefulSessionBeanImpl()
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
    return JOnASPackage.Literals.STATEFUL_SESSION_BEAN;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    if(fileName!=null && fileName.endsWith("jar")){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      ObjectName query;
      try {
        this.setNewborn(false);
        String[] signature={"java.lang.String"};
        String[] params=new String[1];
        params[0] = fileName;
        query = new ObjectName("jonas:j2eeType=J2EEServer,*");
        ObjectName server=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        String deployedName=(String)mgmt.invoke(server, "deployJar", params, signature);
        query=new ObjectName(deployedName);
        ObjectName module=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        String[] allEjb=(String[])mgmt.getAttribute(module, "ejbs");
        
        String qString=allEjb[0];
        query=new ObjectName(qString+",*");
        ObjectName res=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        return res;
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        return null;
      } 
    }
    return null;
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public void destroyCore(){
   	if(core==null){
      this.newborn=false;
      return;
    }
    if(core==null)
      return;
    getFileName();
    if(fileName!=null && fileName.endsWith("jar")){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      ObjectName query;
      try {
        this.setCore(null);
        this.setNewborn(false);
        String[] signature={"java.lang.String"};
        String[] params=new String[1];
        params[0] = fileName;
        query = new ObjectName("jonas:j2eeType=J2EEServer,*");
        ObjectName server=(ObjectName)mgmt.queryNames(query, null).iterator().next();
        mgmt.invoke(server, "unDeployJar", params, signature);
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } 
    }
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
  public MBeanServer getParent()
  {
    if (eContainerFeatureID != JOnASPackage.STATEFUL_SESSION_BEAN__PARENT) return null;
    return (MBeanServer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(MBeanServer newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, JOnASPackage.STATEFUL_SESSION_BEAN__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(MBeanServer newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != JOnASPackage.STATEFUL_SESSION_BEAN__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN, MBeanServer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.STATEFUL_SESSION_BEAN__PARENT, newParent, newParent));
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
        return eInternalContainer().eInverseRemove(this, JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN, MBeanServer.class, msgs);
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
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
      case JOnASPackage.STATEFUL_SESSION_BEAN__PARENT:
        return getParent() != null;
    }
    return super.eIsSet(featureID);
  }

} //StatefulSessionBeanImpl
