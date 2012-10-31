/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Parser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.TextParser#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.TextParser#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getTextParser()
 * @model
 * @generated
 */
public interface TextParser extends Parser
{
  /**
   * Returns the value of the '<em><b>Formatter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formatter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formatter</em>' containment reference.
   * @see #setFormatter(TextFormatter)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getTextParser_Formatter()
   * @model containment="true"
   * @generated
   */
  TextFormatter getFormatter();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.TextParser#getFormatter <em>Formatter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formatter</em>' containment reference.
   * @see #getFormatter()
   * @generated
   */
  void setFormatter(TextFormatter value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.AbstractTextValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getTextParser_Value()
   * @model containment="true"
   * @generated
   */
  EList<AbstractTextValue> getValue();

} // TextParser
