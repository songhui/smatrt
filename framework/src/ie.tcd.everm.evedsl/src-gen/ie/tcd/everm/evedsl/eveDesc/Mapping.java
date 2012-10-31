/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getMType <em>MType</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getSType <em>SType</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#isUnique <em>Unique</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getIdentify <em>Identify</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getNewImage <em>New Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>MType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>MType</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>MType</em>' containment reference.
   * @see #setMType(JvmTypeReference)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_MType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getMType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getMType <em>MType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>MType</em>' containment reference.
   * @see #getMType()
   * @generated
   */
  void setMType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>SType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>SType</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>SType</em>' containment reference.
   * @see #setSType(JvmTypeReference)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_SType()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getSType();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getSType <em>SType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>SType</em>' containment reference.
   * @see #getSType()
   * @generated
   */
  void setSType(JvmTypeReference value);

  /**
   * Returns the value of the '<em><b>Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unique</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unique</em>' attribute.
   * @see #setUnique(boolean)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_Unique()
   * @model
   * @generated
   */
  boolean isUnique();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#isUnique <em>Unique</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unique</em>' attribute.
   * @see #isUnique()
   * @generated
   */
  void setUnique(boolean value);

  /**
   * Returns the value of the '<em><b>Identify</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identify</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identify</em>' containment reference.
   * @see #setIdentify(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_Identify()
   * @model containment="true"
   * @generated
   */
  XExpression getIdentify();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getIdentify <em>Identify</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identify</em>' containment reference.
   * @see #getIdentify()
   * @generated
   */
  void setIdentify(XExpression value);

  /**
   * Returns the value of the '<em><b>Sub Type</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.SubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Type</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_SubType()
   * @model containment="true"
   * @generated
   */
  EList<SubType> getSubType();

  /**
   * Returns the value of the '<em><b>New Image</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>New Image</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>New Image</em>' containment reference.
   * @see #setNewImage(XExpression)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getMapping_NewImage()
   * @model containment="true"
   * @generated
   */
  XExpression getNewImage();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.Mapping#getNewImage <em>New Image</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Image</em>' containment reference.
   * @see #getNewImage()
   * @generated
   */
  void setNewImage(XExpression value);

} // Mapping
