/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.SubType#getType <em>Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.SubType#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getSubType()
 * @model
 * @generated
 */
public interface SubType extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(JvmTypeReference)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getSubType_Type()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.SubType#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference.
   * @see #setPre(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getSubType_Pre()
   * @model containment="true"
   * @generated
   */
  XExpression getPre();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.SubType#getPre <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' containment reference.
   * @see #getPre()
   * @generated
   */
  void setPre(XExpression value);

} // SubType
