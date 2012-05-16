
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT.impl;

import SimpleSWT.LabelWrap;
import SimpleSWT.SimpleSWTPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 * An implementation of the model object '<em><b>Label Wrap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SimpleSWT.impl.LabelWrapImpl#getText <em>Text</em>}</li>
 *   <li>{@link SimpleSWT.impl.LabelWrapImpl#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelWrapImpl  extends ControlWrapImpl implements LabelWrap
{
  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected String image = IMAGE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelWrapImpl()
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
    return SimpleSWTPackage.Literals.LABEL_WRAP;
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
  public String getText()
  {
        Label core=(Label)getCore();
        if(core==null) return text;	
        final Label txt=core;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
text=txt.getText();
      }
    });
    return text; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
        	
      Label core=(Label)getCore();
      if(core==null) return;
      	
        final Label txt=core;
    if(txt==null)
      return;
    Display.getDefault().syncExec(new Runnable(){
      public void run(){
txt.setText(text);
      }
    });
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSWTPackage.LABEL_WRAP__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage()
  {
        Label core=(Label)getCore();
        if(core==null) return image;	
        
    return image; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(String newImage)
  {
    String oldImage = image;
    image = newImage;
        	
      Label core=(Label)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SimpleSWTPackage.LABEL_WRAP__IMAGE, oldImage, image));
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
      case SimpleSWTPackage.LABEL_WRAP__TEXT:
        return getText();
      case SimpleSWTPackage.LABEL_WRAP__IMAGE:
        return getImage();
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
      case SimpleSWTPackage.LABEL_WRAP__TEXT:
        setText((String)newValue);
        return;
      case SimpleSWTPackage.LABEL_WRAP__IMAGE:
        setImage((String)newValue);
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
      case SimpleSWTPackage.LABEL_WRAP__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case SimpleSWTPackage.LABEL_WRAP__IMAGE:
        setImage(IMAGE_EDEFAULT);
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
      case SimpleSWTPackage.LABEL_WRAP__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case SimpleSWTPackage.LABEL_WRAP__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
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
    result.append(" (text: ");
    result.append(text);
    result.append(", image: ");
    result.append(image);
    result.append(')');
    return result.toString();
  }

} //LabelWrapImpl
