/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.EntityBean;
import JOnAS.JDBCDataSource;
import JOnAS.JOnASPackage;
import JOnAS.JVM;
import JOnAS.MBeanServer;
import JOnAS.StatefulSessionBean;
import JOnAS.StatelessSessionBean;
import JOnAS.WebModule;

import java.util.Collection;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>MBean Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getJdbcDataSource <em>Jdbc Data Source</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getStatefulSessionBean <em>Stateful Session Bean</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getStatelessSessionBean <em>Stateless Session Bean</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getEntityBean <em>Entity Bean</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getJvm <em>Jvm</em>}</li>
 *   <li>{@link JOnAS.impl.MBeanServerImpl#getWebModule <em>Web Module</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MBeanServerImpl extends WrappingEObjectImpl implements MBeanServer
{
  /**
   * The default value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerHost()
   * @generated
   * @ordered
   */
  protected static final String SERVER_HOST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServerHost() <em>Server Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerHost()
   * @generated
   * @ordered
   */
  protected String serverHost = SERVER_HOST_EDEFAULT;

  /**
   * The default value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerPort()
   * @generated
   * @ordered
   */
  protected static final int SERVER_PORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getServerPort() <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerPort()
   * @generated
   * @ordered
   */
  protected int serverPort = SERVER_PORT_EDEFAULT;

  /**
   * The cached value of the '{@link #getJdbcDataSource() <em>Jdbc Data Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcDataSource()
   * @generated
   * @ordered
   */
  protected EList<JDBCDataSource> jdbcDataSource;

  /**
   * The cached value of the '{@link #getStatefulSessionBean() <em>Stateful Session Bean</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatefulSessionBean()
   * @generated
   * @ordered
   */
  protected EList<StatefulSessionBean> statefulSessionBean;

  /**
   * The cached value of the '{@link #getStatelessSessionBean() <em>Stateless Session Bean</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatelessSessionBean()
   * @generated
   * @ordered
   */
  protected EList<StatelessSessionBean> statelessSessionBean;

  /**
   * The cached value of the '{@link #getEntityBean() <em>Entity Bean</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntityBean()
   * @generated
   * @ordered
   */
  protected EList<EntityBean> entityBean;

  /**
   * The cached value of the '{@link #getJvm() <em>Jvm</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvm()
   * @generated
   * @ordered
   */
  protected EList<JVM> jvm;

  /**
   * The cached value of the '{@link #getWebModule() <em>Web Module</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWebModule()
   * @generated
   * @ordered
   */
  protected EList<WebModule> webModule;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MBeanServerImpl()
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
    return JOnASPackage.Literals.MBEAN_SERVER;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
    switch(featureID){
  
  
    case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=JDBCDataSource,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
    case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=StatefulSessionBean,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
    case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=StatelessSessionBean,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
    case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=EntityBean,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
    case JOnASPackage.MBEAN_SERVER__JVM:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=JVM,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
    case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
  
      try {
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    ObjectName query=new ObjectName("jonas:j2eeType=WebModule,*");
    Set sets=mgmt.queryNames(query, null);
    result.addAll(sets);
  } catch (Exception e) {
    e.printStackTrace();
  }
    break;
    
  }
    return result;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getServerHost()
  {
        Object core=(Object)getCore();
        if(core==null) return serverHost;	
        
    return serverHost; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerHost(String newServerHost)
  {
    String oldServerHost = serverHost;
    serverHost = newServerHost;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.MBEAN_SERVER__SERVER_HOST, oldServerHost, serverHost));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getServerPort()
  {
        Object core=(Object)getCore();
        if(core==null) return serverPort;	
        
    return serverPort; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setServerPort(int newServerPort)
  {
    int oldServerPort = serverPort;
    serverPort = newServerPort;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.MBEAN_SERVER__SERVER_PORT, oldServerPort, serverPort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JDBCDataSource> getJdbcDataSource()
  {

    
    if (jdbcDataSource == null)
    {
  
  
    
      jdbcDataSource = new EObjectContainmentEListForWrapping<JDBCDataSource>(
          JDBCDataSource.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE,
          JOnASPackage.eINSTANCE.getJDBCDataSource()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<JDBCDataSource>)jdbcDataSource)
    .refreshWrap();
  
    return jdbcDataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatefulSessionBean> getStatefulSessionBean()
  {

    
    if (statefulSessionBean == null)
    {
  
  
    
      statefulSessionBean = new EObjectContainmentEListForWrapping<StatefulSessionBean>(
          StatefulSessionBean.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN,
          JOnASPackage.eINSTANCE.getStatefulSessionBean()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<StatefulSessionBean>)statefulSessionBean)
    .refreshWrap();
  
    return statefulSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StatelessSessionBean> getStatelessSessionBean()
  {

    
    if (statelessSessionBean == null)
    {
  
  
    
      statelessSessionBean = new EObjectContainmentEListForWrapping<StatelessSessionBean>(
          StatelessSessionBean.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN,
          JOnASPackage.eINSTANCE.getStatelessSessionBean()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<StatelessSessionBean>)statelessSessionBean)
    .refreshWrap();
  
    return statelessSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EntityBean> getEntityBean()
  {

    
    if (entityBean == null)
    {
  
  
    
      entityBean = new EObjectContainmentEListForWrapping<EntityBean>(
          EntityBean.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__ENTITY_BEAN,
          JOnASPackage.eINSTANCE.getEntityBean()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<EntityBean>)entityBean)
    .refreshWrap();
  
    return entityBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JVM> getJvm()
  {

    
    if (jvm == null)
    {
  
  
    
      jvm = new EObjectContainmentEListForWrapping<JVM>(
          JVM.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__JVM,
          JOnASPackage.eINSTANCE.getJVM()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<JVM>)jvm)
    .refreshWrap();
  
    return jvm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WebModule> getWebModule()
  {

    
    if (webModule == null)
    {
  
  
    
      webModule = new EObjectContainmentEListForWrapping<WebModule>(
          WebModule.class, 
          this, 
          JOnASPackage.MBEAN_SERVER__WEB_MODULE,
          JOnASPackage.eINSTANCE.getWebModule()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<WebModule>)webModule)
    .refreshWrap();
  
    return webModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getJdbcDataSource()).basicAdd(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getStatefulSessionBean()).basicAdd(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getStatelessSessionBean()).basicAdd(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntityBean()).basicAdd(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__JVM:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getJvm()).basicAdd(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getWebModule()).basicAdd(otherEnd, msgs);
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
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        return ((InternalEList<?>)getJdbcDataSource()).basicRemove(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        return ((InternalEList<?>)getStatefulSessionBean()).basicRemove(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        return ((InternalEList<?>)getStatelessSessionBean()).basicRemove(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        return ((InternalEList<?>)getEntityBean()).basicRemove(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__JVM:
        return ((InternalEList<?>)getJvm()).basicRemove(otherEnd, msgs);
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        return ((InternalEList<?>)getWebModule()).basicRemove(otherEnd, msgs);
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
      case JOnASPackage.MBEAN_SERVER__SERVER_HOST:
        return getServerHost();
      case JOnASPackage.MBEAN_SERVER__SERVER_PORT:
        return new Integer(getServerPort());
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        return getJdbcDataSource();
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        return getStatefulSessionBean();
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        return getStatelessSessionBean();
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        return getEntityBean();
      case JOnASPackage.MBEAN_SERVER__JVM:
        return getJvm();
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        return getWebModule();
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
      case JOnASPackage.MBEAN_SERVER__SERVER_HOST:
        setServerHost((String)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__SERVER_PORT:
        setServerPort(((Integer)newValue).intValue());
        return;
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        getJdbcDataSource().clear();
        getJdbcDataSource().addAll((Collection<? extends JDBCDataSource>)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        getStatefulSessionBean().clear();
        getStatefulSessionBean().addAll((Collection<? extends StatefulSessionBean>)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        getStatelessSessionBean().clear();
        getStatelessSessionBean().addAll((Collection<? extends StatelessSessionBean>)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        getEntityBean().clear();
        getEntityBean().addAll((Collection<? extends EntityBean>)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__JVM:
        getJvm().clear();
        getJvm().addAll((Collection<? extends JVM>)newValue);
        return;
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        getWebModule().clear();
        getWebModule().addAll((Collection<? extends WebModule>)newValue);
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
      case JOnASPackage.MBEAN_SERVER__SERVER_HOST:
        setServerHost(SERVER_HOST_EDEFAULT);
        return;
      case JOnASPackage.MBEAN_SERVER__SERVER_PORT:
        setServerPort(SERVER_PORT_EDEFAULT);
        return;
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        getJdbcDataSource().clear();
        return;
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        getStatefulSessionBean().clear();
        return;
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        getStatelessSessionBean().clear();
        return;
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        getEntityBean().clear();
        return;
      case JOnASPackage.MBEAN_SERVER__JVM:
        getJvm().clear();
        return;
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        getWebModule().clear();
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
      case JOnASPackage.MBEAN_SERVER__SERVER_HOST:
        return SERVER_HOST_EDEFAULT == null ? serverHost != null : !SERVER_HOST_EDEFAULT.equals(serverHost);
      case JOnASPackage.MBEAN_SERVER__SERVER_PORT:
        return serverPort != SERVER_PORT_EDEFAULT;
      case JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE:
        return jdbcDataSource != null && !jdbcDataSource.isEmpty();
      case JOnASPackage.MBEAN_SERVER__STATEFUL_SESSION_BEAN:
        return statefulSessionBean != null && !statefulSessionBean.isEmpty();
      case JOnASPackage.MBEAN_SERVER__STATELESS_SESSION_BEAN:
        return statelessSessionBean != null && !statelessSessionBean.isEmpty();
      case JOnASPackage.MBEAN_SERVER__ENTITY_BEAN:
        return entityBean != null && !entityBean.isEmpty();
      case JOnASPackage.MBEAN_SERVER__JVM:
        return jvm != null && !jvm.isEmpty();
      case JOnASPackage.MBEAN_SERVER__WEB_MODULE:
        return webModule != null && !webModule.isEmpty();
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
    result.append(" (serverHost: ");
    result.append(serverHost);
    result.append(", serverPort: ");
    result.append(serverPort);
    result.append(')');
    return result.toString();
  }

} //MBeanServerImpl
