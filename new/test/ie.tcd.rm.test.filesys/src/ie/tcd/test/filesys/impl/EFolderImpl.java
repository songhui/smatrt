/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys.impl;

import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.FileSysPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFolder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.test.filesys.impl.EFolderImpl#getSubfiles <em>Subfiles</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFolderImpl extends EFileImpl implements EFolder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FileSysPackage.Literals.EFOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubfiles() {
		return (EList)eGet(FileSysPackage.Literals.EFOLDER__SUBFILES, true);
	}

} //EFolderImpl
