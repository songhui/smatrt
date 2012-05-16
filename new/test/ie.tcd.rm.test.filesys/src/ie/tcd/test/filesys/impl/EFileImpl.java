/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys.impl;

import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.FileSysPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ie.tcd.test.filesys.impl.EFileImpl#isReadonly <em>Readonly</em>}</li>
 *   <li>{@link ie.tcd.test.filesys.impl.EFileImpl#getName <em>Name</em>}</li>
 *   <li>{@link ie.tcd.test.filesys.impl.EFileImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFileImpl extends CDOObjectImpl implements EFile {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return FileSysPackage.Literals.EFILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadonly() {
		return ((Boolean)eGet(FileSysPackage.Literals.EFILE__READONLY, true)).booleanValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadonly(boolean newReadonly) {
		eSet(FileSysPackage.Literals.EFILE__READONLY, new Boolean(newReadonly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(FileSysPackage.Literals.EFILE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(FileSysPackage.Literals.EFILE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFolder getParent() {
		return (EFolder)eGet(FileSysPackage.Literals.EFILE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(EFolder newParent) {
		eSet(FileSysPackage.Literals.EFILE__PARENT, newParent);
	}

} //EFileImpl
