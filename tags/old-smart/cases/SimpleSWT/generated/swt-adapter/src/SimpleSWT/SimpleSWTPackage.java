/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package SimpleSWT;

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
 * @see SimpleSWT.SimpleSWTFactory
 * @model kind="package"
 * @generated
 */
public interface SimpleSWTPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "SimpleSWT";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sei.pku.edu.cn/rsa/simpleswt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "SimpleSWT";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SimpleSWTPackage eINSTANCE = SimpleSWT.impl.SimpleSWTPackageImpl.init();

  /**
   * The meta object id for the '{@link SimpleSWT.impl.ControlWrapImpl <em>Control Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleSWT.impl.ControlWrapImpl
   * @see SimpleSWT.impl.SimpleSWTPackageImpl#getControlWrap()
   * @generated
   */
  int CONTROL_WRAP = 0;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_WRAP__BACKGROUND = 0;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_WRAP__ID = 1;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_WRAP__PARENT = 2;

  /**
   * The number of structural features of the '<em>Control Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTROL_WRAP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link SimpleSWT.impl.CompositeWrapImpl <em>Composite Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleSWT.impl.CompositeWrapImpl
   * @see SimpleSWT.impl.SimpleSWTPackageImpl#getCompositeWrap()
   * @generated
   */
  int COMPOSITE_WRAP = 1;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_WRAP__BACKGROUND = CONTROL_WRAP__BACKGROUND;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_WRAP__ID = CONTROL_WRAP__ID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_WRAP__PARENT = CONTROL_WRAP__PARENT;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_WRAP__CHILDREN = CONTROL_WRAP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_WRAP_FEATURE_COUNT = CONTROL_WRAP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link SimpleSWT.impl.TextWrapImpl <em>Text Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleSWT.impl.TextWrapImpl
   * @see SimpleSWT.impl.SimpleSWTPackageImpl#getTextWrap()
   * @generated
   */
  int TEXT_WRAP = 2;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP__BACKGROUND = CONTROL_WRAP__BACKGROUND;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP__ID = CONTROL_WRAP__ID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP__PARENT = CONTROL_WRAP__PARENT;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP__TEXT = CONTROL_WRAP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Editable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP__EDITABLE = CONTROL_WRAP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Text Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_WRAP_FEATURE_COUNT = CONTROL_WRAP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link SimpleSWT.impl.ButtonWrapImpl <em>Button Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleSWT.impl.ButtonWrapImpl
   * @see SimpleSWT.impl.SimpleSWTPackageImpl#getButtonWrap()
   * @generated
   */
  int BUTTON_WRAP = 3;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__BACKGROUND = CONTROL_WRAP__BACKGROUND;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__ID = CONTROL_WRAP__ID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__PARENT = CONTROL_WRAP__PARENT;

  /**
   * The feature id for the '<em><b>Grayed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__GRAYED = CONTROL_WRAP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__TEXT = CONTROL_WRAP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP__IMAGE = CONTROL_WRAP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Button Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_WRAP_FEATURE_COUNT = CONTROL_WRAP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link SimpleSWT.impl.LabelWrapImpl <em>Label Wrap</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see SimpleSWT.impl.LabelWrapImpl
   * @see SimpleSWT.impl.SimpleSWTPackageImpl#getLabelWrap()
   * @generated
   */
  int LABEL_WRAP = 4;

  /**
   * The feature id for the '<em><b>Background</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP__BACKGROUND = CONTROL_WRAP__BACKGROUND;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP__ID = CONTROL_WRAP__ID;

  /**
   * The feature id for the '<em><b>Parent</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP__PARENT = CONTROL_WRAP__PARENT;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP__TEXT = CONTROL_WRAP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Image</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP__IMAGE = CONTROL_WRAP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Label Wrap</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_WRAP_FEATURE_COUNT = CONTROL_WRAP_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link SimpleSWT.ControlWrap <em>Control Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Control Wrap</em>'.
   * @see SimpleSWT.ControlWrap
   * @generated
   */
  EClass getControlWrap();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.ControlWrap#getBackground <em>Background</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background</em>'.
   * @see SimpleSWT.ControlWrap#getBackground()
   * @see #getControlWrap()
   * @generated
   */
  EAttribute getControlWrap_Background();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.ControlWrap#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see SimpleSWT.ControlWrap#getId()
   * @see #getControlWrap()
   * @generated
   */
  EAttribute getControlWrap_Id();

  /**
   * Returns the meta object for the container reference '{@link SimpleSWT.ControlWrap#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Parent</em>'.
   * @see SimpleSWT.ControlWrap#getParent()
   * @see #getControlWrap()
   * @generated
   */
  EReference getControlWrap_Parent();

  /**
   * Returns the meta object for class '{@link SimpleSWT.CompositeWrap <em>Composite Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Wrap</em>'.
   * @see SimpleSWT.CompositeWrap
   * @generated
   */
  EClass getCompositeWrap();

  /**
   * Returns the meta object for the containment reference list '{@link SimpleSWT.CompositeWrap#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see SimpleSWT.CompositeWrap#getChildren()
   * @see #getCompositeWrap()
   * @generated
   */
  EReference getCompositeWrap_Children();

  /**
   * Returns the meta object for class '{@link SimpleSWT.TextWrap <em>Text Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Wrap</em>'.
   * @see SimpleSWT.TextWrap
   * @generated
   */
  EClass getTextWrap();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.TextWrap#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see SimpleSWT.TextWrap#getText()
   * @see #getTextWrap()
   * @generated
   */
  EAttribute getTextWrap_Text();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.TextWrap#isEditable <em>Editable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Editable</em>'.
   * @see SimpleSWT.TextWrap#isEditable()
   * @see #getTextWrap()
   * @generated
   */
  EAttribute getTextWrap_Editable();

  /**
   * Returns the meta object for class '{@link SimpleSWT.ButtonWrap <em>Button Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Wrap</em>'.
   * @see SimpleSWT.ButtonWrap
   * @generated
   */
  EClass getButtonWrap();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.ButtonWrap#isGrayed <em>Grayed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Grayed</em>'.
   * @see SimpleSWT.ButtonWrap#isGrayed()
   * @see #getButtonWrap()
   * @generated
   */
  EAttribute getButtonWrap_Grayed();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.ButtonWrap#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see SimpleSWT.ButtonWrap#getText()
   * @see #getButtonWrap()
   * @generated
   */
  EAttribute getButtonWrap_Text();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.ButtonWrap#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see SimpleSWT.ButtonWrap#getImage()
   * @see #getButtonWrap()
   * @generated
   */
  EAttribute getButtonWrap_Image();

  /**
   * Returns the meta object for class '{@link SimpleSWT.LabelWrap <em>Label Wrap</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Wrap</em>'.
   * @see SimpleSWT.LabelWrap
   * @generated
   */
  EClass getLabelWrap();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.LabelWrap#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see SimpleSWT.LabelWrap#getText()
   * @see #getLabelWrap()
   * @generated
   */
  EAttribute getLabelWrap_Text();

  /**
   * Returns the meta object for the attribute '{@link SimpleSWT.LabelWrap#getImage <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image</em>'.
   * @see SimpleSWT.LabelWrap#getImage()
   * @see #getLabelWrap()
   * @generated
   */
  EAttribute getLabelWrap_Image();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SimpleSWTFactory getSimpleSWTFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link SimpleSWT.impl.ControlWrapImpl <em>Control Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleSWT.impl.ControlWrapImpl
     * @see SimpleSWT.impl.SimpleSWTPackageImpl#getControlWrap()
     * @generated
     */
    EClass CONTROL_WRAP = eINSTANCE.getControlWrap();

    /**
     * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_WRAP__BACKGROUND = eINSTANCE.getControlWrap_Background();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTROL_WRAP__ID = eINSTANCE.getControlWrap_Id();

    /**
     * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTROL_WRAP__PARENT = eINSTANCE.getControlWrap_Parent();

    /**
     * The meta object literal for the '{@link SimpleSWT.impl.CompositeWrapImpl <em>Composite Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleSWT.impl.CompositeWrapImpl
     * @see SimpleSWT.impl.SimpleSWTPackageImpl#getCompositeWrap()
     * @generated
     */
    EClass COMPOSITE_WRAP = eINSTANCE.getCompositeWrap();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_WRAP__CHILDREN = eINSTANCE.getCompositeWrap_Children();

    /**
     * The meta object literal for the '{@link SimpleSWT.impl.TextWrapImpl <em>Text Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleSWT.impl.TextWrapImpl
     * @see SimpleSWT.impl.SimpleSWTPackageImpl#getTextWrap()
     * @generated
     */
    EClass TEXT_WRAP = eINSTANCE.getTextWrap();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_WRAP__TEXT = eINSTANCE.getTextWrap_Text();

    /**
     * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_WRAP__EDITABLE = eINSTANCE.getTextWrap_Editable();

    /**
     * The meta object literal for the '{@link SimpleSWT.impl.ButtonWrapImpl <em>Button Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleSWT.impl.ButtonWrapImpl
     * @see SimpleSWT.impl.SimpleSWTPackageImpl#getButtonWrap()
     * @generated
     */
    EClass BUTTON_WRAP = eINSTANCE.getButtonWrap();

    /**
     * The meta object literal for the '<em><b>Grayed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_WRAP__GRAYED = eINSTANCE.getButtonWrap_Grayed();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_WRAP__TEXT = eINSTANCE.getButtonWrap_Text();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_WRAP__IMAGE = eINSTANCE.getButtonWrap_Image();

    /**
     * The meta object literal for the '{@link SimpleSWT.impl.LabelWrapImpl <em>Label Wrap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see SimpleSWT.impl.LabelWrapImpl
     * @see SimpleSWT.impl.SimpleSWTPackageImpl#getLabelWrap()
     * @generated
     */
    EClass LABEL_WRAP = eINSTANCE.getLabelWrap();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_WRAP__TEXT = eINSTANCE.getLabelWrap_Text();

    /**
     * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_WRAP__IMAGE = eINSTANCE.getLabelWrap_Image();

  }

  /*Global utility methods are generated here*/
    
} //SimpleSWTPackage
