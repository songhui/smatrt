/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.JDBCDataSource;
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
 * An implementation of the model object '<em><b>JDBC Data Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getJdbcMinConnPool <em>Jdbc Min Conn Pool</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getJdbcMaxConnPool <em>Jdbc Max Conn Pool</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getCurrentOpened <em>Current Opened</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getBusyMax <em>Busy Max</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getConnectionFailures <em>Connection Failures</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getCurrentBusy <em>Current Busy</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getBusyMin <em>Busy Min</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getJdbcMaxWaiters <em>Jdbc Max Waiters</em>}</li>
 *   <li>{@link JOnAS.impl.JDBCDataSourceImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JDBCDataSourceImpl  extends J2EEManagedObjectImpl implements JDBCDataSource
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getJdbcMinConnPool() <em>Jdbc Min Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMinConnPool()
   * @generated
   * @ordered
   */
  protected static final int JDBC_MIN_CONN_POOL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJdbcMinConnPool() <em>Jdbc Min Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMinConnPool()
   * @generated
   * @ordered
   */
  protected int jdbcMinConnPool = JDBC_MIN_CONN_POOL_EDEFAULT;

  /**
   * The default value of the '{@link #getJdbcMaxConnPool() <em>Jdbc Max Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMaxConnPool()
   * @generated
   * @ordered
   */
  protected static final int JDBC_MAX_CONN_POOL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJdbcMaxConnPool() <em>Jdbc Max Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMaxConnPool()
   * @generated
   * @ordered
   */
  protected int jdbcMaxConnPool = JDBC_MAX_CONN_POOL_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrentOpened() <em>Current Opened</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentOpened()
   * @generated
   * @ordered
   */
  protected static final int CURRENT_OPENED_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCurrentOpened() <em>Current Opened</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentOpened()
   * @generated
   * @ordered
   */
  protected int currentOpened = CURRENT_OPENED_EDEFAULT;

  /**
   * The default value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJndiName()
   * @generated
   * @ordered
   */
  protected static final String JNDI_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJndiName() <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJndiName()
   * @generated
   * @ordered
   */
  protected String jndiName = JNDI_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBusyMax() <em>Busy Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusyMax()
   * @generated
   * @ordered
   */
  protected static final int BUSY_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBusyMax() <em>Busy Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusyMax()
   * @generated
   * @ordered
   */
  protected int busyMax = BUSY_MAX_EDEFAULT;

  /**
   * The default value of the '{@link #getConnectionFailures() <em>Connection Failures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionFailures()
   * @generated
   * @ordered
   */
  protected static final int CONNECTION_FAILURES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getConnectionFailures() <em>Connection Failures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnectionFailures()
   * @generated
   * @ordered
   */
  protected int connectionFailures = CONNECTION_FAILURES_EDEFAULT;

  /**
   * The default value of the '{@link #getCurrentBusy() <em>Current Busy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentBusy()
   * @generated
   * @ordered
   */
  protected static final int CURRENT_BUSY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCurrentBusy() <em>Current Busy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentBusy()
   * @generated
   * @ordered
   */
  protected int currentBusy = CURRENT_BUSY_EDEFAULT;

  /**
   * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserName()
   * @generated
   * @ordered
   */
  protected static final String USER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserName()
   * @generated
   * @ordered
   */
  protected String userName = USER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBusyMin() <em>Busy Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusyMin()
   * @generated
   * @ordered
   */
  protected static final int BUSY_MIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBusyMin() <em>Busy Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBusyMin()
   * @generated
   * @ordered
   */
  protected int busyMin = BUSY_MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getUserPassword() <em>User Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserPassword()
   * @generated
   * @ordered
   */
  protected static final String USER_PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUserPassword() <em>User Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUserPassword()
   * @generated
   * @ordered
   */
  protected String userPassword = USER_PASSWORD_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getJdbcMaxWaiters() <em>Jdbc Max Waiters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMaxWaiters()
   * @generated
   * @ordered
   */
  protected static final int JDBC_MAX_WAITERS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getJdbcMaxWaiters() <em>Jdbc Max Waiters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJdbcMaxWaiters()
   * @generated
   * @ordered
   */
  protected int jdbcMaxWaiters = JDBC_MAX_WAITERS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JDBCDataSourceImpl()
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
    return JOnASPackage.Literals.JDBC_DATA_SOURCE;
  }
  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object createCore(){
    if(name!=null){
      Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
      try {
        String p_Filename=name;
            String[] asParam = new String[1];
            String[] asSignature = new String[1];
            asParam[0] = p_Filename;
            asSignature[0] = "java.lang.String";

            ObjectName onDb=new ObjectName("jonas:type=service,name=database");
            // Verify if datasource already loaded
            Boolean oLoaded = (Boolean) mgmt.invoke(onDb, "isLoadedDataSource", asParam
                , asSignature);
            if (oLoaded.booleanValue() == false) {
                // Get Datasource properties file
                Properties oProps = (Properties) mgmt.invoke(onDb
                    , "getDataSourcePropertiesFile", asParam, asSignature);
                // Load Datasource
                Object[] aoParam = {
                    p_Filename, oProps, new Boolean(true)};
                String[] asSign_3 = {
                    "java.lang.String", "java.util.Properties", "java.lang.Boolean"};
                mgmt.invoke(onDb, "loadDataSource", aoParam, asSign_3);
            }
            else {
                return null;
            }
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
    Management mgmt=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    try{
            String[] asParam = new String[1];
            asParam[0] = name;
            String[] asSignature = new String[1];
            asSignature[0] = "java.lang.String";
            ObjectName onDb=new ObjectName("jonas:type=service,name=database");
            mgmt.invoke(onDb, "unloadDataSource"
                , asParam, asSignature);

    }
    catch(Exception e){
      e.printStackTrace();
      return;
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
  public String getDescription()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return description;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "description");
    } catch (Exception e) {
      e.printStackTrace();
      return description;
    }
if(result==null)
  return description;
description=result.toString();
    return description; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getJdbcMinConnPool()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return jdbcMinConnPool;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "jdbcMinConnPool");
    } catch (Exception e) {
      e.printStackTrace();
      return jdbcMinConnPool;
    }
