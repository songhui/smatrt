/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.EntityBean;
import JOnAS.J2EEManagedObject;
import JOnAS.JDBCDataSource;
import JOnAS.JOnASFactory;
import JOnAS.JOnASPackage;
import JOnAS.MBeanServer;
import JOnAS.SessionBean;
import JOnAS.StatefulSessionBean;
import JOnAS.StatelessSessionBean;
import JOnAS.WebModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
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



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JOnASPackageImpl extends EPackageImpl implements JOnASPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mBeanServerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass j2EEManagedObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ejbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statefulSessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statelessSessionBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityBeanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jdbcDataSourceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jvmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass webModuleEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see JOnAS.JOnASPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private JOnASPackageImpl()
  {
    super(eNS_URI, JOnASFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static JOnASPackage init()
  {
    if (isInited) return (JOnASPackage)EPackage.Registry.INSTANCE.getEPackage(JOnASPackage.eNS_URI);

    // Obtain or create and register package
    JOnASPackageImpl theJOnASPackage = (JOnASPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof JOnASPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new JOnASPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theJOnASPackage.createPackageContents();

    // Initialize created meta-data
    theJOnASPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theJOnASPackage.freeze();

    return theJOnASPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMBeanServer()
  {
    return mBeanServerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBeanServer_ServerHost()
  {
    return (EAttribute)mBeanServerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMBeanServer_ServerPort()
  {
    return (EAttribute)mBeanServerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_JdbcDataSource()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_StatefulSessionBean()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_StatelessSessionBean()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_EntityBean()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_Jvm()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMBeanServer_WebModule()
  {
    return (EReference)mBeanServerEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJ2EEManagedObject()
  {
    return j2EEManagedObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJ2EEManagedObject_Name()
  {
    return (EAttribute)j2EEManagedObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEJB()
  {
    return ejbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_JndiName()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_FileName()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_LocalClass()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_LocalHomeClass()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_HomeClass()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_EjbClass()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_CacheSize()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_PoolSize()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_MaxCacheSize()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_MinPoolSize()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_DisplayName()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEJB_DataSourceJNDI()
  {
    return (EAttribute)ejbEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSessionBean()
  {
    return sessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSessionBean_SessionTimeOut()
  {
    return (EAttribute)sessionBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatefulSessionBean()
  {
    return statefulSessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatefulSessionBean_Parent()
  {
    return (EReference)statefulSessionBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatelessSessionBean()
  {
    return statelessSessionBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatelessSessionBean_Parent()
  {
    return (EReference)statelessSessionBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntityBean()
  {
    return entityBeanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBean_PassivationTimeOut()
  {
    return (EAttribute)entityBeanEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBean_InactivityTimeOut()
  {
    return (EAttribute)entityBeanEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBean_DeadlockTimeOut()
  {
    return (EAttribute)entityBeanEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEntityBean_LockPolicy()
  {
    return (EAttribute)entityBeanEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityBean_Parent()
  {
    return (EReference)entityBeanEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJDBCDataSource()
  {
    return jdbcDataSourceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_Description()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_JdbcMinConnPool()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_JdbcMaxConnPool()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_CurrentOpened()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_JndiName()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_BusyMax()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_ConnectionFailures()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_CurrentBusy()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_UserName()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_BusyMin()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_UserPassword()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_Url()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJDBCDataSource_JdbcMaxWaiters()
  {
    return (EAttribute)jdbcDataSourceEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJDBCDataSource_Parent()
  {
    return (EReference)jdbcDataSourceEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJVM()
  {
    return jvmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJVM_JavaVersion()
  {
    return (EAttribute)jvmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJVM_JavaVendor()
  {
    return (EAttribute)jvmEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJVM_AllThreadsCount()
  {
    return (EAttribute)jvmEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJVM_Parent()
  {
    return (EReference)jvmEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWebModule()
  {
    return webModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_Path()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_StartTime()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_Hostname()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_StartupTime()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_WarURL()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWebModule_Parent()
  {
    return (EReference)webModuleEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_FileName()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWebModule_Ejbref()
  {
    return (EAttribute)webModuleEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JOnASFactory getJOnASFactory()
  {
    return (JOnASFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    mBeanServerEClass = createEClass(MBEAN_SERVER);
    createEAttribute(mBeanServerEClass, MBEAN_SERVER__SERVER_HOST);
    createEAttribute(mBeanServerEClass, MBEAN_SERVER__SERVER_PORT);
    createEReference(mBeanServerEClass, MBEAN_SERVER__JDBC_DATA_SOURCE);
    createEReference(mBeanServerEClass, MBEAN_SERVER__STATEFUL_SESSION_BEAN);
    createEReference(mBeanServerEClass, MBEAN_SERVER__STATELESS_SESSION_BEAN);
    createEReference(mBeanServerEClass, MBEAN_SERVER__ENTITY_BEAN);
    createEReference(mBeanServerEClass, MBEAN_SERVER__JVM);
    createEReference(mBeanServerEClass, MBEAN_SERVER__WEB_MODULE);

    j2EEManagedObjectEClass = createEClass(J2EE_MANAGED_OBJECT);
    createEAttribute(j2EEManagedObjectEClass, J2EE_MANAGED_OBJECT__NAME);

    ejbEClass = createEClass(EJB);
    createEAttribute(ejbEClass, EJB__JNDI_NAME);
    createEAttribute(ejbEClass, EJB__FILE_NAME);
    createEAttribute(ejbEClass, EJB__LOCAL_CLASS);
    createEAttribute(ejbEClass, EJB__LOCAL_HOME_CLASS);
    createEAttribute(ejbEClass, EJB__HOME_CLASS);
    createEAttribute(ejbEClass, EJB__EJB_CLASS);
    createEAttribute(ejbEClass, EJB__CACHE_SIZE);
    createEAttribute(ejbEClass, EJB__POOL_SIZE);
    createEAttribute(ejbEClass, EJB__MAX_CACHE_SIZE);
    createEAttribute(ejbEClass, EJB__MIN_POOL_SIZE);
    createEAttribute(ejbEClass, EJB__DISPLAY_NAME);
    createEAttribute(ejbEClass, EJB__DATA_SOURCE_JNDI);

    sessionBeanEClass = createEClass(SESSION_BEAN);
    createEAttribute(sessionBeanEClass, SESSION_BEAN__SESSION_TIME_OUT);

    statefulSessionBeanEClass = createEClass(STATEFUL_SESSION_BEAN);
    createEReference(statefulSessionBeanEClass, STATEFUL_SESSION_BEAN__PARENT);

    statelessSessionBeanEClass = createEClass(STATELESS_SESSION_BEAN);
    createEReference(statelessSessionBeanEClass, STATELESS_SESSION_BEAN__PARENT);

    entityBeanEClass = createEClass(ENTITY_BEAN);
    createEAttribute(entityBeanEClass, ENTITY_BEAN__PASSIVATION_TIME_OUT);
    createEAttribute(entityBeanEClass, ENTITY_BEAN__INACTIVITY_TIME_OUT);
    createEAttribute(entityBeanEClass, ENTITY_BEAN__DEADLOCK_TIME_OUT);
    createEAttribute(entityBeanEClass, ENTITY_BEAN__LOCK_POLICY);
    createEReference(entityBeanEClass, ENTITY_BEAN__PARENT);

    jdbcDataSourceEClass = createEClass(JDBC_DATA_SOURCE);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__DESCRIPTION);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__CURRENT_OPENED);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__JNDI_NAME);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__BUSY_MAX);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__CONNECTION_FAILURES);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__CURRENT_BUSY);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__USER_NAME);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__BUSY_MIN);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__USER_PASSWORD);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__URL);
    createEAttribute(jdbcDataSourceEClass, JDBC_DATA_SOURCE__JDBC_MAX_WAITERS);
    createEReference(jdbcDataSourceEClass, JDBC_DATA_SOURCE__PARENT);

    jvmEClass = createEClass(JVM);
    createEAttribute(jvmEClass, JVM__JAVA_VERSION);
    createEAttribute(jvmEClass, JVM__JAVA_VENDOR);
    createEAttribute(jvmEClass, JVM__ALL_THREADS_COUNT);
    createEReference(jvmEClass, JVM__PARENT);

    webModuleEClass = createEClass(WEB_MODULE);
    createEAttribute(webModuleEClass, WEB_MODULE__PATH);
    createEAttribute(webModuleEClass, WEB_MODULE__START_TIME);
    createEAttribute(webModuleEClass, WEB_MODULE__HOSTNAME);
    createEAttribute(webModuleEClass, WEB_MODULE__STARTUP_TIME);
    createEAttribute(webModuleEClass, WEB_MODULE__WAR_URL);
    createEReference(webModuleEClass, WEB_MODULE__PARENT);
    createEAttribute(webModuleEClass, WEB_MODULE__FILE_NAME);
    createEAttribute(webModuleEClass, WEB_MODULE__EJBREF);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    ejbEClass.getESuperTypes().add(this.getJ2EEManagedObject());
    sessionBeanEClass.getESuperTypes().add(this.getEJB());
    statefulSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
    statelessSessionBeanEClass.getESuperTypes().add(this.getSessionBean());
    entityBeanEClass.getESuperTypes().add(this.getEJB());
    jdbcDataSourceEClass.getESuperTypes().add(this.getJ2EEManagedObject());
    jvmEClass.getESuperTypes().add(this.getJ2EEManagedObject());
    webModuleEClass.getESuperTypes().add(this.getJ2EEManagedObject());

    // Initialize classes and features; add operations and parameters
    initEClass(mBeanServerEClass, MBeanServer.class, "MBeanServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMBeanServer_ServerHost(), ecorePackage.getEString(), "serverHost", null, 1, 1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMBeanServer_ServerPort(), ecorePackage.getEInt(), "serverPort", null, 1, 1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMBeanServer_JdbcDataSource(), this.getJDBCDataSource(), this.getJDBCDataSource_Parent(), "jdbcDataSource", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMBeanServer_StatefulSessionBean(), this.getStatefulSessionBean(), this.getStatefulSessionBean_Parent(), "statefulSessionBean", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMBeanServer_StatelessSessionBean(), this.getStatelessSessionBean(), this.getStatelessSessionBean_Parent(), "statelessSessionBean", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMBeanServer_EntityBean(), this.getEntityBean(), this.getEntityBean_Parent(), "entityBean", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMBeanServer_Jvm(), this.getJVM(), this.getJVM_Parent(), "jvm", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getMBeanServer_WebModule(), this.getWebModule(), this.getWebModule_Parent(), "webModule", null, 0, -1, MBeanServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(j2EEManagedObjectEClass, J2EEManagedObject.class, "J2EEManagedObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJ2EEManagedObject_Name(), ecorePackage.getEString(), "name", null, 1, 1, J2EEManagedObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ejbEClass, JOnAS.EJB.class, "EJB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEJB_JndiName(), ecorePackage.getEString(), "jndiName", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_LocalClass(), ecorePackage.getEString(), "localClass", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_LocalHomeClass(), ecorePackage.getEString(), "localHomeClass", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_HomeClass(), ecorePackage.getEString(), "homeClass", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_EjbClass(), ecorePackage.getEString(), "ejbClass", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_CacheSize(), ecorePackage.getEInt(), "cacheSize", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_PoolSize(), ecorePackage.getEInt(), "poolSize", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_MaxCacheSize(), ecorePackage.getEInt(), "maxCacheSize", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_MinPoolSize(), ecorePackage.getEInt(), "minPoolSize", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_DisplayName(), ecorePackage.getEString(), "displayName", null, 1, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEJB_DataSourceJNDI(), ecorePackage.getEString(), "dataSourceJNDI", null, 0, 1, JOnAS.EJB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(sessionBeanEClass, SessionBean.class, "SessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSessionBean_SessionTimeOut(), ecorePackage.getEInt(), "sessionTimeOut", null, 1, 1, SessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statefulSessionBeanEClass, StatefulSessionBean.class, "StatefulSessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatefulSessionBean_Parent(), this.getMBeanServer(), this.getMBeanServer_StatefulSessionBean(), "parent", null, 1, 1, StatefulSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statelessSessionBeanEClass, StatelessSessionBean.class, "StatelessSessionBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatelessSessionBean_Parent(), this.getMBeanServer(), this.getMBeanServer_StatelessSessionBean(), "parent", null, 1, 1, StatelessSessionBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityBeanEClass, EntityBean.class, "EntityBean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityBean_PassivationTimeOut(), ecorePackage.getEInt(), "passivationTimeOut", null, 1, 1, EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityBean_InactivityTimeOut(), ecorePackage.getEInt(), "inactivityTimeOut", null, 1, 1, EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityBean_DeadlockTimeOut(), ecorePackage.getEInt(), "deadlockTimeOut", null, 1, 1, EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEntityBean_LockPolicy(), ecorePackage.getEString(), "lockPolicy", null, 1, 1, EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityBean_Parent(), this.getMBeanServer(), this.getMBeanServer_EntityBean(), "parent", null, 1, 1, EntityBean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jdbcDataSourceEClass, JDBCDataSource.class, "JDBCDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJDBCDataSource_Description(), ecorePackage.getEString(), "description", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_JdbcMinConnPool(), ecorePackage.getEInt(), "jdbcMinConnPool", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_JdbcMaxConnPool(), ecorePackage.getEInt(), "jdbcMaxConnPool", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_CurrentOpened(), ecorePackage.getEInt(), "currentOpened", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_JndiName(), ecorePackage.getEString(), "jndiName", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_BusyMax(), ecorePackage.getEInt(), "busyMax", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_ConnectionFailures(), ecorePackage.getEInt(), "connectionFailures", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_CurrentBusy(), ecorePackage.getEInt(), "currentBusy", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_UserName(), ecorePackage.getEString(), "userName", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_BusyMin(), ecorePackage.getEInt(), "busyMin", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_UserPassword(), ecorePackage.getEString(), "userPassword", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_Url(), ecorePackage.getEString(), "url", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJDBCDataSource_JdbcMaxWaiters(), ecorePackage.getEInt(), "jdbcMaxWaiters", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJDBCDataSource_Parent(), this.getMBeanServer(), this.getMBeanServer_JdbcDataSource(), "parent", null, 1, 1, JDBCDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jvmEClass, JOnAS.JVM.class, "JVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJVM_JavaVersion(), ecorePackage.getEString(), "javaVersion", null, 1, 1, JOnAS.JVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJVM_JavaVendor(), ecorePackage.getEString(), "javaVendor", null, 1, 1, JOnAS.JVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getJVM_AllThreadsCount(), ecorePackage.getEInt(), "allThreadsCount", null, 1, 1, JOnAS.JVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJVM_Parent(), this.getMBeanServer(), this.getMBeanServer_Jvm(), "parent", null, 1, 1, JOnAS.JVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(webModuleEClass, WebModule.class, "WebModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWebModule_Path(), ecorePackage.getEString(), "path", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_StartTime(), ecorePackage.getELong(), "startTime", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_Hostname(), ecorePackage.getEString(), "hostname", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_StartupTime(), ecorePackage.getELong(), "startupTime", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_WarURL(), ecorePackage.getEString(), "warURL", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWebModule_Parent(), this.getMBeanServer(), this.getMBeanServer_WebModule(), "parent", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWebModule_Ejbref(), ecorePackage.getEString(), "ejbref", null, 1, 1, WebModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.sei.pku.edu.cn/rsa
    createRsaAnnotations();
    // http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations
    createJpAnnotations();
    // http://www.sei.pku.edu.cn/runtime-access
    createRuntimeaccessAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.sei.pku.edu.cn/rsa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRsaAnnotations()
  {
    String source = "http://www.sei.pku.edu.cn/rsa";		
    addAnnotation
      (mBeanServerEClass, 
       source, 
       new String[] 
       {
       "RootClass", "true"
       });					
  }

  /**
   * Initializes the annotations for <b>http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createJpAnnotations()
  {
    String source = "http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations";			
    addAnnotation
      (getMBeanServer_ServerHost(), 
       source, 
       new String[] 
       {
       "KeyAttribute", "true"
       });		
    addAnnotation
      (getJ2EEManagedObject_Name(), 
       source, 
       new String[] 
       {
       "KeyAttribute", "true"
       });		
    addAnnotation
      (getEJB_FileName(), 
       source, 
       new String[] 
       {
       "KeyAttribute", "true"
       });		
  }

  /**
   * Initializes the annotations for <b>http://www.sei.pku.edu.cn/runtime-access</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRuntimeaccessAnnotations()
  {
    String source = "http://www.sei.pku.edu.cn/runtime-access";						
    addAnnotation
      (jdbcDataSourceEClass, 
       source, 
       new String[] 
       {
       "create", "if(name!=null){\r\n\t\t\tManagement mgmt=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\t\ttry {\r\n\t\t\t\tString p_Filename=name;\r\n\t\t        String[] asParam = new String[1];\r\n\t\t        String[] asSignature = new String[1];\r\n\t\t        asParam[0] = p_Filename;\r\n\t\t        asSignature[0] = \"java.lang.String\";\r\n\r\n\t\t}\r\n\t\treturn null;",
       "delete", "if(name!=null){\r\n\t\t\tManagement mgmt=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\t\ttry {\r\n\t\t\t\tString p_Filename=name;\r\n\t\t        String[] asParam = new String[1];\r\n\t\t        String[] asSignature = new String[1];\r\n\t\t        asParam[0] = p_Filename;\r\n\t\t        asSignature[0] = \"java.lang.String\";\r\n\r\n\t\t}\r\n\t\treturn null;"
       });		
    addAnnotation
      (getJDBCDataSource_JdbcMaxConnPool(), 
       source, 
       new String[] 
       {
       "get", "        if(getCore()==null) \r\n        \treturn  -1;\r\n\t\t\r\n\t\tManagement mainEntry=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\tObjectName obj=(ObjectName)getCore();\r\n\t\t\r\n\t\ttry {\r\n\t\t\tObject res=mainEntry.getAttribute(obj, \"jdbcMaxConnPool\");\r\n\t\t\t\r\n\t\t\tjdbcMaxConnPool=((Integer)res).intValue();\r\n\t\t\t\r\n\t\t} catch (Exception e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n        \r\n\t\treturn jdbcMaxConnPool;//second"
       });
  }

  /*Global utility methods are generated here*/
    private long mainEntryBorn=0;
  private Management mainEntry=null; 
  public Management getMainEntry(){
    System.setProperty("java.naming.factory.initial", "org.objectweb.carol.jndi.spi.MultiOrbInitialContextFactory");
    Context initialContext=null;
    long current=System.currentTimeMillis();
    if(current-mainEntryBorn>8000){
      mainEntryBorn=current;
      mainEntry=null;
    }
    if(mainEntry!=null){
      return mainEntry;
    }
    try {
            initialContext = new InitialContext();           
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }  
        // Connecting to the MEJB home through JNDI
        ManagementHome mgmtHome=null; 
        try {
        	Object obj=initialContext.lookup("ejb/mgmt/MEJB");
            mgmtHome = (ManagementHome) PortableRemoteObject.narrow(initialContext.lookup("ejb/mgmt/MEJB"),
                    ManagementHome.class);
            mainEntry=mgmtHome.create();
        } catch (Exception e) {
           e.printStackTrace();
           return null;
        }
        return mainEntry;
  }
  
} //JOnASPackageImpl
