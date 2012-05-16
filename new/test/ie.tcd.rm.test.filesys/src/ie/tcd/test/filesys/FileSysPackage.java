/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ie.tcd.test.filesys.FileSysFactory
 * @model kind="package"
 * @generated
 */
public interface FileSysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "filesys";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.tcd.ie/rm/test/filesys";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "FileSys";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FileSysPackage eINSTANCE = ie.tcd.test.filesys.impl.FileSysPackageImpl.init();

	/**
	 * The meta object id for the '{@link ie.tcd.test.filesys.impl.EFileImpl <em>EFile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ie.tcd.test.filesys.impl.EFileImpl
	 * @see ie.tcd.test.filesys.impl.FileSysPackageImpl#getEFile()
	 * @generated
	 */
	int EFILE = 1;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILE__READONLY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>EFile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link ie.tcd.test.filesys.impl.EFolderImpl <em>EFolder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ie.tcd.test.filesys.impl.EFolderImpl
	 * @see ie.tcd.test.filesys.impl.FileSysPackageImpl#getEFolder()
	 * @generated
	 */
	int EFOLDER = 0;

	/**
	 * The feature id for the '<em><b>Readonly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFOLDER__READONLY = EFILE__READONLY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFOLDER__NAME = EFILE__NAME;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFOLDER__PARENT = EFILE__PARENT;

	/**
	 * The feature id for the '<em><b>Subfiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFOLDER__SUBFILES = EFILE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EFolder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFOLDER_FEATURE_COUNT = EFILE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link ie.tcd.test.filesys.EFolder <em>EFolder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFolder</em>'.
	 * @see ie.tcd.test.filesys.EFolder
	 * @generated
	 */
	EClass getEFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link ie.tcd.test.filesys.EFolder#getSubfiles <em>Subfiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subfiles</em>'.
	 * @see ie.tcd.test.filesys.EFolder#getSubfiles()
	 * @see #getEFolder()
	 * @generated
	 */
	EReference getEFolder_Subfiles();

	/**
	 * Returns the meta object for class '{@link ie.tcd.test.filesys.EFile <em>EFile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFile</em>'.
	 * @see ie.tcd.test.filesys.EFile
	 * @generated
	 */
	EClass getEFile();

	/**
	 * Returns the meta object for the attribute '{@link ie.tcd.test.filesys.EFile#isReadonly <em>Readonly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Readonly</em>'.
	 * @see ie.tcd.test.filesys.EFile#isReadonly()
	 * @see #getEFile()
	 * @generated
	 */
	EAttribute getEFile_Readonly();

	/**
	 * Returns the meta object for the attribute '{@link ie.tcd.test.filesys.EFile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ie.tcd.test.filesys.EFile#getName()
	 * @see #getEFile()
	 * @generated
	 */
	EAttribute getEFile_Name();

	/**
	 * Returns the meta object for the container reference '{@link ie.tcd.test.filesys.EFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ie.tcd.test.filesys.EFile#getParent()
	 * @see #getEFile()
	 * @generated
	 */
	EReference getEFile_Parent();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FileSysFactory getFileSysFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ie.tcd.test.filesys.impl.EFolderImpl <em>EFolder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ie.tcd.test.filesys.impl.EFolderImpl
		 * @see ie.tcd.test.filesys.impl.FileSysPackageImpl#getEFolder()
		 * @generated
		 */
		EClass EFOLDER = eINSTANCE.getEFolder();

		/**
		 * The meta object literal for the '<em><b>Subfiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFOLDER__SUBFILES = eINSTANCE.getEFolder_Subfiles();

		/**
		 * The meta object literal for the '{@link ie.tcd.test.filesys.impl.EFileImpl <em>EFile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ie.tcd.test.filesys.impl.EFileImpl
		 * @see ie.tcd.test.filesys.impl.FileSysPackageImpl#getEFile()
		 * @generated
		 */
		EClass EFILE = eINSTANCE.getEFile();

		/**
		 * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFILE__READONLY = eINSTANCE.getEFile_Readonly();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFILE__NAME = eINSTANCE.getEFile_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFILE__PARENT = eINSTANCE.getEFile_Parent();

	}

} //FileSysPackage
