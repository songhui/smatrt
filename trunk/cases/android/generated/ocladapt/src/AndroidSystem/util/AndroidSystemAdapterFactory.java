/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.util;

import AndroidSystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see AndroidSystem.AndroidSystemPackage
 * @generated
 */
public class AndroidSystemAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AndroidSystemPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystemAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AndroidSystemPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AndroidSystemSwitch<Adapter> modelSwitch =
    new AndroidSystemSwitch<Adapter>()
    {
      @Override
      public Adapter caseContext(Context object)
      {
        return createContextAdapter();
      }
      @Override
      public Adapter caseActivityManager(ActivityManager object)
      {
        return createActivityManagerAdapter();
      }
      @Override
      public Adapter caseRunningService(RunningService object)
      {
        return createRunningServiceAdapter();
      }
      @Override
      public Adapter caseConnectivityManager(ConnectivityManager object)
      {
        return createConnectivityManagerAdapter();
      }
      @Override
      public Adapter caseNetworkInfo(NetworkInfo object)
      {
        return createNetworkInfoAdapter();
      }
      @Override
      public Adapter caseWiFiManager(WiFiManager object)
      {
        return createWiFiManagerAdapter();
      }
      @Override
      public Adapter caseScanResult(ScanResult object)
      {
        return createScanResultAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.Context
   * @generated
   */
  public Adapter createContextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.ActivityManager <em>Activity Manager</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.ActivityManager
   * @generated
   */
  public Adapter createActivityManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.RunningService <em>Running Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.RunningService
   * @generated
   */
  public Adapter createRunningServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.ConnectivityManager <em>Connectivity Manager</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.ConnectivityManager
   * @generated
   */
  public Adapter createConnectivityManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.NetworkInfo <em>Network Info</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.NetworkInfo
   * @generated
   */
  public Adapter createNetworkInfoAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.WiFiManager <em>Wi Fi Manager</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.WiFiManager
   * @generated
   */
  public Adapter createWiFiManagerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link AndroidSystem.ScanResult <em>Scan Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see AndroidSystem.ScanResult
   * @generated
   */
  public Adapter createScanResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AndroidSystemAdapterFactory
