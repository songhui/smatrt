
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Dependency#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link uml.Dependency#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getDependency()
 * @model
 * @generated
 */
public interface Dependency extends PackageableElement, DirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Supplier</b></em>' reference list.
   * The list contents are of type {@link uml.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The element(s) independent of the client element(s), in the same respect and the same dependency relationship. In some directed dependency relationships (such as Refinement Abstractions), a common convention in the domain of class-based OO software is to put the more abstract element in this role. Despite this convention, users of UML may stipulate a sense of dependency suitable for their domain, which makes a more abstract element dependent on that which is more specific.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Supplier</em>' reference list.
   * @see uml.UmlPackage#getDependency_Supplier()
   * @model required="true" ordered="false"
   * @generated
   */
  EList<NamedElement> getSupplier();

  /**
   * Returns the value of the '<em><b>Client</b></em>' reference list.
   * The list contents are of type {@link uml.NamedElement}.
   * It is bidirectional and its opposite is '{@link uml.NamedElement#getClientDependency <em>Client Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The element(s) dependent on the supplier element(s). In some cases (such as a Trace Abstraction) the assignment of direction (that is, the designation of the client element) is at the discretion of the modeler, and is a stipulation.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Client</em>' reference list.
   * @see uml.UmlPackage#getDependency_Client()
   * @see uml.NamedElement#getClientDependency
   * @model opposite="clientDependency" required="true" ordered="false"
   * @generated
   */
  EList<NamedElement> getClient();

} // Dependency