if(result==null)
  return jdbcMinConnPool;
jdbcMinConnPool=((Integer)result).intValue();
    return jdbcMinConnPool; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJdbcMinConnPool(int newJdbcMinConnPool)
  {
    int oldJdbcMinConnPool = jdbcMinConnPool;
    jdbcMinConnPool = newJdbcMinConnPool;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL, oldJdbcMinConnPool, jdbcMinConnPool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getJdbcMaxConnPool()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return jdbcMaxConnPool;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "jdbcMaxConnPool");
    } catch (Exception e) {
      e.printStackTrace();
      return jdbcMaxConnPool;
    }
if(result==null)
  return jdbcMaxConnPool;
jdbcMaxConnPool=((Integer)result).intValue();
    return jdbcMaxConnPool; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJdbcMaxConnPool(int newJdbcMaxConnPool)
  {
    int oldJdbcMaxConnPool = jdbcMaxConnPool;
    jdbcMaxConnPool = newJdbcMaxConnPool;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL, oldJdbcMaxConnPool, jdbcMaxConnPool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCurrentOpened()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return currentOpened;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "currentOpened");
    } catch (Exception e) {
      e.printStackTrace();
      return currentOpened;
    }
if(result==null)
  return currentOpened;
currentOpened=((Integer)result).intValue();
    return currentOpened; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentOpened(int newCurrentOpened)
  {
    int oldCurrentOpened = currentOpened;
    currentOpened = newCurrentOpened;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__CURRENT_OPENED, oldCurrentOpened, currentOpened));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getJndiName()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return jndiName;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "jndiName");
    } catch (Exception e) {
      e.printStackTrace();
      return jndiName;
    }
if(result==null)
  return jndiName;
jndiName=result.toString();
    return jndiName; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJndiName(String newJndiName)
  {
    String oldJndiName = jndiName;
    jndiName = newJndiName;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__JNDI_NAME, oldJndiName, jndiName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBusyMax()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return busyMax;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "busyMax");
    } catch (Exception e) {
      e.printStackTrace();
      return busyMax;
    }
if(result==null)
  return busyMax;
busyMax=((Integer)result).intValue();
    return busyMax; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusyMax(int newBusyMax)
  {
    int oldBusyMax = busyMax;
    busyMax = newBusyMax;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__BUSY_MAX, oldBusyMax, busyMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getConnectionFailures()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return connectionFailures;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "connectionFailures");
    } catch (Exception e) {
      e.printStackTrace();
      return connectionFailures;
    }
if(result==null)
  return connectionFailures;
