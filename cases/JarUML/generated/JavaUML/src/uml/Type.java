
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Type#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends PackageableElement
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' reference.
   * It is bidirectional and its opposite is '{@link uml.Package#getOwnedType <em>Owned Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the owning package of this classifier, if any.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Package</em>' reference.
   * @see #setPackage(uml.Package)
   * @see uml.UmlPackage#getType_Package()
   * @see uml.Package#getOwnedType
   * @model opposite="ownedType" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  uml.Package getPackage();

  /**
   * Sets the value of the '{@link uml.Type#getPackage <em>Package</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' reference.
   * @see #getPackage()
   * @generated
   */
  void setPackage(uml.Package value);

} // Type
