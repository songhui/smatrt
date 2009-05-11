/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

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
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelFactory
 * @model kind="package"
 * @generated
 */
public interface DecModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DecModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sei.pku.edu.cn/rsa/decmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DecModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecModelPackage eINSTANCE = cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl <em>Decoration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getDecoration()
	 * @generated
	 */
	int DECORATION = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Import Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__IMPORT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Code Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__CODE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Map Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION__MAP_AREA = 3;

	/**
	 * The number of structural features of the '<em>Decoration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ImportClassImpl <em>Import Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ImportClassImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getImportClass()
	 * @generated
	 */
	int IMPORT_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Full Class Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CLASS__FULL_CLASS_NAME = 0;

	/**
	 * The number of structural features of the '<em>Import Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_CLASS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeAreaImpl <em>Code Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeAreaImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeArea()
	 * @generated
	 */
	int CODE_AREA = 2;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AREA__CODE = 0;

	/**
	 * The number of structural features of the '<em>Code Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_AREA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__CODE = 1;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeNoneImpl <em>Code None</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeNoneImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeNone()
	 * @generated
	 */
	int CODE_NONE = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NONE__DESCRIPTION = CODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NONE__CODE = CODE__CODE;

	/**
	 * The number of structural features of the '<em>Code None</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_NONE_FEATURE_COUNT = CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeFragmentImpl <em>Code Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeFragmentImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeFragment()
	 * @generated
	 */
	int CODE_FRAGMENT = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__DESCRIPTION = CODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT__TEXT = CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FRAGMENT_FEATURE_COUNT = CODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeReferenceImpl <em>Code Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeReferenceImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeReference()
	 * @generated
	 */
	int CODE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REFERENCE__DESCRIPTION = CODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REFERENCE__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REFERENCE__REFERENCE = CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_REFERENCE_FEATURE_COUNT = CODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeCompositionImpl <em>Code Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeCompositionImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeComposition()
	 * @generated
	 */
	int CODE_COMPOSITION = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPOSITION__DESCRIPTION = CODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPOSITION__CODE = CODE__CODE;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPOSITION__CHILD = CODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_COMPOSITION_FEATURE_COUNT = CODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl <em>Map Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getMapArea()
	 * @generated
	 */
	int MAP_AREA = 8;

	/**
	 * The feature id for the '<em><b>Global Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_AREA__GLOBAL_MAP = 0;

	/**
	 * The feature id for the '<em><b>Class Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_AREA__CLASS_MAP = 1;

	/**
	 * The number of structural features of the '<em>Map Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_AREA_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl <em>Abstract Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getAbstractMap()
	 * @generated
	 */
	int ABSTRACT_MAP = 9;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP__SPEC_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Spec Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP__SPEC_CODE = 1;

	/**
	 * The number of structural features of the '<em>Abstract Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GlobalMapImpl <em>Global Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GlobalMapImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getGlobalMap()
	 * @generated
	 */
	int GLOBAL_MAP = 10;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAP__SPEC_TYPE = ABSTRACT_MAP__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAP__SPEC_CODE = ABSTRACT_MAP__SPEC_CODE;

	/**
	 * The number of structural features of the '<em>Global Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_MAP_FEATURE_COUNT = ABSTRACT_MAP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl <em>Class Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getClassMap()
	 * @generated
	 */
	int CLASS_MAP = 11;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__SPEC_TYPE = ABSTRACT_MAP__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__SPEC_CODE = ABSTRACT_MAP__SPEC_CODE;

	/**
	 * The feature id for the '<em><b>Class Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__CLASS_REF = ABSTRACT_MAP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature Map</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP__FEATURE_MAP = ABSTRACT_MAP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Class Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_MAP_FEATURE_COUNT = ABSTRACT_MAP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapImpl <em>Feature Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getFeatureMap()
	 * @generated
	 */
	int FEATURE_MAP = 12;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__SPEC_TYPE = ABSTRACT_MAP__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__SPEC_CODE = ABSTRACT_MAP__SPEC_CODE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP__FEATURE = ABSTRACT_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FEATURE_COUNT = ABSTRACT_MAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapForAbstractClassImpl <em>Feature Map For Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapForAbstractClassImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getFeatureMapForAbstractClass()
	 * @generated
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS = 13;

	/**
	 * The feature id for the '<em><b>Spec Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS__SPEC_TYPE = FEATURE_MAP__SPEC_TYPE;

	/**
	 * The feature id for the '<em><b>Spec Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS__SPEC_CODE = FEATURE_MAP__SPEC_CODE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS__FEATURE = FEATURE_MAP__FEATURE;

	/**
	 * The feature id for the '<em><b>Class2eclass</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS = FEATURE_MAP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Map For Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MAP_FOR_ABSTRACT_CLASS_FEATURE_COUNT = FEATURE_MAP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SpecCodeImpl <em>Spec Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SpecCodeImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getSpecCode()
	 * @generated
	 */
	int SPEC_CODE = 14;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_CODE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_CODE__FINAL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_CODE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Spec Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEC_CODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CreateImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DestroyImpl <em>Destroy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DestroyImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getDestroy()
	 * @generated
	 */
	int DESTROY = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Destroy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESTROY_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.LookupImpl <em>Lookup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.LookupImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getLookup()
	 * @generated
	 */
	int LOOKUP = 17;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Lookup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOKUP_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.IdentifyImpl <em>Identify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.IdentifyImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getIdentify()
	 * @generated
	 */
	int IDENTIFY = 18;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Identify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFY_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GetImpl <em>Get</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GetImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getGet()
	 * @generated
	 */
	int GET = 19;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Get</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SetImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getSet()
	 * @generated
	 */
	int SET = 20;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ListSubImpl <em>List Sub</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ListSubImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getListSub()
	 * @generated
	 */
	int LIST_SUB = 21;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUB__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUB__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUB__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>List Sub</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_SUB_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.InsertImpl <em>Insert</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.InsertImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getInsert()
	 * @generated
	 */
	int INSERT = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Insert</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.RemoveImpl <em>Remove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.RemoveImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getRemove()
	 * @generated
	 */
	int REMOVE = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Remove</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilMethodImpl <em>Util Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilMethodImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getUtilMethod()
	 * @generated
	 */
	int UTIL_METHOD = 24;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_METHOD__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_METHOD__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_METHOD__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Util Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_METHOD_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilFieldImpl <em>Util Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilFieldImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getUtilField()
	 * @generated
	 */
	int UTIL_FIELD = 25;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FIELD__CODE = SPEC_CODE__CODE;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FIELD__FINAL = SPEC_CODE__FINAL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FIELD__DESCRIPTION = SPEC_CODE__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Util Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTIL_FIELD_FEATURE_COUNT = SPEC_CODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.EStringToStringMapEntryImpl
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getEStringToStringMapEntry()
	 * @generated
	 */
	int ESTRING_TO_STRING_MAP_ENTRY = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To String Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_STRING_MAP_ENTRY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decoration</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration
	 * @generated
	 */
	EClass getDecoration();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Model</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getGenModel()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_GenModel();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getImportClass <em>Import Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import Class</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getImportClass()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_ImportClass();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getCodeArea <em>Code Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code Area</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getCodeArea()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_CodeArea();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getMapArea <em>Map Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map Area</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration#getMapArea()
	 * @see #getDecoration()
	 * @generated
	 */
	EReference getDecoration_MapArea();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass <em>Import Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Class</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass
	 * @generated
	 */
	EClass getImportClass();

	/**
	 * Returns the meta object for the attribute list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass#getFullClassName <em>Full Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Full Class Name</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass#getFullClassName()
	 * @see #getImportClass()
	 * @generated
	 */
	EAttribute getImportClass_FullClassName();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea <em>Code Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Area</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea
	 * @generated
	 */
	EClass getCodeArea();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea#getCode()
	 * @see #getCodeArea()
	 * @generated
	 */
	EReference getCodeArea_Code();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code#getDescription()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Description();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code#getCode()
	 * @see #getCode()
	 * @generated
	 */
	EAttribute getCode_Code();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeNone <em>Code None</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code None</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeNone
	 * @generated
	 */
	EClass getCodeNone();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment <em>Code Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Fragment</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment
	 * @generated
	 */
	EClass getCodeFragment();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment#getText()
	 * @see #getCodeFragment()
	 * @generated
	 */
	EAttribute getCodeFragment_Text();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference <em>Code Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Reference</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference
	 * @generated
	 */
	EClass getCodeReference();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference#getReference()
	 * @see #getCodeReference()
	 * @generated
	 */
	EReference getCodeReference_Reference();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition <em>Code Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Composition</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition
	 * @generated
	 */
	EClass getCodeComposition();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition#getChild()
	 * @see #getCodeComposition()
	 * @generated
	 */
	EReference getCodeComposition_Child();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea <em>Map Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Area</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea
	 * @generated
	 */
	EClass getMapArea();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getGlobalMap <em>Global Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Global Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getGlobalMap()
	 * @see #getMapArea()
	 * @generated
	 */
	EReference getMapArea_GlobalMap();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getClassMap <em>Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea#getClassMap()
	 * @see #getMapArea()
	 * @generated
	 */
	EReference getMapArea_ClassMap();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap <em>Abstract Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap
	 * @generated
	 */
	EClass getAbstractMap();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec Type</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecType()
	 * @see #getAbstractMap()
	 * @generated
	 */
	EAttribute getAbstractMap_SpecType();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecCode <em>Spec Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spec Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap#getSpecCode()
	 * @see #getAbstractMap()
	 * @generated
	 */
	EReference getAbstractMap_SpecCode();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.GlobalMap <em>Global Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.GlobalMap
	 * @generated
	 */
	EClass getGlobalMap();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap <em>Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap
	 * @generated
	 */
	EClass getClassMap();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getClassRef <em>Class Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Class Ref</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getClassRef()
	 * @see #getClassMap()
	 * @generated
	 */
	EReference getClassMap_ClassRef();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getFeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap#getFeatureMap()
	 * @see #getClassMap()
	 * @generated
	 */
	EReference getClassMap_FeatureMap();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Map</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap
	 * @generated
	 */
	EClass getFeatureMap();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap#getFeature()
	 * @see #getFeatureMap()
	 * @generated
	 */
	EReference getFeatureMap_Feature();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass <em>Feature Map For Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Map For Abstract Class</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass
	 * @generated
	 */
	EClass getFeatureMapForAbstractClass();

	/**
	 * Returns the meta object for the map '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass#getClass2eclass <em>Class2eclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Class2eclass</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass#getClass2eclass()
	 * @see #getFeatureMapForAbstractClass()
	 * @generated
	 */
	EReference getFeatureMapForAbstractClass_Class2eclass();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode <em>Spec Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode
	 * @generated
	 */
	EClass getSpecCode();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getCode()
	 * @see #getSpecCode()
	 * @generated
	 */
	EReference getSpecCode_Code();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#isFinal()
	 * @see #getSpecCode()
	 * @generated
	 */
	EAttribute getSpecCode_Final();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode#getDescription()
	 * @see #getSpecCode()
	 * @generated
	 */
	EAttribute getSpecCode_Description();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Destroy <em>Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Destroy</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Destroy
	 * @generated
	 */
	EClass getDestroy();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Lookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lookup</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Lookup
	 * @generated
	 */
	EClass getLookup();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Identify <em>Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identify</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Identify
	 * @generated
	 */
	EClass getIdentify();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Get <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Get
	 * @generated
	 */
	EClass getGet();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ListSub <em>List Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Sub</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ListSub
	 * @generated
	 */
	EClass getListSub();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Insert
	 * @generated
	 */
	EClass getInsert();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Remove
	 * @generated
	 */
	EClass getRemove();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilMethod <em>Util Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util Method</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilMethod
	 * @generated
	 */
	EClass getUtilMethod();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilField <em>Util Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Util Field</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilField
	 * @generated
	 */
	EClass getUtilField();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To String Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getEStringToStringMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToStringMapEntry()
	 * @generated
	 */
	EAttribute getEStringToStringMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DecModelFactory getDecModelFactory();

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
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl <em>Decoration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getDecoration()
		 * @generated
		 */
		EClass DECORATION = eINSTANCE.getDecoration();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__GEN_MODEL = eINSTANCE.getDecoration_GenModel();

		/**
		 * The meta object literal for the '<em><b>Import Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__IMPORT_CLASS = eINSTANCE.getDecoration_ImportClass();

		/**
		 * The meta object literal for the '<em><b>Code Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__CODE_AREA = eINSTANCE.getDecoration_CodeArea();

		/**
		 * The meta object literal for the '<em><b>Map Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATION__MAP_AREA = eINSTANCE.getDecoration_MapArea();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ImportClassImpl <em>Import Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ImportClassImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getImportClass()
		 * @generated
		 */
		EClass IMPORT_CLASS = eINSTANCE.getImportClass();

		/**
		 * The meta object literal for the '<em><b>Full Class Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_CLASS__FULL_CLASS_NAME = eINSTANCE.getImportClass_FullClassName();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeAreaImpl <em>Code Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeAreaImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeArea()
		 * @generated
		 */
		EClass CODE_AREA = eINSTANCE.getCodeArea();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_AREA__CODE = eINSTANCE.getCodeArea_Code();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__DESCRIPTION = eINSTANCE.getCode_Description();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE__CODE = eINSTANCE.getCode_Code();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeNoneImpl <em>Code None</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeNoneImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeNone()
		 * @generated
		 */
		EClass CODE_NONE = eINSTANCE.getCodeNone();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeFragmentImpl <em>Code Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeFragmentImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeFragment()
		 * @generated
		 */
		EClass CODE_FRAGMENT = eINSTANCE.getCodeFragment();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_FRAGMENT__TEXT = eINSTANCE.getCodeFragment_Text();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeReferenceImpl <em>Code Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeReferenceImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeReference()
		 * @generated
		 */
		EClass CODE_REFERENCE = eINSTANCE.getCodeReference();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_REFERENCE__REFERENCE = eINSTANCE.getCodeReference_Reference();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeCompositionImpl <em>Code Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CodeCompositionImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCodeComposition()
		 * @generated
		 */
		EClass CODE_COMPOSITION = eINSTANCE.getCodeComposition();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_COMPOSITION__CHILD = eINSTANCE.getCodeComposition_Child();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl <em>Map Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.MapAreaImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getMapArea()
		 * @generated
		 */
		EClass MAP_AREA = eINSTANCE.getMapArea();

		/**
		 * The meta object literal for the '<em><b>Global Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_AREA__GLOBAL_MAP = eINSTANCE.getMapArea_GlobalMap();

		/**
		 * The meta object literal for the '<em><b>Class Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_AREA__CLASS_MAP = eINSTANCE.getMapArea_ClassMap();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl <em>Abstract Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.AbstractMapImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getAbstractMap()
		 * @generated
		 */
		EClass ABSTRACT_MAP = eINSTANCE.getAbstractMap();

		/**
		 * The meta object literal for the '<em><b>Spec Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MAP__SPEC_TYPE = eINSTANCE.getAbstractMap_SpecType();

		/**
		 * The meta object literal for the '<em><b>Spec Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MAP__SPEC_CODE = eINSTANCE.getAbstractMap_SpecCode();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GlobalMapImpl <em>Global Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GlobalMapImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getGlobalMap()
		 * @generated
		 */
		EClass GLOBAL_MAP = eINSTANCE.getGlobalMap();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl <em>Class Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ClassMapImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getClassMap()
		 * @generated
		 */
		EClass CLASS_MAP = eINSTANCE.getClassMap();

		/**
		 * The meta object literal for the '<em><b>Class Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAP__CLASS_REF = eINSTANCE.getClassMap_ClassRef();

		/**
		 * The meta object literal for the '<em><b>Feature Map</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_MAP__FEATURE_MAP = eINSTANCE.getClassMap_FeatureMap();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapImpl <em>Feature Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getFeatureMap()
		 * @generated
		 */
		EClass FEATURE_MAP = eINSTANCE.getFeatureMap();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP__FEATURE = eINSTANCE.getFeatureMap_Feature();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapForAbstractClassImpl <em>Feature Map For Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.FeatureMapForAbstractClassImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getFeatureMapForAbstractClass()
		 * @generated
		 */
		EClass FEATURE_MAP_FOR_ABSTRACT_CLASS = eINSTANCE.getFeatureMapForAbstractClass();

		/**
		 * The meta object literal for the '<em><b>Class2eclass</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MAP_FOR_ABSTRACT_CLASS__CLASS2ECLASS = eINSTANCE.getFeatureMapForAbstractClass_Class2eclass();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SpecCodeImpl <em>Spec Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SpecCodeImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getSpecCode()
		 * @generated
		 */
		EClass SPEC_CODE = eINSTANCE.getSpecCode();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEC_CODE__CODE = eINSTANCE.getSpecCode_Code();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_CODE__FINAL = eINSTANCE.getSpecCode_Final();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEC_CODE__DESCRIPTION = eINSTANCE.getSpecCode_Description();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.CreateImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DestroyImpl <em>Destroy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DestroyImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getDestroy()
		 * @generated
		 */
		EClass DESTROY = eINSTANCE.getDestroy();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.LookupImpl <em>Lookup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.LookupImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getLookup()
		 * @generated
		 */
		EClass LOOKUP = eINSTANCE.getLookup();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.IdentifyImpl <em>Identify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.IdentifyImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getIdentify()
		 * @generated
		 */
		EClass IDENTIFY = eINSTANCE.getIdentify();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GetImpl <em>Get</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.GetImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getGet()
		 * @generated
		 */
		EClass GET = eINSTANCE.getGet();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.SetImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ListSubImpl <em>List Sub</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.ListSubImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getListSub()
		 * @generated
		 */
		EClass LIST_SUB = eINSTANCE.getListSub();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.InsertImpl <em>Insert</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.InsertImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getInsert()
		 * @generated
		 */
		EClass INSERT = eINSTANCE.getInsert();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.RemoveImpl <em>Remove</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.RemoveImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getRemove()
		 * @generated
		 */
		EClass REMOVE = eINSTANCE.getRemove();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilMethodImpl <em>Util Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilMethodImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getUtilMethod()
		 * @generated
		 */
		EClass UTIL_METHOD = eINSTANCE.getUtilMethod();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilFieldImpl <em>Util Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.UtilFieldImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getUtilField()
		 * @generated
		 */
		EClass UTIL_FIELD = eINSTANCE.getUtilField();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.EStringToStringMapEntryImpl <em>EString To String Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.EStringToStringMapEntryImpl
		 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelPackageImpl#getEStringToStringMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_STRING_MAP_ENTRY = eINSTANCE.getEStringToStringMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__KEY = eINSTANCE.getEStringToStringMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_STRING_MAP_ENTRY__VALUE = eINSTANCE.getEStringToStringMapEntry_Value();

	}

} //DecModelPackage
