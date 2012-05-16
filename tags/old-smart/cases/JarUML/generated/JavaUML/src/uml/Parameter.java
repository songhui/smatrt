
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature.
 * Parameters are allowed to be treated as connectable elements.
 * Parameters have support for streaming, exceptions, and parameter sets.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link uml.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml.Parameter#isIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml.Parameter#isIsStream <em>Is Stream</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the Operation owning this parameter.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Operation</em>' reference.
   * @see uml.UmlPackage#getParameter_Operation()
   * @model transient="true" changeable="false" volatile="true" ordered="false"
   * @generated
   */
  Operation getOperation();

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies a String that represents a value to be used when no argument is supplied for the Parameter.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #isSetDefault()
   * @see #unsetDefault()
   * @see #setDefault(String)
   * @see uml.UmlPackage#getParameter_Default()
   * @model unsettable="true" dataType="uml.String" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link uml.Parameter#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #isSetDefault()
   * @see #unsetDefault()
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

  /**
   * Unsets the value of the '{@link uml.Parameter#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isSetDefault()
   * @see #getDefault()
   * @see #setDefault(String)
   * @generated
   */
  void unsetDefault();

  /**
   * Returns whether the value of the '{@link uml.Parameter#getDefault <em>Default</em>}' attribute is set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return whether the value of the '<em>Default</em>' attribute is set.
   * @see #unsetDefault()
   * @see #getDefault()
   * @see #setDefault(String)
   * @generated
   */
  boolean isSetDefault();

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(ValueSpecification)
   * @see uml.UmlPackage#getParameter_DefaultValue()
   * @model containment="true" ordered="false"
   * @generated
   */
  ValueSpecification getDefaultValue();

  /**
   * Sets the value of the '{@link uml.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(ValueSpecification value);

  /**
   * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Exception</em>' attribute.
   * @see #setIsException(boolean)
   * @see uml.UmlPackage#getParameter_IsException()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsException();

  /**
   * Sets the value of the '{@link uml.Parameter#isIsException <em>Is Exception</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Exception</em>' attribute.
   * @see #isIsException()
   * @generated
   */
  void setIsException(boolean value);

  /**
   * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter post values while the behavior is executing.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Stream</em>' attribute.
   * @see #setIsStream(boolean)
   * @see uml.UmlPackage#getParameter_IsStream()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsStream();

  /**
   * Sets the value of the '{@link uml.Parameter#isIsStream <em>Is Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Stream</em>' attribute.
   * @see #isIsStream()
   * @generated
   */
  void setIsStream(boolean value);

} // Parameter
