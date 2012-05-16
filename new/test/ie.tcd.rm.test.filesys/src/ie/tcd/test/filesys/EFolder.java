/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFolder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ie.tcd.test.filesys.EFolder#getSubfiles <em>Subfiles</em>}</li>
 * </ul>
 * </p>
 *
 * @see ie.tcd.test.filesys.FileSysPackage#getEFolder()
 * @model
 * @generated
 */
public interface EFolder extends EFile {
	/**
	 * Returns the value of the '<em><b>Subfiles</b></em>' containment reference list.
	 * The list contents are of type {@link ie.tcd.test.filesys.EFile}.
	 * It is bidirectional and its opposite is '{@link ie.tcd.test.filesys.EFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subfiles</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subfiles</em>' containment reference list.
	 * @see ie.tcd.test.filesys.FileSysPackage#getEFolder_Subfiles()
	 * @see ie.tcd.test.filesys.EFile#getParent
	 * @model type="ie.tcd.test.filesys.EFile" opposite="parent" containment="true"
	 * @generated
	 */
	EList getSubfiles();

} // EFolder
