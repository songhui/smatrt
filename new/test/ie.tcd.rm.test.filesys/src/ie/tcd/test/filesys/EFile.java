/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.test.filesys.EFile#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ie.tcd.test.filesys.EFile#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.test.filesys.EFile#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.test.filesys.FileSysPackage#getEFile()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface EFile extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Readonly</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readonly</em>' attribute.
	 * @see #setReadonly(boolean)
	 * @see ie.tcd.test.filesys.FileSysPackage#getEFile_Readonly()
	 * @model required="true"
	 * @generated
	 */
	boolean isReadonly();

	/**
	 * Sets the value of the '{@link ie.tcd.test.filesys.EFile#isReadonly <em>Readonly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readonly</em>' attribute.
	 * @see #isReadonly()
	 * @generated
	 */
	void setReadonly(boolean value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"NewFile"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ie.tcd.test.filesys.FileSysPackage#getEFile_Name()
	 * @model default="NewFile" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ie.tcd.test.filesys.EFile#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ie.tcd.test.filesys.EFolder#getSubfiles <em>Subfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(EFolder)
	 * @see ie.tcd.test.filesys.FileSysPackage#getEFile_Parent()
	 * @see ie.tcd.test.filesys.EFolder#getSubfiles
	 * @model opposite="subfiles" transient="false"
	 * @generated
	 */
	EFolder getParent();

	/**
	 * Sets the value of the '{@link ie.tcd.test.filesys.EFile#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(EFolder value);

} // EFile
