/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.util;

import AndroidSystem.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see AndroidSystem.AndroidSystemPackage
 * @generated
 */
public class AndroidSystemSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroidSystemPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystemSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroidSystemPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AndroidSystemPackage.CONTEXT:
      {
        Context context = (Context)theEObject;
        T result = caseContext(context);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.ACTIVITY_MANAGER:
      {
        ActivityManager activityManager = (ActivityManager)theEObject;
        T result = caseActivityManager(activityManager);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.RUNNING_SERVICE:
      {
        RunningService runningService = (RunningService)theEObject;
        T result = caseRunningService(runningService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.CONNECTIVITY_MANAGER:
      {
        ConnectivityManager connectivityManager = (ConnectivityManager)theEObject;
        T result = caseConnectivityManager(connectivityManager);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.NETWORK_INFO:
      {
        NetworkInfo networkInfo = (NetworkInfo)theEObject;
        T result = caseNetworkInfo(networkInfo);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.WI_FI_MANAGER:
      {
        WiFiManager wiFiManager = (WiFiManager)theEObject;
        T result = caseWiFiManager(wiFiManager);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AndroidSystemPackage.SCAN_RESULT:
      {
        ScanResult scanResult = (ScanResult)theEObject;
        T result = caseScanResult(scanResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContext(Context object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Activity Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Activity Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActivityManager(ActivityManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Running Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Running Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRunningService(RunningService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connectivity Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connectivity Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnectivityManager(ConnectivityManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Network Info</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Network Info</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNetworkInfo(NetworkInfo object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wi Fi Manager</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wi Fi Manager</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWiFiManager(WiFiManager object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scan Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scan Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScanResult(ScanResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AndroidSystemSwitch
