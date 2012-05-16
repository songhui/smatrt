/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage
 * @generated
 */
public interface DecModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DecModelFactory eINSTANCE = cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decoration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decoration</em>'.
	 * @generated
	 */
	Decoration createDecoration();

	/**
	 * Returns a new object of class '<em>Import Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Class</em>'.
	 * @generated
	 */
	ImportClass createImportClass();

	/**
	 * Returns a new object of class '<em>Code Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Area</em>'.
	 * @generated
	 */
	CodeArea createCodeArea();

	/**
	 * Returns a new object of class '<em>Code None</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code None</em>'.
	 * @generated
	 */
	CodeNone createCodeNone();

	/**
	 * Returns a new object of class '<em>Code Fragment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Fragment</em>'.
	 * @generated
	 */
	CodeFragment createCodeFragment();

	/**
	 * Returns a new object of class '<em>Code Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Reference</em>'.
	 * @generated
	 */
	CodeReference createCodeReference();

	/**
	 * Returns a new object of class '<em>Code Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Composition</em>'.
	 * @generated
	 */
	CodeComposition createCodeComposition();

	/**
	 * Returns a new object of class '<em>Map Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Map Area</em>'.
	 * @generated
	 */
	MapArea createMapArea();

	/**
	 * Returns a new object of class '<em>Global Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Map</em>'.
	 * @generated
	 */
	GlobalMap createGlobalMap();

	/**
	 * Returns a new object of class '<em>Class Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Map</em>'.
	 * @generated
	 */
	ClassMap createClassMap();

	/**
	 * Returns a new object of class '<em>Feature Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Map</em>'.
	 * @generated
	 */
	FeatureMap createFeatureMap();

	/**
	 * Returns a new object of class '<em>Feature Map For Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Map For Abstract Class</em>'.
	 * @generated
	 */
	FeatureMapForAbstractClass createFeatureMapForAbstractClass();

	/**
	 * Returns a new object of class '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create</em>'.
	 * @generated
	 */
	Create createCreate();

	/**
	 * Returns a new object of class '<em>Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Destroy</em>'.
	 * @generated
	 */
	Destroy createDestroy();

	/**
	 * Returns a new object of class '<em>Lookup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lookup</em>'.
	 * @generated
	 */
	Lookup createLookup();

	/**
	 * Returns a new object of class '<em>Identify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Identify</em>'.
	 * @generated
	 */
	Identify createIdentify();

	/**
	 * Returns a new object of class '<em>Get</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get</em>'.
	 * @generated
	 */
	Get createGet();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>List Sub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Sub</em>'.
	 * @generated
	 */
	ListSub createListSub();

	/**
	 * Returns a new object of class '<em>Insert</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insert</em>'.
	 * @generated
	 */
	Insert createInsert();

	/**
	 * Returns a new object of class '<em>Remove</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove</em>'.
	 * @generated
	 */
	Remove createRemove();

	/**
	 * Returns a new object of class '<em>Util Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Util Method</em>'.
	 * @generated
	 */
	UtilMethod createUtilMethod();

	/**
	 * Returns a new object of class '<em>Util Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Util Field</em>'.
	 * @generated
	 */
	UtilField createUtilField();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DecModelPackage getDecModelPackage();

} //DecModelFactory
