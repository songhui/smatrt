
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml.Classifier;
import uml.Generalization;
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
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.GeneralizationImpl#isIsSubstitutable <em>Is Substitutable</em>}</li>
 *   <li>{@link uml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationImpl  extends DirectedRelationshipImpl implements Generalization
{
  /**
   * The default value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSubstitutable()
   * @generated
   * @ordered
   */
  protected static final boolean IS_SUBSTITUTABLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsSubstitutable() <em>Is Substitutable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsSubstitutable()
   * @generated
   * @ordered
   */
  protected boolean isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;

  /**
   * This is true if the Is Substitutable attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean isSubstitutableESet;

  /**
   * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneral()
   * @generated
   * @ordered
   */
  protected Classifier general;

  /**
   * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecific()
   * @generated
   * @ordered
   */
  protected Classifier specific;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GeneralizationImpl()
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
    return UmlPackage.Literals.GENERALIZATION;
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
    result=((ClassImpl.ClassWrap)core).clazz.getClassName().equals(((ClassImpl.ClassWrap)arg0).clazz.getClassName());
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
  
    ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)this.getCore();
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
    UmlPackage pack=UmlPackage.eINSTANCE;	
  
  
    return null;
  }


      
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsSubstitutable()
  {
        Object result=null;
        ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)getCore();
        if(core==null) return isSubstitutable;
    return isSubstitutable; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsSubstitutable(boolean newIsSubstitutable)
  {
    boolean oldIsSubstitutable = isSubstitutable;
    isSubstitutable = newIsSubstitutable;
    boolean oldIsSubstitutableESet = isSubstitutableESet;
    isSubstitutableESet = true;
        //Am I here 2?
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, isSubstitutable, !oldIsSubstitutableESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetIsSubstitutable()
  {
    boolean oldIsSubstitutable = isSubstitutable;
    boolean oldIsSubstitutableESet = isSubstitutableESet;
    isSubstitutable = IS_SUBSTITUTABLE_EDEFAULT;
    isSubstitutableESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE, oldIsSubstitutable, IS_SUBSTITUTABLE_EDEFAULT, oldIsSubstitutableESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetIsSubstitutable()
  {
    return isSubstitutableESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getGeneral()
  {
    if (general != null && general.eIsProxy())
    {
      InternalEObject oldGeneral = (InternalEObject)general;
      general = (Classifier)eResolveProxy(oldGeneral);
      if (general != oldGeneral)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.GENERALIZATION__GENERAL, oldGeneral, general));
      }
    }
        Object result=null;
        ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)getCore();
        if(core==null) return general;	
        result=core.clazz;
        general=(Classifier)ImagePool.find(result);
    return general; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier basicGetGeneral()
  {
    return general;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneral(Classifier newGeneral)
  {
    Classifier oldGeneral = general;
    general = newGeneral;
        	
      ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__GENERAL, oldGeneral, general));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier getSpecific()
  {
    if (specific != null && specific.eIsProxy())
    {
      InternalEObject oldSpecific = (InternalEObject)specific;
      specific = (Classifier)eResolveProxy(oldSpecific);
      if (specific != oldSpecific)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
      }
    }
        Object result=null;
        ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)getCore();
        if(core==null) return specific;
    return specific; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classifier basicGetSpecific()
  {
    return specific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecific(Classifier newSpecific)
  {
    Classifier oldSpecific = specific;
    specific = newSpecific;
        	
      ClassImpl.ClassWrap core=(ClassImpl.ClassWrap)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
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
      case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        return isIsSubstitutable() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.GENERALIZATION__GENERAL:
        if (resolve) return getGeneral();
        return basicGetGeneral();
      case UmlPackage.GENERALIZATION__SPECIFIC:
        if (resolve) return getSpecific();
        return basicGetSpecific();
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
      case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        setIsSubstitutable(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.GENERALIZATION__GENERAL:
        setGeneral((Classifier)newValue);
        return;
      case UmlPackage.GENERALIZATION__SPECIFIC:
        setSpecific((Classifier)newValue);
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
      case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        unsetIsSubstitutable();
        return;
      case UmlPackage.GENERALIZATION__GENERAL:
        setGeneral((Classifier)null);
        return;
      case UmlPackage.GENERALIZATION__SPECIFIC:
        setSpecific((Classifier)null);
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
      case UmlPackage.GENERALIZATION__IS_SUBSTITUTABLE:
        return isSetIsSubstitutable();
      case UmlPackage.GENERALIZATION__GENERAL:
        return general != null;
      case UmlPackage.GENERALIZATION__SPECIFIC:
        return specific != null;
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
    result.append(" (isSubstitutable: ");
    if (isSubstitutableESet) result.append(isSubstitutable); else result.append("<unset>");
    result.append(')');
    return result.toString();
  }

} //GeneralizationImpl
