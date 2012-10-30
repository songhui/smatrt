/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Desc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getImports <em>Imports</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getSequence <em>Sequence</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getApi <em>Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEventDesc()
 * @model
 * @generated
 */
public interface EventDesc extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEventDesc_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.EventDesc#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEventDesc_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Sequence</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.EventSeq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sequence</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sequence</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEventDesc_Sequence()
   * @model containment="true"
   * @generated
   */
  EList<EventSeq> getSequence();

  /**
   * Returns the value of the '<em><b>Api</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.API}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Api</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Api</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getEventDesc_Api()
   * @model containment="true"
   * @generated
   */
  EList<API> getApi();

} // EventDesc
