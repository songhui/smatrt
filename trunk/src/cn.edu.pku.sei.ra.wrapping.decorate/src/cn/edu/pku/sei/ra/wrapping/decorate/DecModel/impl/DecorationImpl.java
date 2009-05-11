/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl;

import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.CodeArea;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.DecModelPackage;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.Decoration;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.ImportClass;
import cn.edu.pku.sei.ra.wrapping.decorate.DecModel.MapArea;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decoration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl#getImportClass <em>Import Class</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl#getCodeArea <em>Code Area</em>}</li>
 *   <li>{@link cn.edu.pku.sei.ra.wrapping.decorate.DecModel.impl.DecorationImpl#getMapArea <em>Map Area</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecorationImpl extends EObjectImpl implements Decoration {
	/**
	 * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel genModel;

	/**
	 * The cached value of the '{@link #getImportClass() <em>Import Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportClass()
	 * @generated
	 * @ordered
	 */
	protected ImportClass importClass;

	/**
	 * The cached value of the '{@link #getCodeArea() <em>Code Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeArea()
	 * @generated
	 * @ordered
	 */
	protected CodeArea codeArea;

	/**
	 * The cached value of the '{@link #getMapArea() <em>Map Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapArea()
	 * @generated
	 * @ordered
	 */
	protected MapArea mapArea;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecorationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DecModelPackage.Literals.DECORATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenModel() {
		if (genModel != null && genModel.eIsProxy()) {
			InternalEObject oldGenModel = (InternalEObject)genModel;
			genModel = (GenModel)eResolveProxy(oldGenModel);
			if (genModel != oldGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DecModelPackage.DECORATION__GEN_MODEL, oldGenModel, genModel));
			}
		}
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel basicGetGenModel() {
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenModel newGenModel) {
		GenModel oldGenModel = genModel;
		genModel = newGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__GEN_MODEL, oldGenModel, genModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportClass getImportClass() {
		return importClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportClass(ImportClass newImportClass, NotificationChain msgs) {
		ImportClass oldImportClass = importClass;
		importClass = newImportClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__IMPORT_CLASS, oldImportClass, newImportClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportClass(ImportClass newImportClass) {
		if (newImportClass != importClass) {
			NotificationChain msgs = null;
			if (importClass != null)
				msgs = ((InternalEObject)importClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__IMPORT_CLASS, null, msgs);
			if (newImportClass != null)
				msgs = ((InternalEObject)newImportClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__IMPORT_CLASS, null, msgs);
			msgs = basicSetImportClass(newImportClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__IMPORT_CLASS, newImportClass, newImportClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeArea getCodeArea() {
		return codeArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodeArea(CodeArea newCodeArea, NotificationChain msgs) {
		CodeArea oldCodeArea = codeArea;
		codeArea = newCodeArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__CODE_AREA, oldCodeArea, newCodeArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeArea(CodeArea newCodeArea) {
		if (newCodeArea != codeArea) {
			NotificationChain msgs = null;
			if (codeArea != null)
				msgs = ((InternalEObject)codeArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__CODE_AREA, null, msgs);
			if (newCodeArea != null)
				msgs = ((InternalEObject)newCodeArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__CODE_AREA, null, msgs);
			msgs = basicSetCodeArea(newCodeArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__CODE_AREA, newCodeArea, newCodeArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapArea getMapArea() {
		return mapArea;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapArea(MapArea newMapArea, NotificationChain msgs) {
		MapArea oldMapArea = mapArea;
		mapArea = newMapArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__MAP_AREA, oldMapArea, newMapArea);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapArea(MapArea newMapArea) {
		if (newMapArea != mapArea) {
			NotificationChain msgs = null;
			if (mapArea != null)
				msgs = ((InternalEObject)mapArea).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__MAP_AREA, null, msgs);
			if (newMapArea != null)
				msgs = ((InternalEObject)newMapArea).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DecModelPackage.DECORATION__MAP_AREA, null, msgs);
			msgs = basicSetMapArea(newMapArea, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DecModelPackage.DECORATION__MAP_AREA, newMapArea, newMapArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DecModelPackage.DECORATION__IMPORT_CLASS:
				return basicSetImportClass(null, msgs);
			case DecModelPackage.DECORATION__CODE_AREA:
				return basicSetCodeArea(null, msgs);
			case DecModelPackage.DECORATION__MAP_AREA:
				return basicSetMapArea(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DecModelPackage.DECORATION__GEN_MODEL:
				if (resolve) return getGenModel();
				return basicGetGenModel();
			case DecModelPackage.DECORATION__IMPORT_CLASS:
				return getImportClass();
			case DecModelPackage.DECORATION__CODE_AREA:
				return getCodeArea();
			case DecModelPackage.DECORATION__MAP_AREA:
				return getMapArea();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DecModelPackage.DECORATION__GEN_MODEL:
				setGenModel((GenModel)newValue);
				return;
			case DecModelPackage.DECORATION__IMPORT_CLASS:
				setImportClass((ImportClass)newValue);
				return;
			case DecModelPackage.DECORATION__CODE_AREA:
				setCodeArea((CodeArea)newValue);
				return;
			case DecModelPackage.DECORATION__MAP_AREA:
				setMapArea((MapArea)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DecModelPackage.DECORATION__GEN_MODEL:
				setGenModel((GenModel)null);
				return;
			case DecModelPackage.DECORATION__IMPORT_CLASS:
				setImportClass((ImportClass)null);
				return;
			case DecModelPackage.DECORATION__CODE_AREA:
				setCodeArea((CodeArea)null);
				return;
			case DecModelPackage.DECORATION__MAP_AREA:
				setMapArea((MapArea)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DecModelPackage.DECORATION__GEN_MODEL:
				return genModel != null;
			case DecModelPackage.DECORATION__IMPORT_CLASS:
				return importClass != null;
			case DecModelPackage.DECORATION__CODE_AREA:
				return codeArea != null;
			case DecModelPackage.DECORATION__MAP_AREA:
				return mapArea != null;
		}
		return super.eIsSet(featureID);
	}

} //DecorationImpl
