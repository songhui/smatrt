
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
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Package#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link uml.Package#getName <em>Name</em>}</li>
 *   <li>{@link uml.Package#getPackagedElement <em>Packaged Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageableElement
{
  /**
   * Returns the value of the '<em><b>Owned Type</b></em>' reference list.
   * The list contents are of type {@link uml.Type}.
   * It is bidirectional and its opposite is '{@link uml.Type#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the packaged elements that are Types.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Type</em>' reference list.
   * @see uml.UmlPackage#getPackage_OwnedType()
   * @see uml.Type#getPackage
   * @model opposite="package" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Type> getOwnedType();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The name of the NamedElement.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uml.UmlPackage#getPackage_Name()
   * @model dataType="uml.String" required="true" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uml.Package#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Packaged Element</b></em>' containment reference list.
   * The list contents are of type {@link uml.PackageableElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the packageable elements that are owned by this Package.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Packaged Element</em>' containment reference list.
   * @see uml.UmlPackage#getPackage_PackagedElement()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<PackageableElement> getPackagedElement();

} // Package
