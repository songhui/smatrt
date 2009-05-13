/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stateful Session Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.StatefulSessionBean#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getStatefulSessionBean()
 * @model
 * @generated
 */
public interface StatefulSessionBean extends SessionBean
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JOnAS.MBeanServer#getStatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(MBeanServer)
   * @see JOnAS.JOnASPackage#getStatefulSessionBean_Parent()
   * @see JOnAS.MBeanServer#getStatefulSessionBean
   * @model opposite="statefulSessionBean" required="true" transient="false"
   * @generated
   */
  MBeanServer getParent();

  /**
   * Sets the value of the '{@link JOnAS.StatefulSessionBean#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MBeanServer value);

} // StatefulSessionBean
