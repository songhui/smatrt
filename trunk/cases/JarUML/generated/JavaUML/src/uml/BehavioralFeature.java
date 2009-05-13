
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
 * A representation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.BehavioralFeature#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getBehavioralFeature()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralFeature extends Namespace, Feature
{
  /**
   * Returns the value of the '<em><b>Owned Parameter</b></em>' containment reference list.
   * The list contents are of type {@link uml.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the ordered set of formal parameters of this BehavioralFeature.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Parameter</em>' containment reference list.
   * @see uml.UmlPackage#getBehavioralFeature_OwnedParameter()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getOwnedParameter();

  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If true, then the behavioral feature does not have an implementation, and one must be supplied by a more specific element. If false, the behavioral feature must have an implementation in the classifier or one must be inherited from a more general element.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see uml.UmlPackage#getBehavioralFeature_IsAbstract()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link uml.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Raised Exception</b></em>' reference list.
   * The list contents are of type {@link uml.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the Types representing exceptions that may be raised during an invocation of this feature.
   * The signals that the behavioral feature raises as exceptions.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Raised Exception</em>' reference list.
   * @see uml.UmlPackage#getBehavioralFeature_RaisedException()
   * @model ordered="false"
   * @generated
   */
  EList<Type> getRaisedException();

} // BehavioralFeature
