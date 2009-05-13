
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
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Namespace#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.Namespace#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.Namespace#getMember <em>Member</em>}</li>
 *   <li>{@link uml.Namespace#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.Namespace#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getNamespace()
 * @model abstract="true"
 * @generated
 */
public interface Namespace extends NamedElement
{
  /**
   * Returns the value of the '<em><b>Element Import</b></em>' containment reference list.
   * The list contents are of type {@link uml.ElementImport}.
   * It is bidirectional and its opposite is '{@link uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the ElementImports owned by the Namespace.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Element Import</em>' containment reference list.
   * @see uml.UmlPackage#getNamespace_ElementImport()
   * @see uml.ElementImport#getImportingNamespace
   * @model opposite="importingNamespace" containment="true" ordered="false"
   * @generated
   */
  EList<ElementImport> getElementImport();

  /**
   * Returns the value of the '<em><b>Package Import</b></em>' containment reference list.
   * The list contents are of type {@link uml.PackageImport}.
   * It is bidirectional and its opposite is '{@link uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the PackageImports owned by the Namespace.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Package Import</em>' containment reference list.
   * @see uml.UmlPackage#getNamespace_PackageImport()
   * @see uml.PackageImport#getImportingNamespace
   * @model opposite="importingNamespace" containment="true" ordered="false"
   * @generated
   */
  EList<PackageImport> getPackageImport();

  /**
   * Returns the value of the '<em><b>Member</b></em>' reference list.
   * The list contents are of type {@link uml.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A collection of NamedElements identifiable within the Namespace, either by being owned or by being introduced by importing or inheritance.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Member</em>' reference list.
   * @see uml.UmlPackage#getNamespace_Member()
   * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<NamedElement> getMember();

  /**
   * Returns the value of the '<em><b>Imported Member</b></em>' reference list.
   * The list contents are of type {@link uml.PackageableElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the PackageableElements that are members of this Namespace as a result of either PackageImports or ElementImports.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Imported Member</em>' reference list.
   * @see uml.UmlPackage#getNamespace_ImportedMember()
   * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<PackageableElement> getImportedMember();

  /**
   * Returns the value of the '<em><b>Owned Member</b></em>' reference list.
   * The list contents are of type {@link uml.NamedElement}.
   * It is bidirectional and its opposite is '{@link uml.NamedElement#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A collection of NamedElements owned by the Namespace.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Member</em>' reference list.
   * @see uml.UmlPackage#getNamespace_OwnedMember()
   * @see uml.NamedElement#getNamespace
   * @model opposite="namespace" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<NamedElement> getOwnedMember();

} // Namespace
