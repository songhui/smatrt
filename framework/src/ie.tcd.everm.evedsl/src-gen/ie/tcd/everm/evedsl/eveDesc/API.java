/**
 */
package ie.tcd.everm.evedsl.eveDesc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.API#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.API#getHelper <em>Helper</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.API#getMapping <em>Mapping</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.API#getInvocation <em>Invocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject
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
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getAPI_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ie.tcd.everm.evedsl.eveDesc.API#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Helper</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.Helper}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Helper</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Helper</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getAPI_Helper()
   * @model containment="true"
   * @generated
   */
  EList<Helper> getHelper();

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.Mapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getAPI_Mapping()
   * @model containment="true"
   * @generated
   */
  EList<Mapping> getMapping();

  /**
   * Returns the value of the '<em><b>Invocation</b></em>' containment reference list.
   * The list contents are of type {@link ie.tcd.everm.evedsl.eveDesc.Invocation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Invocation</em>' containment reference list.
   * @see ie.tcd.everm.evedsl.eveDesc.EveDescPackage#getAPI_Invocation()
   * @model containment="true"
   * @generated
   */
  EList<Invocation> getInvocation();

} // API
