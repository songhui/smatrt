
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.ElementImport#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.ElementImport#getAlias <em>Alias</em>}</li>
 *   <li>{@link uml.ElementImport#getImportedElement <em>Imported Element</em>}</li>
 *   <li>{@link uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getElementImport()
 * @model
 * @generated
 */
public interface ElementImport extends DirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The default value is <code>"public"</code>.
   * The literals are from the enumeration {@link uml.VisibilityKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the visibility of the imported PackageableElement within the importing Package. The default visibility is the same as that of the imported element. If the imported element does not have a visibility, it is possible to add visibility to the element import.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see uml.VisibilityKind
   * @see #setVisibility(VisibilityKind)
   * @see uml.UmlPackage#getElementImport_Visibility()
   * @model default="public" required="true" ordered="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link uml.ElementImport#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see uml.VisibilityKind
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the name that should be added to the namespace of the importing package in lieu of the name of the imported packagable element. The aliased name must not clash with any other member name in the importing package. By default, no alias is used.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #isSetAlias()
   * @see #unsetAlias()
   * @see #setAlias(String)
   * @see uml.UmlPackage#getElementImport_Alias()
   * @model unsettable="true" dataType="uml.String" ordered="false"
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link uml.ElementImport#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #isSetAlias()
   * @see #unsetAlias()
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Unsets the value of the '{@link uml.ElementImport#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetAlias()
   * @see #getAlias()
   * @see #setAlias(String)
   * @generated
   */
  void unsetAlias();

  /**
   * Returns whether the value of the '{@link uml.ElementImport#getAlias <em>Alias</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Alias</em>' attribute is set.
   * @see #unsetAlias()
   * @see #getAlias()
   * @see #setAlias(String)
   * @generated
   */
  boolean isSetAlias();

  /**
   * Returns the value of the '<em><b>Imported Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the PackageableElement whose name is to be added to a Namespace.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Imported Element</em>' reference.
   * @see #setImportedElement(PackageableElement)
   * @see uml.UmlPackage#getElementImport_ImportedElement()
   * @model required="true" ordered="false"
   * @generated
   */
  PackageableElement getImportedElement();

  /**
   * Sets the value of the '{@link uml.ElementImport#getImportedElement <em>Imported Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Element</em>' reference.
   * @see #getImportedElement()
   * @generated
   */
  void setImportedElement(PackageableElement value);

  /**
   * Returns the value of the '<em><b>Importing Namespace</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link uml.Namespace#getElementImport <em>Element Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the Namespace that imports a PackageableElement from another Package.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Importing Namespace</em>' container reference.
   * @see #setImportingNamespace(Namespace)
   * @see uml.UmlPackage#getElementImport_ImportingNamespace()
   * @see uml.Namespace#getElementImport
   * @model opposite="elementImport" required="true" transient="false" ordered="false"
   * @generated
   */
  Namespace getImportingNamespace();

  /**
   * Sets the value of the '{@link uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Importing Namespace</em>' container reference.
   * @see #getImportingNamespace()
   * @generated
   */
  void setImportingNamespace(Namespace value);

} // ElementImport
