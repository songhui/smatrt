/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Defined Formatter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getUserDefinedFormatter()
 * @model
 * @generated
 */
public interface UserDefinedFormatter extends TextFormatter
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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getUserDefinedFormatter_Expr()
   * @model containment="true"
   * @generated
   */
  XExpression getExpr();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.UserDefinedFormatter#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(XExpression value);

} // UserDefinedFormatter
