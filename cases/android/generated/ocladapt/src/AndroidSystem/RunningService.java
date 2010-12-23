
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Running Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.RunningService#getProcess <em>Process</em>}</li>
 *   <li>{@link AndroidSystem.RunningService#getClientCount <em>Client Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getRunningService()
 * @model
 * @generated
 */
public interface RunningService extends EObject
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Process</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' attribute.
   * @see #setProcess(String)
   * @see AndroidSystem.AndroidSystemPackage#getRunningService_Process()
   * @model required="true"
   * @generated
   */
  String getProcess();

  /**
   * Sets the value of the '{@link AndroidSystem.RunningService#getProcess <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' attribute.
   * @see #getProcess()
   * @generated
   */
  void setProcess(String value);

  /**
   * Returns the value of the '<em><b>Client Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Client Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Client Count</em>' attribute.
   * @see #setClientCount(int)
   * @see AndroidSystem.AndroidSystemPackage#getRunningService_ClientCount()
   * @model required="true"
   * @generated
   */
  int getClientCount();

  /**
   * Sets the value of the '{@link AndroidSystem.RunningService#getClientCount <em>Client Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Client Count</em>' attribute.
   * @see #getClientCount()
   * @generated
   */
  void setClientCount(int value);

} // RunningService
