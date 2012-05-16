/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.util;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.*;

import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage
 * @generated
 */
public class DecModelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DecModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecModelSwitch() {
		if (modelPackage == null) {
			modelPackage = DecModelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DecModelPackage.DECORATION: {
				Decoration decoration = (Decoration)theEObject;
				T result = caseDecoration(decoration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.IMPORT_CLASS: {
				ImportClass importClass = (ImportClass)theEObject;
				T result = caseImportClass(importClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE_AREA: {
				CodeArea codeArea = (CodeArea)theEObject;
				T result = caseCodeArea(codeArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE: {
				Code code = (Code)theEObject;
				T result = caseCode(code);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE_NONE: {
				CodeNone codeNone = (CodeNone)theEObject;
				T result = caseCodeNone(codeNone);
				if (result == null) result = caseCode(codeNone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE_FRAGMENT: {
				CodeFragment codeFragment = (CodeFragment)theEObject;
				T result = caseCodeFragment(codeFragment);
				if (result == null) result = caseCode(codeFragment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE_REFERENCE: {
				CodeReference codeReference = (CodeReference)theEObject;
				T result = caseCodeReference(codeReference);
				if (result == null) result = caseCode(codeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CODE_COMPOSITION: {
				CodeComposition codeComposition = (CodeComposition)theEObject;
				T result = caseCodeComposition(codeComposition);
				if (result == null) result = caseCode(codeComposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.MAP_AREA: {
				MapArea mapArea = (MapArea)theEObject;
				T result = caseMapArea(mapArea);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.ABSTRACT_MAP: {
				AbstractMap abstractMap = (AbstractMap)theEObject;
				T result = caseAbstractMap(abstractMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.GLOBAL_MAP: {
				GlobalMap globalMap = (GlobalMap)theEObject;
				T result = caseGlobalMap(globalMap);
				if (result == null) result = caseAbstractMap(globalMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CLASS_MAP: {
				ClassMap classMap = (ClassMap)theEObject;
				T result = caseClassMap(classMap);
				if (result == null) result = caseAbstractMap(classMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.FEATURE_MAP: {
				FeatureMap featureMap = (FeatureMap)theEObject;
				T result = caseFeatureMap(featureMap);
				if (result == null) result = caseAbstractMap(featureMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.FEATURE_MAP_FOR_ABSTRACT_CLASS: {
				FeatureMapForAbstractClass featureMapForAbstractClass = (FeatureMapForAbstractClass)theEObject;
				T result = caseFeatureMapForAbstractClass(featureMapForAbstractClass);
				if (result == null) result = caseFeatureMap(featureMapForAbstractClass);
				if (result == null) result = caseAbstractMap(featureMapForAbstractClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.SPEC_CODE: {
				SpecCode specCode = (SpecCode)theEObject;
				T result = caseSpecCode(specCode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseSpecCode(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.DESTROY: {
				Destroy destroy = (Destroy)theEObject;
				T result = caseDestroy(destroy);
				if (result == null) result = caseSpecCode(destroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.LOOKUP: {
				Lookup lookup = (Lookup)theEObject;
				T result = caseLookup(lookup);
				if (result == null) result = caseSpecCode(lookup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.IDENTIFY: {
				Identify identify = (Identify)theEObject;
				T result = caseIdentify(identify);
				if (result == null) result = caseSpecCode(identify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.GET: {
				Get get = (Get)theEObject;
				T result = caseGet(get);
				if (result == null) result = caseSpecCode(get);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseSpecCode(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.LIST_SUB: {
				ListSub listSub = (ListSub)theEObject;
				T result = caseListSub(listSub);
				if (result == null) result = caseSpecCode(listSub);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.INSERT: {
				Insert insert = (Insert)theEObject;
				T result = caseInsert(insert);
				if (result == null) result = caseSpecCode(insert);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.REMOVE: {
				Remove remove = (Remove)theEObject;
				T result = caseRemove(remove);
				if (result == null) result = caseSpecCode(remove);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.UTIL_METHOD: {
				UtilMethod utilMethod = (UtilMethod)theEObject;
				T result = caseUtilMethod(utilMethod);
				if (result == null) result = caseSpecCode(utilMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.UTIL_FIELD: {
				UtilField utilField = (UtilField)theEObject;
				T result = caseUtilField(utilField);
				if (result == null) result = caseSpecCode(utilField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DecModelPackage.ESTRING_TO_STRING_MAP_ENTRY: {
				@SuppressWarnings("unchecked") Map.Entry<String, String> eStringToStringMapEntry = (Map.Entry<String, String>)theEObject;
				T result = caseEStringToStringMapEntry(eStringToStringMapEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decoration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecoration(Decoration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportClass(ImportClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeArea(CodeArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code None</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code None</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeNone(CodeNone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Fragment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeFragment(CodeFragment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeReference(CodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeComposition(CodeComposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapArea(MapArea object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractMap(AbstractMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalMap(GlobalMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMap(ClassMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMap(FeatureMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Map For Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Map For Abstract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureMapForAbstractClass(FeatureMapForAbstractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spec Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spec Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecCode(SpecCode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDestroy(Destroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lookup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lookup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLookup(Lookup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentify(Identify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGet(Get object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Sub</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Sub</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListSub(ListSub object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsert(Insert object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemove(Remove object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Util Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Util Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilMethod(UtilMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Util Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Util Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilField(UtilField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EString To String Map Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEStringToStringMapEntry(Map.Entry<String, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DecModelSwitch
