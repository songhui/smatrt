
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Classifier;
import uml.Feature;
import uml.NamedElement;
import uml.Property;
import uml.Substitution;
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
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.ClassifierImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl  extends TypeImpl implements Classifier
{
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
   * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRedefinedClassifier()
   * @generated
   * @ordered
   */
  protected EList<Classifier> redefinedClassifier;

  /**
   * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstitution()
   * @generated
   * @ordered
   */
  protected EList<Substitution> substitution;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassifierImpl()
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
    return UmlPackage.Literals.CLASSIFIER;
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
    
  
    case UmlPackage.CLASSIFIER__FEATURE:
  
      
    break;
    
    case UmlPackage.CLASSIFIER__INHERITED_MEMBER:
  
      
    break;
    
    case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
  
      
    break;
    
    case UmlPackage.CLASSIFIER__GENERAL:
  
      
    break;
    
    case UmlPackage.CLASSIFIER__SUBSTITUTION:
  
      
    break;
    
    case UmlPackage.CLASSIFIER__ATTRIBUTE:
  
      
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
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getFeature()
  {
    // TODO: implement this method to return the 'Feature' reference list
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
  public EList<NamedElement> getInheritedMember()
  {
    // TODO: implement this method to return the 'Inherited Member' reference list
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
  public EList<Classifier> getRedefinedClassifier()
  {

    
    if (redefinedClassifier == null)
    {
  
  
    
      redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER);
    
      redefinedClassifier = new EObjectContainmentEListForWrapping<Classifier>(
          Classifier.class, 
          this, 
          UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER,
          UmlPackage.eINSTANCE.getClassifier()
        );
        
  }
  
    return redefinedClassifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Classifier> getGeneral()
  {
    // TODO: implement this method to return the 'General' reference list
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
  public EList<Substitution> getSubstitution()
  {

    
    if (substitution == null)
    {
  
  
    
      substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, UmlPackage.CLASSIFIER__SUBSTITUTION, UmlPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
    
      substitution = new EObjectContainmentEListForWrapping<Substitution>(
          Substitution.class, 
          this, 
          UmlPackage.CLASSIFIER__SUBSTITUTION,
          UmlPackage.eINSTANCE.getSubstitution()
        );
        
  }
  
    return substitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getAttribute()
  {
    // TODO: implement this method to return the 'Attribute' reference list
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
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
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
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.CLASSIFIER__IS_ABSTRACT:
        return isIsAbstract() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.CLASSIFIER__FEATURE:
        return getFeature();
      case UmlPackage.CLASSIFIER__INHERITED_MEMBER:
        return getInheritedMember();
      case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
        return getRedefinedClassifier();
      case UmlPackage.CLASSIFIER__GENERAL:
        return getGeneral();
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        return getSubstitution();
      case UmlPackage.CLASSIFIER__ATTRIBUTE:
        return getAttribute();
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
      case UmlPackage.CLASSIFIER__IS_ABSTRACT:
        setIsAbstract(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
        getRedefinedClassifier().clear();
        getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
        return;
      case UmlPackage.CLASSIFIER__GENERAL:
        getGeneral().clear();
        getGeneral().addAll((Collection<? extends Classifier>)newValue);
        return;
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        getSubstitution().clear();
        getSubstitution().addAll((Collection<? extends Substitution>)newValue);
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
      case UmlPackage.CLASSIFIER__IS_ABSTRACT:
        setIsAbstract(IS_ABSTRACT_EDEFAULT);
        return;
      case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
        getRedefinedClassifier().clear();
        return;
      case UmlPackage.CLASSIFIER__GENERAL:
        getGeneral().clear();
        return;
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        getSubstitution().clear();
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
      case UmlPackage.CLASSIFIER__IS_ABSTRACT:
        return isAbstract != IS_ABSTRACT_EDEFAULT;
      case UmlPackage.CLASSIFIER__FEATURE:
        return !getFeature().isEmpty();
      case UmlPackage.CLASSIFIER__INHERITED_MEMBER:
        return !getInheritedMember().isEmpty();
      case UmlPackage.CLASSIFIER__REDEFINED_CLASSIFIER:
        return redefinedClassifier != null && !redefinedClassifier.isEmpty();
      case UmlPackage.CLASSIFIER__GENERAL:
        return !getGeneral().isEmpty();
      case UmlPackage.CLASSIFIER__SUBSTITUTION:
        return substitution != null && !substitution.isEmpty();
      case UmlPackage.CLASSIFIER__ATTRIBUTE:
        return !getAttribute().isEmpty();
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
    result.append(" (isAbstract: ");
    result.append(isAbstract);
    result.append(')');
    return result.toString();
  }

} //ClassifierImpl
