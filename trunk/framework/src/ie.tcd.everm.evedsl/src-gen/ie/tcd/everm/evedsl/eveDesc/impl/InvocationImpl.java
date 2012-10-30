/**
 * <copyright>
 * </copyright>
 *

 */
package ie.tcd.everm.evedsl.eveDesc.impl;

import ie.tcd.everm.evedsl.eveDesc.EveDescPackage;
import ie.tcd.everm.evedsl.eveDesc.Invocation;
import ie.tcd.everm.evedsl.eveDesc.OperationPointCut;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getRetType <em>Ret Type</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getInvoke <em>Invoke</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getPostpara <em>Postpara</em>}</li>
 *   <li>{@link ie.tcd.everm.evedsl.eveDesc.impl.InvocationImpl#getPost <em>Post</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvocationImpl extends MinimalEObjectImpl.Container implements Invocation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected EList<XVariableDeclaration> variable;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EList<OperationPointCut> operation;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected XExpression pre;

  /**
   * The cached value of the '{@link #getRetType() <em>Ret Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetType()
   * @generated
   * @ordered
   */
  protected JvmTypeReference retType;

  /**
   * The cached value of the '{@link #getInvoke() <em>Invoke</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInvoke()
   * @generated
   * @ordered
   */
  protected XExpression invoke;

  /**
   * The cached value of the '{@link #getPostpara() <em>Postpara</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostpara()
   * @generated
   * @ordered
   */
  protected JvmFormalParameter postpara;

  /**
   * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPost()
   * @generated
   * @ordered
   */
  protected XExpression post;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvocationImpl()
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
    return EveDescPackage.Literals.INVOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XVariableDeclaration> getVariable()
  {
    if (variable == null)
    {
      variable = new EObjectContainmentEList<XVariableDeclaration>(XVariableDeclaration.class, this, EveDescPackage.INVOCATION__VARIABLE);
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationPointCut> getOperation()
  {
    if (operation == null)
    {
      operation = new EObjectContainmentEList<OperationPointCut>(OperationPointCut.class, this, EveDescPackage.INVOCATION__OPERATION);
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPre()
  {
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPre(XExpression newPre, NotificationChain msgs)
  {
    XExpression oldPre = pre;
    pre = newPre;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__PRE, oldPre, newPre);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPre(XExpression newPre)
  {
    if (newPre != pre)
    {
      NotificationChain msgs = null;
      if (pre != null)
        msgs = ((InternalEObject)pre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__PRE, null, msgs);
      if (newPre != null)
        msgs = ((InternalEObject)newPre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__PRE, null, msgs);
      msgs = basicSetPre(newPre, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__PRE, newPre, newPre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getRetType()
  {
    return retType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRetType(JvmTypeReference newRetType, NotificationChain msgs)
  {
    JvmTypeReference oldRetType = retType;
    retType = newRetType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__RET_TYPE, oldRetType, newRetType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetType(JvmTypeReference newRetType)
  {
    if (newRetType != retType)
    {
      NotificationChain msgs = null;
      if (retType != null)
        msgs = ((InternalEObject)retType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__RET_TYPE, null, msgs);
      if (newRetType != null)
        msgs = ((InternalEObject)newRetType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__RET_TYPE, null, msgs);
      msgs = basicSetRetType(newRetType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__RET_TYPE, newRetType, newRetType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getInvoke()
  {
    return invoke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInvoke(XExpression newInvoke, NotificationChain msgs)
  {
    XExpression oldInvoke = invoke;
    invoke = newInvoke;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__INVOKE, oldInvoke, newInvoke);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInvoke(XExpression newInvoke)
  {
    if (newInvoke != invoke)
    {
      NotificationChain msgs = null;
      if (invoke != null)
        msgs = ((InternalEObject)invoke).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__INVOKE, null, msgs);
      if (newInvoke != null)
        msgs = ((InternalEObject)newInvoke).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__INVOKE, null, msgs);
      msgs = basicSetInvoke(newInvoke, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__INVOKE, newInvoke, newInvoke));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmFormalParameter getPostpara()
  {
    return postpara;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostpara(JvmFormalParameter newPostpara, NotificationChain msgs)
  {
    JvmFormalParameter oldPostpara = postpara;
    postpara = newPostpara;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__POSTPARA, oldPostpara, newPostpara);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostpara(JvmFormalParameter newPostpara)
  {
    if (newPostpara != postpara)
    {
      NotificationChain msgs = null;
      if (postpara != null)
        msgs = ((InternalEObject)postpara).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__POSTPARA, null, msgs);
      if (newPostpara != null)
        msgs = ((InternalEObject)newPostpara).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__POSTPARA, null, msgs);
      msgs = basicSetPostpara(newPostpara, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__POSTPARA, newPostpara, newPostpara));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getPost()
  {
    return post;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPost(XExpression newPost, NotificationChain msgs)
  {
    XExpression oldPost = post;
    post = newPost;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__POST, oldPost, newPost);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPost(XExpression newPost)
  {
    if (newPost != post)
    {
      NotificationChain msgs = null;
      if (post != null)
        msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__POST, null, msgs);
      if (newPost != null)
        msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EveDescPackage.INVOCATION__POST, null, msgs);
      msgs = basicSetPost(newPost, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EveDescPackage.INVOCATION__POST, newPost, newPost));
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
      case EveDescPackage.INVOCATION__VARIABLE:
        return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
      case EveDescPackage.INVOCATION__OPERATION:
        return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
      case EveDescPackage.INVOCATION__PRE:
        return basicSetPre(null, msgs);
      case EveDescPackage.INVOCATION__RET_TYPE:
        return basicSetRetType(null, msgs);
      case EveDescPackage.INVOCATION__INVOKE:
        return basicSetInvoke(null, msgs);
      case EveDescPackage.INVOCATION__POSTPARA:
        return basicSetPostpara(null, msgs);
      case EveDescPackage.INVOCATION__POST:
        return basicSetPost(null, msgs);
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
      case EveDescPackage.INVOCATION__NAME:
        return getName();
      case EveDescPackage.INVOCATION__VARIABLE:
        return getVariable();
      case EveDescPackage.INVOCATION__OPERATION:
        return getOperation();
      case EveDescPackage.INVOCATION__PRE:
        return getPre();
      case EveDescPackage.INVOCATION__RET_TYPE:
        return getRetType();
      case EveDescPackage.INVOCATION__INVOKE:
        return getInvoke();
      case EveDescPackage.INVOCATION__POSTPARA:
        return getPostpara();
      case EveDescPackage.INVOCATION__POST:
        return getPost();
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
      case EveDescPackage.INVOCATION__NAME:
        setName((String)newValue);
        return;
      case EveDescPackage.INVOCATION__VARIABLE:
        getVariable().clear();
        getVariable().addAll((Collection<? extends XVariableDeclaration>)newValue);
        return;
      case EveDescPackage.INVOCATION__OPERATION:
        getOperation().clear();
        getOperation().addAll((Collection<? extends OperationPointCut>)newValue);
        return;
      case EveDescPackage.INVOCATION__PRE:
        setPre((XExpression)newValue);
        return;
      case EveDescPackage.INVOCATION__RET_TYPE:
        setRetType((JvmTypeReference)newValue);
        return;
      case EveDescPackage.INVOCATION__INVOKE:
        setInvoke((XExpression)newValue);
        return;
      case EveDescPackage.INVOCATION__POSTPARA:
        setPostpara((JvmFormalParameter)newValue);
        return;
      case EveDescPackage.INVOCATION__POST:
        setPost((XExpression)newValue);
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
      case EveDescPackage.INVOCATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EveDescPackage.INVOCATION__VARIABLE:
        getVariable().clear();
        return;
      case EveDescPackage.INVOCATION__OPERATION:
        getOperation().clear();
        return;
      case EveDescPackage.INVOCATION__PRE:
        setPre((XExpression)null);
        return;
      case EveDescPackage.INVOCATION__RET_TYPE:
        setRetType((JvmTypeReference)null);
        return;
      case EveDescPackage.INVOCATION__INVOKE:
        setInvoke((XExpression)null);
        return;
      case EveDescPackage.INVOCATION__POSTPARA:
        setPostpara((JvmFormalParameter)null);
        return;
      case EveDescPackage.INVOCATION__POST:
        setPost((XExpression)null);
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
      case EveDescPackage.INVOCATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EveDescPackage.INVOCATION__VARIABLE:
        return variable != null && !variable.isEmpty();
      case EveDescPackage.INVOCATION__OPERATION:
        return operation != null && !operation.isEmpty();
      case EveDescPackage.INVOCATION__PRE:
        return pre != null;
      case EveDescPackage.INVOCATION__RET_TYPE:
        return retType != null;
      case EveDescPackage.INVOCATION__INVOKE:
        return invoke != null;
      case EveDescPackage.INVOCATION__POSTPARA:
        return postpara != null;
      case EveDescPackage.INVOCATION__POST:
        return post != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //InvocationImpl
