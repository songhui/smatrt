/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.util;

import JOnAS.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see JOnAS.JOnASPackage
 * @generated
 */
public class JOnASSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JOnASPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JOnASSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = JOnASPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case JOnASPackage.MBEAN_SERVER:
      {
        MBeanServer mBeanServer = (MBeanServer)theEObject;
        T result = caseMBeanServer(mBeanServer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.J2EE_MANAGED_OBJECT:
      {
        J2EEManagedObject j2EEManagedObject = (J2EEManagedObject)theEObject;
        T result = caseJ2EEManagedObject(j2EEManagedObject);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.EJB:
      {
        EJB ejb = (EJB)theEObject;
        T result = caseEJB(ejb);
        if (result == null) result = caseJ2EEManagedObject(ejb);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.SESSION_BEAN:
      {
        SessionBean sessionBean = (SessionBean)theEObject;
        T result = caseSessionBean(sessionBean);
        if (result == null) result = caseEJB(sessionBean);
        if (result == null) result = caseJ2EEManagedObject(sessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.STATEFUL_SESSION_BEAN:
      {
        StatefulSessionBean statefulSessionBean = (StatefulSessionBean)theEObject;
        T result = caseStatefulSessionBean(statefulSessionBean);
        if (result == null) result = caseSessionBean(statefulSessionBean);
        if (result == null) result = caseEJB(statefulSessionBean);
        if (result == null) result = caseJ2EEManagedObject(statefulSessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.STATELESS_SESSION_BEAN:
      {
        StatelessSessionBean statelessSessionBean = (StatelessSessionBean)theEObject;
        T result = caseStatelessSessionBean(statelessSessionBean);
        if (result == null) result = caseSessionBean(statelessSessionBean);
        if (result == null) result = caseEJB(statelessSessionBean);
        if (result == null) result = caseJ2EEManagedObject(statelessSessionBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.ENTITY_BEAN:
      {
        EntityBean entityBean = (EntityBean)theEObject;
        T result = caseEntityBean(entityBean);
        if (result == null) result = caseEJB(entityBean);
        if (result == null) result = caseJ2EEManagedObject(entityBean);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.JDBC_DATA_SOURCE:
      {
        JDBCDataSource jdbcDataSource = (JDBCDataSource)theEObject;
        T result = caseJDBCDataSource(jdbcDataSource);
        if (result == null) result = caseJ2EEManagedObject(jdbcDataSource);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.JVM:
      {
        JVM jvm = (JVM)theEObject;
        T result = caseJVM(jvm);
        if (result == null) result = caseJ2EEManagedObject(jvm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case JOnASPackage.WEB_MODULE:
      {
        WebModule webModule = (WebModule)theEObject;
        T result = caseWebModule(webModule);
        if (result == null) result = caseJ2EEManagedObject(webModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>MBean Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>MBean Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMBeanServer(MBeanServer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>J2EE Managed Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>J2EE Managed Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJ2EEManagedObject(J2EEManagedObject object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EJB</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EJB</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEJB(EJB object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSessionBean(SessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateful Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatefulSessionBean(StatefulSessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stateless Session Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatelessSessionBean(StatelessSessionBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entity Bean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entity Bean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntityBean(EntityBean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JDBC Data Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JDBC Data Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJDBCDataSource(JDBCDataSource object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>JVM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>JVM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJVM(JVM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Web Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Web Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebModule(WebModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //JOnASSwitch
