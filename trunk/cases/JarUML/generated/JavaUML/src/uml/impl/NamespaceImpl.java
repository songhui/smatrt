
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.ElementImport;
import uml.NamedElement;
import uml.Namespace;
import uml.PackageImport;
import uml.PackageableElement;
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
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.NamespaceImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NamespaceImpl  extends NamedElementImpl implements Namespace
{
  /**
   * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementImport()
   * @generated
   * @ordered
   */
  protected EList<ElementImport> elementImport;

  /**
   * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageImport()
   * @generated
   * @ordered
   */
  protected EList<PackageImport> packageImport;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceImpl()
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
    return UmlPackage.Literals.NAMESPACE;
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
    
    case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
  
      
    break;
    
    case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
  
      
    break;
    
    case UmlPackage.NAMESPACE__MEMBER:
  
      
    break;
    
    case UmlPackage.NAMESPACE__IMPORTED_MEMBER:
  
      
    break;
    
    case UmlPackage.NAMESPACE__OWNED_MEMBER:
  
      
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
  public EList<ElementImport> getElementImport()
  {

    
    if (elementImport == null)
    {
  
  
    
      elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, UmlPackage.NAMESPACE__ELEMENT_IMPORT, UmlPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
    
      elementImport = new EObjectContainmentEListForWrapping<ElementImport>(
          ElementImport.class, 
          this, 
          UmlPackage.NAMESPACE__ELEMENT_IMPORT,
          UmlPackage.eINSTANCE.getElementImport()
        );
        
  }
  
    return elementImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PackageImport> getPackageImport()
  {

    
    if (packageImport == null)
    {
  
  
    
      packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, UmlPackage.NAMESPACE__PACKAGE_IMPORT, UmlPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
    
      packageImport = new EObjectContainmentEListForWrapping<PackageImport>(
          PackageImport.class, 
          this, 
          UmlPackage.NAMESPACE__PACKAGE_IMPORT,
          UmlPackage.eINSTANCE.getPackageImport()
        );
        
  }
  
    return packageImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getMember()
  {
    // TODO: implement this method to return the 'Member' reference list
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
  public EList<PackageableElement> getImportedMember()
  {
    // TODO: implement this method to return the 'Imported Member' reference list
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
  public EList<NamedElement> getOwnedMember()
  {
    // TODO: implement this method to return the 'Owned Member' reference list
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        return getElementImport();
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        return getPackageImport();
      case UmlPackage.NAMESPACE__MEMBER:
        return getMember();
      case UmlPackage.NAMESPACE__IMPORTED_MEMBER:
        return getImportedMember();
      case UmlPackage.NAMESPACE__OWNED_MEMBER:
        return getOwnedMember();
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        getElementImport().clear();
        getElementImport().addAll((Collection<? extends ElementImport>)newValue);
        return;
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        getPackageImport().clear();
        getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        getElementImport().clear();
        return;
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        getPackageImport().clear();
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
      case UmlPackage.NAMESPACE__ELEMENT_IMPORT:
        return elementImport != null && !elementImport.isEmpty();
      case UmlPackage.NAMESPACE__PACKAGE_IMPORT:
        return packageImport != null && !packageImport.isEmpty();
      case UmlPackage.NAMESPACE__MEMBER:
        return !getMember().isEmpty();
      case UmlPackage.NAMESPACE__IMPORTED_MEMBER:
        return !getImportedMember().isEmpty();
      case UmlPackage.NAMESPACE__OWNED_MEMBER:
        return !getOwnedMember().isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NamespaceImpl
