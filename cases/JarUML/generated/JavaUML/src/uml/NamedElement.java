
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
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link uml.NamedElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link uml.NamedElement#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link uml.NamedElement#getClientDependency <em>Client Dependency</em>}</li>
 *   <li>{@link uml.NamedElement#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends Element
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The name of the NamedElement.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #isSetName()
   * @see #unsetName()
   * @see #setName(String)
   * @see uml.UmlPackage#getNamedElement_Name()
   * @model unsettable="true" dataType="uml.String" ordered="false"
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uml.NamedElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #isSetName()
   * @see #unsetName()
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Unsets the value of the '{@link uml.NamedElement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
  void unsetName();

  /**
   * Returns whether the value of the '{@link uml.NamedElement#getName <em>Name</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Name</em>' attribute is set.
   * @see #unsetName()
   * @see #getName()
   * @see #setName(String)
   * @generated
   */
  boolean isSetName();

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' attribute.
   * The literals are from the enumeration {@link uml.VisibilityKind}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Determines where the NamedElement appears within different Namespaces within the overall model, and its accessibility.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Visibility</em>' attribute.
   * @see uml.VisibilityKind
   * @see #isSetVisibility()
   * @see #unsetVisibility()
   * @see #setVisibility(VisibilityKind)
   * @see uml.UmlPackage#getNamedElement_Visibility()
   * @model unsettable="true" ordered="false"
   * @generated
   */
  VisibilityKind getVisibility();

  /**
   * Sets the value of the '{@link uml.NamedElement#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' attribute.
   * @see uml.VisibilityKind
   * @see #isSetVisibility()
   * @see #unsetVisibility()
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(VisibilityKind value);

  /**
   * Unsets the value of the '{@link uml.NamedElement#getVisibility <em>Visibility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetVisibility()
   * @see #getVisibility()
   * @see #setVisibility(VisibilityKind)
   * @generated
   */
  void unsetVisibility();

  /**
   * Returns whether the value of the '{@link uml.NamedElement#getVisibility <em>Visibility</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Visibility</em>' attribute is set.
   * @see #unsetVisibility()
   * @see #getVisibility()
   * @see #setVisibility(VisibilityKind)
   * @generated
   */
  boolean isSetVisibility();

  /**
   * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * A name which allows the NamedElement to be identified within a hierarchy of nested Namespaces. It is constructed from the names of the containing namespaces starting at the root of the hierarchy and ending with the name of the NamedElement itself.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Qualified Name</em>' attribute.
   * @see uml.UmlPackage#getNamedElement_QualifiedName()
   * @model dataType="uml.String" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  String getQualifiedName();

  /**
   * Returns the value of the '<em><b>Client Dependency</b></em>' reference list.
   * The list contents are of type {@link uml.Dependency}.
   * It is bidirectional and its opposite is '{@link uml.Dependency#getClient <em>Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Indicates the dependencies that reference the client.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Client Dependency</em>' reference list.
   * @see uml.UmlPackage#getNamedElement_ClientDependency()
   * @see uml.Dependency#getClient
   * @model opposite="client" ordered="false"
   * @generated
   */
  EList<Dependency> getClientDependency();

  /**
   * Returns the value of the '<em><b>Namespace</b></em>' reference.
   * It is bidirectional and its opposite is '{@link uml.Namespace#getOwnedMember <em>Owned Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies the namespace that owns the NamedElement.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Namespace</em>' reference.
   * @see uml.UmlPackage#getNamedElement_Namespace()
   * @see uml.Namespace#getOwnedMember
   * @model opposite="ownedMember" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
   * @generated
   */
  Namespace getNamespace();

} // NamedElement
