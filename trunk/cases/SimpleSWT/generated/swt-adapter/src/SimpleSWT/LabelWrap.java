
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Wrap</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SimpleSWT.LabelWrap#getText <em>Text</em>}</li>
 *   <li>{@link SimpleSWT.LabelWrap#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see SimpleSWT.SimpleSWTPackage#getLabelWrap()
 * @model
 * @generated
 */
public interface LabelWrap extends ControlWrap
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
   * @see SimpleSWT.SimpleSWTPackage#getLabelWrap_Text()
   * @model required="true"
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link SimpleSWT.LabelWrap#getText <em>Text</em>}' attribute.
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
   * @see SimpleSWT.SimpleSWTPackage#getLabelWrap_Image()
   * @model required="true"
   * @generated
   */
  String getImage();

  /**
   * Sets the value of the '{@link SimpleSWT.LabelWrap#getImage <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image</em>' attribute.
   * @see #getImage()
   * @generated
   */
  void setImage(String value);

} // LabelWrap
