/**
 */
package ie.tcd.everm.evedsl.eveDesc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ignore Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.IgnoreValue#isIgnore <em>Ignore</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getIgnoreValue()
 * @model
 * @generated
 */
public interface IgnoreValue extends AbstractTextValue
{
  /**
   * Returns the value of the '<em><b>Ignore</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ignore</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ignore</em>' attribute.
   * @see #setIgnore(boolean)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getIgnoreValue_Ignore()
   * @model
   * @generated
   */
  boolean isIgnore();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.IgnoreValue#isIgnore <em>Ignore</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ignore</em>' attribute.
   * @see #isIgnore()
   * @generated
   */
  void setIgnore(boolean value);

} // IgnoreValue
