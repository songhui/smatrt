/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.util;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.*;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage
 * @generated
 */
public class DecModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DecModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecModelSwitch<Adapter> modelSwitch =
		new DecModelSwitch<Adapter>() {
			@Override
			public Adapter caseDecoration(Decoration object) {
				return createDecorationAdapter();
			}
			@Override
			public Adapter caseImportClass(ImportClass object) {
				return createImportClassAdapter();
			}
			@Override
			public Adapter caseCodeArea(CodeArea object) {
				return createCodeAreaAdapter();
			}
			@Override
			public Adapter caseCode(Code object) {
				return createCodeAdapter();
			}
			@Override
			public Adapter caseCodeNone(CodeNone object) {
				return createCodeNoneAdapter();
			}
			@Override
			public Adapter caseCodeFragment(CodeFragment object) {
				return createCodeFragmentAdapter();
			}
			@Override
			public Adapter caseCodeReference(CodeReference object) {
				return createCodeReferenceAdapter();
			}
			@Override
			public Adapter caseCodeComposition(CodeComposition object) {
				return createCodeCompositionAdapter();
			}
			@Override
			public Adapter caseMapArea(MapArea object) {
				return createMapAreaAdapter();
			}
			@Override
			public Adapter caseAbstractMap(AbstractMap object) {
				return createAbstractMapAdapter();
			}
			@Override
			public Adapter caseGlobalMap(GlobalMap object) {
				return createGlobalMapAdapter();
			}
			@Override
			public Adapter caseClassMap(ClassMap object) {
				return createClassMapAdapter();
			}
			@Override
			public Adapter caseFeatureMap(FeatureMap object) {
				return createFeatureMapAdapter();
			}
			@Override
			public Adapter caseFeatureMapForAbstractClass(FeatureMapForAbstractClass object) {
				return createFeatureMapForAbstractClassAdapter();
			}
			@Override
			public Adapter caseSpecCode(SpecCode object) {
				return createSpecCodeAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseDestroy(Destroy object) {
				return createDestroyAdapter();
			}
			@Override
			public Adapter caseLookup(Lookup object) {
				return createLookupAdapter();
			}
			@Override
			public Adapter caseIdentify(Identify object) {
				return createIdentifyAdapter();
			}
			@Override
			public Adapter caseGet(Get object) {
				return createGetAdapter();
			}
			@Override
			public Adapter caseSet(Set object) {
				return createSetAdapter();
			}
			@Override
			public Adapter caseListSub(ListSub object) {
				return createListSubAdapter();
			}
			@Override
			public Adapter caseInsert(Insert object) {
				return createInsertAdapter();
			}
			@Override
			public Adapter caseRemove(Remove object) {
				return createRemoveAdapter();
			}
			@Override
			public Adapter caseUtilMethod(UtilMethod object) {
				return createUtilMethodAdapter();
			}
			@Override
			public Adapter caseUtilField(UtilField object) {
				return createUtilFieldAdapter();
			}
			@Override
			public Adapter caseEStringToStringMapEntry(Map.Entry<String, String> object) {
				return createEStringToStringMapEntryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration <em>Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration
	 * @generated
	 */
	public Adapter createDecorationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass <em>Import Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass
	 * @generated
	 */
	public Adapter createImportClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea <em>Code Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea
	 * @generated
	 */
	public Adapter createCodeAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeNone <em>Code None</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeNone
	 * @generated
	 */
	public Adapter createCodeNoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment <em>Code Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeFragment
	 * @generated
	 */
	public Adapter createCodeFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference <em>Code Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeReference
	 * @generated
	 */
	public Adapter createCodeReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition <em>Code Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeComposition
	 * @generated
	 */
	public Adapter createCodeCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea <em>Map Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea
	 * @generated
	 */
	public Adapter createMapAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap <em>Abstract Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.AbstractMap
	 * @generated
	 */
	public Adapter createAbstractMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.GlobalMap <em>Global Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.GlobalMap
	 * @generated
	 */
	public Adapter createGlobalMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap <em>Class Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ClassMap
	 * @generated
	 */
	public Adapter createClassMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap <em>Feature Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMap
	 * @generated
	 */
	public Adapter createFeatureMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass <em>Feature Map For Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.FeatureMapForAbstractClass
	 * @generated
	 */
	public Adapter createFeatureMapForAbstractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode <em>Spec Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.SpecCode
	 * @generated
	 */
	public Adapter createSpecCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Destroy <em>Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Destroy
	 * @generated
	 */
	public Adapter createDestroyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Lookup <em>Lookup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Lookup
	 * @generated
	 */
	public Adapter createLookupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Identify <em>Identify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Identify
	 * @generated
	 */
	public Adapter createIdentifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Get <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Get
	 * @generated
	 */
	public Adapter createGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Set
	 * @generated
	 */
	public Adapter createSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ListSub <em>List Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ListSub
	 * @generated
	 */
	public Adapter createListSubAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Insert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Insert
	 * @generated
	 */
	public Adapter createInsertAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Remove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Remove
	 * @generated
	 */
	public Adapter createRemoveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilMethod <em>Util Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilMethod
	 * @generated
	 */
	public Adapter createUtilMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilField <em>Util Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.UtilField
	 * @generated
	 */
	public Adapter createUtilFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>EString To String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createEStringToStringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DecModelAdapterFactory
