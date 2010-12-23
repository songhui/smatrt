
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AndroidSystem.ActivityManager#getRunningService <em>Running Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see AndroidSystem.AndroidSystemPackage#getActivityManager()
 * @model
 * @generated
 */
public interface ActivityManager extends EObject
{
  /**
   * Returns the value of the '<em><b>Running Service</b></em>' containment reference list.
   * The list contents are of type {@link AndroidSystem.RunningService}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Running Service</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Running Service</em>' containment reference list.
   * @see AndroidSystem.AndroidSystemPackage#getActivityManager_RunningService()
   * @model containment="true"
   * @generated
   */
  EList<RunningService> getRunningService();

} // ActivityManager
