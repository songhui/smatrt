
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package AndroidSystem.impl;

import AndroidSystem.ActivityManager;
import AndroidSystem.AndroidSystemPackage;
import AndroidSystem.RunningService;

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
 * An implementation of the model object '<em><b>Activity Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link AndroidSystem.impl.ActivityManagerImpl#getRunningService <em>Running Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityManagerImpl extends WrappingEObjectImpl implements ActivityManager
{
  /**
   * The cached value of the '{@link #getRunningService() <em>Running Service</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRunningService()
   * @generated
   * @ordered
   */
  protected EList<RunningService> runningService;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActivityManagerImpl()
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
    return AndroidSystemPackage.Literals.ACTIVITY_MANAGER;
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
  
    android.app.ActivityManager core=(android.app.ActivityManager)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
  
      result=core.getRunningServices(200);
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
  public EList<RunningService> getRunningService()
  {

    
    if (runningService == null)
    {
  
  
    
      
      runningService = new EObjectContainmentEListForWrapping<RunningService>(
          RunningService.class, 
          this, 
          AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE,
          AndroidSystemPackage.eINSTANCE.getRunningService()
        );
        
  }
  
      ((EObjectContainmentEListForWrapping<RunningService>)runningService)
      .refreshWrap();
  
    return runningService;
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
      case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
        return ((InternalEList<?>)getRunningService()).basicRemove(otherEnd, msgs);
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
      case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
        return getRunningService();
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
      case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
        getRunningService().clear();
        getRunningService().addAll((Collection<? extends RunningService>)newValue);
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
      case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
        getRunningService().clear();
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
      case AndroidSystemPackage.ACTIVITY_MANAGER__RUNNING_SERVICE:
        return runningService != null && !runningService.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActivityManagerImpl
