/**
 * <copyright>
 * </copyright>
 *
 * $Id: C2Package.java,v 1.2 2008/11/13 05:53:00 song Exp $
 */
package cn.edu.pku.sei.ra.arch.C2;

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
 * @see cn.edu.pku.sei.ra.arch.C2.C2Factory
 * @model kind="package"
 * @generated
 */
public interface C2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "C2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sei.pku.edu.cn/rsa/c2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "C2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	C2Package eINSTANCE = cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl.init();

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl <em>Architecture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getArchitecture()
	 * @generated
	 */
	int ARCHITECTURE = 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__CONNECTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Deployed Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__DEPLOYED_HOST = 3;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__COMMENT = 4;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE__PARENT = 5;

	/**
	 * The number of structural features of the '<em>Architecture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__FILE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Pool Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__POOL_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Min Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MIN_POOL = 5;

	/**
	 * The feature id for the '<em><b>Max Pool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__MAX_POOL = 6;

	/**
	 * The feature id for the '<em><b>Above</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ABOVE = 7;

	/**
	 * The feature id for the '<em><b>Below</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BELOW = 8;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PARENT = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMMENT = 11;

	/**
	 * The feature id for the '<em><b>Inner Arch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INNER_ARCH = 12;

	/**
	 * The feature id for the '<em><b>Instance Life</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INSTANCE_LIFE = 13;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl
	 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Above</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__ABOVE = 4;

	/**
	 * The feature id for the '<em><b>Below</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__BELOW = 5;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.arch.C2.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture
	 * @generated
	 */
	EClass getArchitecture();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Component</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getComponent()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Component();

	/**
	 * Returns the meta object for the containment reference list '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connector</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getConnector()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Connector();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getName()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getDeployedHost <em>Deployed Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployed Host</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getDeployedHost()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_DeployedHost();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getComment()
	 * @see #getArchitecture()
	 * @generated
	 */
	EAttribute getArchitecture_Comment();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.pku.sei.ra.arch.C2.Architecture#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Architecture#getParent()
	 * @see #getArchitecture()
	 * @generated
	 */
	EReference getArchitecture_Parent();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.arch.C2.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getFilePath <em>File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Path</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getFilePath()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_FilePath();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getAddress()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Address();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getVersion()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Version();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getPoolSize <em>Pool Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pool Size</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getPoolSize()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_PoolSize();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getMinPool <em>Min Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Pool</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getMinPool()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_MinPool();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getMaxPool <em>Max Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pool</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getMaxPool()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_MaxPool();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.arch.C2.Component#getAbove <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Above</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getAbove()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Above();

	/**
	 * Returns the meta object for the reference '{@link cn.edu.pku.sei.ra.arch.C2.Component#getBelow <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Below</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getBelow()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Below();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.pku.sei.ra.arch.C2.Component#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getParent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Parent();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getType()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getComment()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Comment();

	/**
	 * Returns the meta object for the containment reference '{@link cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch <em>Inner Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inner Arch</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getInnerArch()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InnerArch();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Component#getInstanceLife <em>Instance Life</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Life</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Component#getInstanceLife()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_InstanceLife();

	/**
	 * Returns the meta object for class '{@link cn.edu.pku.sei.ra.arch.C2.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getName()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Name();

	/**
	 * Returns the meta object for the container reference '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getParent()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Parent();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getType()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Type();

	/**
	 * Returns the meta object for the attribute '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getComment()
	 * @see #getConnector()
	 * @generated
	 */
	EAttribute getConnector_Comment();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getAbove <em>Above</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Above</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getAbove()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Above();

	/**
	 * Returns the meta object for the reference list '{@link cn.edu.pku.sei.ra.arch.C2.Connector#getBelow <em>Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Below</em>'.
	 * @see cn.edu.pku.sei.ra.arch.C2.Connector#getBelow()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_Below();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	C2Factory getC2Factory();

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
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl <em>Architecture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.ArchitectureImpl
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getArchitecture()
		 * @generated
		 */
		EClass ARCHITECTURE = eINSTANCE.getArchitecture();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__COMPONENT = eINSTANCE.getArchitecture_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__CONNECTOR = eINSTANCE.getArchitecture_Connector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__NAME = eINSTANCE.getArchitecture_Name();

		/**
		 * The meta object literal for the '<em><b>Deployed Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__DEPLOYED_HOST = eINSTANCE.getArchitecture_DeployedHost();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE__COMMENT = eINSTANCE.getArchitecture_Comment();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE__PARENT = eINSTANCE.getArchitecture_Parent();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.ComponentImpl
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__FILE_PATH = eINSTANCE.getComponent_FilePath();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__ADDRESS = eINSTANCE.getComponent_Address();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__VERSION = eINSTANCE.getComponent_Version();

		/**
		 * The meta object literal for the '<em><b>Pool Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__POOL_SIZE = eINSTANCE.getComponent_PoolSize();

		/**
		 * The meta object literal for the '<em><b>Min Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MIN_POOL = eINSTANCE.getComponent_MinPool();

		/**
		 * The meta object literal for the '<em><b>Max Pool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__MAX_POOL = eINSTANCE.getComponent_MaxPool();

		/**
		 * The meta object literal for the '<em><b>Above</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ABOVE = eINSTANCE.getComponent_Above();

		/**
		 * The meta object literal for the '<em><b>Below</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__BELOW = eINSTANCE.getComponent_Below();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__PARENT = eINSTANCE.getComponent_Parent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__TYPE = eINSTANCE.getComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__COMMENT = eINSTANCE.getComponent_Comment();

		/**
		 * The meta object literal for the '<em><b>Inner Arch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INNER_ARCH = eINSTANCE.getComponent_InnerArch();

		/**
		 * The meta object literal for the '<em><b>Instance Life</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__INSTANCE_LIFE = eINSTANCE.getComponent_InstanceLife();

		/**
		 * The meta object literal for the '{@link cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.ConnectorImpl
		 * @see cn.edu.pku.sei.ra.arch.C2.impl.C2PackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__NAME = eINSTANCE.getConnector_Name();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__PARENT = eINSTANCE.getConnector_Parent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__TYPE = eINSTANCE.getConnector_Type();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTOR__COMMENT = eINSTANCE.getConnector_Comment();

		/**
		 * The meta object literal for the '<em><b>Above</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__ABOVE = eINSTANCE.getConnector_Above();

		/**
		 * The meta object literal for the '<em><b>Below</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__BELOW = eINSTANCE.getConnector_Below();

	}

} //C2Package
