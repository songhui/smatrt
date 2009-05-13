
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.Generalization#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.Generalization#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends DirectedRelationship
{
  /**
   * Returns the value of the '<em><b>Is Substitutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Indicates whether the specific classifier can be used wherever the general classifier can be used. If true, the execution traces of the specific classifier will be a superset of the execution traces of the general classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Substitutable</em>' attribute.
   * @see #isSetIsSubstitutable()
   * @see #unsetIsSubstitutable()
   * @see #setIsSubstitutable(boolean)
   * @see uml.UmlPackage#getGeneralization_IsSubstitutable()
   * @model unsettable="true" dataType="uml.Boolean" ordered="false"
   * @generated
   */
  boolean isIsSubstitutable();

  /**
   * Sets the value of the '{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Substitutable</em>' attribute.
   * @see #isSetIsSubstitutable()
   * @see #unsetIsSubstitutable()
   * @see #isIsSubstitutable()
   * @generated
   */
  void setIsSubstitutable(boolean value);

  /**
   * Unsets the value of the '{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetIsSubstitutable()
   * @see #isIsSubstitutable()
   * @see #setIsSubstitutable(boolean)
   * @generated
   */
  void unsetIsSubstitutable();

  /**
   * Returns whether the value of the '{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Is Substitutable</em>' attribute is set.
   * @see #unsetIsSubstitutable()
   * @see #isIsSubstitutable()
   * @see #setIsSubstitutable(boolean)
   * @generated
   */
  boolean isSetIsSubstitutable();

  /**
   * Returns the value of the '<em><b>General</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the general classifier in the Generalization relationship.
   * <!-- end-model-doc -->
   * @return the value of the '<em>General</em>' reference.
   * @see #setGeneral(Classifier)
   * @see uml.UmlPackage#getGeneralization_General()
   * @model required="true" ordered="false"
   * @generated
   */
  Classifier getGeneral();

  /**
   * Sets the value of the '{@link uml.Generalization#getGeneral <em>General</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>General</em>' reference.
   * @see #getGeneral()
   * @generated
   */
  void setGeneral(Classifier value);

  /**
   * Returns the value of the '<em><b>Specific</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the specializing classifier in the Generalization relationship.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Specific</em>' reference.
   * @see #setSpecific(Classifier)
   * @see uml.UmlPackage#getGeneralization_Specific()
   * @model required="true" ordered="false"
   * @generated
   */
  Classifier getSpecific();

  /**
   * Sets the value of the '{@link uml.Generalization#getSpecific <em>Specific</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specific</em>' reference.
   * @see #getSpecific()
   * @generated
   */
  void setSpecific(Classifier value);

} // Generalization
