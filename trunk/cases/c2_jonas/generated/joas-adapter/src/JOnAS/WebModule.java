/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.WebModule#getPath <em>Path</em>}</li>
 *   <li>{@link JOnAS.WebModule#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link JOnAS.WebModule#getHostname <em>Hostname</em>}</li>
 *   <li>{@link JOnAS.WebModule#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link JOnAS.WebModule#getWarURL <em>War URL</em>}</li>
 *   <li>{@link JOnAS.WebModule#getParent <em>Parent</em>}</li>
 *   <li>{@link JOnAS.WebModule#getFileName <em>File Name</em>}</li>
 *   <li>{@link JOnAS.WebModule#getEjbref <em>Ejbref</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getWebModule()
 * @model
 * @generated
 */
public interface WebModule extends J2EEManagedObject
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see JOnAS.JOnASPackage#getWebModule_Path()
   * @model required="true"
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Start Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Time</em>' attribute.
   * @see #setStartTime(long)
   * @see JOnAS.JOnASPackage#getWebModule_StartTime()
   * @model required="true"
   * @generated
   */
  long getStartTime();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getStartTime <em>Start Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Time</em>' attribute.
   * @see #getStartTime()
   * @generated
   */
  void setStartTime(long value);

  /**
   * Returns the value of the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostname</em>' attribute.
   * @see #setHostname(String)
   * @see JOnAS.JOnASPackage#getWebModule_Hostname()
   * @model required="true"
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

  /**
   * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Startup Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Startup Time</em>' attribute.
   * @see #setStartupTime(long)
   * @see JOnAS.JOnASPackage#getWebModule_StartupTime()
   * @model required="true"
   * @generated
   */
  long getStartupTime();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getStartupTime <em>Startup Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Startup Time</em>' attribute.
   * @see #getStartupTime()
   * @generated
   */
  void setStartupTime(long value);

  /**
   * Returns the value of the '<em><b>War URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>War URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>War URL</em>' attribute.
   * @see #setWarURL(String)
   * @see JOnAS.JOnASPackage#getWebModule_WarURL()
   * @model required="true"
   * @generated
   */
  String getWarURL();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getWarURL <em>War URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>War URL</em>' attribute.
   * @see #getWarURL()
   * @generated
   */
  void setWarURL(String value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JOnAS.MBeanServer#getWebModule <em>Web Module</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(MBeanServer)
   * @see JOnAS.JOnASPackage#getWebModule_Parent()
   * @see JOnAS.MBeanServer#getWebModule
   * @model opposite="webModule" required="true" transient="false"
   * @generated
   */
  MBeanServer getParent();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MBeanServer value);

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
   * @see JOnAS.JOnASPackage#getWebModule_FileName()
   * @model required="true"
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

  /**
   * Returns the value of the '<em><b>Ejbref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ejbref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ejbref</em>' attribute.
   * @see #setEjbref(String)
   * @see JOnAS.JOnASPackage#getWebModule_Ejbref()
   * @model required="true"
   * @generated
   */
  String getEjbref();

  /**
   * Sets the value of the '{@link JOnAS.WebModule#getEjbref <em>Ejbref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ejbref</em>' attribute.
   * @see #getEjbref()
   * @generated
   */
  void setEjbref(String value);

} // WebModule
