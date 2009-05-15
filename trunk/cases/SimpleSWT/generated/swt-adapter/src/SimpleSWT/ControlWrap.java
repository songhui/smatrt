
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleSWT.ControlWrap#getBackground <em>Background</em>}</li>
 *   <li>{@link SimpleSWT.ControlWrap#getId <em>Id</em>}</li>
 *   <li>{@link SimpleSWT.ControlWrap#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleSWT.SimpleSWTPackage#getControlWrap()
 * @model abstract="true"
 * @generated
 */
public interface ControlWrap extends EObject
{
  /**
   * Returns the value of the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background</em>' attribute.
   * @see #setBackground(String)
   * @see SimpleSWT.SimpleSWTPackage#getControlWrap_Background()
   * @model required="true"
   * @generated
   */
  String getBackground();

  /**
   * Sets the value of the '{@link SimpleSWT.ControlWrap#getBackground <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background</em>' attribute.
   * @see #getBackground()
   * @generated
   */
  void setBackground(String value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see SimpleSWT.SimpleSWTPackage#getControlWrap_Id()
   * @model required="true"
   *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link SimpleSWT.ControlWrap#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link SimpleSWT.CompositeWrap#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(CompositeWrap)
   * @see SimpleSWT.SimpleSWTPackage#getControlWrap_Parent()
   * @see SimpleSWT.CompositeWrap#getChildren
   * @model opposite="children" transient="false"
   * @generated
   */
  CompositeWrap getParent();

  /**
   * Sets the value of the '{@link SimpleSWT.ControlWrap#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(CompositeWrap value);

} // ControlWrap
