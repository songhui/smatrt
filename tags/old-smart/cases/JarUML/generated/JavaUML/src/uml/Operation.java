
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
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml.Operation#getClass_ <em>Class</em>}</li>
 *   <li>{@link uml.Operation#isIsQuery <em>Is Query</em>}</li>
 *   <li>{@link uml.Operation#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml.Operation#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml.Operation#getLower <em>Lower</em>}</li>
 *   <li>{@link uml.Operation#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml.Operation#getRedefinedOperation <em>Redefined Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml.UmlPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends BehavioralFeature
{
  /**
   * Returns the value of the '<em><b>Class</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link uml.Class#getOwnedOperation <em>Owned Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The class that owns the operation.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Class</em>' container reference.
   * @see #setClass(uml.Class)
   * @see uml.UmlPackage#getOperation_Class()
   * @see uml.Class#getOwnedOperation
   * @model opposite="ownedOperation" transient="false" ordered="false"
   * @generated
   */
  uml.Class getClass_();

  /**
   * Sets the value of the '{@link uml.Operation#getClass_ <em>Class</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' container reference.
   * @see #getClass_()
   * @generated
   */
  void setClass(uml.Class value);

  /**
   * Returns the value of the '<em><b>Is Query</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Specifies whether an execution of the BehavioralFeature leaves the state of the system unchanged (isQuery=true) or whether side effects may occur (isQuery=false).
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Query</em>' attribute.
   * @see #setIsQuery(boolean)
   * @see uml.UmlPackage#getOperation_IsQuery()
   * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
   * @generated
   */
  boolean isIsQuery();

  /**
   * Sets the value of the '{@link uml.Operation#isIsQuery <em>Is Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Query</em>' attribute.
   * @see #isIsQuery()
   * @generated
   */
  void setIsQuery(boolean value);

  /**
   * Returns the value of the '<em><b>Is Ordered</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This information is derived from the return result for this Operation.
   * Specifies whether the return parameter is ordered or not, if present.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Ordered</em>' attribute.
   * @see #setIsOrdered(boolean)
   * @see uml.UmlPackage#getOperation_IsOrdered()
   * @model default="false" dataType="uml.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  boolean isIsOrdered();

  /**
   * Sets the value of the '{@link uml.Operation#isIsOrdered <em>Is Ordered</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Ordered</em>' attribute.
   * @see #isIsOrdered()
   * @generated
   */
  void setIsOrdered(boolean value);

  /**
   * Returns the value of the '<em><b>Is Unique</b></em>' attribute.
   * The default value is <code>"true"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This information is derived from the return result for this Operation.
   * Specifies whether the return parameter is unique or not, if present.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Is Unique</em>' attribute.
   * @see #setIsUnique(boolean)
   * @see uml.UmlPackage#getOperation_IsUnique()
   * @model default="true" dataType="uml.Boolean" required="true" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  boolean isIsUnique();

  /**
   * Sets the value of the '{@link uml.Operation#isIsUnique <em>Is Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Unique</em>' attribute.
   * @see #isIsUnique()
   * @generated
   */
  void setIsUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Lower</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This information is derived from the return result for this Operation.
   * Specifies the lower multiplicity of the return parameter, if present.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Lower</em>' attribute.
   * @see #setLower(int)
   * @see uml.UmlPackage#getOperation_Lower()
   * @model default="1" dataType="uml.Integer" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  int getLower();

  /**
   * Sets the value of the '{@link uml.Operation#getLower <em>Lower</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lower</em>' attribute.
   * @see #getLower()
   * @generated
   */
  void setLower(int value);

  /**
   * Returns the value of the '<em><b>Upper</b></em>' attribute.
   * The default value is <code>"1"</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * This information is derived from the return result for this Operation.
   * Specifies the upper multiplicity of the return parameter, if present.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Upper</em>' attribute.
   * @see #setUpper(int)
   * @see uml.UmlPackage#getOperation_Upper()
   * @model default="1" dataType="uml.UnlimitedNatural" transient="true" volatile="true" derived="true" ordered="false"
   * @generated
   */
  int getUpper();

  /**
   * Sets the value of the '{@link uml.Operation#getUpper <em>Upper</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upper</em>' attribute.
   * @see #getUpper()
   * @generated
   */
  void setUpper(int value);

  /**
   * Returns the value of the '<em><b>Redefined Operation</b></em>' reference list.
   * The list contents are of type {@link uml.Operation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * References the Operations that are redefined by this Operation.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Redefined Operation</em>' reference list.
   * @see uml.UmlPackage#getOperation_RedefinedOperation()
   * @model ordered="false"
   * @generated
   */
  EList<Operation> getRedefinedOperation();

} // Operation
