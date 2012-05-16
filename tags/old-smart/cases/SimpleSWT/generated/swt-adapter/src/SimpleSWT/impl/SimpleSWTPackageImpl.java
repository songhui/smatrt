/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT.impl;

import SimpleSWT.ButtonWrap;
import SimpleSWT.CompositeWrap;
import SimpleSWT.ControlWrap;
import SimpleSWT.LabelWrap;
import SimpleSWT.SimpleSWTFactory;
import SimpleSWT.SimpleSWTPackage;
import SimpleSWT.TextWrap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import cn.edu.pku.sei.ra.guineapig.swtview.views.SampleView;
import org.eclipse.ui.PlatformUI;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.graphics.Color;
import java.util.Map;
import java.util.HashMap;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSWTPackageImpl extends EPackageImpl implements SimpleSWTPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass controlWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonWrapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelWrapEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see SimpleSWT.SimpleSWTPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleSWTPackageImpl()
  {
    super(eNS_URI, SimpleSWTFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleSWTPackage init()
  {
    if (isInited) return (SimpleSWTPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleSWTPackage.eNS_URI);

    // Obtain or create and register package
    SimpleSWTPackageImpl theSimpleSWTPackage = (SimpleSWTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimpleSWTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimpleSWTPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSimpleSWTPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleSWTPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleSWTPackage.freeze();

    return theSimpleSWTPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getControlWrap()
  {
    return controlWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlWrap_Background()
  {
    return (EAttribute)controlWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getControlWrap_Id()
  {
    return (EAttribute)controlWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getControlWrap_Parent()
  {
    return (EReference)controlWrapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeWrap()
  {
    return compositeWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeWrap_Children()
  {
    return (EReference)compositeWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextWrap()
  {
    return textWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextWrap_Text()
  {
    return (EAttribute)textWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextWrap_Editable()
  {
    return (EAttribute)textWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonWrap()
  {
    return buttonWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonWrap_Grayed()
  {
    return (EAttribute)buttonWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonWrap_Text()
  {
    return (EAttribute)buttonWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonWrap_Image()
  {
    return (EAttribute)buttonWrapEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelWrap()
  {
    return labelWrapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelWrap_Text()
  {
    return (EAttribute)labelWrapEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabelWrap_Image()
  {
    return (EAttribute)labelWrapEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleSWTFactory getSimpleSWTFactory()
  {
    return (SimpleSWTFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    controlWrapEClass = createEClass(CONTROL_WRAP);
    createEAttribute(controlWrapEClass, CONTROL_WRAP__BACKGROUND);
    createEAttribute(controlWrapEClass, CONTROL_WRAP__ID);
    createEReference(controlWrapEClass, CONTROL_WRAP__PARENT);

    compositeWrapEClass = createEClass(COMPOSITE_WRAP);
    createEReference(compositeWrapEClass, COMPOSITE_WRAP__CHILDREN);

    textWrapEClass = createEClass(TEXT_WRAP);
    createEAttribute(textWrapEClass, TEXT_WRAP__TEXT);
    createEAttribute(textWrapEClass, TEXT_WRAP__EDITABLE);

    buttonWrapEClass = createEClass(BUTTON_WRAP);
    createEAttribute(buttonWrapEClass, BUTTON_WRAP__GRAYED);
    createEAttribute(buttonWrapEClass, BUTTON_WRAP__TEXT);
    createEAttribute(buttonWrapEClass, BUTTON_WRAP__IMAGE);

    labelWrapEClass = createEClass(LABEL_WRAP);
    createEAttribute(labelWrapEClass, LABEL_WRAP__TEXT);
    createEAttribute(labelWrapEClass, LABEL_WRAP__IMAGE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compositeWrapEClass.getESuperTypes().add(this.getControlWrap());
    textWrapEClass.getESuperTypes().add(this.getControlWrap());
    buttonWrapEClass.getESuperTypes().add(this.getControlWrap());
    labelWrapEClass.getESuperTypes().add(this.getControlWrap());

    // Initialize classes and features; add operations and parameters
    initEClass(controlWrapEClass, ControlWrap.class, "ControlWrap", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getControlWrap_Background(), ecorePackage.getEString(), "background", null, 1, 1, ControlWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getControlWrap_Id(), ecorePackage.getEString(), "id", null, 1, 1, ControlWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getControlWrap_Parent(), this.getCompositeWrap(), this.getCompositeWrap_Children(), "parent", null, 0, 1, ControlWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeWrapEClass, CompositeWrap.class, "CompositeWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeWrap_Children(), this.getControlWrap(), this.getControlWrap_Parent(), "children", null, 0, -1, CompositeWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(textWrapEClass, TextWrap.class, "TextWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextWrap_Text(), ecorePackage.getEString(), "text", null, 1, 1, TextWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextWrap_Editable(), ecorePackage.getEBoolean(), "editable", null, 1, 1, TextWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonWrapEClass, ButtonWrap.class, "ButtonWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButtonWrap_Grayed(), ecorePackage.getEBoolean(), "grayed", null, 1, 1, ButtonWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonWrap_Text(), ecorePackage.getEString(), "text", null, 1, 1, ButtonWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonWrap_Image(), ecorePackage.getEString(), "image", null, 1, 1, ButtonWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelWrapEClass, LabelWrap.class, "LabelWrap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabelWrap_Text(), ecorePackage.getEString(), "text", null, 1, 1, LabelWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabelWrap_Image(), ecorePackage.getEString(), "image", null, 1, 1, LabelWrap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations
    createJpAnnotations();
    // http://www.sei.pku.edu.cn/rsa
    createRsaAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createJpAnnotations()
  {
    String source = "http:///jp.ac.u_tokyo.wrapper.AttributeAnnotations";		
    addAnnotation
      (getControlWrap_Id(), 
       source, 
       new String[] 
       {
       "KeyAttribute", "true"
       });	
  }

  /**
   * Initializes the annotations for <b>http://www.sei.pku.edu.cn/rsa</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRsaAnnotations()
  {
    String source = "http://www.sei.pku.edu.cn/rsa";			
    addAnnotation
      (compositeWrapEClass, 
       source, 
       new String[] 
       {
       "RootClass", "true"
       });
  }

  /*Global utility methods are generated here*/
    
} //SimpleSWTPackageImpl
