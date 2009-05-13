
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
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Element#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.Element#getOwner <em>Owner</em>}</li>
 *   <li>{@link uml.Element#getOwnedComment <em>Owned Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Owned Element</b></em>' reference list.
   * The list contents are of type {@link uml.Element}.
   * It is bidirectional and its opposite is '{@link uml.Element#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The Elements owned by this element.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Element</em>' reference list.
   * @see uml.UmlPackage#getElement_OwnedElement()
   * @see uml.Element#getOwner
   * @model opposite="owner" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Element> getOwnedElement();

  /**
   * Returns the value of the '<em><b>Owner</b></em>' reference.
   * It is bidirectional and its opposite is '{@link uml.Element#getOwnedElement <em>Owned Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The Element that owns this element.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owner</em>' reference.
   * @see uml.UmlPackage#getElement_Owner()
   * @see uml.Element#getOwnedElement
   * @model opposite="ownedElement" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  Element getOwner();

  /**
   * Returns the value of the '<em><b>Owned Comment</b></em>' containment reference list.
   * The list contents are of type {@link uml.Comment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The Comments owned by this element.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Comment</em>' containment reference list.
   * @see uml.UmlPackage#getElement_OwnedComment()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Comment> getOwnedComment();

} // Element
