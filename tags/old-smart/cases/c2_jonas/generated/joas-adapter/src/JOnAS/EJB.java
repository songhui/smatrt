/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EJB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.EJB#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link JOnAS.EJB#getFileName <em>File Name</em>}</li>
 *   <li>{@link JOnAS.EJB#getLocalClass <em>Local Class</em>}</li>
 *   <li>{@link JOnAS.EJB#getLocalHomeClass <em>Local Home Class</em>}</li>
 *   <li>{@link JOnAS.EJB#getHomeClass <em>Home Class</em>}</li>
 *   <li>{@link JOnAS.EJB#getEjbClass <em>Ejb Class</em>}</li>
 *   <li>{@link JOnAS.EJB#getCacheSize <em>Cache Size</em>}</li>
 *   <li>{@link JOnAS.EJB#getPoolSize <em>Pool Size</em>}</li>
 *   <li>{@link JOnAS.EJB#getMaxCacheSize <em>Max Cache Size</em>}</li>
 *   <li>{@link JOnAS.EJB#getMinPoolSize <em>Min Pool Size</em>}</li>
 *   <li>{@link JOnAS.EJB#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link JOnAS.EJB#getDataSourceJNDI <em>Data Source JNDI</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getEJB()
 * @model
 * @generated
 */
public interface EJB extends J2EEManagedObject
{
  /**
   * Returns the value of the '<em><b>Jndi Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jndi Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jndi Name</em>' attribute.
   * @see #setJndiName(String)
   * @see JOnAS.JOnASPackage#getEJB_JndiName()
   * @model required="true"
   * @generated
   */
  String getJndiName();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getJndiName <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jndi Name</em>' attribute.
   * @see #getJndiName()
   * @generated
   */
  void setJndiName(String value);

  /**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see JOnAS.JOnASPackage#getEJB_FileName()
   * @model required="true"
   *        annotation="http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations KeyAttribute='true'"
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

  /**
   * Returns the value of the '<em><b>Local Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Class</em>' attribute.
   * @see #setLocalClass(String)
   * @see JOnAS.JOnASPackage#getEJB_LocalClass()
   * @model required="true"
   * @generated
   */
  String getLocalClass();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getLocalClass <em>Local Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Class</em>' attribute.
   * @see #getLocalClass()
   * @generated
   */
  void setLocalClass(String value);

  /**
   * Returns the value of the '<em><b>Local Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Local Home Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Local Home Class</em>' attribute.
   * @see #setLocalHomeClass(String)
   * @see JOnAS.JOnASPackage#getEJB_LocalHomeClass()
   * @model required="true"
   * @generated
   */
  String getLocalHomeClass();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getLocalHomeClass <em>Local Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Local Home Class</em>' attribute.
   * @see #getLocalHomeClass()
   * @generated
   */
  void setLocalHomeClass(String value);

  /**
   * Returns the value of the '<em><b>Home Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Home Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Home Class</em>' attribute.
   * @see #setHomeClass(String)
   * @see JOnAS.JOnASPackage#getEJB_HomeClass()
   * @model required="true"
   * @generated
   */
  String getHomeClass();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getHomeClass <em>Home Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Home Class</em>' attribute.
   * @see #getHomeClass()
   * @generated
   */
  void setHomeClass(String value);

  /**
   * Returns the value of the '<em><b>Ejb Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ejb Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ejb Class</em>' attribute.
   * @see #setEjbClass(String)
   * @see JOnAS.JOnASPackage#getEJB_EjbClass()
   * @model required="true"
   * @generated
   */
  String getEjbClass();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getEjbClass <em>Ejb Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ejb Class</em>' attribute.
   * @see #getEjbClass()
   * @generated
   */
  void setEjbClass(String value);

  /**
   * Returns the value of the '<em><b>Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache Size</em>' attribute.
   * @see #setCacheSize(int)
   * @see JOnAS.JOnASPackage#getEJB_CacheSize()
   * @model required="true"
   * @generated
   */
  int getCacheSize();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getCacheSize <em>Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache Size</em>' attribute.
   * @see #getCacheSize()
   * @generated
   */
  void setCacheSize(int value);

  /**
   * Returns the value of the '<em><b>Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pool Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pool Size</em>' attribute.
   * @see #setPoolSize(int)
   * @see JOnAS.JOnASPackage#getEJB_PoolSize()
   * @model required="true"
   * @generated
   */
  int getPoolSize();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getPoolSize <em>Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pool Size</em>' attribute.
   * @see #getPoolSize()
   * @generated
   */
  void setPoolSize(int value);

  /**
   * Returns the value of the '<em><b>Max Cache Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max Cache Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max Cache Size</em>' attribute.
   * @see #setMaxCacheSize(int)
   * @see JOnAS.JOnASPackage#getEJB_MaxCacheSize()
   * @model required="true"
   * @generated
   */
  int getMaxCacheSize();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getMaxCacheSize <em>Max Cache Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max Cache Size</em>' attribute.
   * @see #getMaxCacheSize()
   * @generated
   */
  void setMaxCacheSize(int value);

  /**
   * Returns the value of the '<em><b>Min Pool Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min Pool Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min Pool Size</em>' attribute.
   * @see #setMinPoolSize(int)
   * @see JOnAS.JOnASPackage#getEJB_MinPoolSize()
   * @model required="true"
   * @generated
   */
  int getMinPoolSize();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getMinPoolSize <em>Min Pool Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min Pool Size</em>' attribute.
   * @see #getMinPoolSize()
   * @generated
   */
  void setMinPoolSize(int value);

  /**
   * Returns the value of the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Display Name</em>' attribute.
   * @see #setDisplayName(String)
   * @see JOnAS.JOnASPackage#getEJB_DisplayName()
   * @model required="true"
   * @generated
   */
  String getDisplayName();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getDisplayName <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Name</em>' attribute.
   * @see #getDisplayName()
   * @generated
   */
  void setDisplayName(String value);

  /**
   * Returns the value of the '<em><b>Data Source JNDI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Source JNDI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Source JNDI</em>' attribute.
   * @see #setDataSourceJNDI(String)
   * @see JOnAS.JOnASPackage#getEJB_DataSourceJNDI()
   * @model ordered="false"
   * @generated
   */
  String getDataSourceJNDI();

  /**
   * Sets the value of the '{@link JOnAS.EJB#getDataSourceJNDI <em>Data Source JNDI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Source JNDI</em>' attribute.
   * @see #getDataSourceJNDI()
   * @generated
   */
  void setDataSourceJNDI(String value);

} // EJB
