/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getVariable <em>Variable</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getOperation <em>Operation</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPre <em>Pre</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getRetType <em>Ret Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPostpara <em>Postpara</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation()
 * @model
 * @generated
 */
public interface Invocation extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Variable()
   * @model containment="true"
   * @generated
   */
  EList<XVariableDeclaration> getVariable();

  /**
   * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.OperationPointCut}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operation</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Operation()
   * @model containment="true"
   * @generated
   */
  EList<OperationPointCut> getOperation();

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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Pre()
   * @model containment="true"
   * @generated
   */
  XExpression getPre();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPre <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' containment reference.
   * @see #getPre()
   * @generated
   */
  void setPre(XExpression value);

  /**
   * Returns the value of the '<em><b>Ret Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ret Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret Type</em>' containment reference.
   * @see #setRetType(JvmTypeReference)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_RetType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getRetType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getRetType <em>Ret Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Type</em>' containment reference.
   * @see #getRetType()
   * @generated
   */
  void setRetType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Invoke</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invoke</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invoke</em>' containment reference.
   * @see #setInvoke(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Invoke()
   * @model containment="true"
   * @generated
   */
  XExpression getInvoke();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getInvoke <em>Invoke</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Invoke</em>' containment reference.
   * @see #getInvoke()
   * @generated
   */
  void setInvoke(XExpression value);

  /**
   * Returns the value of the '<em><b>Postpara</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postpara</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postpara</em>' containment reference.
   * @see #setPostpara(JvmFormalParameter)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Postpara()
   * @model containment="true"
   * @generated
   */
  JvmFormalParameter getPostpara();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPostpara <em>Postpara</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postpara</em>' containment reference.
   * @see #getPostpara()
   * @generated
   */
  void setPostpara(JvmFormalParameter value);

  /**
   * Returns the value of the '<em><b>Post</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post</em>' containment reference.
   * @see #setPost(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getInvocation_Post()
   * @model containment="true"
   * @generated
   */
  XExpression getPost();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Invocation#getPost <em>Post</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' containment reference.
   * @see #getPost()
   * @generated
   */
  void setPost(XExpression value);

} // Invocation
