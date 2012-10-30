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
 * A representation of the model object '<em><b>Operation Point Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getOpType <em>Op Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getElemType <em>Elem Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getFeature <em>Feature</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getPre <em>Pre</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getOperationPointCut()
 * @model
 * @generated
 */
public interface OperationPointCut extends EObject
{
  /**
   * Returns the value of the '<em><b>Op Type</b></em>' attribute.
   * The literals are from the enumeration {@link ie.tcd.everm.evedsl.eveDesc.OperationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op Type</em>' attribute.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationType
   * @see #setOpType(OperationType)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getOperationPointCut_OpType()
   * @model
   * @generated
   */
  OperationType getOpType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getOpType <em>Op Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op Type</em>' attribute.
   * @see ie.tcd.everm.evedsl.eveDesc.OperationType
   * @see #getOpType()
   * @generated
   */
  void setOpType(OperationType value);

  /**
   * Returns the value of the '<em><b>Elem Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elem Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elem Type</em>' containment reference.
   * @see #setElemType(JvmTypeReference)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getOperationPointCut_ElemType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getElemType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getElemType <em>Elem Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elem Type</em>' containment reference.
   * @see #getElemType()
   * @generated
   */
  void setElemType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Feature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' attribute.
   * @see #setFeature(String)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getOperationPointCut_Feature()
   * @model
   * @generated
   */
  String getFeature();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getFeature <em>Feature</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' attribute.
   * @see #getFeature()
   * @generated
   */
  void setFeature(String value);

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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getOperationPointCut_Pre()
   * @model containment="true"
   * @generated
   */
  XExpression getPre();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut#getPre <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' containment reference.
   * @see #getPre()
   * @generated
   */
  void setPre(XExpression value);

} // OperationPointCut
