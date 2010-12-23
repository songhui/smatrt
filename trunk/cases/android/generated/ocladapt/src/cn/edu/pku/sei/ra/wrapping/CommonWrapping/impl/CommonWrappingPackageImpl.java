/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommonWrappingPackageImpl.java,v 1.3 2008/11/19 02:38:06 song Exp $
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl;

import cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingFactory;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WaitingPair;
import cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject;

import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonWrappingPackageImpl extends EPackageImpl implements CommonWrappingPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wrappingEObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eJavaListEDataType = null;

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
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonWrappingPackageImpl() {
		super(eNS_URI, CommonWrappingFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonWrappingPackage init() {
		if (isInited) return (CommonWrappingPackage)EPackage.Registry.INSTANCE.getEPackage(CommonWrappingPackage.eNS_URI);

		// Obtain or create and register package
		CommonWrappingPackageImpl theCommonWrappingPackage = (CommonWrappingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CommonWrappingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CommonWrappingPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommonWrappingPackage.createPackageContents();

		// Initialize created meta-data
		theCommonWrappingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonWrappingPackage.freeze();

		return theCommonWrappingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWrappingEObject() {
		return wrappingEObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrappingEObject_WaitingFeature() {
		return (EAttribute)wrappingEObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrappingEObject_Core() {
		return (EAttribute)wrappingEObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrappingEObject_Newborn() {
		return (EAttribute)wrappingEObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWrappingEObject_Dead() {
		return (EAttribute)wrappingEObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEJavaList() {
		return eJavaListEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonWrappingFactory getCommonWrappingFactory() {
		return (CommonWrappingFactory)getEFactoryInstance();
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
		wrappingEObjectEClass = createEClass(WRAPPING_EOBJECT);
		createEAttribute(wrappingEObjectEClass, WRAPPING_EOBJECT__WAITING_FEATURE);
		createEAttribute(wrappingEObjectEClass, WRAPPING_EOBJECT__CORE);
		createEAttribute(wrappingEObjectEClass, WRAPPING_EOBJECT__NEWBORN);
		createEAttribute(wrappingEObjectEClass, WRAPPING_EOBJECT__DEAD);

		// Create data types
		eJavaListEDataType = createEDataType(EJAVA_LIST);
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

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(wrappingEObjectEClass, WrappingEObject.class, "WrappingEObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWrappingEObject_WaitingFeature(), ecorePackage.getEInt(), "waitingFeature", "-1", 1, 1, WrappingEObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWrappingEObject_Core(), ecorePackage.getEJavaObject(), "core", null, 1, 1, WrappingEObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWrappingEObject_Newborn(), ecorePackage.getEBoolean(), "newborn", null, 1, 1, WrappingEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWrappingEObject_Dead(), ecorePackage.getEBoolean(), "dead", null, 1, 1, WrappingEObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(wrappingEObjectEClass, ecorePackage.getEJavaObject(), "lookupCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wrappingEObjectEClass, ecorePackage.getEJavaObject(), "createCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(wrappingEObjectEClass, ecorePackage.getEBoolean(), "addSubCore", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWrappingEObject(), "wrappingEObject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, null, "removeSubCore", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getWrappingEObject(), "wrappingEObject", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, this.getEJavaList(), "listSubCores", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, ecorePackage.getEBoolean(), "isForCore", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "core", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(wrappingEObjectEClass, null, "destroyCore", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, ecorePackage.getEBoolean(), "addAttribute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, ecorePackage.getEBoolean(), "removeAttribute", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "value", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "featureID", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(wrappingEObjectEClass, theEcorePackage.getEClass(), "getChildClassMap", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(eJavaListEDataType, List.class, "EJavaList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CommonWrappingPackageImpl
