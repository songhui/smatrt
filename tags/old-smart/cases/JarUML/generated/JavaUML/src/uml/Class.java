
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
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class describes a set of objects that share the same specifications of features, constraints, and semantics.
 * A class may be designated as active (i.e., each of its instances having its own thread of control) or passive (i.e., each of its instances executing within the context of some other object). A class may also specify which signals the instances of this class handle.
 * A class has the capability to have an internal structure and ports.
 * Class has derived association that indicates how it may be extended through one or more stereotypes. Stereotype is the only kind of metaclass that cannot be extended by stereotypes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Class#getNestedClassifier <em>Nested Classifier</em>}</li>
 *   <li>{@link uml.Class#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link uml.Class#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link uml.Class#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link uml.Class#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.Class#getName <em>Name</em>}</li>
 *   <li>{@link uml.Class#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier
{
  /**
   * Returns the value of the '<em><b>Nested Classifier</b></em>' containment reference list.
   * The list contents are of type {@link uml.Classifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References all the Classifiers that are defined (nested) within the Class.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Nested Classifier</em>' containment reference list.
   * @see uml.UmlPackage#getClass_NestedClassifier()
   * @model containment="true"
   * @generated
   */
  EList<Classifier> getNestedClassifier();

  /**
   * Returns the value of the '<em><b>Owned Operation</b></em>' containment reference list.
   * The list contents are of type {@link uml.Operation}.
   * It is bidirectional and its opposite is '{@link uml.Operation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The operations owned by the class.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Owned Operation</em>' containment reference list.
   * @see uml.UmlPackage#getClass_OwnedOperation()
   * @see uml.Operation#getClass_
   * @model opposite="class" containment="true"
   * @generated
   */
  EList<Operation> getOwnedOperation();

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' reference list.
   * The list contents are of type {@link uml.Class}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This gives the superclasses of a class.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Super Class</em>' reference list.
   * @see uml.UmlPackage#getClass_SuperClass()
   * @model transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  EList<Class> getSuperClass();

  /**
   * Returns the value of the '<em><b>Is Active</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Determines whether an object specified by this class is active or not. If true, then the owning class is referred to as an active class. If false, then such a class is referred to as a passive class.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Active</em>' attribute.
   * @see #setIsActive(boolean)
   * @see uml.UmlPackage#getClass_IsActive()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsActive();

  /**
   * Sets the value of the '{@link uml.Class#isIsActive <em>Is Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Active</em>' attribute.
   * @see #isIsActive()
   * @generated
   */
  void setIsActive(boolean value);

  /**
   * Returns the value of the '<em><b>Owned Attribute</b></em>' containment reference list.
   * The list contents are of type {@link uml.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owned Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owned Attribute</em>' containment reference list.
   * @see uml.UmlPackage#getClass_OwnedAttribute()
   * @model containment="true"
   * @generated
   */
  EList<Property> getOwnedAttribute();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The name of the NamedElement.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uml.UmlPackage#getClass_Name()
   * @model dataType="uml.String" required="true" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uml.Class#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
   * The list contents are of type {@link uml.Generalization}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the Generalization relationships for this Classifier. These Generalizations navigaten to more general classifiers in the generalization hierarchy.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Generalization</em>' containment reference list.
   * @see uml.UmlPackage#getClass_Generalization()
   * @model containment="true" ordered="false"
   * @generated
   */
  EList<Generalization> getGeneralization();

} // Class
