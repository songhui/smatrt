
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
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Association#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.Association#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.Association#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.Association#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Classifier, Relationship
{
  /**
   * Returns the value of the '<em><b>Owned End</b></em>' containment reference list.
   * The list contents are of type {@link uml.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The ends that are owned by the association itself.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned End</em>' containment reference list.
   * @see uml.UmlPackage#getAssociation_OwnedEnd()
   * @model containment="true"
   * @generated
   */
  EList<Property> getOwnedEnd();

  /**
   * Returns the value of the '<em><b>Member End</b></em>' reference list.
   * The list contents are of type {@link uml.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Each end represents participation of instances of the classifier connected to the end in links of the association.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Member End</em>' reference list.
   * @see uml.UmlPackage#getAssociation_MemberEnd()
   * @model lower="2"
   * @generated
   */
  EList<Property> getMemberEnd();

  /**
   * Returns the value of the '<em><b>Is Derived</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies whether the association is derived from other model elements such as other associations or constraints.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Derived</em>' attribute.
   * @see #setIsDerived(boolean)
   * @see uml.UmlPackage#getAssociation_IsDerived()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsDerived();

  /**
   * Sets the value of the '{@link uml.Association#isIsDerived <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Derived</em>' attribute.
   * @see #isIsDerived()
   * @generated
   */
  void setIsDerived(boolean value);

  /**
   * Returns the value of the '<em><b>End Type</b></em>' reference list.
   * The list contents are of type {@link uml.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the classifiers that are used as types of the ends of the association.
   * <!-- end-model-doc -->
   * @return the value of the '<em>End Type</em>' reference list.
   * @see uml.UmlPackage#getAssociation_EndType()
   * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
   * @generated
   */
  EList<Type> getEndType();

  /**
   * Returns the value of the '<em><b>Navigable Owned End</b></em>' reference list.
   * The list contents are of type {@link uml.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The navigable ends that are owned by the association itself.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Navigable Owned End</em>' reference list.
   * @see uml.UmlPackage#getAssociation_NavigableOwnedEnd()
   * @model ordered="false"
   * @generated
   */
  EList<Property> getNavigableOwnedEnd();

} // Association
