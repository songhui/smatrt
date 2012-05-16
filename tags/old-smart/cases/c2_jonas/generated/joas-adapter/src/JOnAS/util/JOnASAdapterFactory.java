/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS.util;

import JOnAS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JOnAS.JOnASPackage
 * @generated
 */
public class JOnASAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static JOnASPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JOnASAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = JOnASPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JOnASSwitch<Adapter> modelSwitch =
    new JOnASSwitch<Adapter>()
    {
      @Override
      public Adapter caseMBeanServer(MBeanServer object)
      {
        return createMBeanServerAdapter();
      }
      @Override
      public Adapter caseJ2EEManagedObject(J2EEManagedObject object)
      {
        return createJ2EEManagedObjectAdapter();
      }
      @Override
      public Adapter caseEJB(EJB object)
      {
        return createEJBAdapter();
      }
      @Override
      public Adapter caseSessionBean(SessionBean object)
      {
        return createSessionBeanAdapter();
      }
      @Override
      public Adapter caseStatefulSessionBean(StatefulSessionBean object)
      {
        return createStatefulSessionBeanAdapter();
      }
      @Override
      public Adapter caseStatelessSessionBean(StatelessSessionBean object)
      {
        return createStatelessSessionBeanAdapter();
      }
      @Override
      public Adapter caseEntityBean(EntityBean object)
      {
        return createEntityBeanAdapter();
      }
      @Override
      public Adapter caseJDBCDataSource(JDBCDataSource object)
      {
        return createJDBCDataSourceAdapter();
      }
      @Override
      public Adapter caseJVM(JVM object)
      {
        return createJVMAdapter();
      }
      @Override
      public Adapter caseWebModule(WebModule object)
      {
        return createWebModuleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link JOnAS.MBeanServer <em>MBean Server</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.MBeanServer
   * @generated
   */
  public Adapter createMBeanServerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.J2EEManagedObject <em>J2EE Managed Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.J2EEManagedObject
   * @generated
   */
  public Adapter createJ2EEManagedObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.EJB <em>EJB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.EJB
   * @generated
   */
  public Adapter createEJBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.SessionBean <em>Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.SessionBean
   * @generated
   */
  public Adapter createSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.StatefulSessionBean <em>Stateful Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.StatefulSessionBean
   * @generated
   */
  public Adapter createStatefulSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.StatelessSessionBean <em>Stateless Session Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.StatelessSessionBean
   * @generated
   */
  public Adapter createStatelessSessionBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.EntityBean <em>Entity Bean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.EntityBean
   * @generated
   */
  public Adapter createEntityBeanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.JDBCDataSource <em>JDBC Data Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.JDBCDataSource
   * @generated
   */
  public Adapter createJDBCDataSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.JVM <em>JVM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.JVM
   * @generated
   */
  public Adapter createJVMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link JOnAS.WebModule <em>Web Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see JOnAS.WebModule
   * @generated
   */
  public Adapter createWebModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //JOnASAdapterFactory
