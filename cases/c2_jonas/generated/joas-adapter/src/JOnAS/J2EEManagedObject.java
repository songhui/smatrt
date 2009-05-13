/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>J2EE Managed Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.J2EEManagedObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getJ2EEManagedObject()
 * @model
 * @generated
 */
public interface J2EEManagedObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see JOnAS.JOnASPackage#getJ2EEManagedObject_Name()
   * @model required="true"
   *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link JOnAS.J2EEManagedObject#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // J2EEManagedObject
