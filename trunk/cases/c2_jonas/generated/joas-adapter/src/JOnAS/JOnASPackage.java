/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;



/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JOnAS.JOnASFactory
 * @model kind="package"
 * @generated
 */
public interface JOnASPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "JOnAS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sei.pku.edu.cn/rsa/jonas_test";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "JOnAS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JOnASPackage eINSTANCE = JOnAS.impl.JOnASPackageImpl.init();

  /**
   * The meta object id for the '{@link JOnAS.impl.MBeanServerImpl <em>MBean Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.MBeanServerImpl
   * @see JOnAS.impl.JOnASPackageImpl#getMBeanServer()
   * @generated
   */
  int MBEAN_SERVER = 0;

  /**
   * The feature id for the '<em><b>Server Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__SERVER_HOST = 0;

  /**
   * The feature id for the '<em><b>Server Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__SERVER_PORT = 1;

  /**
   * The feature id for the '<em><b>Jdbc Data Source</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__JDBC_DATA_SOURCE = 2;

  /**
   * The feature id for the '<em><b>Stateful Session Bean</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__STATEFUL_SESSION_BEAN = 3;

  /**
   * The feature id for the '<em><b>Stateless Session Bean</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__STATELESS_SESSION_BEAN = 4;

  /**
   * The feature id for the '<em><b>Entity Bean</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__ENTITY_BEAN = 5;

  /**
   * The feature id for the '<em><b>Jvm</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__JVM = 6;

  /**
   * The feature id for the '<em><b>Web Module</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER__WEB_MODULE = 7;

  /**
   * The number of structural features of the '<em>MBean Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MBEAN_SERVER_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link JOnAS.impl.J2EEManagedObjectImpl <em>J2EE Managed Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.J2EEManagedObjectImpl
   * @see JOnAS.impl.JOnASPackageImpl#getJ2EEManagedObject()
   * @generated
   */
  int J2EE_MANAGED_OBJECT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int J2EE_MANAGED_OBJECT__NAME = 0;

  /**
   * The number of structural features of the '<em>J2EE Managed Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int J2EE_MANAGED_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link JOnAS.impl.EJBImpl <em>EJB</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.EJBImpl
   * @see JOnAS.impl.JOnASPackageImpl#getEJB()
   * @generated
   */
  int EJB = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__NAME = J2EE_MANAGED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__JNDI_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__FILE_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__LOCAL_CLASS = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__LOCAL_HOME_CLASS = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__HOME_CLASS = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__EJB_CLASS = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__CACHE_SIZE = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__POOL_SIZE = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__MAX_CACHE_SIZE = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__MIN_POOL_SIZE = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__DISPLAY_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB__DATA_SOURCE_JNDI = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>EJB</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EJB_FEATURE_COUNT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link JOnAS.impl.SessionBeanImpl <em>Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.SessionBeanImpl
   * @see JOnAS.impl.JOnASPackageImpl#getSessionBean()
   * @generated
   */
  int SESSION_BEAN = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__NAME = EJB__NAME;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__JNDI_NAME = EJB__JNDI_NAME;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__FILE_NAME = EJB__FILE_NAME;

  /**
   * The feature id for the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__LOCAL_CLASS = EJB__LOCAL_CLASS;

  /**
   * The feature id for the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__LOCAL_HOME_CLASS = EJB__LOCAL_HOME_CLASS;

  /**
   * The feature id for the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__HOME_CLASS = EJB__HOME_CLASS;

  /**
   * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__EJB_CLASS = EJB__EJB_CLASS;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__CACHE_SIZE = EJB__CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__POOL_SIZE = EJB__POOL_SIZE;

  /**
   * The feature id for the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__MAX_CACHE_SIZE = EJB__MAX_CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__MIN_POOL_SIZE = EJB__MIN_POOL_SIZE;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__DISPLAY_NAME = EJB__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__DATA_SOURCE_JNDI = EJB__DATA_SOURCE_JNDI;

  /**
   * The feature id for the '<em><b>Session Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN__SESSION_TIME_OUT = EJB_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link JOnAS.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.StatefulSessionBeanImpl
   * @see JOnAS.impl.JOnASPackageImpl#getStatefulSessionBean()
   * @generated
   */
  int STATEFUL_SESSION_BEAN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__JNDI_NAME = SESSION_BEAN__JNDI_NAME;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__FILE_NAME = SESSION_BEAN__FILE_NAME;

  /**
   * The feature id for the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__LOCAL_CLASS = SESSION_BEAN__LOCAL_CLASS;

  /**
   * The feature id for the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__LOCAL_HOME_CLASS = SESSION_BEAN__LOCAL_HOME_CLASS;

  /**
   * The feature id for the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__HOME_CLASS = SESSION_BEAN__HOME_CLASS;

  /**
   * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__EJB_CLASS = SESSION_BEAN__EJB_CLASS;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__CACHE_SIZE = SESSION_BEAN__CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__POOL_SIZE = SESSION_BEAN__POOL_SIZE;

  /**
   * The feature id for the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__MAX_CACHE_SIZE = SESSION_BEAN__MAX_CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__MIN_POOL_SIZE = SESSION_BEAN__MIN_POOL_SIZE;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__DISPLAY_NAME = SESSION_BEAN__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__DATA_SOURCE_JNDI = SESSION_BEAN__DATA_SOURCE_JNDI;

  /**
   * The feature id for the '<em><b>Session Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__SESSION_TIME_OUT = SESSION_BEAN__SESSION_TIME_OUT;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN__PARENT = SESSION_BEAN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stateful Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEFUL_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link JOnAS.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.StatelessSessionBeanImpl
   * @see JOnAS.impl.JOnASPackageImpl#getStatelessSessionBean()
   * @generated
   */
  int STATELESS_SESSION_BEAN = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__NAME = SESSION_BEAN__NAME;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__JNDI_NAME = SESSION_BEAN__JNDI_NAME;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__FILE_NAME = SESSION_BEAN__FILE_NAME;

  /**
   * The feature id for the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__LOCAL_CLASS = SESSION_BEAN__LOCAL_CLASS;

  /**
   * The feature id for the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__LOCAL_HOME_CLASS = SESSION_BEAN__LOCAL_HOME_CLASS;

  /**
   * The feature id for the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__HOME_CLASS = SESSION_BEAN__HOME_CLASS;

  /**
   * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__EJB_CLASS = SESSION_BEAN__EJB_CLASS;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__CACHE_SIZE = SESSION_BEAN__CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__POOL_SIZE = SESSION_BEAN__POOL_SIZE;

  /**
   * The feature id for the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__MAX_CACHE_SIZE = SESSION_BEAN__MAX_CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__MIN_POOL_SIZE = SESSION_BEAN__MIN_POOL_SIZE;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__DISPLAY_NAME = SESSION_BEAN__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__DATA_SOURCE_JNDI = SESSION_BEAN__DATA_SOURCE_JNDI;

  /**
   * The feature id for the '<em><b>Session Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__SESSION_TIME_OUT = SESSION_BEAN__SESSION_TIME_OUT;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN__PARENT = SESSION_BEAN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Stateless Session Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATELESS_SESSION_BEAN_FEATURE_COUNT = SESSION_BEAN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link JOnAS.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.EntityBeanImpl
   * @see JOnAS.impl.JOnASPackageImpl#getEntityBean()
   * @generated
   */
  int ENTITY_BEAN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__NAME = EJB__NAME;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__JNDI_NAME = EJB__JNDI_NAME;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__FILE_NAME = EJB__FILE_NAME;

  /**
   * The feature id for the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__LOCAL_CLASS = EJB__LOCAL_CLASS;

  /**
   * The feature id for the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__LOCAL_HOME_CLASS = EJB__LOCAL_HOME_CLASS;

  /**
   * The feature id for the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__HOME_CLASS = EJB__HOME_CLASS;

  /**
   * The feature id for the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__EJB_CLASS = EJB__EJB_CLASS;

  /**
   * The feature id for the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__CACHE_SIZE = EJB__CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__POOL_SIZE = EJB__POOL_SIZE;

  /**
   * The feature id for the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__MAX_CACHE_SIZE = EJB__MAX_CACHE_SIZE;

  /**
   * The feature id for the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__MIN_POOL_SIZE = EJB__MIN_POOL_SIZE;

  /**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__DISPLAY_NAME = EJB__DISPLAY_NAME;

  /**
   * The feature id for the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__DATA_SOURCE_JNDI = EJB__DATA_SOURCE_JNDI;

  /**
   * The feature id for the '<em><b>Passivation Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__PASSIVATION_TIME_OUT = EJB_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inactivity Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__INACTIVITY_TIME_OUT = EJB_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Deadlock Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__DEADLOCK_TIME_OUT = EJB_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Lock Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__LOCK_POLICY = EJB_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN__PARENT = EJB_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Entity Bean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_BEAN_FEATURE_COUNT = EJB_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link JOnAS.impl.JDBCDataSourceImpl <em>JDBC Data Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.JDBCDataSourceImpl
   * @see JOnAS.impl.JOnASPackageImpl#getJDBCDataSource()
   * @generated
   */
  int JDBC_DATA_SOURCE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__NAME = J2EE_MANAGED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__DESCRIPTION = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Jdbc Min Conn Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Jdbc Max Conn Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Current Opened</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__CURRENT_OPENED = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__JNDI_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Busy Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__BUSY_MAX = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Connection Failures</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__CONNECTION_FAILURES = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Current Busy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__CURRENT_BUSY = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__USER_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Busy Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__BUSY_MIN = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>User Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__USER_PASSWORD = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__URL = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Jdbc Max Waiters</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__JDBC_MAX_WAITERS = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE__PARENT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 13;

  /**
   * The number of structural features of the '<em>JDBC Data Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JDBC_DATA_SOURCE_FEATURE_COUNT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 14;

  /**
   * The meta object id for the '{@link JOnAS.impl.JVMImpl <em>JVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.JVMImpl
   * @see JOnAS.impl.JOnASPackageImpl#getJVM()
   * @generated
   */
  int JVM = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM__NAME = J2EE_MANAGED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Java Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM__JAVA_VERSION = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Java Vendor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM__JAVA_VENDOR = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>All Threads Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM__ALL_THREADS_COUNT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM__PARENT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>JVM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_FEATURE_COUNT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link JOnAS.impl.WebModuleImpl <em>Web Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see JOnAS.impl.WebModuleImpl
   * @see JOnAS.impl.JOnASPackageImpl#getWebModule()
   * @generated
   */
  int WEB_MODULE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__NAME = J2EE_MANAGED_OBJECT__NAME;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__PATH = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__START_TIME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__HOSTNAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Startup Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__STARTUP_TIME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>War URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__WAR_URL = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__PARENT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__FILE_NAME = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Ejbref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE__EJBREF = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Web Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEB_MODULE_FEATURE_COUNT = J2EE_MANAGED_OBJECT_FEATURE_COUNT + 8;


  /**
   * Returns the meta object for class '{@link JOnAS.MBeanServer <em>MBean Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MBean Server</em>'.
   * @see JOnAS.MBeanServer
   * @generated
   */
  EClass getMBeanServer();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.MBeanServer#getServerHost <em>Server Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Host</em>'.
   * @see JOnAS.MBeanServer#getServerHost()
   * @see #getMBeanServer()
   * @generated
   */
  EAttribute getMBeanServer_ServerHost();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.MBeanServer#getServerPort <em>Server Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Port</em>'.
   * @see JOnAS.MBeanServer#getServerPort()
   * @see #getMBeanServer()
   * @generated
   */
  EAttribute getMBeanServer_ServerPort();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getJdbcDataSource <em>Jdbc Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Jdbc Data Source</em>'.
   * @see JOnAS.MBeanServer#getJdbcDataSource()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_JdbcDataSource();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getStatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stateful Session Bean</em>'.
   * @see JOnAS.MBeanServer#getStatefulSessionBean()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_StatefulSessionBean();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getStatelessSessionBean <em>Stateless Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stateless Session Bean</em>'.
   * @see JOnAS.MBeanServer#getStatelessSessionBean()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_StatelessSessionBean();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getEntityBean <em>Entity Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entity Bean</em>'.
   * @see JOnAS.MBeanServer#getEntityBean()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_EntityBean();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getJvm <em>Jvm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Jvm</em>'.
   * @see JOnAS.MBeanServer#getJvm()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_Jvm();

  /**
   * Returns the meta object for the containment reference list '{@link JOnAS.MBeanServer#getWebModule <em>Web Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Web Module</em>'.
   * @see JOnAS.MBeanServer#getWebModule()
   * @see #getMBeanServer()
   * @generated
   */
  EReference getMBeanServer_WebModule();

  /**
   * Returns the meta object for class '{@link JOnAS.J2EEManagedObject <em>J2EE Managed Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>J2EE Managed Object</em>'.
   * @see JOnAS.J2EEManagedObject
   * @generated
   */
  EClass getJ2EEManagedObject();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.J2EEManagedObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see JOnAS.J2EEManagedObject#getName()
   * @see #getJ2EEManagedObject()
   * @generated
   */
  EAttribute getJ2EEManagedObject_Name();

  /**
   * Returns the meta object for class '{@link JOnAS.EJB <em>EJB</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EJB</em>'.
   * @see JOnAS.EJB
   * @generated
   */
  EClass getEJB();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getJndiName <em>Jndi Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jndi Name</em>'.
   * @see JOnAS.EJB#getJndiName()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_JndiName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see JOnAS.EJB#getFileName()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_FileName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getLocalClass <em>Local Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Class</em>'.
   * @see JOnAS.EJB#getLocalClass()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_LocalClass();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getLocalHomeClass <em>Local Home Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Local Home Class</em>'.
   * @see JOnAS.EJB#getLocalHomeClass()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_LocalHomeClass();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getHomeClass <em>Home Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Home Class</em>'.
   * @see JOnAS.EJB#getHomeClass()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_HomeClass();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getEjbClass <em>Ejb Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ejb Class</em>'.
   * @see JOnAS.EJB#getEjbClass()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_EjbClass();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getCacheSize <em>Cache Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cache Size</em>'.
   * @see JOnAS.EJB#getCacheSize()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_CacheSize();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getPoolSize <em>Pool Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pool Size</em>'.
   * @see JOnAS.EJB#getPoolSize()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_PoolSize();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getMaxCacheSize <em>Max Cache Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max Cache Size</em>'.
   * @see JOnAS.EJB#getMaxCacheSize()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_MaxCacheSize();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getMinPoolSize <em>Min Pool Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min Pool Size</em>'.
   * @see JOnAS.EJB#getMinPoolSize()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_MinPoolSize();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see JOnAS.EJB#getDisplayName()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_DisplayName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EJB#getDataSourceJNDI <em>Data Source JNDI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Source JNDI</em>'.
   * @see JOnAS.EJB#getDataSourceJNDI()
   * @see #getEJB()
   * @generated
   */
  EAttribute getEJB_DataSourceJNDI();

  /**
   * Returns the meta object for class '{@link JOnAS.SessionBean <em>Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session Bean</em>'.
   * @see JOnAS.SessionBean
   * @generated
   */
  EClass getSessionBean();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.SessionBean#getSessionTimeOut <em>Session Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Session Time Out</em>'.
   * @see JOnAS.SessionBean#getSessionTimeOut()
   * @see #getSessionBean()
   * @generated
   */
  EAttribute getSessionBean_SessionTimeOut();

  /**
   * Returns the meta object for class '{@link JOnAS.StatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stateful Session Bean</em>'.
   * @see JOnAS.StatefulSessionBean
   * @generated
   */
  EClass getStatefulSessionBean();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.StatefulSessionBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.StatefulSessionBean#getParent()
   * @see #getStatefulSessionBean()
   * @generated
   */
  EReference getStatefulSessionBean_Parent();

  /**
   * Returns the meta object for class '{@link JOnAS.StatelessSessionBean <em>Stateless Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stateless Session Bean</em>'.
   * @see JOnAS.StatelessSessionBean
   * @generated
   */
  EClass getStatelessSessionBean();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.StatelessSessionBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.StatelessSessionBean#getParent()
   * @see #getStatelessSessionBean()
   * @generated
   */
  EReference getStatelessSessionBean_Parent();

  /**
   * Returns the meta object for class '{@link JOnAS.EntityBean <em>Entity Bean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Bean</em>'.
   * @see JOnAS.EntityBean
   * @generated
   */
  EClass getEntityBean();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EntityBean#getPassivationTimeOut <em>Passivation Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Passivation Time Out</em>'.
   * @see JOnAS.EntityBean#getPassivationTimeOut()
   * @see #getEntityBean()
   * @generated
   */
  EAttribute getEntityBean_PassivationTimeOut();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EntityBean#getInactivityTimeOut <em>Inactivity Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inactivity Time Out</em>'.
   * @see JOnAS.EntityBean#getInactivityTimeOut()
   * @see #getEntityBean()
   * @generated
   */
  EAttribute getEntityBean_InactivityTimeOut();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EntityBean#getDeadlockTimeOut <em>Deadlock Time Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Deadlock Time Out</em>'.
   * @see JOnAS.EntityBean#getDeadlockTimeOut()
   * @see #getEntityBean()
   * @generated
   */
  EAttribute getEntityBean_DeadlockTimeOut();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.EntityBean#getLockPolicy <em>Lock Policy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lock Policy</em>'.
   * @see JOnAS.EntityBean#getLockPolicy()
   * @see #getEntityBean()
   * @generated
   */
  EAttribute getEntityBean_LockPolicy();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.EntityBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.EntityBean#getParent()
   * @see #getEntityBean()
   * @generated
   */
  EReference getEntityBean_Parent();

  /**
   * Returns the meta object for class '{@link JOnAS.JDBCDataSource <em>JDBC Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JDBC Data Source</em>'.
   * @see JOnAS.JDBCDataSource
   * @generated
   */
  EClass getJDBCDataSource();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see JOnAS.JDBCDataSource#getDescription()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_Description();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getJdbcMinConnPool <em>Jdbc Min Conn Pool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jdbc Min Conn Pool</em>'.
   * @see JOnAS.JDBCDataSource#getJdbcMinConnPool()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_JdbcMinConnPool();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getJdbcMaxConnPool <em>Jdbc Max Conn Pool</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jdbc Max Conn Pool</em>'.
   * @see JOnAS.JDBCDataSource#getJdbcMaxConnPool()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_JdbcMaxConnPool();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getCurrentOpened <em>Current Opened</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Opened</em>'.
   * @see JOnAS.JDBCDataSource#getCurrentOpened()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_CurrentOpened();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getJndiName <em>Jndi Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jndi Name</em>'.
   * @see JOnAS.JDBCDataSource#getJndiName()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_JndiName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getBusyMax <em>Busy Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Busy Max</em>'.
   * @see JOnAS.JDBCDataSource#getBusyMax()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_BusyMax();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getConnectionFailures <em>Connection Failures</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Connection Failures</em>'.
   * @see JOnAS.JDBCDataSource#getConnectionFailures()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_ConnectionFailures();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getCurrentBusy <em>Current Busy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Busy</em>'.
   * @see JOnAS.JDBCDataSource#getCurrentBusy()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_CurrentBusy();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getUserName <em>User Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Name</em>'.
   * @see JOnAS.JDBCDataSource#getUserName()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_UserName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getBusyMin <em>Busy Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Busy Min</em>'.
   * @see JOnAS.JDBCDataSource#getBusyMin()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_BusyMin();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getUserPassword <em>User Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>User Password</em>'.
   * @see JOnAS.JDBCDataSource#getUserPassword()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_UserPassword();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see JOnAS.JDBCDataSource#getUrl()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_Url();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JDBCDataSource#getJdbcMaxWaiters <em>Jdbc Max Waiters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jdbc Max Waiters</em>'.
   * @see JOnAS.JDBCDataSource#getJdbcMaxWaiters()
   * @see #getJDBCDataSource()
   * @generated
   */
  EAttribute getJDBCDataSource_JdbcMaxWaiters();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.JDBCDataSource#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.JDBCDataSource#getParent()
   * @see #getJDBCDataSource()
   * @generated
   */
  EReference getJDBCDataSource_Parent();

  /**
   * Returns the meta object for class '{@link JOnAS.JVM <em>JVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>JVM</em>'.
   * @see JOnAS.JVM
   * @generated
   */
  EClass getJVM();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JVM#getJavaVersion <em>Java Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Version</em>'.
   * @see JOnAS.JVM#getJavaVersion()
   * @see #getJVM()
   * @generated
   */
  EAttribute getJVM_JavaVersion();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JVM#getJavaVendor <em>Java Vendor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Java Vendor</em>'.
   * @see JOnAS.JVM#getJavaVendor()
   * @see #getJVM()
   * @generated
   */
  EAttribute getJVM_JavaVendor();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.JVM#getAllThreadsCount <em>All Threads Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>All Threads Count</em>'.
   * @see JOnAS.JVM#getAllThreadsCount()
   * @see #getJVM()
   * @generated
   */
  EAttribute getJVM_AllThreadsCount();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.JVM#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.JVM#getParent()
   * @see #getJVM()
   * @generated
   */
  EReference getJVM_Parent();

  /**
   * Returns the meta object for class '{@link JOnAS.WebModule <em>Web Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Web Module</em>'.
   * @see JOnAS.WebModule
   * @generated
   */
  EClass getWebModule();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see JOnAS.WebModule#getPath()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_Path();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getStartTime <em>Start Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Time</em>'.
   * @see JOnAS.WebModule#getStartTime()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_StartTime();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hostname</em>'.
   * @see JOnAS.WebModule#getHostname()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_Hostname();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getStartupTime <em>Startup Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Startup Time</em>'.
   * @see JOnAS.WebModule#getStartupTime()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_StartupTime();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getWarURL <em>War URL</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>War URL</em>'.
   * @see JOnAS.WebModule#getWarURL()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_WarURL();

  /**
   * Returns the meta object for the container reference '{@link JOnAS.WebModule#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see JOnAS.WebModule#getParent()
   * @see #getWebModule()
   * @generated
   */
  EReference getWebModule_Parent();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see JOnAS.WebModule#getFileName()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_FileName();

  /**
   * Returns the meta object for the attribute '{@link JOnAS.WebModule#getEjbref <em>Ejbref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ejbref</em>'.
   * @see JOnAS.WebModule#getEjbref()
   * @see #getWebModule()
   * @generated
   */
  EAttribute getWebModule_Ejbref();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JOnASFactory getJOnASFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link JOnAS.impl.MBeanServerImpl <em>MBean Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.MBeanServerImpl
     * @see JOnAS.impl.JOnASPackageImpl#getMBeanServer()
     * @generated
     */
    EClass MBEAN_SERVER = eINSTANCE.getMBeanServer();

    /**
     * The meta object literal for the '<em><b>Server Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBEAN_SERVER__SERVER_HOST = eINSTANCE.getMBeanServer_ServerHost();

    /**
     * The meta object literal for the '<em><b>Server Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MBEAN_SERVER__SERVER_PORT = eINSTANCE.getMBeanServer_ServerPort();

    /**
     * The meta object literal for the '<em><b>Jdbc Data Source</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__JDBC_DATA_SOURCE = eINSTANCE.getMBeanServer_JdbcDataSource();

    /**
     * The meta object literal for the '<em><b>Stateful Session Bean</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__STATEFUL_SESSION_BEAN = eINSTANCE.getMBeanServer_StatefulSessionBean();

    /**
     * The meta object literal for the '<em><b>Stateless Session Bean</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__STATELESS_SESSION_BEAN = eINSTANCE.getMBeanServer_StatelessSessionBean();

    /**
     * The meta object literal for the '<em><b>Entity Bean</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__ENTITY_BEAN = eINSTANCE.getMBeanServer_EntityBean();

    /**
     * The meta object literal for the '<em><b>Jvm</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__JVM = eINSTANCE.getMBeanServer_Jvm();

    /**
     * The meta object literal for the '<em><b>Web Module</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MBEAN_SERVER__WEB_MODULE = eINSTANCE.getMBeanServer_WebModule();

    /**
     * The meta object literal for the '{@link JOnAS.impl.J2EEManagedObjectImpl <em>J2EE Managed Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.J2EEManagedObjectImpl
     * @see JOnAS.impl.JOnASPackageImpl#getJ2EEManagedObject()
     * @generated
     */
    EClass J2EE_MANAGED_OBJECT = eINSTANCE.getJ2EEManagedObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute J2EE_MANAGED_OBJECT__NAME = eINSTANCE.getJ2EEManagedObject_Name();

    /**
     * The meta object literal for the '{@link JOnAS.impl.EJBImpl <em>EJB</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.EJBImpl
     * @see JOnAS.impl.JOnASPackageImpl#getEJB()
     * @generated
     */
    EClass EJB = eINSTANCE.getEJB();

    /**
     * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__JNDI_NAME = eINSTANCE.getEJB_JndiName();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__FILE_NAME = eINSTANCE.getEJB_FileName();

    /**
     * The meta object literal for the '<em><b>Local Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__LOCAL_CLASS = eINSTANCE.getEJB_LocalClass();

    /**
     * The meta object literal for the '<em><b>Local Home Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__LOCAL_HOME_CLASS = eINSTANCE.getEJB_LocalHomeClass();

    /**
     * The meta object literal for the '<em><b>Home Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__HOME_CLASS = eINSTANCE.getEJB_HomeClass();

    /**
     * The meta object literal for the '<em><b>Ejb Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__EJB_CLASS = eINSTANCE.getEJB_EjbClass();

    /**
     * The meta object literal for the '<em><b>Cache Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__CACHE_SIZE = eINSTANCE.getEJB_CacheSize();

    /**
     * The meta object literal for the '<em><b>Pool Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__POOL_SIZE = eINSTANCE.getEJB_PoolSize();

    /**
     * The meta object literal for the '<em><b>Max Cache Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__MAX_CACHE_SIZE = eINSTANCE.getEJB_MaxCacheSize();

    /**
     * The meta object literal for the '<em><b>Min Pool Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__MIN_POOL_SIZE = eINSTANCE.getEJB_MinPoolSize();

    /**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__DISPLAY_NAME = eINSTANCE.getEJB_DisplayName();

    /**
     * The meta object literal for the '<em><b>Data Source JNDI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EJB__DATA_SOURCE_JNDI = eINSTANCE.getEJB_DataSourceJNDI();

    /**
     * The meta object literal for the '{@link JOnAS.impl.SessionBeanImpl <em>Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.SessionBeanImpl
     * @see JOnAS.impl.JOnASPackageImpl#getSessionBean()
     * @generated
     */
    EClass SESSION_BEAN = eINSTANCE.getSessionBean();

    /**
     * The meta object literal for the '<em><b>Session Time Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SESSION_BEAN__SESSION_TIME_OUT = eINSTANCE.getSessionBean_SessionTimeOut();

    /**
     * The meta object literal for the '{@link JOnAS.impl.StatefulSessionBeanImpl <em>Stateful Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.StatefulSessionBeanImpl
     * @see JOnAS.impl.JOnASPackageImpl#getStatefulSessionBean()
     * @generated
     */
    EClass STATEFUL_SESSION_BEAN = eINSTANCE.getStatefulSessionBean();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEFUL_SESSION_BEAN__PARENT = eINSTANCE.getStatefulSessionBean_Parent();

    /**
     * The meta object literal for the '{@link JOnAS.impl.StatelessSessionBeanImpl <em>Stateless Session Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.StatelessSessionBeanImpl
     * @see JOnAS.impl.JOnASPackageImpl#getStatelessSessionBean()
     * @generated
     */
    EClass STATELESS_SESSION_BEAN = eINSTANCE.getStatelessSessionBean();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATELESS_SESSION_BEAN__PARENT = eINSTANCE.getStatelessSessionBean_Parent();

    /**
     * The meta object literal for the '{@link JOnAS.impl.EntityBeanImpl <em>Entity Bean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.EntityBeanImpl
     * @see JOnAS.impl.JOnASPackageImpl#getEntityBean()
     * @generated
     */
    EClass ENTITY_BEAN = eINSTANCE.getEntityBean();

    /**
     * The meta object literal for the '<em><b>Passivation Time Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BEAN__PASSIVATION_TIME_OUT = eINSTANCE.getEntityBean_PassivationTimeOut();

    /**
     * The meta object literal for the '<em><b>Inactivity Time Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BEAN__INACTIVITY_TIME_OUT = eINSTANCE.getEntityBean_InactivityTimeOut();

    /**
     * The meta object literal for the '<em><b>Deadlock Time Out</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BEAN__DEADLOCK_TIME_OUT = eINSTANCE.getEntityBean_DeadlockTimeOut();

    /**
     * The meta object literal for the '<em><b>Lock Policy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_BEAN__LOCK_POLICY = eINSTANCE.getEntityBean_LockPolicy();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_BEAN__PARENT = eINSTANCE.getEntityBean_Parent();

    /**
     * The meta object literal for the '{@link JOnAS.impl.JDBCDataSourceImpl <em>JDBC Data Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.JDBCDataSourceImpl
     * @see JOnAS.impl.JOnASPackageImpl#getJDBCDataSource()
     * @generated
     */
    EClass JDBC_DATA_SOURCE = eINSTANCE.getJDBCDataSource();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__DESCRIPTION = eINSTANCE.getJDBCDataSource_Description();

    /**
     * The meta object literal for the '<em><b>Jdbc Min Conn Pool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__JDBC_MIN_CONN_POOL = eINSTANCE.getJDBCDataSource_JdbcMinConnPool();

    /**
     * The meta object literal for the '<em><b>Jdbc Max Conn Pool</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__JDBC_MAX_CONN_POOL = eINSTANCE.getJDBCDataSource_JdbcMaxConnPool();

    /**
     * The meta object literal for the '<em><b>Current Opened</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__CURRENT_OPENED = eINSTANCE.getJDBCDataSource_CurrentOpened();

    /**
     * The meta object literal for the '<em><b>Jndi Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__JNDI_NAME = eINSTANCE.getJDBCDataSource_JndiName();

    /**
     * The meta object literal for the '<em><b>Busy Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__BUSY_MAX = eINSTANCE.getJDBCDataSource_BusyMax();

    /**
     * The meta object literal for the '<em><b>Connection Failures</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__CONNECTION_FAILURES = eINSTANCE.getJDBCDataSource_ConnectionFailures();

    /**
     * The meta object literal for the '<em><b>Current Busy</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__CURRENT_BUSY = eINSTANCE.getJDBCDataSource_CurrentBusy();

    /**
     * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__USER_NAME = eINSTANCE.getJDBCDataSource_UserName();

    /**
     * The meta object literal for the '<em><b>Busy Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__BUSY_MIN = eINSTANCE.getJDBCDataSource_BusyMin();

    /**
     * The meta object literal for the '<em><b>User Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__USER_PASSWORD = eINSTANCE.getJDBCDataSource_UserPassword();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__URL = eINSTANCE.getJDBCDataSource_Url();

    /**
     * The meta object literal for the '<em><b>Jdbc Max Waiters</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JDBC_DATA_SOURCE__JDBC_MAX_WAITERS = eINSTANCE.getJDBCDataSource_JdbcMaxWaiters();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JDBC_DATA_SOURCE__PARENT = eINSTANCE.getJDBCDataSource_Parent();

    /**
     * The meta object literal for the '{@link JOnAS.impl.JVMImpl <em>JVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.JVMImpl
     * @see JOnAS.impl.JOnASPackageImpl#getJVM()
     * @generated
     */
    EClass JVM = eINSTANCE.getJVM();

    /**
     * The meta object literal for the '<em><b>Java Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JVM__JAVA_VERSION = eINSTANCE.getJVM_JavaVersion();

    /**
     * The meta object literal for the '<em><b>Java Vendor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JVM__JAVA_VENDOR = eINSTANCE.getJVM_JavaVendor();

    /**
     * The meta object literal for the '<em><b>All Threads Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JVM__ALL_THREADS_COUNT = eINSTANCE.getJVM_AllThreadsCount();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JVM__PARENT = eINSTANCE.getJVM_Parent();

    /**
     * The meta object literal for the '{@link JOnAS.impl.WebModuleImpl <em>Web Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see JOnAS.impl.WebModuleImpl
     * @see JOnAS.impl.JOnASPackageImpl#getWebModule()
     * @generated
     */
    EClass WEB_MODULE = eINSTANCE.getWebModule();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__PATH = eINSTANCE.getWebModule_Path();

    /**
     * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__START_TIME = eINSTANCE.getWebModule_StartTime();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__HOSTNAME = eINSTANCE.getWebModule_Hostname();

    /**
     * The meta object literal for the '<em><b>Startup Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__STARTUP_TIME = eINSTANCE.getWebModule_StartupTime();

    /**
     * The meta object literal for the '<em><b>War URL</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__WAR_URL = eINSTANCE.getWebModule_WarURL();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WEB_MODULE__PARENT = eINSTANCE.getWebModule_Parent();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__FILE_NAME = eINSTANCE.getWebModule_FileName();

    /**
     * The meta object literal for the '<em><b>Ejbref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEB_MODULE__EJBREF = eINSTANCE.getWebModule_Ejbref();

  }

  /*Global utility methods are generated here*/
    
} //JOnASPackage
