
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import uml.Classifier;
import uml.Feature;
import uml.UmlPackage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.Field;
import java.util.Random;
import org.apache.bcel.generic.BasicType;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.EObjectContainmentEListForWrapping;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.util.ImagePool;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.FeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.impl.FeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureImpl extends WrappingEObjectImpl implements Feature
{
  /**
   * The default value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected static final boolean IS_STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsStatic() <em>Is Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsStatic()
   * @generated
   * @ordered
   */
  protected boolean isStatic = IS_STATIC_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureImpl()
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
    return UmlPackage.Literals.FEATURE;
  }

  
  

  
  

  
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
  public List listSubCores(int featureID){
    List result=new ArrayList();
  
    Object core=(Object)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
  
    case UmlPackage.FEATURE__FEATURING_CLASSIFIER:
  
      
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
    UmlPackage pack=UmlPackage.eINSTANCE;	
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsStatic()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return isStatic;
    return isStatic; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsStatic(boolean newIsStatic)
  {
    boolean oldIsStatic = isStatic;
    isStatic = newIsStatic;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.FEATURE__IS_STATIC, oldIsStatic, isStatic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getFeaturingClassifier()
  {
    // TODO: implement this method to return the 'Featuring Classifier' reference list
    // Ensure that you remove @generated or mark it @generated NOT
    // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
    // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
    throw new UnsupportedOperationException();
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
      case UmlPackage.FEATURE__IS_STATIC:
        return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.FEATURE__FEATURING_CLASSIFIER:
        return getFeaturingClassifier();
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
      case UmlPackage.FEATURE__IS_STATIC:
        setIsStatic(((Boolean)newValue).booleanValue());
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
      case UmlPackage.FEATURE__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
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
      case UmlPackage.FEATURE__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case UmlPackage.FEATURE__FEATURING_CLASSIFIER:
        return !getFeaturingClassifier().isEmpty();
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
    result.append(" (isStatic: ");
    result.append(isStatic);
    result.append(')');
    return result.toString();
  }

} //FeatureImpl
