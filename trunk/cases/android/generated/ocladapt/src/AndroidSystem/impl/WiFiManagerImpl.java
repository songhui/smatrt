
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.ScanResult;
import AndroidSystem.WiFiManager;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
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
 * An implementation of the model object '<em><b>Wi Fi Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.WiFiManagerImpl#getScanResult <em>Scan Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiFiManagerImpl extends WrappingEObjectImpl implements WiFiManager
{
  /**
   * The cached value of the '{@link #getScanResult() <em>Scan Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScanResult()
   * @generated
   * @ordered
   */
  protected EList<ScanResult> scanResult;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WiFiManagerImpl()
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
    return AndroidSystemPackage.Literals.WI_FI_MANAGER;
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
    result= (core==arg0);
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
  
    android.net.wifi.WifiManager core=(android.net.wifi.WifiManager)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
  
      List res=core.getScanResults();
      if(res!=null)
    	  result=res;
    break;
    
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
  public EList<ScanResult> getScanResult()
  {

    
    if (scanResult == null)
    {
  
  
    
      
      scanResult = new EObjectContainmentEListForWrapping<ScanResult>(
          ScanResult.class, 
          this, 
          AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT,
          AndroidSystemPackage.eINSTANCE.getScanResult()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<ScanResult>)scanResult)
      .refreshWrap();
  
    return scanResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
        return ((InternalEList<?>)getScanResult()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
        return getScanResult();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
        getScanResult().clear();
        getScanResult().addAll((Collection<? extends ScanResult>)newValue);
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
      case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
        getScanResult().clear();
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
      case AndroidSystemPackage.WI_FI_MANAGER__SCAN_RESULT:
        return scanResult != null && !scanResult.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //WiFiManagerImpl
