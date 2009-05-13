/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see JOnAS.JOnASPackage
 * @generated
 */
public interface JOnASFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JOnASFactory eINSTANCE = JOnAS.impl.JOnASFactoryImpl.init();

  /**
   * Returns a new object of class '<em>MBean Server</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>MBean Server</em>'.
   * @generated
   */
  MBeanServer createMBeanServer();

  /**
   * Returns a new object of class '<em>J2EE Managed Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>J2EE Managed Object</em>'.
   * @generated
   */
  J2EEManagedObject createJ2EEManagedObject();

  /**
   * Returns a new object of class '<em>EJB</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EJB</em>'.
   * @generated
   */
  EJB createEJB();

  /**
   * Returns a new object of class '<em>Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Session Bean</em>'.
   * @generated
   */
  SessionBean createSessionBean();

  /**
   * Returns a new object of class '<em>Stateful Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stateful Session Bean</em>'.
   * @generated
   */
  StatefulSessionBean createStatefulSessionBean();

  /**
   * Returns a new object of class '<em>Stateless Session Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stateless Session Bean</em>'.
   * @generated
   */
  StatelessSessionBean createStatelessSessionBean();

  /**
   * Returns a new object of class '<em>Entity Bean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Entity Bean</em>'.
   * @generated
   */
  EntityBean createEntityBean();

  /**
   * Returns a new object of class '<em>JDBC Data Source</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JDBC Data Source</em>'.
   * @generated
   */
  JDBCDataSource createJDBCDataSource();

  /**
   * Returns a new object of class '<em>JVM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JVM</em>'.
   * @generated
   */
  JVM createJVM();

  /**
   * Returns a new object of class '<em>Web Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Web Module</em>'.
   * @generated
   */
  WebModule createWebModule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  JOnASPackage getJOnASPackage();

} //JOnASFactory
