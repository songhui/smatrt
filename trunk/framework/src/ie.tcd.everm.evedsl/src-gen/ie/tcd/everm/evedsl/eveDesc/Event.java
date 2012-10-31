/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Event#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Event#getDecScope <em>Dec Scope</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Event#getParser <em>Parser</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Event#getPre <em>Pre</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Event#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent()
 * @model
 * @generated
 */
public interface Event extends EObject
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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Event#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dec Scope</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.DecScope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec Scope</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec Scope</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent_DecScope()
   * @model containment="true"
   * @generated
   */
  EList<DecScope> getDecScope();

  /**
   * Returns the value of the '<em><b>Parser</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parser</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parser</em>' containment reference.
   * @see #setParser(Parser)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent_Parser()
   * @model containment="true"
   * @generated
   */
  Parser getParser();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Event#getParser <em>Parser</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parser</em>' containment reference.
   * @see #getParser()
   * @generated
   */
  void setParser(Parser value);

  /**
   * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent_Pre()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getPre();

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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEvent_Post()
   * @model containment="true"
   * @generated
   */
  XExpression getPost();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Event#getPost <em>Post</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Post</em>' containment reference.
   * @see #getPost()
   * @generated
   */
  void setPost(XExpression value);

} // Event
