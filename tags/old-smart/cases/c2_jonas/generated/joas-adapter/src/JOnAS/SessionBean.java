/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Bean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.SessionBean#getSessionTimeOut <em>Session Time Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getSessionBean()
 * @model
 * @generated
 */
public interface SessionBean extends EJB
{
  /**
   * Returns the value of the '<em><b>Session Time Out</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Session Time Out</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session Time Out</em>' attribute.
   * @see #setSessionTimeOut(int)
   * @see JOnAS.JOnASPackage#getSessionBean_SessionTimeOut()
   * @model required="true"
   * @generated
   */
  int getSessionTimeOut();

  /**
   * Sets the value of the '{@link JOnAS.SessionBean#getSessionTimeOut <em>Session Time Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session Time Out</em>' attribute.
   * @see #getSessionTimeOut()
   * @generated
   */
  void setSessionTimeOut(int value);

} // SessionBean
