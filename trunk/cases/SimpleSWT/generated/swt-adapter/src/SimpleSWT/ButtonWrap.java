
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleSWT.ButtonWrap#isGrayed <em>Grayed</em>}</li>
 *   <li>{@link SimpleSWT.ButtonWrap#getText <em>Text</em>}</li>
 *   <li>{@link SimpleSWT.ButtonWrap#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleSWT.SimpleSWTPackage#getButtonWrap()
 * @model
 * @generated
 */
public interface ButtonWrap extends ControlWrap
{
  /**
   * Returns the value of the '<em><b>Grayed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grayed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grayed</em>' attribute.
   * @see #setGrayed(boolean)
   * @see SimpleSWT.SimpleSWTPackage#getButtonWrap_Grayed()
   * @model required="true"
   * @generated
   */
  boolean isGrayed();

  /**
   * Sets the value of the '{@link SimpleSWT.ButtonWrap#isGrayed <em>Grayed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grayed</em>' attribute.
   * @see #isGrayed()
   * @generated
   */
  void setGrayed(boolean value);

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
   * @see SimpleSWT.SimpleSWTPackage#getButtonWrap_Text()
   * @model required="true"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link SimpleSWT.ButtonWrap#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image</em>' attribute.
   * @see #setImage(String)
   * @see SimpleSWT.SimpleSWTPackage#getButtonWrap_Image()
   * @model required="true"
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link SimpleSWT.ButtonWrap#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

} // ButtonWrap
