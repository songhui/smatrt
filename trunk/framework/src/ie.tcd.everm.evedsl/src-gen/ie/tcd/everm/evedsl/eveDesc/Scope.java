/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Scope#getExpr <em>Expr</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Scope#isEnforce <em>Enforce</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getScope_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Scope#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

  /**
   * Returns the value of the '<em><b>Enforce</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enforce</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enforce</em>' attribute.
   * @see #setEnforce(boolean)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getScope_Enforce()
   * @model
   * @generated
   */
  boolean isEnforce();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Scope#isEnforce <em>Enforce</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enforce</em>' attribute.
   * @see #isEnforce()
   * @generated
   */
  void setEnforce(boolean value);

} // Scope
