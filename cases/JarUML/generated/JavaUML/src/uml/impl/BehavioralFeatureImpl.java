
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.BehavioralFeature;
import uml.Classifier;
import uml.Feature;
import uml.Parameter;
import uml.Type;
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
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#isIsStatic <em>Is Static</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getFeaturingClassifier <em>Featuring Classifier</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.impl.BehavioralFeatureImpl#getRaisedException <em>Raised Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl  extends NamespaceImpl implements BehavioralFeature
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
   * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> ownedParameter;

  /**
   * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean IS_ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsAbstract()
   * @generated
   * @ordered
   */
  protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getRaisedException() <em>Raised Exception</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaisedException()
   * @generated
   * @ordered
   */
  protected EList<Type> raisedException;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BehavioralFeatureImpl()
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
    return UmlPackage.Literals.BEHAVIORAL_FEATURE;
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
    
    case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
  
      
    break;
    
  
    case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
  
      
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC, oldIsStatic, isStatic));
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
  public EList<Parameter> getOwnedParameter()
  {

    
    if (ownedParameter == null)
    {
  
  
    
      ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
    
      ownedParameter = new EObjectContainmentEListForWrapping<Parameter>(
          Parameter.class, 
          this, 
          UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER,
          UmlPackage.eINSTANCE.getParameter()
        );
        
  }
  
    return ownedParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsAbstract()
  {
        Object result=null;
        Object core=(Object)getCore();
        if(core==null) return isAbstract;
    return isAbstract; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsAbstract(boolean newIsAbstract)
  {
    boolean oldIsAbstract = isAbstract;
    isAbstract = newIsAbstract;
        	
      Object core=(Object)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getRaisedException()
  {

    
    if (raisedException == null)
    {
  
  
    
      raisedException = new EObjectResolvingEList<Type>(Type.class, this, UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION);
    
      raisedException = new EObjectContainmentEListForWrapping<Type>(
          Type.class, 
          this, 
          UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION,
          UmlPackage.eINSTANCE.getType()
        );
        
  }
  
    return raisedException;
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
      case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
        return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
        return isIsStatic() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
        return getFeaturingClassifier();
      case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
        return getOwnedParameter();
      case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
        return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
        return getRaisedException();
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
      case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
        setIsStatic(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
        getOwnedParameter().clear();
        getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
        setIsAbstract(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
        getRaisedException().clear();
        getRaisedException().addAll((Collection<? extends Type>)newValue);
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
      case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
        setIsStatic(IS_STATIC_EDEFAULT);
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
        getOwnedParameter().clear();
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
        getRaisedException().clear();
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
      case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC:
        return isStatic != IS_STATIC_EDEFAULT;
      case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER:
        return !getFeaturingClassifier().isEmpty();
      case UmlPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
        return ownedParameter != null && !ownedParameter.isEmpty();
      case UmlPackage.BEHAVIORAL_FEATURE__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case UmlPackage.BEHAVIORAL_FEATURE__RAISED_EXCEPTION:
        return raisedException != null && !raisedException.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Feature.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC: return UmlPackage.FEATURE__IS_STATIC;
        case UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER: return UmlPackage.FEATURE__FEATURING_CLASSIFIER;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Feature.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.FEATURE__IS_STATIC: return UmlPackage.BEHAVIORAL_FEATURE__IS_STATIC;
        case UmlPackage.FEATURE__FEATURING_CLASSIFIER: return UmlPackage.BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //BehavioralFeatureImpl