connectionFailures=((Integer)result).intValue();
    return connectionFailures; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConnectionFailures(int newConnectionFailures)
  {
    int oldConnectionFailures = connectionFailures;
    connectionFailures = newConnectionFailures;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__CONNECTION_FAILURES, oldConnectionFailures, connectionFailures));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCurrentBusy()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return currentBusy;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "currentBusy");
    } catch (Exception e) {
      e.printStackTrace();
      return currentBusy;
    }
if(result==null)
  return currentBusy;
currentBusy=((Integer)result).intValue();
    return currentBusy; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentBusy(int newCurrentBusy)
  {
    int oldCurrentBusy = currentBusy;
    currentBusy = newCurrentBusy;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__CURRENT_BUSY, oldCurrentBusy, currentBusy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUserName()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return userName;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "userName");
    } catch (Exception e) {
      e.printStackTrace();
      return userName;
    }
if(result==null)
  return userName;
userName=result.toString();
    return userName; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserName(String newUserName)
  {
    String oldUserName = userName;
    userName = newUserName;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__USER_NAME, oldUserName, userName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBusyMin()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return busyMin;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "busyMin");
    } catch (Exception e) {
      e.printStackTrace();
      return busyMin;
    }
if(result==null)
  return busyMin;
busyMin=((Integer)result).intValue();
    return busyMin; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBusyMin(int newBusyMin)
  {
    int oldBusyMin = busyMin;
    busyMin = newBusyMin;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__BUSY_MIN, oldBusyMin, busyMin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUserPassword()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return userPassword;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "userPassword");
    } catch (Exception e) {
      e.printStackTrace();
      return userPassword;
    }
if(result==null)
  return userPassword;
userPassword=result.toString();
    return userPassword; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUserPassword(String newUserPassword)
  {
    String oldUserPassword = userPassword;
    userPassword = newUserPassword;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__USER_PASSWORD, oldUserPassword, userPassword));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return url;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "url");
    } catch (Exception e) {
      e.printStackTrace();
      return url;
    }
if(result==null)
  return url;
