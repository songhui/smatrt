
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

import uml.Association;
import uml.Comment;
import uml.Element;
import uml.Property;
import uml.Relationship;
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
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.AssociationImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link uml.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl  extends ClassifierImpl implements Association
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
   * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedEnd()
   * @generated
   * @ordered
   */
  protected EList<Property> ownedEnd;

  /**
   * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberEnd()
   * @generated
   * @ordered
   */
  protected EList<Property> memberEnd;

  /**
   * The default value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected static final boolean IS_DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsDerived() <em>Is Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsDerived()
   * @generated
   * @ordered
   */
  protected boolean isDerived = IS_DERIVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigableOwnedEnd()
   * @generated
   * @ordered
   */
  protected EList<Property> navigableOwnedEnd;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssociationImpl()
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
    return UmlPackage.Literals.ASSOCIATION;
  }

  
  
  public static Random random=new Random();

public static class ClassWrap{JavaClass clazz;long id;String name;}

ClassWrap src=null;
ClassWrap tgt=null;
  

  
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */ 
   public boolean isForCore(Object arg0){
   	boolean result=true;
   	if(core==null) return false;
    try{
    result=((PackageImpl.FieldWrap)core).src.getClassName().equals(((PackageImpl.FieldWrap)arg0).src.getClassName())
      &&
    ((PackageImpl.FieldWrap)core).tgt.getClassName().equals(((PackageImpl.FieldWrap)arg0).tgt.getClassName())
;
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
  
    PackageImpl.FieldWrap core=(PackageImpl.FieldWrap)this.getCore();
    if(core==null) 
      return result;
    switch(featureID){
    
    case UmlPackage.ASSOCIATION__OWNED_END:
  
      if(src==null || tgt==null){
  src=new AssociationImpl.ClassWrap();
  src.clazz=core.src;
  src.id=random.nextLong();
  tgt=new AssociationImpl.ClassWrap();
  tgt.clazz=core.tgt;
  tgt.id=random.nextLong();
}
result.add(tgt);
result.add(src);
    break;
    
    case UmlPackage.ASSOCIATION__MEMBER_END:
  
      result.add(src);
result.add(tgt);
    break;
    
  
    case UmlPackage.ASSOCIATION__END_TYPE:
  
      
    break;
    
    case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
  
      
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
  
  
    
      ownedComment = new EObjectContainmentEList<Comment>(Comment.class, this, UmlPackage.ASSOCIATION__OWNED_COMMENT);
    
      ownedComment = new EObjectContainmentEListForWrapping<Comment>(
          Comment.class, 
          this, 
          UmlPackage.ASSOCIATION__OWNED_COMMENT,
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
  public EList<Property> getOwnedEnd()
  {

    
    if (ownedEnd == null)
    {
  
  
    
      ownedEnd = new EObjectContainmentEListForWrapping<Property>(
          Property.class, 
          this, 
          UmlPackage.ASSOCIATION__OWNED_END,
          UmlPackage.eINSTANCE.getProperty()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<Property>)ownedEnd)
    .refreshWrap();
  
    return ownedEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getMemberEnd()
  {

    
    if (memberEnd == null)
    {
  
  
    
      memberEnd = new EObjectContainmentEListForWrapping<Property>(
          Property.class, 
          this, 
          UmlPackage.ASSOCIATION__MEMBER_END,
          UmlPackage.eINSTANCE.getProperty()
        );
        
  }
  
    ((EObjectContainmentEListForWrapping<Property>)memberEnd)
    .refreshWrap();
  
    return memberEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsDerived()
  {
        Object result=null;
        PackageImpl.FieldWrap core=(PackageImpl.FieldWrap)getCore();
        if(core==null) return isDerived;
    return isDerived; 
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsDerived(boolean newIsDerived)
  {
    boolean oldIsDerived = isDerived;
    isDerived = newIsDerived;
        	
      PackageImpl.FieldWrap core=(PackageImpl.FieldWrap)getCore();
      if(core==null) return;
      	
        
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__IS_DERIVED, oldIsDerived, isDerived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Type> getEndType()
  {
    // TODO: implement this method to return the 'End Type' reference list
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
  public EList<Property> getNavigableOwnedEnd()
  {

    
    if (navigableOwnedEnd == null)
    {
  
  
    
      navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
    
      navigableOwnedEnd = new EObjectContainmentEListForWrapping<Property>(
          Property.class, 
          this, 
          UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END,
          UmlPackage.eINSTANCE.getProperty()
        );
        
  }
  
    return navigableOwnedEnd;
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
      case UmlPackage.ASSOCIATION__OWNED_COMMENT:
        return ((InternalEList<?>)getOwnedComment()).basicRemove(otherEnd, msgs);
      case UmlPackage.ASSOCIATION__OWNED_END:
        return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
      case UmlPackage.ASSOCIATION__OWNED_ELEMENT:
        return getOwnedElement();
      case UmlPackage.ASSOCIATION__OWNER:
        if (resolve) return getOwner();
        return basicGetOwner();
      case UmlPackage.ASSOCIATION__OWNED_COMMENT:
        return getOwnedComment();
      case UmlPackage.ASSOCIATION__RELATED_ELEMENT:
        return getRelatedElement();
      case UmlPackage.ASSOCIATION__OWNED_END:
        return getOwnedEnd();
      case UmlPackage.ASSOCIATION__MEMBER_END:
        return getMemberEnd();
      case UmlPackage.ASSOCIATION__IS_DERIVED:
        return isIsDerived() ? Boolean.TRUE : Boolean.FALSE;
      case UmlPackage.ASSOCIATION__END_TYPE:
        return getEndType();
      case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
        return getNavigableOwnedEnd();
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
      case UmlPackage.ASSOCIATION__OWNED_COMMENT:
        getOwnedComment().clear();
        getOwnedComment().addAll((Collection<? extends Comment>)newValue);
        return;
      case UmlPackage.ASSOCIATION__OWNED_END:
        getOwnedEnd().clear();
        getOwnedEnd().addAll((Collection<? extends Property>)newValue);
        return;
      case UmlPackage.ASSOCIATION__MEMBER_END:
        getMemberEnd().clear();
        getMemberEnd().addAll((Collection<? extends Property>)newValue);
        return;
      case UmlPackage.ASSOCIATION__IS_DERIVED:
        setIsDerived(((Boolean)newValue).booleanValue());
        return;
      case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
        getNavigableOwnedEnd().clear();
        getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
      case UmlPackage.ASSOCIATION__OWNED_COMMENT:
        getOwnedComment().clear();
        return;
      case UmlPackage.ASSOCIATION__OWNED_END:
        getOwnedEnd().clear();
        return;
      case UmlPackage.ASSOCIATION__MEMBER_END:
        getMemberEnd().clear();
        return;
      case UmlPackage.ASSOCIATION__IS_DERIVED:
        setIsDerived(IS_DERIVED_EDEFAULT);
        return;
      case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
        getNavigableOwnedEnd().clear();
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
      case UmlPackage.ASSOCIATION__OWNED_ELEMENT:
        return !getOwnedElement().isEmpty();
      case UmlPackage.ASSOCIATION__OWNER:
        return basicGetOwner() != null;
      case UmlPackage.ASSOCIATION__OWNED_COMMENT:
        return ownedComment != null && !ownedComment.isEmpty();
      case UmlPackage.ASSOCIATION__RELATED_ELEMENT:
        return !getRelatedElement().isEmpty();
      case UmlPackage.ASSOCIATION__OWNED_END:
        return ownedEnd != null && !ownedEnd.isEmpty();
      case UmlPackage.ASSOCIATION__MEMBER_END:
        return memberEnd != null && !memberEnd.isEmpty();
      case UmlPackage.ASSOCIATION__IS_DERIVED:
        return isDerived != IS_DERIVED_EDEFAULT;
      case UmlPackage.ASSOCIATION__END_TYPE:
        return !getEndType().isEmpty();
      case UmlPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
        return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
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
        case UmlPackage.ASSOCIATION__OWNED_ELEMENT: return UmlPackage.ELEMENT__OWNED_ELEMENT;
        case UmlPackage.ASSOCIATION__OWNER: return UmlPackage.ELEMENT__OWNER;
        case UmlPackage.ASSOCIATION__OWNED_COMMENT: return UmlPackage.ELEMENT__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == Relationship.class)
    {
      switch (derivedFeatureID)
      {
        case UmlPackage.ASSOCIATION__RELATED_ELEMENT: return UmlPackage.RELATIONSHIP__RELATED_ELEMENT;
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
        case UmlPackage.ELEMENT__OWNED_ELEMENT: return UmlPackage.ASSOCIATION__OWNED_ELEMENT;
        case UmlPackage.ELEMENT__OWNER: return UmlPackage.ASSOCIATION__OWNER;
        case UmlPackage.ELEMENT__OWNED_COMMENT: return UmlPackage.ASSOCIATION__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == Relationship.class)
    {
      switch (baseFeatureID)
      {
        case UmlPackage.RELATIONSHIP__RELATED_ELEMENT: return UmlPackage.ASSOCIATION__RELATED_ELEMENT;
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
    result.append(" (isDerived: ");
    result.append(isDerived);
    result.append(')');
    return result.toString();
  }

} //AssociationImpl
