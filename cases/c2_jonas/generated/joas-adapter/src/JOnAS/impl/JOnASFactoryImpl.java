/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.impl;

import JOnAS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JOnASFactoryImpl extends EFactoryImpl implements JOnASFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JOnASFactory init()
  {
    try
    {
      JOnASFactory theJOnASFactory = (JOnASFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sei.pku.edu.cn/rsa/jonas_test"); 
      if (theJOnASFactory != null)
      {
        return theJOnASFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JOnASFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JOnASFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JOnASPackage.MBEAN_SERVER: return createMBeanServer();
      case JOnASPackage.J2EE_MANAGED_OBJECT: return createJ2EEManagedObject();
      case JOnASPackage.EJB: return createEJB();
      case JOnASPackage.SESSION_BEAN: return createSessionBean();
      case JOnASPackage.STATEFUL_SESSION_BEAN: return createStatefulSessionBean();
      case JOnASPackage.STATELESS_SESSION_BEAN: return createStatelessSessionBean();
      case JOnASPackage.ENTITY_BEAN: return createEntityBean();
      case JOnASPackage.JDBC_DATA_SOURCE: return createJDBCDataSource();
      case JOnASPackage.JVM: return createJVM();
      case JOnASPackage.WEB_MODULE: return createWebModule();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MBeanServer createMBeanServer()
  {
    MBeanServerImpl mBeanServer = new MBeanServerImpl();
    return mBeanServer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public J2EEManagedObject createJ2EEManagedObject()
  {
    J2EEManagedObjectImpl j2EEManagedObject = new J2EEManagedObjectImpl();
    return j2EEManagedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EJB createEJB()
  {
    EJBImpl ejb = new EJBImpl();
    return ejb;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SessionBean createSessionBean()
  {
    SessionBeanImpl sessionBean = new SessionBeanImpl();
    return sessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatefulSessionBean createStatefulSessionBean()
  {
    StatefulSessionBeanImpl statefulSessionBean = new StatefulSessionBeanImpl();
    return statefulSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatelessSessionBean createStatelessSessionBean()
  {
    StatelessSessionBeanImpl statelessSessionBean = new StatelessSessionBeanImpl();
    return statelessSessionBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EntityBean createEntityBean()
  {
    EntityBeanImpl entityBean = new EntityBeanImpl();
    return entityBean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JDBCDataSource createJDBCDataSource()
  {
    JDBCDataSourceImpl jdbcDataSource = new JDBCDataSourceImpl();
    return jdbcDataSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JVM createJVM()
  {
    JVMImpl jvm = new JVMImpl();
    return jvm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebModule createWebModule()
  {
    WebModuleImpl webModule = new WebModuleImpl();
    return webModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JOnASPackage getJOnASPackage()
  {
    return (JOnASPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JOnASPackage getPackage()
  {
    return JOnASPackage.eINSTANCE;
  }

} //JOnASFactoryImpl