url=result.toString();
    return url; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getJdbcMaxWaiters()
  {
        ObjectName core=(ObjectName)getCore();
        if(core==null) return jdbcMaxWaiters;	
        Management mainEntry=((JOnASPackageImpl)JOnASPackage.eINSTANCE).getMainEntry();
    Object result=null;	
    try {
      result=mainEntry.getAttribute(core, "jdbcMaxWaiters");
    } catch (Exception e) {
      e.printStackTrace();
      return jdbcMaxWaiters;
    }
if(result==null)
  return jdbcMaxWaiters;
jdbcMaxWaiters=((Integer)result).intValue();
    return jdbcMaxWaiters; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJdbcMaxWaiters(int newJdbcMaxWaiters)
  {
    int oldJdbcMaxWaiters = jdbcMaxWaiters;
    jdbcMaxWaiters = newJdbcMaxWaiters;
        	
      ObjectName core=(ObjectName)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_WAITERS, oldJdbcMaxWaiters, jdbcMaxWaiters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBeanServer getParent()
  {
    if (eContainerFeatureID != JOnASPackage.JDBC_DATA_SOURCE__PARENT) return null;
    return (MBeanServer)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(MBeanServer newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, JOnASPackage.JDBC_DATA_SOURCE__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(MBeanServer newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != JOnASPackage.JDBC_DATA_SOURCE__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE, MBeanServer.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JOnASPackage.JDBC_DATA_SOURCE__PARENT, newParent, newParent));
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
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
        return eInternalContainer().eInverseRemove(this, JOnASPackage.MBEAN_SERVER__JDBC_DATA_SOURCE, MBeanServer.class, msgs);
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
      case JOnASPackage.JDBC_DATA_SOURCE__DESCRIPTION:
        return getDescription();
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL:
        return new Integer(getJdbcMinConnPool());
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL:
        return new Integer(getJdbcMaxConnPool());
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_OPENED:
        return new Integer(getCurrentOpened());
      case JOnASPackage.JDBC_DATA_SOURCE__JNDI_NAME:
        return getJndiName();
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MAX:
        return new Integer(getBusyMax());
      case JOnASPackage.JDBC_DATA_SOURCE__CONNECTION_FAILURES:
        return new Integer(getConnectionFailures());
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_BUSY:
        return new Integer(getCurrentBusy());
      case JOnASPackage.JDBC_DATA_SOURCE__USER_NAME:
        return getUserName();
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MIN:
        return new Integer(getBusyMin());
      case JOnASPackage.JDBC_DATA_SOURCE__USER_PASSWORD:
        return getUserPassword();
      case JOnASPackage.JDBC_DATA_SOURCE__URL:
        return getUrl();
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_WAITERS:
        return new Integer(getJdbcMaxWaiters());
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
      case JOnASPackage.JDBC_DATA_SOURCE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL:
        setJdbcMinConnPool(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL:
        setJdbcMaxConnPool(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_OPENED:
        setCurrentOpened(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JNDI_NAME:
        setJndiName((String)newValue);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MAX:
        setBusyMax(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CONNECTION_FAILURES:
        setConnectionFailures(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_BUSY:
        setCurrentBusy(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_NAME:
        setUserName((String)newValue);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MIN:
        setBusyMin(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_PASSWORD:
        setUserPassword((String)newValue);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__URL:
        setUrl((String)newValue);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_WAITERS:
        setJdbcMaxWaiters(((Integer)newValue).intValue());
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
      case JOnASPackage.JDBC_DATA_SOURCE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL:
        setJdbcMinConnPool(JDBC_MIN_CONN_POOL_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL:
        setJdbcMaxConnPool(JDBC_MAX_CONN_POOL_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_OPENED:
        setCurrentOpened(CURRENT_OPENED_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JNDI_NAME:
        setJndiName(JNDI_NAME_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MAX:
        setBusyMax(BUSY_MAX_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CONNECTION_FAILURES:
        setConnectionFailures(CONNECTION_FAILURES_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_BUSY:
        setCurrentBusy(CURRENT_BUSY_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_NAME:
        setUserName(USER_NAME_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MIN:
        setBusyMin(BUSY_MIN_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_PASSWORD:
        setUserPassword(USER_PASSWORD_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_WAITERS:
        setJdbcMaxWaiters(JDBC_MAX_WAITERS_EDEFAULT);
        return;
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
      case JOnASPackage.JDBC_DATA_SOURCE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL:
        return jdbcMinConnPool != JDBC_MIN_CONN_POOL_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL:
        return jdbcMaxConnPool != JDBC_MAX_CONN_POOL_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_OPENED:
        return currentOpened != CURRENT_OPENED_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__JNDI_NAME:
        return JNDI_NAME_EDEFAULT == null ? jndiName != null : !JNDI_NAME_EDEFAULT.equals(jndiName);
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MAX:
        return busyMax != BUSY_MAX_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__CONNECTION_FAILURES:
        return connectionFailures != CONNECTION_FAILURES_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__CURRENT_BUSY:
        return currentBusy != CURRENT_BUSY_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_NAME:
        return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
      case JOnASPackage.JDBC_DATA_SOURCE__BUSY_MIN:
        return busyMin != BUSY_MIN_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__USER_PASSWORD:
        return USER_PASSWORD_EDEFAULT == null ? userPassword != null : !USER_PASSWORD_EDEFAULT.equals(userPassword);
      case JOnASPackage.JDBC_DATA_SOURCE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case JOnASPackage.JDBC_DATA_SOURCE__JDBC_MAX_WAITERS:
        return jdbcMaxWaiters != JDBC_MAX_WAITERS_EDEFAULT;
      case JOnASPackage.JDBC_DATA_SOURCE__PARENT:
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
    result.append(" (description: ");
    result.append(description);
    result.append(", jdbcMinConnPool: ");
    result.append(jdbcMinConnPool);
    result.append(", jdbcMaxConnPool: ");
    result.append(jdbcMaxConnPool);
    result.append(", currentOpened: ");
    result.append(currentOpened);
    result.append(", jndiName: ");
    result.append(jndiName);
    result.append(", busyMax: ");
    result.append(busyMax);
    result.append(", connectionFailures: ");
    result.append(connectionFailures);
    result.append(", currentBusy: ");
    result.append(currentBusy);
    result.append(", userName: ");
    result.append(userName);
    result.append(", busyMin: ");
    result.append(busyMin);
    result.append(", userPassword: ");
    result.append(userPassword);
    result.append(", url: ");
    result.append(url);
    result.append(", jdbcMaxWaiters: ");
    result.append(jdbcMaxWaiters);
    result.append(')');
    return result.toString();
  }

} //JDBCDataSourceImpl
