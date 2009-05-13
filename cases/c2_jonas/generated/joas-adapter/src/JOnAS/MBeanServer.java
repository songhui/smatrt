/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MBean Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.MBeanServer#getServerHost <em>Server Host</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getServerPort <em>Server Port</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getJdbcDataSource <em>Jdbc Data Source</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getStatefulSessionBean <em>Stateful Session Bean</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getStatelessSessionBean <em>Stateless Session Bean</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getEntityBean <em>Entity Bean</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getJvm <em>Jvm</em>}</li>
 *   <li>{@link JOnAS.MBeanServer#getWebModule <em>Web Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getMBeanServer()
 * @model annotation="http://www.sei.pku.edu.cn/rsa RootClass='true'"
 * @generated
 */
public interface MBeanServer extends EObject
{
  /**
   * Returns the value of the '<em><b>Server Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Host</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Host</em>' attribute.
   * @see #setServerHost(String)
   * @see JOnAS.JOnASPackage#getMBeanServer_ServerHost()
   * @model required="true"
   *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
   * @generated
   */
  String getServerHost();

  /**
   * Sets the value of the '{@link JOnAS.MBeanServer#getServerHost <em>Server Host</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Host</em>' attribute.
   * @see #getServerHost()
   * @generated
   */
  void setServerHost(String value);

  /**
   * Returns the value of the '<em><b>Server Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Port</em>' attribute.
   * @see #setServerPort(int)
   * @see JOnAS.JOnASPackage#getMBeanServer_ServerPort()
   * @model required="true"
   * @generated
   */
  int getServerPort();

  /**
   * Sets the value of the '{@link JOnAS.MBeanServer#getServerPort <em>Server Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Port</em>' attribute.
   * @see #getServerPort()
   * @generated
   */
  void setServerPort(int value);

  /**
   * Returns the value of the '<em><b>Jdbc Data Source</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.JDBCDataSource}.
   * It is bidirectional and its opposite is '{@link JOnAS.JDBCDataSource#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Data Source</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Data Source</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_JdbcDataSource()
   * @see JOnAS.JDBCDataSource#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<JDBCDataSource> getJdbcDataSource();

  /**
   * Returns the value of the '<em><b>Stateful Session Bean</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.StatefulSessionBean}.
   * It is bidirectional and its opposite is '{@link JOnAS.StatefulSessionBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stateful Session Bean</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stateful Session Bean</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_StatefulSessionBean()
   * @see JOnAS.StatefulSessionBean#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<StatefulSessionBean> getStatefulSessionBean();

  /**
   * Returns the value of the '<em><b>Stateless Session Bean</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.StatelessSessionBean}.
   * It is bidirectional and its opposite is '{@link JOnAS.StatelessSessionBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stateless Session Bean</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stateless Session Bean</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_StatelessSessionBean()
   * @see JOnAS.StatelessSessionBean#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<StatelessSessionBean> getStatelessSessionBean();

  /**
   * Returns the value of the '<em><b>Entity Bean</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.EntityBean}.
   * It is bidirectional and its opposite is '{@link JOnAS.EntityBean#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity Bean</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity Bean</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_EntityBean()
   * @see JOnAS.EntityBean#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<EntityBean> getEntityBean();

  /**
   * Returns the value of the '<em><b>Jvm</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.JVM}.
   * It is bidirectional and its opposite is '{@link JOnAS.JVM#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jvm</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jvm</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_Jvm()
   * @see JOnAS.JVM#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<JVM> getJvm();

  /**
   * Returns the value of the '<em><b>Web Module</b></em>' containment reference list.
   * The list contents are of type {@link JOnAS.WebModule}.
   * It is bidirectional and its opposite is '{@link JOnAS.WebModule#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Web Module</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Web Module</em>' containment reference list.
   * @see JOnAS.JOnASPackage#getMBeanServer_WebModule()
   * @see JOnAS.WebModule#getParent
   * @model opposite="parent" containment="true" ordered="false"
   * @generated
   */
  EList<WebModule> getWebModule();

} // MBeanServer
