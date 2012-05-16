/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AndroidSystemFactoryImpl extends EFactoryImpl implements AndroidSystemFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AndroidSystemFactory init()
  {
    try
    {
      AndroidSystemFactory theAndroidSystemFactory = (AndroidSystemFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sei.pku.edu.cn/ra/android"); 
      if (theAndroidSystemFactory != null)
      {
        return theAndroidSystemFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AndroidSystemFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystemFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AndroidSystemPackage.CONTEXT: return createContext();
      case AndroidSystemPackage.ACTIVITY_MANAGER: return createActivityManager();
      case AndroidSystemPackage.RUNNING_SERVICE: return createRunningService();
      case AndroidSystemPackage.CONNECTIVITY_MANAGER: return createConnectivityManager();
      case AndroidSystemPackage.NETWORK_INFO: return createNetworkInfo();
      case AndroidSystemPackage.WI_FI_MANAGER: return createWiFiManager();
      case AndroidSystemPackage.SCAN_RESULT: return createScanResult();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Context createContext()
  {
    ContextImpl context = new ContextImpl();
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActivityManager createActivityManager()
  {
    ActivityManagerImpl activityManager = new ActivityManagerImpl();
    return activityManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RunningService createRunningService()
  {
    RunningServiceImpl runningService = new RunningServiceImpl();
    return runningService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConnectivityManager createConnectivityManager()
  {
    ConnectivityManagerImpl connectivityManager = new ConnectivityManagerImpl();
    return connectivityManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NetworkInfo createNetworkInfo()
  {
    NetworkInfoImpl networkInfo = new NetworkInfoImpl();
    return networkInfo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WiFiManager createWiFiManager()
  {
    WiFiManagerImpl wiFiManager = new WiFiManagerImpl();
    return wiFiManager;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScanResult createScanResult()
  {
    ScanResultImpl scanResult = new ScanResultImpl();
    return scanResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndroidSystemPackage getAndroidSystemPackage()
  {
    return (AndroidSystemPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AndroidSystemPackage getPackage()
  {
    return AndroidSystemPackage.eINSTANCE;
  }

} //AndroidSystemFactoryImpl
