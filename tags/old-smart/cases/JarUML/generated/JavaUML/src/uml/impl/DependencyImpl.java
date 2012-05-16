
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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.Comment;
import uml.Dependency;
import uml.DirectedRelationship;
import uml.Element;
import uml.NamedElement;
import uml.Relationship;
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
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DependencyImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getSource <em>Source</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getSupplier <em>Supplier</em>}</li>
 *   <li>{@link uml.impl.DependencyImpl#getClient <em>Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl  extends PackageableElementImpl implements Dependency
{
  /**
   * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedComment()
   * @generated
   * @ordered
   */
  protected EList<Comment> ownedComment;

  /**
   * The cached value of the '{@link #getSupplier() <em>Supplier</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplier()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> supplier;

  /**
   * The cached value of the '{@link #getClient() <em>Client</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClient()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> client;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return UmlPackage.Literals.DEPENDENCY;
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
    
    case UmlPackage.DEPENDENCY__SUPPLIER:
  
      
    break;
    
    case UmlPackage.DEPENDENCY__CLIENT:
  
      
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
  public EList<Element> getOwnedElement()
  {
    // TODO: implement this method to return the 'Owned Element' reference list
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
  public Element getOwner()
  {
    Element owner = basicGetOwner();
    return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element basicGetOwner()
  {
    // TODO: implement this method to return the 'Owner' reference
    // -> do not perform proxy resolution
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getOwnedComment()
  {

    
    if (ownedComment == null)
    {
  
  
    
      ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, UmlPackage.DEPENDENCY__OWNED_COMMENT);
    
      ownedComment = new EObjectContainmentEListForWrapping<Comment>(
          Comment.class, 
          this, 
          UmlPackage.DEPENDENCY__OWNED_COMMENT,
          UmlPackage.eINSTANCE.getComment()
        );
        
  }
  
    return ownedComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getRelatedElement()
  {
    // TODO: implement this method to return the 'Related Element' reference list
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
  public EList<Element> getSource()
  {
    // TODO: implement this method to return the 'Source' reference list
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
  public EList<Element> getTarget()
  {
    // TODO: implement this method to return the 'Target' reference list
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
  public EList<NamedElement> getSupplier()
  {

    
    if (supplier == null)
    {
  
  
    
      supplier = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, UmlPackage.DEPENDENCY__SUPPLIER);
    
      supplier = new EObjectContainmentEListForWrapping<NamedElement>(
          NamedElement.class, 
          this, 
          UmlPackage.DEPENDENCY__SUPPLIER,
          UmlPackage.eINSTANCE.getNamedElement()
        );
        
  }
  
    return supplier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getClient()
  {

    
    if (client == null)
    {
  
  
    
      client = new EObjectWithInverseResolvingEList.ManyInverse<NamedElement>(NamedElement.class, this, UmlPackage.DEPENDENCY__CLIENT, UmlPackage.NAMED_ELEMENT__CLIENT_DEPENDENCY);
    
      client = new EObjectContainmentEListForWrapping<NamedElement>(
          NamedElement.class, 
          this, 
          UmlPackage.DEPENDENCY__CLIENT,
          UmlPackage.eINSTANCE.getNamedElement()
        );
        
  }
  
    return client;
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
      case UmlPackage.DEPENDENCY__CLIENT:
        return ((InternalEList<InternalEObject>)(InternalEList<?>)getClient()).basicAdd(otherEnd, msgs);
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
      case UmlPackage.DEPENDENCY__OWNED_COMMENT:
        return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
      case UmlPackage.DEPENDENCY__CLIENT:
        return ((InternalEList<?>)getClient()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.DEPENDENCY__OWNED_ELEMENT:
        return getOwnedElement();
      case UmlPackage.DEPENDENCY__OWNER:
        if (resolve) return getOwner();
        return basicGetOwner();
      case UmlPackage.DEPENDENCY__OWNED_COMMENT:
        return getOwnedComment();
      case UmlPackage.DEPENDENCY__RELATED_ELEMENT:
        return getRelatedElement();
      case UmlPackage.DEPENDENCY__SOURCE:
        return getSource();
      case UmlPackage.DEPENDENCY__TARGET:
        return getTarget();
      case UmlPackage.DEPENDENCY__SUPPLIER:
        return getSupplier();
      case UmlPackage.DEPENDENCY__CLIENT:
        return getClient();
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
      case UmlPackage.DEPENDENCY__OWNED_COMMENT:
        getOwnedComment().clear();
        getOwnedComment().addAll((Collection<? extends Comment>)newValue);
        return;
      case UmlPackage.DEPENDENCY__SUPPLIER:
        getSupplier().clear();
        getSupplier().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case UmlPackage.DEPENDENCY__CLIENT:
        getClient().clear();
        getClient().addAll((Collection<? extends NamedElement>)newValue);
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
      case UmlPackage.DEPENDENCY__OWNED_COMMENT:
        getOwnedComment().clear();
        return;
      case UmlPackage.DEPENDENCY__SUPPLIER:
        getSupplier().clear();
        return;
      case UmlPackage.DEPENDENCY__CLIENT:
        getClient().clear();
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
      case UmlPackage.DEPENDENCY__OWNED_ELEMENT:
        return !getOwnedElement().isEmpty();
      case UmlPackage.DEPENDENCY__OWNER:
        return basicGetOwner() != null;
      case UmlPackage.DEPENDENCY__OWNED_COMMENT:
        return ownedComment != null && !ownedComment.isEmpty();
      case UmlPackage.DEPENDENCY__RELATED_ELEMENT:
        return !getRelatedElement().isEmpty();
      case UmlPackage.DEPENDENCY__SOURCE:
        return !getSource().isEmpty();
      case UmlPackage.DEPENDENCY__TARGET:
        return !getTarget().isEmpty();
      case UmlPackage.DEPENDENCY__SUPPLIER:
        return supplier != null && !supplier.isEmpty();
      case UmlPackage.DEPENDENCY__CLIENT:
        return client != null && !client.isEmpty();
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
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.DEPENDENCY__OWNED_ELEMENT: return UmlPackage.ELEMENT__OWNED_ELEMENT;
        case UmlPackage.DEPENDENCY__OWNER: return UmlPackage.ELEMENT__OWNER;
        case UmlPackage.DEPENDENCY__OWNED_COMMENT: return UmlPackage.ELEMENT__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == Relationship.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.DEPENDENCY__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == DirectedRelationship.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.DEPENDENCY__SOURCE: return UmlPackage.DIRECTED_RELATIONSHIP__SOURCE;
        case UmlPackage.DEPENDENCY__TARGET: return UmlPackage.DIRECTED_RELATIONSHIP__TARGET;
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
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.ELEMENT__OWNED_ELEMENT: return UmlPackage.DEPENDENCY__OWNED_ELEMENT;
        case UmlPackage.ELEMENT__OWNER: return UmlPackage.DEPENDENCY__OWNER;
        case UmlPackage.ELEMENT__OWNED_COMMENT: return UmlPackage.DEPENDENCY__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == Relationship.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.DEPENDENCY__RELATED_ELEMENT;
        default: return -1;
      }
    }
    if (baseClass == DirectedRelationship.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.DIRECTED_RELATIONSHIP__SOURCE: return UmlPackage.DEPENDENCY__SOURCE;
        case UmlPackage.DIRECTED_RELATIONSHIP__TARGET: return UmlPackage.DEPENDENCY__TARGET;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DependencyImpl
