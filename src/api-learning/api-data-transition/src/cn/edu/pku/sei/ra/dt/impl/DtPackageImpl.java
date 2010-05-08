/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt.impl;

import cn.edu.pku.sei.ra.dt.DtFactory;
import cn.edu.pku.sei.ra.dt.DtPackage;
import cn.edu.pku.sei.ra.dt.Place;
import cn.edu.pku.sei.ra.dt.PlaceType;
import cn.edu.pku.sei.ra.dt.Repository;
import cn.edu.pku.sei.ra.dt.Transition;
import cn.edu.pku.sei.ra.dt.TransitionType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DtPackageImpl extends EPackageImpl implements DtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repositoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sJavaElementEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sStatementOrMethodEDataType = null;

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
	 * @see cn.edu.pku.sei.ra.dt.DtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DtPackageImpl() {
		super(eNS_URI, DtFactory.eINSTANCE);
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
	public static DtPackage init() {
		if (isInited) return (DtPackage)EPackage.Registry.INSTANCE.getEPackage(DtPackage.eNS_URI);

		// Obtain or create and register package
		DtPackageImpl theDtPackage = (DtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof DtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new DtPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDtPackage.createPackageContents();

		// Initialize created meta-data
		theDtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDtPackage.freeze();

		return theDtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepository() {
		return repositoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Place() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepository_Transition() {
		return (EReference)repositoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_TracerBuilder() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRepository_Method() {
		return (EAttribute)repositoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlace() {
		return placeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Id() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Name() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Variable() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_StatementOrMethod() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Involved() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_InputOf() {
		return (EReference)placeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlace_OutputOf() {
		return (EReference)placeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Type() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_ParaOrder() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlace_Typefull() {
		return (EAttribute)placeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Id() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Input() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Output() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Involved() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Type() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_JavaElement() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Name() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Signature() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Activated() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Invokechain() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceType() {
		return placeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionType() {
		return transitionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSJavaElement() {
		return sJavaElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSStatementOrMethod() {
		return sStatementOrMethodEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtFactory getDtFactory() {
		return (DtFactory)getEFactoryInstance();
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
		repositoryEClass = createEClass(REPOSITORY);
		createEReference(repositoryEClass, REPOSITORY__PLACE);
		createEReference(repositoryEClass, REPOSITORY__TRANSITION);
		createEAttribute(repositoryEClass, REPOSITORY__TRACER_BUILDER);
		createEAttribute(repositoryEClass, REPOSITORY__METHOD);

		placeEClass = createEClass(PLACE);
		createEAttribute(placeEClass, PLACE__ID);
		createEAttribute(placeEClass, PLACE__NAME);
		createEAttribute(placeEClass, PLACE__VARIABLE);
		createEAttribute(placeEClass, PLACE__STATEMENT_OR_METHOD);
		createEAttribute(placeEClass, PLACE__INVOLVED);
		createEReference(placeEClass, PLACE__INPUT_OF);
		createEReference(placeEClass, PLACE__OUTPUT_OF);
		createEAttribute(placeEClass, PLACE__TYPE);
		createEAttribute(placeEClass, PLACE__PARA_ORDER);
		createEAttribute(placeEClass, PLACE__TYPEFULL);

		transitionEClass = createEClass(TRANSITION);
		createEAttribute(transitionEClass, TRANSITION__ID);
		createEAttribute(transitionEClass, TRANSITION__NAME);
		createEReference(transitionEClass, TRANSITION__INPUT);
		createEReference(transitionEClass, TRANSITION__OUTPUT);
		createEAttribute(transitionEClass, TRANSITION__INVOLVED);
		createEAttribute(transitionEClass, TRANSITION__TYPE);
		createEAttribute(transitionEClass, TRANSITION__JAVA_ELEMENT);
		createEAttribute(transitionEClass, TRANSITION__SIGNATURE);
		createEAttribute(transitionEClass, TRANSITION__ACTIVATED);
		createEAttribute(transitionEClass, TRANSITION__INVOKECHAIN);

		// Create enums
		placeTypeEEnum = createEEnum(PLACE_TYPE);
		transitionTypeEEnum = createEEnum(TRANSITION_TYPE);

		// Create data types
		sJavaElementEDataType = createEDataType(SJAVA_ELEMENT);
		sStatementOrMethodEDataType = createEDataType(SSTATEMENT_OR_METHOD);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(repositoryEClass, Repository.class, "Repository", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepository_Place(), this.getPlace(), null, "place", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepository_Transition(), this.getTransition(), null, "transition", null, 0, -1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_TracerBuilder(), ecorePackage.getEJavaObject(), "tracerBuilder", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRepository_Method(), this.getSJavaElement(), "method", null, 1, 1, Repository.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(repositoryEClass, this.getPlace(), "getPlaceByJavaElement", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSJavaElement(), "element", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(repositoryEClass, null, "clearTemp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(placeEClass, Place.class, "Place", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlace_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Name(), ecorePackage.getEString(), "name", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Variable(), this.getSJavaElement(), "variable", null, 1, 1, Place.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_StatementOrMethod(), this.getSStatementOrMethod(), "statementOrMethod", null, 1, 1, Place.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Involved(), ecorePackage.getEBoolean(), "involved", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_InputOf(), this.getTransition(), this.getTransition_Input(), "inputOf", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlace_OutputOf(), this.getTransition(), this.getTransition_Output(), "outputOf", null, 0, -1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Type(), this.getPlaceType(), "type", "False", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_ParaOrder(), ecorePackage.getEInt(), "paraOrder", "0", 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlace_Typefull(), ecorePackage.getEString(), "typefull", null, 1, 1, Place.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransition_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Name(), ecorePackage.getEString(), "name", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Input(), this.getPlace(), this.getPlace_InputOf(), "input", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Output(), this.getPlace(), this.getPlace_OutputOf(), "output", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Involved(), ecorePackage.getEBoolean(), "involved", "False", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Type(), this.getTransitionType(), "type", "False", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_JavaElement(), this.getSJavaElement(), "javaElement", null, 1, 1, Transition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Signature(), ecorePackage.getEString(), "signature", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Activated(), ecorePackage.getEBoolean(), "activated", "False", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransition_Invokechain(), ecorePackage.getEBoolean(), "invokechain", "False", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(placeTypeEEnum, PlaceType.class, "PlaceType");
		addEEnumLiteral(placeTypeEEnum, PlaceType.LOCAL_VARIABLE);
		addEEnumLiteral(placeTypeEEnum, PlaceType.FIELD);
		addEEnumLiteral(placeTypeEEnum, PlaceType.PARAMETER);
		addEEnumLiteral(placeTypeEEnum, PlaceType.CONSTANT);
		addEEnumLiteral(placeTypeEEnum, PlaceType.INVISIBLE);
		addEEnumLiteral(placeTypeEEnum, PlaceType.METHOD_END);

		initEEnum(transitionTypeEEnum, TransitionType.class, "TransitionType");
		addEEnumLiteral(transitionTypeEEnum, TransitionType.INITIALIZE);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.ASSIGNMENT);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.DOWN_CAST);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.UPCAST);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.INSTANCE_CALL);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.STATIC_CALL);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.PARAMETERIZE);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.ENUMERATE);
		addEEnumLiteral(transitionTypeEEnum, TransitionType.INTERMEDIATE);

		// Initialize data types
		initEDataType(sJavaElementEDataType, IJavaElement.class, "SJavaElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sStatementOrMethodEDataType, ASTNode.class, "SStatementOrMethod", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DtPackageImpl
