/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys.impl;

import ie.tcd.test.filesys.EFile;
import ie.tcd.test.filesys.EFolder;
import ie.tcd.test.filesys.FileSysFactory;
import ie.tcd.test.filesys.FileSysPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FileSysPackageImpl extends EPackageImpl implements FileSysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eFileEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ie.tcd.test.filesys.FileSysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FileSysPackageImpl() {
		super(eNS_URI, FileSysFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FileSysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FileSysPackage init() {
		if (isInited) return (FileSysPackage)EPackage.Registry.INSTANCE.getEPackage(FileSysPackage.eNS_URI);

		// Obtain or create and register package
		FileSysPackageImpl theFileSysPackage = (FileSysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FileSysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FileSysPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFileSysPackage.createPackageContents();

		// Initialize created meta-data
		theFileSysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFileSysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FileSysPackage.eNS_URI, theFileSysPackage);
		return theFileSysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFolder() {
		return eFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFolder_Subfiles() {
		return (EReference)eFolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFile() {
		return eFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFile_Readonly() {
		return (EAttribute)eFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEFile_Name() {
		return (EAttribute)eFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFile_Parent() {
		return (EReference)eFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSysFactory getFileSysFactory() {
		return (FileSysFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		eFolderEClass = createEClass(EFOLDER);
		createEReference(eFolderEClass, EFOLDER__SUBFILES);

		eFileEClass = createEClass(EFILE);
		createEAttribute(eFileEClass, EFILE__READONLY);
		createEAttribute(eFileEClass, EFILE__NAME);
		createEReference(eFileEClass, EFILE__PARENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		eFolderEClass.getESuperTypes().add(this.getEFile());

		// Initialize classes and features; add operations and parameters
		initEClass(eFolderEClass, EFolder.class, "EFolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFolder_Subfiles(), this.getEFile(), this.getEFile_Parent(), "subfiles", null, 0, -1, EFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eFileEClass, EFile.class, "EFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEFile_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 1, 1, EFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEFile_Name(), ecorePackage.getEString(), "name", "NewFile", 1, 1, EFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFile_Parent(), this.getEFolder(), this.getEFolder_Subfiles(), "parent", null, 0, 1, EFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //FileSysPackageImpl
