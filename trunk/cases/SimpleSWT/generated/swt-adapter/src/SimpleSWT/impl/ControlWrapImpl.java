
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
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
 * An implementation of the model object '<em><b>Control Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleSWT.impl.ControlWrapImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link SimpleSWT.impl.ControlWrapImpl#getId <em>Id</em>}</li>
 *   <li>{@link SimpleSWT.impl.ControlWrapImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ControlWrapImpl extends WrappingEObjectImpl implements ControlWrap
{
  /**
   * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected static final String BACKGROUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected String background = BACKGROUND_EDEFAULT;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlWrapImpl()
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
    return SimpleSWTPackage.Literals.CONTROL_WRAP;
  }

  
  
  private static Map<String,Integer> colorMap=new HashMap<String,Integer>();
  static{
    colorMap.put("red", SWT.COLOR_RED);
    colorMap.put("yellow", SWT.COLOR_YELLOW);
    colorMap.put("black", SWT.COLOR_BLACK);
    colorMap.put("white", SWT.COLOR_WHITE);
    colorMap.put("blue", SWT.COLOR_BLUE);
    colorMap.put("gray", SWT.COLOR_GRAY);
    colorMap.put("green", SWT.COLOR_GREEN);
    colorMap.put("cyan", SWT.COLOR_CYAN);
  }
boolean idEqual;
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
    final Object obj=arg0;
    if(core==obj)
      return true;
    if(!(obj instanceof Control))
      return false;
    if(id==null)
      return false;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
        idEqual=id.equals(((Control)obj).getData());
      }
    });
    result=idEqual;
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
  
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBackground()
  {
        Control core=(Control)getCore();
        if(core==null) return background;	
        final Control ctrl=core;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
background=ctrl.getBackground().toString();
      }
    });
    return background; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(String newBackground)
  {
    String oldBackground = background;
    background = newBackground;
        	
      Control core=(Control)getCore();
      if(core==null) return;
      	
        final Control ctrl=core;
    if(ctrl==null)
      return;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
        Color color=ctrl.getBackground();
        Integer it=colorMap.get(background);
        if(it==null)
          return;
        color=color.getDevice().getSystemColor(it.intValue());
        ctrl.setBackground(color);
        ctrl.redraw();
        ctrl.update();
      }
    });
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSWTPackage.CONTROL_WRAP__BACKGROUND, oldBackground, background));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
        Control core=(Control)getCore();
        if(core==null) return id;	
        final Control ctrl=core;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
id=(String)ctrl.getData();
      }
    });
    return id; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
        	
      Control core=(Control)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSWTPackage.CONTROL_WRAP__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeWrap getParent()
  {
    if (eContainerFeatureID != SimpleSWTPackage.CONTROL_WRAP__PARENT) return null;
    return (CompositeWrap)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParent(CompositeWrap newParent, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParent, SimpleSWTPackage.CONTROL_WRAP__PARENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParent(CompositeWrap newParent)
  {
    if (newParent != eInternalContainer() || (eContainerFeatureID != SimpleSWTPackage.CONTROL_WRAP__PARENT && newParent != null))
    {
      if (EcoreUtil.isAncestor(this, newParent))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParent != null)
        msgs = ((InternalEObject)newParent).eInverseAdd(this, SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN, CompositeWrap.class, msgs);
      msgs = basicSetParent(newParent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSWTPackage.CONTROL_WRAP__PARENT, newParent, newParent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParent((CompositeWrap)otherEnd, msgs);
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
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        return basicSetParent(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID)
    {
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        return eInternalContainer().eInverseRemove(this, SimpleSWTPackage.COMPOSITE_WRAP__CHILDREN, CompositeWrap.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case SimpleSWTPackage.CONTROL_WRAP__BACKGROUND:
        return getBackground();
      case SimpleSWTPackage.CONTROL_WRAP__ID:
        return getId();
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        return getParent();
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
      case SimpleSWTPackage.CONTROL_WRAP__BACKGROUND:
        setBackground((String)newValue);
        return;
      case SimpleSWTPackage.CONTROL_WRAP__ID:
        setId((String)newValue);
        return;
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        setParent((CompositeWrap)newValue);
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
      case SimpleSWTPackage.CONTROL_WRAP__BACKGROUND:
        setBackground(BACKGROUND_EDEFAULT);
        return;
      case SimpleSWTPackage.CONTROL_WRAP__ID:
        setId(ID_EDEFAULT);
        return;
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        setParent((CompositeWrap)null);
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
      case SimpleSWTPackage.CONTROL_WRAP__BACKGROUND:
        return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
      case SimpleSWTPackage.CONTROL_WRAP__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case SimpleSWTPackage.CONTROL_WRAP__PARENT:
        return getParent() != null;
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
    result.append(" (background: ");
    result.append(background);
    result.append(", id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //ControlWrapImpl
