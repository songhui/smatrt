
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT.impl;

import SimpleSWT.CompositeWrap;
import SimpleSWT.ControlWrap;
import SimpleSWT.SimpleSWTPackage;

import java.util.Collection;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import cn.edu.pku.sei.ra.guineapig.swtview.views.SampleView;
import org.eclipse.ui.PlatformUI;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Color;

import java.util.Map;
import java.util.HashMap;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleSWT.impl.CompositeWrapImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeWrapImpl  extends ControlWrapImpl implements CompositeWrap
{
  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected EList<ControlWrap> children;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeWrapImpl()
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
    return SimpleSWTPackage.Literals.COMPOSITE_WRAP;
  }

  
  
  Control[] ctrls;
SampleView view;
  

  
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public Object lookupCore(){
    Object result=null;
    try{
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
    try{
                view=(SampleView)PlatformUI.getWorkbench().getWorkbenchWindows()[0].getPages()[0]
                        .showView("cn.edu.pku.sei.ra.guineapig.swtview.views.SampleView");
    }
    catch(Exception e){
      e.printStackTrace();
    }
      }
    });
      Composite root=view.getRoot();
      if(id!=null){
        root.setData(id);
      }
      result=root;
    }
    catch(Exception e){
      e.printStackTrace();
      return null;
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
    switch(featureID){
    case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
  
      Display.getDefault().syncExec(new Runnable(){
      public void run(){
ctrls=((Composite)getCore()).getChildren();
      }
    });
      for(int i=0;i<ctrls.length;i++){
        result.add(ctrls[i]);
      }
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
    SimpleSWTPackage pack=SimpleSWTPackage.eINSTANCE;	
  
    if(object instanceof Text)
      return pack.getTextWrap();
      
      
    if(object instanceof Button)
      return pack.getButtonWrap();
      
      
    if(object instanceof Label)
      return pack.getLabelWrap();
      
      
    
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ControlWrap> getChildren()
  {

    
    if (children == null)
    {
  
  
    
      children = new EObjectContainmentEListForWrapping<ControlWrap>(
          ControlWrap.class, 
          this, 
          SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN,
          SimpleSWTPackage.eINSTANCE.getControlWrap()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<ControlWrap>)children)
    .refreshWrap();
  
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        return getChildren();
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
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        getChildren().clear();
        getChildren().addAll((Collection<? extends ControlWrap>)newValue);
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
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        getChildren().clear();
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
      case SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN:
        return children != null && !children.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeWrapImpl
