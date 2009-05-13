/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.EntityBean#getPassivationTimeOut <em>Passivation Time Out</em>}</li>
 *   <li>{@link JOnAS.EntityBean#getInactivityTimeOut <em>Inactivity Time Out</em>}</li>
 *   <li>{@link JOnAS.EntityBean#getDeadlockTimeOut <em>Deadlock Time Out</em>}</li>
 *   <li>{@link JOnAS.EntityBean#getLockPolicy <em>Lock Policy</em>}</li>
 *   <li>{@link JOnAS.EntityBean#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getEntityBean()
 * @model
 * @generated
 */
public interface EntityBean extends EJB
{
  /**
   * Returns the value of the '<em><b>Passivation Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Passivation Time Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Passivation Time Out</em>' attribute.
   * @see #setPassivationTimeOut(int)
   * @see JOnAS.JOnASPackage#getEntityBean_PassivationTimeOut()
   * @model required="true"
   * @generated
   */
  int getPassivationTimeOut();

  /**
   * Sets the value of the '{@link JOnAS.EntityBean#getPassivationTimeOut <em>Passivation Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Passivation Time Out</em>' attribute.
   * @see #getPassivationTimeOut()
   * @generated
   */
  void setPassivationTimeOut(int value);

  /**
   * Returns the value of the '<em><b>Inactivity Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inactivity Time Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inactivity Time Out</em>' attribute.
   * @see #setInactivityTimeOut(int)
   * @see JOnAS.JOnASPackage#getEntityBean_InactivityTimeOut()
   * @model required="true"
   * @generated
   */
  int getInactivityTimeOut();

  /**
   * Sets the value of the '{@link JOnAS.EntityBean#getInactivityTimeOut <em>Inactivity Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inactivity Time Out</em>' attribute.
   * @see #getInactivityTimeOut()
   * @generated
   */
  void setInactivityTimeOut(int value);

  /**
   * Returns the value of the '<em><b>Deadlock Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Deadlock Time Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Deadlock Time Out</em>' attribute.
   * @see #setDeadlockTimeOut(int)
   * @see JOnAS.JOnASPackage#getEntityBean_DeadlockTimeOut()
   * @model required="true"
   * @generated
   */
  int getDeadlockTimeOut();

  /**
   * Sets the value of the '{@link JOnAS.EntityBean#getDeadlockTimeOut <em>Deadlock Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Deadlock Time Out</em>' attribute.
   * @see #getDeadlockTimeOut()
   * @generated
   */
  void setDeadlockTimeOut(int value);

  /**
   * Returns the value of the '<em><b>Lock Policy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lock Policy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lock Policy</em>' attribute.
   * @see #setLockPolicy(String)
   * @see JOnAS.JOnASPackage#getEntityBean_LockPolicy()
   * @model required="true"
   * @generated
   */
  String getLockPolicy();

  /**
   * Sets the value of the '{@link JOnAS.EntityBean#getLockPolicy <em>Lock Policy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lock Policy</em>' attribute.
   * @see #getLockPolicy()
   * @generated
   */
  void setLockPolicy(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JOnAS.MBeanServer#getEntityBean <em>Entity Bean</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(MBeanServer)
   * @see JOnAS.JOnASPackage#getEntityBean_Parent()
   * @see JOnAS.MBeanServer#getEntityBean
   * @model opposite="entityBean" required="true" transient="false"
   * @generated
   */
  MBeanServer getParent();

  /**
   * Sets the value of the '{@link JOnAS.EntityBean#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MBeanServer value);

} // EntityBean
