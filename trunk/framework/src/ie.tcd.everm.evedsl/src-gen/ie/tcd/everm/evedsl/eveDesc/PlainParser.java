/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plain Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.PlainParser#getLogic <em>Logic</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getPlainParser()
 * @model
 * @generated
 */
public interface PlainParser extends Parser
{
  /**
   * Returns the value of the '<em><b>Logic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logic</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logic</em>' containment reference.
   * @see #setLogic(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getPlainParser_Logic()
   * @model containment="true"
   * @generated
   */
  XExpression getLogic();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.PlainParser#getLogic <em>Logic</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logic</em>' containment reference.
   * @see #getLogic()
   * @generated
   */
  void setLogic(XExpression value);

} // PlainParser
