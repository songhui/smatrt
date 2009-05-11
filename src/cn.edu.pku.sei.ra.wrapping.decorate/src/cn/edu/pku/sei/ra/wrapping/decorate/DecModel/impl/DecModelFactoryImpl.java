/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DecModelFactoryImpl extends EFactoryImpl implements DecModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DecModelFactory init() {
		try {
			DecModelFactory theDecModelFactory = (DecModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sei.pku.edu.cn/rsa/decmodel"); 
			if (theDecModelFactory != null) {
				return theDecModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DecModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DecModelPackage.DECORATION: return createDecoration();
			case DecModelPackage.IMPORT_CLASS: return createImportClass();
			case DecModelPackage.CODE_AREA: return createCodeArea();
			case DecModelPackage.CODE_NONE: return createCodeNone();
			case DecModelPackage.CODE_FRAGMENT: return createCodeFragment();
			case DecModelPackage.CODE_REFERENCE: return createCodeReference();
			case DecModelPackage.CODE_COMPOSITION: return createCodeComposition();
			case DecModelPackage.MAP_AREA: return createMapArea();
			case DecModelPackage.GLOBAL_MAP: return createGlobalMap();
			case DecModelPackage.CLASS_MAP: return createClassMap();
			case DecModelPackage.FEATURE_MAP: return createFeatureMap();
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS: return createFeatureMapForAbstractClass();
			case DecModelPackage.CREATE: return createCreate();
			case DecModelPackage.DESTROY: return createDestroy();
			case DecModelPackage.LOOKUP: return createLookup();
			case DecModelPackage.IDENTIFY: return createIdentify();
			case DecModelPackage.GET: return createGet();
			case DecModelPackage.SET: return createSet();
			case DecModelPackage.LIST_SUB: return createListSub();
			case DecModelPackage.INSERT: return createInsert();
			case DecModelPackage.REMOVE: return createRemove();
			case DecModelPackage.UTIL_METHOD: return createUtilMethod();
			case DecModelPackage.UTIL_FIELD: return createUtilField();
			case DecModelPackage.ESTRING_TO_STRING_MAP_ENTRY: return (EObject)createEStringToStringMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decoration createDecoration() {
		DecorationImpl decoration = new DecorationImpl();
		return decoration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportClass createImportClass() {
		ImportClassImpl importClass = new ImportClassImpl();
		return importClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeArea createCodeArea() {
		CodeAreaImpl codeArea = new CodeAreaImpl();
		return codeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeNone createCodeNone() {
		CodeNoneImpl codeNone = new CodeNoneImpl();
		return codeNone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeFragment createCodeFragment() {
		CodeFragmentImpl codeFragment = new CodeFragmentImpl();
		return codeFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeReference createCodeReference() {
		CodeReferenceImpl codeReference = new CodeReferenceImpl();
		return codeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeComposition createCodeComposition() {
		CodeCompositionImpl codeComposition = new CodeCompositionImpl();
		return codeComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapArea createMapArea() {
		MapAreaImpl mapArea = new MapAreaImpl();
		return mapArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalMap createGlobalMap() {
		GlobalMapImpl globalMap = new GlobalMapImpl();
		return globalMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMap createClassMap() {
		ClassMapImpl classMap = new ClassMapImpl();
		return classMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap createFeatureMap() {
		FeatureMapImpl featureMap = new FeatureMapImpl();
		return featureMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMapForAbstractClass createFeatureMapForAbstractClass() {
		FeatureMapForAbstractClassImpl featureMapForAbstractClass = new FeatureMapForAbstractClassImpl();
		return featureMapForAbstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destroy createDestroy() {
		DestroyImpl destroy = new DestroyImpl();
		return destroy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lookup createLookup() {
		LookupImpl lookup = new LookupImpl();
		return lookup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identify createIdentify() {
		IdentifyImpl identify = new IdentifyImpl();
		return identify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Get createGet() {
		GetImpl get = new GetImpl();
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListSub createListSub() {
		ListSubImpl listSub = new ListSubImpl();
		return listSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insert createInsert() {
		InsertImpl insert = new InsertImpl();
		return insert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Remove createRemove() {
		RemoveImpl remove = new RemoveImpl();
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilMethod createUtilMethod() {
		UtilMethodImpl utilMethod = new UtilMethodImpl();
		return utilMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilField createUtilField() {
		UtilFieldImpl utilField = new UtilFieldImpl();
		return utilField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToStringMapEntry() {
		EStringToStringMapEntryImpl eStringToStringMapEntry = new EStringToStringMapEntryImpl();
		return eStringToStringMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecModelPackage getDecModelPackage() {
		return (DecModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DecModelPackage getPackage() {
		return DecModelPackage.eINSTANCE;
	}

} //DecModelFactoryImpl
