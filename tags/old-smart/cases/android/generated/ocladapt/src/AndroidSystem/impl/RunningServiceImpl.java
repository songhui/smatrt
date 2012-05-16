
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.RunningService;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.EObject;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectResolvingEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Running Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.RunningServiceImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link AndroidSystem.impl.RunningServiceImpl#getClientCount <em>Client Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunningServiceImpl extends WrappingEObjectImpl implements RunningService
{
  /**
   * The default value of the '{@link #getProcess() <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected static final String PROCESS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected String process = PROCESS_EDEFAULT;

  /**
   * The default value of the '{@link #getClientCount() <em>Client Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientCount()
   * @generated
   * @ordered
   */
  protected static final int CLIENT_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getClientCount() <em>Client Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClientCount()
   * @generated
   * @ordered
   */
  protected int clientCount = CLIENT_COUNT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RunningServiceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AndroidSystemPackage.Literals.RUNNING_SERVICE;
  }

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
   	if(core==null) return false;
    try{
    result=((android.app.ActivityManager.RunningServiceInfo)core).service.equals(((android.app.ActivityManager.RunningServiceInfo)arg0).service);
    }
    catch(Exception e){
      result=false;
    }
    return result;
  }
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    android.app.ActivityManager.RunningServiceInfo core=(android.app.ActivityManager.RunningServiceInfo)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
  
  }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public EClass getChildClassMap(Object object){
    AndroidSystemPackage pack=AndroidSystemPackage.eINSTANCE;	
  
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProcess()
  {
        Object result=null;
        android.app.ActivityManager.RunningServiceInfo core=(android.app.ActivityManager.RunningServiceInfo)getCore();
        if(core==null) return process;	
        process=core.process;
    return process; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcess(String newProcess)
  {
    String oldProcess = process;
    process = newProcess;
        	
      android.app.ActivityManager.RunningServiceInfo core=(android.app.ActivityManager.RunningServiceInfo)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.RUNNING_SERVICE__PROCESS, oldProcess, process));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getClientCount()
  {
        Object result=null;
        android.app.ActivityManager.RunningServiceInfo core=(android.app.ActivityManager.RunningServiceInfo)getCore();
        if(core==null) return clientCount;	
        clientCount=core.clientCount;
    return clientCount; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClientCount(int newClientCount)
  {
    int oldClientCount = clientCount;
    clientCount = newClientCount;
        	
      android.app.ActivityManager.RunningServiceInfo core=(android.app.ActivityManager.RunningServiceInfo)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AndroidSystemPackage.RUNNING_SERVICE__CLIENT_COUNT, oldClientCount, clientCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.RUNNING_SERVICE__PROCESS:
        return getProcess();
      case AndroidSystemPackage.RUNNING_SERVICE__CLIENT_COUNT:
        return new Integer(getClientCount());
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.RUNNING_SERVICE__PROCESS:
        setProcess((String)newValue);
        return;
      case AndroidSystemPackage.RUNNING_SERVICE__CLIENT_COUNT:
        setClientCount(((Integer)newValue).intValue());
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.RUNNING_SERVICE__PROCESS:
        setProcess(PROCESS_EDEFAULT);
        return;
      case AndroidSystemPackage.RUNNING_SERVICE__CLIENT_COUNT:
        setClientCount(CLIENT_COUNT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.RUNNING_SERVICE__PROCESS:
        return PROCESS_EDEFAULT == null ? process != null : !PROCESS_EDEFAULT.equals(process);
      case AndroidSystemPackage.RUNNING_SERVICE__CLIENT_COUNT:
        return clientCount != CLIENT_COUNT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (process: ");
    result.append(process);
    result.append(", clientCount: ");
    result.append(clientCount);
    result.append(')');
    return result.toString();
  }

} //RunningServiceImpl
