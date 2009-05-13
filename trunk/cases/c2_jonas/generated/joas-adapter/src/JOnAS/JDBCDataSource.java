/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JDBC Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.JDBCDataSource#getDescription <em>Description</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getJdbcMinConnPool <em>Jdbc Min Conn Pool</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getJdbcMaxConnPool <em>Jdbc Max Conn Pool</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getCurrentOpened <em>Current Opened</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getJndiName <em>Jndi Name</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getBusyMax <em>Busy Max</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getConnectionFailures <em>Connection Failures</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getCurrentBusy <em>Current Busy</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getUserName <em>User Name</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getBusyMin <em>Busy Min</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getUserPassword <em>User Password</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getUrl <em>Url</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getJdbcMaxWaiters <em>Jdbc Max Waiters</em>}</li>
 *   <li>{@link JOnAS.JDBCDataSource#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getJDBCDataSource()
 * @model annotation="http://www.sei.pku.edu.cn/runtime-access create='if(name!=null){\r\n\t\t\tManagement mgmt=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\t\ttry {\r\n\t\t\t\tString p_Filename=name;\r\n\t\t        String[] asParam = new String[1];\r\n\t\t        String[] asSignature = new String[1];\r\n\t\t        asParam[0] = p_Filename;\r\n\t\t        asSignature[0] = \"java.lang.String\";\r\n\r\n\t\t}\r\n\t\treturn null;' delete='if(name!=null){\r\n\t\t\tManagement mgmt=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\t\ttry {\r\n\t\t\t\tString p_Filename=name;\r\n\t\t        String[] asParam = new String[1];\r\n\t\t        String[] asSignature = new String[1];\r\n\t\t        asParam[0] = p_Filename;\r\n\t\t        asSignature[0] = \"java.lang.String\";\r\n\r\n\t\t}\r\n\t\treturn null;'"
 * @generated
 */
public interface JDBCDataSource extends J2EEManagedObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_Description()
   * @model required="true"
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Jdbc Min Conn Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Min Conn Pool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Min Conn Pool</em>' attribute.
   * @see #setJdbcMinConnPool(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_JdbcMinConnPool()
   * @model required="true"
   * @generated
   */
  int getJdbcMinConnPool();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getJdbcMinConnPool <em>Jdbc Min Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc Min Conn Pool</em>' attribute.
   * @see #getJdbcMinConnPool()
   * @generated
   */
  void setJdbcMinConnPool(int value);

  /**
   * Returns the value of the '<em><b>Jdbc Max Conn Pool</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Max Conn Pool</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Max Conn Pool</em>' attribute.
   * @see #setJdbcMaxConnPool(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_JdbcMaxConnPool()
   * @model required="true"
   *        annotation="http://www.sei.pku.edu.cn/runtime-access get='        if(getCore()==null) \r\n        \treturn  -1;\r\n\t\t\r\n\t\tManagement mainEntry=JOnASPackage.eINSTANCE.getMainEntry();\r\n\t\tObjectName obj=(ObjectName)getCore();\r\n\t\t\r\n\t\ttry {\r\n\t\t\tObject res=mainEntry.getAttribute(obj, \"jdbcMaxConnPool\");\r\n\t\t\t\r\n\t\t\tjdbcMaxConnPool=((Integer)res).intValue();\r\n\t\t\t\r\n\t\t} catch (Exception e) {\r\n\t\t\te.printStackTrace();\r\n\t\t}\r\n        \r\n\t\treturn jdbcMaxConnPool;//second'"
   * @generated
   */
  int getJdbcMaxConnPool();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getJdbcMaxConnPool <em>Jdbc Max Conn Pool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc Max Conn Pool</em>' attribute.
   * @see #getJdbcMaxConnPool()
   * @generated
   */
  void setJdbcMaxConnPool(int value);

  /**
   * Returns the value of the '<em><b>Current Opened</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Opened</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Opened</em>' attribute.
   * @see #setCurrentOpened(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_CurrentOpened()
   * @model required="true"
   * @generated
   */
  int getCurrentOpened();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getCurrentOpened <em>Current Opened</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Opened</em>' attribute.
   * @see #getCurrentOpened()
   * @generated
   */
  void setCurrentOpened(int value);

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
   * @see JOnAS.JOnASPackage#getJDBCDataSource_JndiName()
   * @model required="true"
   * @generated
   */
  String getJndiName();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getJndiName <em>Jndi Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jndi Name</em>' attribute.
   * @see #getJndiName()
   * @generated
   */
  void setJndiName(String value);

  /**
   * Returns the value of the '<em><b>Busy Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Busy Max</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Busy Max</em>' attribute.
   * @see #setBusyMax(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_BusyMax()
   * @model required="true"
   * @generated
   */
  int getBusyMax();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getBusyMax <em>Busy Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Busy Max</em>' attribute.
   * @see #getBusyMax()
   * @generated
   */
  void setBusyMax(int value);

  /**
   * Returns the value of the '<em><b>Connection Failures</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Connection Failures</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connection Failures</em>' attribute.
   * @see #setConnectionFailures(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_ConnectionFailures()
   * @model required="true"
   * @generated
   */
  int getConnectionFailures();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getConnectionFailures <em>Connection Failures</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Connection Failures</em>' attribute.
   * @see #getConnectionFailures()
   * @generated
   */
  void setConnectionFailures(int value);

  /**
   * Returns the value of the '<em><b>Current Busy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Busy</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Busy</em>' attribute.
   * @see #setCurrentBusy(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_CurrentBusy()
   * @model required="true"
   * @generated
   */
  int getCurrentBusy();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getCurrentBusy <em>Current Busy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Busy</em>' attribute.
   * @see #getCurrentBusy()
   * @generated
   */
  void setCurrentBusy(int value);

  /**
   * Returns the value of the '<em><b>User Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Name</em>' attribute.
   * @see #setUserName(String)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_UserName()
   * @model required="true"
   * @generated
   */
  String getUserName();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getUserName <em>User Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Name</em>' attribute.
   * @see #getUserName()
   * @generated
   */
  void setUserName(String value);

  /**
   * Returns the value of the '<em><b>Busy Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Busy Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Busy Min</em>' attribute.
   * @see #setBusyMin(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_BusyMin()
   * @model required="true"
   * @generated
   */
  int getBusyMin();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getBusyMin <em>Busy Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Busy Min</em>' attribute.
   * @see #getBusyMin()
   * @generated
   */
  void setBusyMin(int value);

  /**
   * Returns the value of the '<em><b>User Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>User Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>User Password</em>' attribute.
   * @see #setUserPassword(String)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_UserPassword()
   * @model required="true"
   * @generated
   */
  String getUserPassword();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getUserPassword <em>User Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>User Password</em>' attribute.
   * @see #getUserPassword()
   * @generated
   */
  void setUserPassword(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_Url()
   * @model required="true"
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Jdbc Max Waiters</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jdbc Max Waiters</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jdbc Max Waiters</em>' attribute.
   * @see #setJdbcMaxWaiters(int)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_JdbcMaxWaiters()
   * @model required="true"
   * @generated
   */
  int getJdbcMaxWaiters();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getJdbcMaxWaiters <em>Jdbc Max Waiters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jdbc Max Waiters</em>' attribute.
   * @see #getJdbcMaxWaiters()
   * @generated
   */
  void setJdbcMaxWaiters(int value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JOnAS.MBeanServer#getJdbcDataSource <em>Jdbc Data Source</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(MBeanServer)
   * @see JOnAS.JOnASPackage#getJDBCDataSource_Parent()
   * @see JOnAS.MBeanServer#getJdbcDataSource
   * @model opposite="jdbcDataSource" required="true" transient="false"
   * @generated
   */
  MBeanServer getParent();

  /**
   * Sets the value of the '{@link JOnAS.JDBCDataSource#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MBeanServer value);

} // JDBCDataSource
