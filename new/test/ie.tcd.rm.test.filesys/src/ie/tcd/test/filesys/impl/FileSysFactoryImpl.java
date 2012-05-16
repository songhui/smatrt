/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ie.tcd.test.filesys.impl;

import ie.tcd.test.filesys.*;

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
public class FileSysFactoryImpl extends EFactoryImpl implements FileSysFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FileSysFactory init() {
		try {
			FileSysFactory theFileSysFactory = (FileSysFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.tcd.ie/rm/test/filesys"); 
			if (theFileSysFactory != null) {
				return theFileSysFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FileSysFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSysFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FileSysPackage.EFOLDER: return (EObject)createEFolder();
			case FileSysPackage.EFILE: return (EObject)createEFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFolder createEFolder() {
		EFolderImpl eFolder = new EFolderImpl();
		return eFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFile createEFile() {
		EFileImpl eFile = new EFileImpl();
		return eFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSysPackage getFileSysPackage() {
		return (FileSysPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static FileSysPackage getPackage() {
		return FileSysPackage.eINSTANCE;
	}

} //FileSysFactoryImpl
