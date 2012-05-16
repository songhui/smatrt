/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uml.Abstraction;
import uml.Association;
import uml.BehavioralFeature;
import uml.Classifier;
import uml.Comment;
import uml.Dependency;
import uml.DirectedRelationship;
import uml.Element;
import uml.ElementImport;
import uml.Feature;
import uml.Generalization;
import uml.Model;
import uml.NamedElement;
import uml.Namespace;
import uml.Operation;
import uml.PackageImport;
import uml.PackageableElement;
import uml.Parameter;
import uml.Property;
import uml.Realization;
import uml.Relationship;
import uml.Substitution;
import uml.Type;
import uml.TypedElement;
import uml.UmlFactory;
import uml.UmlPackage;
import uml.ValueSpecification;
import uml.VisibilityKind;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import org.apache.bcel.classfile.ClassParser;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.classfile.Field;
import java.util.Random;
import org.apache.bcel.generic.BasicType;



/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlPackageImpl extends EPackageImpl implements UmlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dependencyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directedRelationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass relationshipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass associationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass substitutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass realizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass behavioralFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass generalizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum visibilityKindEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType integerEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType booleanEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType stringEDataType = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EDataType unlimitedNaturalEDataType = null;

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
   * @see uml.UmlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private UmlPackageImpl()
  {
    super(eNS_URI, UmlFactory.eINSTANCE);
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
  public static UmlPackage init()
  {
    if (isInited) return (UmlPackage)EPackage.Registry.INSTANCE.getEPackage(UmlPackage.eNS_URI);

    // Obtain or create and register package
    UmlPackageImpl theUmlPackage = (UmlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof UmlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new UmlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theUmlPackage.createPackageContents();

    // Initialize created meta-data
    theUmlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theUmlPackage.freeze();

    return theUmlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Body()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComment_AnnotatedElement()
  {
    return (EReference)commentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_OwnedElement()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_Owner()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_OwnedComment()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_OwnedType()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_Name()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_PackagedElement()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageableElement()
  {
    return packageableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Visibility()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_QualifiedName()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElement_ClientDependency()
  {
    return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedElement_Namespace()
  {
    return (EReference)namedElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDependency()
  {
    return dependencyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Supplier()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDependency_Client()
  {
    return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectedRelationship()
  {
    return directedRelationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectedRelationship_Source()
  {
    return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectedRelationship_Target()
  {
    return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelationship()
  {
    return relationshipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRelationship_RelatedElement()
  {
    return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_ElementImport()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_PackageImport()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_Member()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_ImportedMember()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespace_OwnedMember()
  {
    return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementImport()
  {
    return elementImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementImport_Visibility()
  {
    return (EAttribute)elementImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getElementImport_Alias()
  {
    return (EAttribute)elementImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementImport_ImportedElement()
  {
    return (EReference)elementImportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementImport_ImportingNamespace()
  {
    return (EReference)elementImportEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackageImport()
  {
    return packageImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackageImport_Visibility()
  {
    return (EAttribute)packageImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageImport_ImportedPackage()
  {
    return (EReference)packageImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackageImport_ImportingNamespace()
  {
    return (EReference)packageImportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueSpecification()
  {
    return valueSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedElement()
  {
    return typedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedElement_Type()
  {
    return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_Package()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssociation()
  {
    return associationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_OwnedEnd()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_MemberEnd()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssociation_IsDerived()
  {
    return (EAttribute)associationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_EndType()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssociation_NavigableOwnedEnd()
  {
    return (EReference)associationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifier()
  {
    return classifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClassifier_IsAbstract()
  {
    return (EAttribute)classifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_Feature()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_InheritedMember()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_RedefinedClassifier()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_General()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_Substitution()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassifier_Attribute()
  {
    return (EReference)classifierEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeature()
  {
    return featureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeature_IsStatic()
  {
    return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeature_FeaturingClassifier()
  {
    return (EReference)featureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubstitution()
  {
    return substitutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitution_Contract()
  {
    return (EReference)substitutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubstitution_SubstitutingClassifier()
  {
    return (EReference)substitutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRealization()
  {
    return realizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstraction()
  {
    return abstractionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Operation()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Default()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_DefaultValue()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_IsException()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_IsStream()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Type()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_Class()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_IsQuery()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_IsOrdered()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_IsUnique()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Lower()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOperation_Upper()
  {
    return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOperation_RedefinedOperation()
  {
    return (EReference)operationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBehavioralFeature()
  {
    return behavioralFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavioralFeature_OwnedParameter()
  {
    return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBehavioralFeature_IsAbstract()
  {
    return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBehavioralFeature_RaisedException()
  {
    return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_NestedClassifier()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_OwnedOperation()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_SuperClass()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_IsActive()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_OwnedAttribute()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_Name()
  {
    return (EAttribute)classEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_Generalization()
  {
    return (EReference)classEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeneralization()
  {
    return generalizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeneralization_IsSubstitutable()
  {
    return (EAttribute)generalizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralization_General()
  {
    return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeneralization_Specific()
  {
    return (EReference)generalizationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_PackagedElement()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModel_Name()
  {
    return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVisibilityKind()
  {
    return visibilityKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getInteger()
  {
    return integerEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getBoolean()
  {
    return booleanEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getString()
  {
    return stringEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType getUnlimitedNatural()
  {
    return unlimitedNaturalEDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlFactory getUmlFactory()
  {
    return (UmlFactory)getEFactoryInstance();
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
    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__BODY);
    createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
    createEReference(elementEClass, ELEMENT__OWNER);
    createEReference(elementEClass, ELEMENT__OWNED_COMMENT);

    packageEClass = createEClass(PACKAGE);
    createEReference(packageEClass, PACKAGE__OWNED_TYPE);
    createEAttribute(packageEClass, PACKAGE__NAME);
    createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);

    packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
    createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
    createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);

    dependencyEClass = createEClass(DEPENDENCY);
    createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);
    createEReference(dependencyEClass, DEPENDENCY__CLIENT);

    directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
    createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
    createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

    relationshipEClass = createEClass(RELATIONSHIP);
    createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

    namespaceEClass = createEClass(NAMESPACE);
    createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
    createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);
    createEReference(namespaceEClass, NAMESPACE__MEMBER);
    createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
    createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);

    elementImportEClass = createEClass(ELEMENT_IMPORT);
    createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
    createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
    createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
    createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTING_NAMESPACE);

    packageImportEClass = createEClass(PACKAGE_IMPORT);
    createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
    createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
    createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_NAMESPACE);

    valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);

    typedElementEClass = createEClass(TYPED_ELEMENT);
    createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__PACKAGE);

    associationEClass = createEClass(ASSOCIATION);
    createEReference(associationEClass, ASSOCIATION__OWNED_END);
    createEReference(associationEClass, ASSOCIATION__MEMBER_END);
    createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
    createEReference(associationEClass, ASSOCIATION__END_TYPE);
    createEReference(associationEClass, ASSOCIATION__NAVIGABLE_OWNED_END);

    classifierEClass = createEClass(CLASSIFIER);
    createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
    createEReference(classifierEClass, CLASSIFIER__FEATURE);
    createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
    createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
    createEReference(classifierEClass, CLASSIFIER__GENERAL);
    createEReference(classifierEClass, CLASSIFIER__SUBSTITUTION);
    createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);

    featureEClass = createEClass(FEATURE);
    createEAttribute(featureEClass, FEATURE__IS_STATIC);
    createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);

    substitutionEClass = createEClass(SUBSTITUTION);
    createEReference(substitutionEClass, SUBSTITUTION__CONTRACT);
    createEReference(substitutionEClass, SUBSTITUTION__SUBSTITUTING_CLASSIFIER);

    realizationEClass = createEClass(REALIZATION);

    abstractionEClass = createEClass(ABSTRACTION);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__OPERATION);
    createEAttribute(parameterEClass, PARAMETER__DEFAULT);
    createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);
    createEAttribute(parameterEClass, PARAMETER__IS_EXCEPTION);
    createEAttribute(parameterEClass, PARAMETER__IS_STREAM);

    propertyEClass = createEClass(PROPERTY);
    createEReference(propertyEClass, PROPERTY__TYPE);
    createEAttribute(propertyEClass, PROPERTY__NAME);

    operationEClass = createEClass(OPERATION);
    createEReference(operationEClass, OPERATION__CLASS);
    createEAttribute(operationEClass, OPERATION__IS_QUERY);
    createEAttribute(operationEClass, OPERATION__IS_ORDERED);
    createEAttribute(operationEClass, OPERATION__IS_UNIQUE);
    createEAttribute(operationEClass, OPERATION__LOWER);
    createEAttribute(operationEClass, OPERATION__UPPER);
    createEReference(operationEClass, OPERATION__REDEFINED_OPERATION);

    behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
    createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__OWNED_PARAMETER);
    createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__IS_ABSTRACT);
    createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__RAISED_EXCEPTION);

    classEClass = createEClass(CLASS);
    createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
    createEReference(classEClass, CLASS__OWNED_OPERATION);
    createEReference(classEClass, CLASS__SUPER_CLASS);
    createEAttribute(classEClass, CLASS__IS_ACTIVE);
    createEReference(classEClass, CLASS__OWNED_ATTRIBUTE);
    createEAttribute(classEClass, CLASS__NAME);
    createEReference(classEClass, CLASS__GENERALIZATION);

    generalizationEClass = createEClass(GENERALIZATION);
    createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
    createEReference(generalizationEClass, GENERALIZATION__GENERAL);
    createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);

    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__PACKAGED_ELEMENT);
    createEAttribute(modelEClass, MODEL__NAME);

    // Create enums
    visibilityKindEEnum = createEEnum(VISIBILITY_KIND);

    // Create data types
    integerEDataType = createEDataType(INTEGER);
    booleanEDataType = createEDataType(BOOLEAN);
    stringEDataType = createEDataType(STRING);
    unlimitedNaturalEDataType = createEDataType(UNLIMITED_NATURAL);
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
    commentEClass.getESuperTypes().add(this.getElement());
    packageEClass.getESuperTypes().add(this.getPackageableElement());
    namedElementEClass.getESuperTypes().add(this.getElement());
    dependencyEClass.getESuperTypes().add(this.getPackageableElement());
    dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
    directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
    relationshipEClass.getESuperTypes().add(this.getElement());
    namespaceEClass.getESuperTypes().add(this.getNamedElement());
    elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
    packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
    valueSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
    valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
    typedElementEClass.getESuperTypes().add(this.getNamedElement());
    typeEClass.getESuperTypes().add(this.getPackageableElement());
    associationEClass.getESuperTypes().add(this.getClassifier());
    associationEClass.getESuperTypes().add(this.getRelationship());
    classifierEClass.getESuperTypes().add(this.getType());
    substitutionEClass.getESuperTypes().add(this.getRealization());
    realizationEClass.getESuperTypes().add(this.getAbstraction());
    abstractionEClass.getESuperTypes().add(this.getDependency());
    operationEClass.getESuperTypes().add(this.getBehavioralFeature());
    behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
    behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
    classEClass.getESuperTypes().add(this.getClassifier());
    generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());

    // Initialize classes and features; add operations and parameters
    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Body(), this.getString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(packageEClass, uml.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType", null, 0, -1, uml.Package.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPackage_Name(), this.getString(), "name", null, 1, 1, uml.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPackage_PackagedElement(), this.getPackageableElement(), null, "packagedElement", null, 0, -1, uml.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), this.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getNamedElement_QualifiedName(), this.getString(), "qualifiedName", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "namespace", null, 0, 1, NamedElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getNamespace_OwnedMember(), this.getNamedElement(), this.getNamedElement_Namespace(), "ownedMember", null, 0, -1, Namespace.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getElementImport_Alias(), this.getString(), "alias", null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPackageImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package", null, 0, 1, Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssociation_OwnedEnd(), this.getProperty(), null, "ownedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssociation_MemberEnd(), this.getProperty(), null, "memberEnd", null, 2, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssociation_IsDerived(), this.getBoolean(), "isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAssociation_EndType(), this.getType(), null, "endType", null, 1, -1, Association.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getAssociation_NavigableOwnedEnd(), this.getProperty(), null, "navigableOwnedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClassifier_IsAbstract(), this.getBoolean(), "isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_Substitution(), this.getSubstitution(), this.getSubstitution_SubstitutingClassifier(), "substitution", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFeature_IsStatic(), this.getBoolean(), "isStatic", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, -1, Feature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

    initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubstitution_Contract(), this.getClassifier(), null, "contract", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubstitution_SubstitutingClassifier(), this.getClassifier(), this.getClassifier_Substitution(), "substitutingClassifier", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Operation(), this.getOperation(), null, "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getParameter_Default(), this.getString(), "default", null, 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getParameter_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getParameter_IsException(), this.getBoolean(), "isException", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getParameter_IsStream(), this.getBoolean(), "isStream", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProperty_Type(), this.getClass_(), null, "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getProperty_Name(), this.getString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOperation_Class(), this.getClass_(), this.getClass_OwnedOperation(), "class", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_IsQuery(), this.getBoolean(), "isQuery", "false", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_IsOrdered(), this.getBoolean(), "isOrdered", "false", 1, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_IsUnique(), this.getBoolean(), "isUnique", "true", 1, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_Lower(), this.getInteger(), "lower", "1", 0, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOperation_Upper(), this.getUnlimitedNatural(), "upper", "1", 0, 1, Operation.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEReference(getOperation_RedefinedOperation(), this.getOperation(), null, "redefinedOperation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBehavioralFeature_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBehavioralFeature_IsAbstract(), this.getBoolean(), "isAbstract", "false", 1, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getBehavioralFeature_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classEClass, uml.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClass_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_OwnedOperation(), this.getOperation(), this.getOperation_Class(), "ownedOperation", null, 0, -1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, uml.Class.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
    initEAttribute(getClass_IsActive(), this.getBoolean(), "isActive", "false", 1, 1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClass_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_Name(), this.getString(), "name", null, 1, 1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClass_Generalization(), this.getGeneralization(), null, "generalization", null, 0, -1, uml.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeneralization_IsSubstitutable(), this.getBoolean(), "isSubstitutable", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getGeneralization_Specific(), this.getClassifier(), null, "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_PackagedElement(), this.getPackageableElement(), null, "packagedElement", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getModel_Name(), this.getString(), "name", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
    addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

    // Initialize data types
    initEDataType(integerEDataType, int.class, "Integer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(booleanEDataType, boolean.class, "Boolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(stringEDataType, String.class, "String", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
    initEDataType(unlimitedNaturalEDataType, int.class, "UnlimitedNatural", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
    // union
    createUnionAnnotations();
    // subsets
    createSubsetsAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // redefines
    createRedefinesAnnotations();
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";								
    addAnnotation
      (getComment_Body(), 
       source, 
       new String[] 
       {
       "kind", "element"
       });																																																																																																																																								
  }

  /**
   * Initializes the annotations for <b>union</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createUnionAnnotations()
  {
    String source = "union";											
    addAnnotation
      (getElement_OwnedElement(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getElement_Owner(), 
       source, 
       new String[] 
       {
       });															
    addAnnotation
      (getNamedElement_Namespace(), 
       source, 
       new String[] 
       {
       });													
    addAnnotation
      (getDirectedRelationship_Source(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getDirectedRelationship_Target(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getRelationship_RelatedElement(), 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (getNamespace_Member(), 
       source, 
       new String[] 
       {
       });						
    addAnnotation
      (getNamespace_OwnedMember(), 
       source, 
       new String[] 
       {
       });																												
    addAnnotation
      (getClassifier_Feature(), 
       source, 
       new String[] 
       {
       });											
    addAnnotation
      (getClassifier_Attribute(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getFeature_FeaturingClassifier(), 
       source, 
       new String[] 
       {
       });																																															
  }

  /**
   * Initializes the annotations for <b>subsets</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createSubsetsAnnotations()
  {
    String source = "subsets";															
    addAnnotation
      (getElement_OwnedComment(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getPackage_OwnedType(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getPackage_PackagedElement(), 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (getNamedElement_Namespace(), 
       source, 
       new String[] 
       {
       });								
    addAnnotation
      (getDependency_Supplier(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getDependency_Client(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getDirectedRelationship_Source(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getDirectedRelationship_Target(), 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (getNamespace_ElementImport(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getNamespace_PackageImport(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getNamespace_ImportedMember(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getNamespace_OwnedMember(), 
       source, 
       new String[] 
       {
       });						
    addAnnotation
      (getElementImport_ImportedElement(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getElementImport_ImportingNamespace(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getPackageImport_ImportedPackage(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getPackageImport_ImportingNamespace(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getType_Package(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getAssociation_OwnedEnd(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getAssociation_MemberEnd(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getAssociation_EndType(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getAssociation_NavigableOwnedEnd(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getClassifier_Feature(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getClassifier_InheritedMember(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getClassifier_RedefinedClassifier(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getClassifier_Substitution(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getClassifier_Attribute(), 
       source, 
       new String[] 
       {
       });									
    addAnnotation
      (getSubstitution_Contract(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getSubstitution_SubstitutingClassifier(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getParameter_Operation(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getParameter_DefaultValue(), 
       source, 
       new String[] 
       {
       });					
    addAnnotation
      (getProperty_Type(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getOperation_Class(), 
       source, 
       new String[] 
       {
       });								
    addAnnotation
      (getOperation_RedefinedOperation(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getBehavioralFeature_OwnedParameter(), 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (getClass_NestedClassifier(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getClass_OwnedOperation(), 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (getClass_Generalization(), 
       source, 
       new String[] 
       {
       });				
    addAnnotation
      (getGeneralization_General(), 
       source, 
       new String[] 
       {
       });			
    addAnnotation
      (getGeneralization_Specific(), 
       source, 
       new String[] 
       {
       });
  }

  /**
   * Initializes the annotations for <b>duplicates</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDuplicatesAnnotations()
  {
    String source = "duplicates";																																																																																																																																	
    addAnnotation
      (classEClass, 
       source, 
       new String[] 
       {
       });															
  }

  /**
   * Initializes the annotations for <b>redefines</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createRedefinesAnnotations()
  {
    String source = "redefines";																																																																																																																																							
    addAnnotation
      (getClass_SuperClass(), 
       source, 
       new String[] 
       {
       });									
  }

  /*Global utility methods are generated here*/
    
} //UmlPackageImpl
