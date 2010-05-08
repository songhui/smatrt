/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see cn.edu.pku.sei.ra.dt.DtFactory
 * @model kind="package"
 * @generated
 */
public interface DtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dt";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sei.pku.edu.cn/ra/dt";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DtPackage eINSTANCE = cn.edu.pku.sei.ra.dt.impl.DtPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.dt.impl.RepositoryImpl
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__PLACE = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Tracer Builder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__TRACER_BUILDER = 2;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__METHOD = 3;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.dt.impl.PlaceImpl
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Statement Or Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__STATEMENT_OR_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Involved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INVOLVED = 4;

	/**
	 * The feature id for the '<em><b>Input Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INPUT_OF = 5;

	/**
	 * The feature id for the '<em><b>Output Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__OUTPUT_OF = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Para Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PARA_ORDER = 8;

	/**
	 * The feature id for the '<em><b>Typefull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TYPEFULL = 9;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.dt.impl.TransitionImpl
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Involved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INVOLVED = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TYPE = 5;

	/**
	 * The feature id for the '<em><b>Java Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__JAVA_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIVATED = 8;

	/**
	 * The feature id for the '<em><b>Invokechain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INVOKECHAIN = 9;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.dt.PlaceType <em>Place Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.dt.PlaceType
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getPlaceType()
	 * @generated
	 */
	int PLACE_TYPE = 3;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.dt.TransitionType <em>Transition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.dt.TransitionType
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getTransitionType()
	 * @generated
	 */
	int TRANSITION_TYPE = 4;

	/**
	 * The meta object id for the '<em>SJava Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.IJavaElement
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getSJavaElement()
	 * @generated
	 */
	int SJAVA_ELEMENT = 5;


	/**
	 * The meta object id for the '<em>SStatement Or Method</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.jdt.core.dom.ASTNode
	 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getSStatementOrMethod()
	 * @generated
	 */
	int SSTATEMENT_OR_METHOD = 6;

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.dt.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.dt.Repository#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Place</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Repository#getPlace()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Place();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.dt.Repository#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Repository#getTransition()
	 * @see #getRepository()
	 * @generated
	 */
	EReference getRepository_Transition();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Repository#getTracerBuilder <em>Tracer Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tracer Builder</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Repository#getTracerBuilder()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_TracerBuilder();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Repository#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Repository#getMethod()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Method();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.dt.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getId()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Id();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getName()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getVariable()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Variable();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getStatementOrMethod <em>Statement Or Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement Or Method</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getStatementOrMethod()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_StatementOrMethod();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#isInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Involved</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#isInvolved()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Involved();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.dt.Place#getInputOf <em>Input Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Of</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getInputOf()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_InputOf();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.dt.Place#getOutputOf <em>Output Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Of</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getOutputOf()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_OutputOf();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getType()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getParaOrder <em>Para Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Para Order</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getParaOrder()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_ParaOrder();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Place#getTypefull <em>Typefull</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typefull</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Place#getTypefull()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_Typefull();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.dt.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Id();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.dt.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Input();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.dt.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Output();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#isInvolved <em>Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Involved</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#isInvolved()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Involved();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getType()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#getJavaElement <em>Java Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Element</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getJavaElement()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_JavaElement();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#getSignature()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Signature();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#isActivated <em>Activated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activated</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#isActivated()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Activated();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.dt.Transition#isInvokechain <em>Invokechain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invokechain</em>'.
	 * @see cn.edu.pku.sei.ra.dt.Transition#isInvokechain()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Invokechain();

	/**
	 * Returns the meta object for enum '{@link cn.edu.pku.sei.ra.dt.PlaceType <em>Place Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Place Type</em>'.
	 * @see cn.edu.pku.sei.ra.dt.PlaceType
	 * @generated
	 */
	EEnum getPlaceType();

	/**
	 * Returns the meta object for enum '{@link cn.edu.pku.sei.ra.dt.TransitionType <em>Transition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transition Type</em>'.
	 * @see cn.edu.pku.sei.ra.dt.TransitionType
	 * @generated
	 */
	EEnum getTransitionType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.IJavaElement <em>SJava Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SJava Element</em>'.
	 * @see org.eclipse.jdt.core.IJavaElement
	 * @model instanceClass="org.eclipse.jdt.core.IJavaElement"
	 * @generated
	 */
	EDataType getSJavaElement();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.jdt.core.dom.ASTNode <em>SStatement Or Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>SStatement Or Method</em>'.
	 * @see org.eclipse.jdt.core.dom.ASTNode
	 * @model instanceClass="org.eclipse.jdt.core.dom.ASTNode"
	 * @generated
	 */
	EDataType getSStatementOrMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DtFactory getDtFactory();

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
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.dt.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.dt.impl.RepositoryImpl
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__PLACE = eINSTANCE.getRepository_Place();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOSITORY__TRANSITION = eINSTANCE.getRepository_Transition();

		/**
		 * The meta object literal for the '<em><b>Tracer Builder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__TRACER_BUILDER = eINSTANCE.getRepository_TracerBuilder();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__METHOD = eINSTANCE.getRepository_Method();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.dt.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.dt.impl.PlaceImpl
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__ID = eINSTANCE.getPlace_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__VARIABLE = eINSTANCE.getPlace_Variable();

		/**
		 * The meta object literal for the '<em><b>Statement Or Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__STATEMENT_OR_METHOD = eINSTANCE.getPlace_StatementOrMethod();

		/**
		 * The meta object literal for the '<em><b>Involved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__INVOLVED = eINSTANCE.getPlace_Involved();

		/**
		 * The meta object literal for the '<em><b>Input Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__INPUT_OF = eINSTANCE.getPlace_InputOf();

		/**
		 * The meta object literal for the '<em><b>Output Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__OUTPUT_OF = eINSTANCE.getPlace_OutputOf();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TYPE = eINSTANCE.getPlace_Type();

		/**
		 * The meta object literal for the '<em><b>Para Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__PARA_ORDER = eINSTANCE.getPlace_ParaOrder();

		/**
		 * The meta object literal for the '<em><b>Typefull</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__TYPEFULL = eINSTANCE.getPlace_Typefull();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.dt.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.dt.impl.TransitionImpl
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ID = eINSTANCE.getTransition_Id();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Involved</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INVOLVED = eINSTANCE.getTransition_Involved();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__TYPE = eINSTANCE.getTransition_Type();

		/**
		 * The meta object literal for the '<em><b>Java Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__JAVA_ELEMENT = eINSTANCE.getTransition_JavaElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__SIGNATURE = eINSTANCE.getTransition_Signature();

		/**
		 * The meta object literal for the '<em><b>Activated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__ACTIVATED = eINSTANCE.getTransition_Activated();

		/**
		 * The meta object literal for the '<em><b>Invokechain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INVOKECHAIN = eINSTANCE.getTransition_Invokechain();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.dt.PlaceType <em>Place Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.dt.PlaceType
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getPlaceType()
		 * @generated
		 */
		EEnum PLACE_TYPE = eINSTANCE.getPlaceType();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.dt.TransitionType <em>Transition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.dt.TransitionType
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getTransitionType()
		 * @generated
		 */
		EEnum TRANSITION_TYPE = eINSTANCE.getTransitionType();

		/**
		 * The meta object literal for the '<em>SJava Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.IJavaElement
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getSJavaElement()
		 * @generated
		 */
		EDataType SJAVA_ELEMENT = eINSTANCE.getSJavaElement();

		/**
		 * The meta object literal for the '<em>SStatement Or Method</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.jdt.core.dom.ASTNode
		 * @see cn.edu.pku.sei.ra.dt.impl.DtPackageImpl#getSStatementOrMethod()
		 * @generated
		 */
		EDataType SSTATEMENT_OR_METHOD = eINSTANCE.getSStatementOrMethod();

	}

} //DtPackage
