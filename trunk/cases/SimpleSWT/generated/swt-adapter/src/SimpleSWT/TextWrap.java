
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleSWT.TextWrap#getText <em>Text</em>}</li>
 *   <li>{@link SimpleSWT.TextWrap#isEditable <em>Editable</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleSWT.SimpleSWTPackage#getTextWrap()
 * @model
 * @generated
 */
public interface TextWrap extends ControlWrap
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see SimpleSWT.SimpleSWTPackage#getTextWrap_Text()
   * @model required="true"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link SimpleSWT.TextWrap#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Editable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Editable</em>' attribute.
   * @see #setEditable(boolean)
   * @see SimpleSWT.SimpleSWTPackage#getTextWrap_Editable()
   * @model required="true"
   * @generated
   */
  boolean isEditable();

  /**
   * Sets the value of the '{@link SimpleSWT.TextWrap#isEditable <em>Editable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Editable</em>' attribute.
   * @see #isEditable()
   * @generated
   */
  void setEditable(boolean value);

} // TextWrap
