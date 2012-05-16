/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommonWrappingPackage.java,v 1.1 2008/11/09 03:10:52 song Exp $
 */
package cn.edu.pku.sei.ra.wrapping.CommonWrapping;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.CommonWrappingFactory
 * @model kind="package"
 * @generated
 */
public interface CommonWrappingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CommonWrapping";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sei.pku.edu.cn/rsa/commonwrapping";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CommonWrapping";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonWrappingPackage eINSTANCE = cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingPackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl <em>Wrapping EObject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingPackageImpl#getWrappingEObject()
	 * @generated
	 */
	int WRAPPING_EOBJECT = 0;

	/**
	 * The feature id for the '<em><b>Waiting Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_EOBJECT__WAITING_FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_EOBJECT__CORE = 1;

	/**
	 * The feature id for the '<em><b>Newborn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_EOBJECT__NEWBORN = 2;

	/**
	 * The feature id for the '<em><b>Dead</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_EOBJECT__DEAD = 3;

	/**
	 * The number of structural features of the '<em>Wrapping EObject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRAPPING_EOBJECT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>EJava List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingPackageImpl#getEJavaList()
	 * @generated
	 */
	int EJAVA_LIST = 1;

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject <em>Wrapping EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wrapping EObject</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject
	 * @generated
	 */
	EClass getWrappingEObject();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getWaitingFeature <em>Waiting Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waiting Feature</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getWaitingFeature()
	 * @see #getWrappingEObject()
	 * @generated
	 */
	EAttribute getWrappingEObject_WaitingFeature();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Core</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#getCore()
	 * @see #getWrappingEObject()
	 * @generated
	 */
	EAttribute getWrappingEObject_Core();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isNewborn <em>Newborn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newborn</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isNewborn()
	 * @see #getWrappingEObject()
	 * @generated
	 */
	EAttribute getWrappingEObject_Newborn();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isDead <em>Dead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dead</em>'.
	 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.WrappingEObject#isDead()
	 * @see #getWrappingEObject()
	 * @generated
	 */
	EAttribute getWrappingEObject_Dead();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>EJava List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EJava List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 * @generated
	 */
	EDataType getEJavaList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonWrappingFactory getCommonWrappingFactory();

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
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl <em>Wrapping EObject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.WrappingEObjectImpl
		 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingPackageImpl#getWrappingEObject()
		 * @generated
		 */
		EClass WRAPPING_EOBJECT = eINSTANCE.getWrappingEObject();

		/**
		 * The meta object literal for the '<em><b>Waiting Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPING_EOBJECT__WAITING_FEATURE = eINSTANCE.getWrappingEObject_WaitingFeature();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPING_EOBJECT__CORE = eINSTANCE.getWrappingEObject_Core();

		/**
		 * The meta object literal for the '<em><b>Newborn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPING_EOBJECT__NEWBORN = eINSTANCE.getWrappingEObject_Newborn();

		/**
		 * The meta object literal for the '<em><b>Dead</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WRAPPING_EOBJECT__DEAD = eINSTANCE.getWrappingEObject_Dead();

		/**
		 * The meta object literal for the '<em>EJava List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see cn.edu.pku.sei.ra.wrapping.CommonWrapping.impl.CommonWrappingPackageImpl#getEJavaList()
		 * @generated
		 */
		EDataType EJAVA_LIST = eINSTANCE.getEJavaList();

	}

} //CommonWrappingPackage
