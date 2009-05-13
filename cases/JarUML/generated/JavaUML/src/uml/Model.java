
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Model#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml.Model#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
   * The list contents are of type {@link uml.PackageableElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packaged Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packaged Element</em>' containment reference list.
   * @see uml.UmlPackage#getModel_PackagedElement()
   * @model containment="true"
   * @generated
   */
  EList<PackageableElement> getPackagedElement();

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
   * @see uml.UmlPackage#getModel_Name()
   * @model dataType="uml.String" required="true"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uml.Model#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Model
