
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
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.Classifier#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Type
{
  /**
   * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships.
   * 
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Abstract</em>' attribute.
   * @see #setIsAbstract(boolean)
   * @see uml.UmlPackage#getClassifier_IsAbstract()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsAbstract();

  /**
   * Sets the value of the '{@link uml.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Abstract</em>' attribute.
   * @see #isIsAbstract()
   * @generated
   */
  void setIsAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference list.
   * The list contents are of type {@link uml.Feature}.
   * It is bidirectional and its opposite is '{@link uml.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Note that there may be members of the Classifier that are of the type Feature but are not included in this association, e.g. inherited features.
   * Specifies each feature defined in the classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Feature</em>' reference list.
   * @see uml.UmlPackage#getClassifier_Feature()
   * @see uml.Feature#getFeaturingClassifier
   * @model opposite="featuringClassifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Feature> getFeature();

  /**
   * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
   * The list contents are of type {@link uml.NamedElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies all elements inherited by this classifier from the general classifiers.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Inherited Member</em>' reference list.
   * @see uml.UmlPackage#getClassifier_InheritedMember()
   * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<NamedElement> getInheritedMember();

  /**
   * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
   * The list contents are of type {@link uml.Classifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the Classifiers that are redefined by this Classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Redefined Classifier</em>' reference list.
   * @see uml.UmlPackage#getClassifier_RedefinedClassifier()
   * @model ordered="false"
   * @generated
   */
  EList<Classifier> getRedefinedClassifier();

  /**
   * Returns the value of the '<em><b>General</b></em>' reference list.
   * The list contents are of type {@link uml.Classifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the general classifier in the Generalization relationship.
   * Specifies the general Classifiers for this Classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>General</em>' reference list.
   * @see uml.UmlPackage#getClassifier_General()
   * @model transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Classifier> getGeneral();

  /**
   * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
   * The list contents are of type {@link uml.Substitution}.
   * It is bidirectional and its opposite is '{@link uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the substitutions that are owned by this Classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Substitution</em>' containment reference list.
   * @see uml.UmlPackage#getClassifier_Substitution()
   * @see uml.Substitution#getSubstitutingClassifier
   * @model opposite="substitutingClassifier" containment="true" ordered="false"
   * @generated
   */
  EList<Substitution> getSubstitution();

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' reference list.
   * The list contents are of type {@link uml.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Refers to all of the Properties that are direct (i.e. not inherited or imported) attributes of the classifier.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Attribute</em>' reference list.
   * @see uml.UmlPackage#getClassifier_Attribute()
   * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Property> getAttribute();

} // Classifier
