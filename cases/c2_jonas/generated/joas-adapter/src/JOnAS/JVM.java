/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package JOnAS;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JVM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link JOnAS.JVM#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link JOnAS.JVM#getJavaVendor <em>Java Vendor</em>}</li>
 *   <li>{@link JOnAS.JVM#getAllThreadsCount <em>All Threads Count</em>}</li>
 *   <li>{@link JOnAS.JVM#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see JOnAS.JOnASPackage#getJVM()
 * @model
 * @generated
 */
public interface JVM extends J2EEManagedObject
{
  /**
   * Returns the value of the '<em><b>Java Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Version</em>' attribute.
   * @see #setJavaVersion(String)
   * @see JOnAS.JOnASPackage#getJVM_JavaVersion()
   * @model required="true"
   * @generated
   */
  String getJavaVersion();

  /**
   * Sets the value of the '{@link JOnAS.JVM#getJavaVersion <em>Java Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Version</em>' attribute.
   * @see #getJavaVersion()
   * @generated
   */
  void setJavaVersion(String value);

  /**
   * Returns the value of the '<em><b>Java Vendor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Java Vendor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Java Vendor</em>' attribute.
   * @see #setJavaVendor(String)
   * @see JOnAS.JOnASPackage#getJVM_JavaVendor()
   * @model required="true"
   * @generated
   */
  String getJavaVendor();

  /**
   * Sets the value of the '{@link JOnAS.JVM#getJavaVendor <em>Java Vendor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Java Vendor</em>' attribute.
   * @see #getJavaVendor()
   * @generated
   */
  void setJavaVendor(String value);

  /**
   * Returns the value of the '<em><b>All Threads Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>All Threads Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>All Threads Count</em>' attribute.
   * @see #setAllThreadsCount(int)
   * @see JOnAS.JOnASPackage#getJVM_AllThreadsCount()
   * @model required="true"
   * @generated
   */
  int getAllThreadsCount();

  /**
   * Sets the value of the '{@link JOnAS.JVM#getAllThreadsCount <em>All Threads Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>All Threads Count</em>' attribute.
   * @see #getAllThreadsCount()
   * @generated
   */
  void setAllThreadsCount(int value);

  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link JOnAS.MBeanServer#getJvm <em>Jvm</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(MBeanServer)
   * @see JOnAS.JOnASPackage#getJVM_Parent()
   * @see JOnAS.MBeanServer#getJvm
   * @model opposite="jvm" required="true" transient="false"
   * @generated
   */
  MBeanServer getParent();

  /**
   * Sets the value of the '{@link JOnAS.JVM#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(MBeanServer value);

} // JVM
