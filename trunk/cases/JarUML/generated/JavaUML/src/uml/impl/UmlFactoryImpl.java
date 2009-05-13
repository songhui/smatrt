/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.Abstraction;
import uml.Association;
import uml.Comment;
import uml.Dependency;
import uml.ElementImport;
import uml.Generalization;
import uml.Model;
import uml.Operation;
import uml.PackageImport;
import uml.Parameter;
import uml.Property;
import uml.Realization;
import uml.Substitution;
import uml.UmlFactory;
import uml.UmlPackage;
import uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UmlFactory init()
  {
    try
    {
      UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sei.pku.edu.cn/simpleUML"); 
      if (theUmlFactory != null)
      {
        return theUmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UmlPackage.COMMENT: return createComment();
      case UmlPackage.PACKAGE: return createPackage();
      case UmlPackage.DEPENDENCY: return createDependency();
      case UmlPackage.ELEMENT_IMPORT: return createElementImport();
      case UmlPackage.PACKAGE_IMPORT: return createPackageImport();
      case UmlPackage.ASSOCIATION: return createAssociation();
      case UmlPackage.SUBSTITUTION: return createSubstitution();
      case UmlPackage.REALIZATION: return createRealization();
      case UmlPackage.ABSTRACTION: return createAbstraction();
      case UmlPackage.PARAMETER: return createParameter();
      case UmlPackage.PROPERTY: return createProperty();
      case UmlPackage.OPERATION: return createOperation();
      case UmlPackage.CLASS: return createClass();
      case UmlPackage.GENERALIZATION: return createGeneralization();
      case UmlPackage.MODEL: return createModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UmlPackage.VISIBILITY_KIND:
        return createVisibilityKindFromString(eDataType, initialValue);
      case UmlPackage.INTEGER:
        return createIntegerFromString(eDataType, initialValue);
      case UmlPackage.BOOLEAN:
        return createBooleanFromString(eDataType, initialValue);
      case UmlPackage.STRING:
        return createStringFromString(eDataType, initialValue);
      case UmlPackage.UNLIMITED_NATURAL:
        return createUnlimitedNaturalFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UmlPackage.VISIBILITY_KIND:
        return convertVisibilityKindToString(eDataType, instanceValue);
      case UmlPackage.INTEGER:
        return convertIntegerToString(eDataType, instanceValue);
      case UmlPackage.BOOLEAN:
        return convertBooleanToString(eDataType, instanceValue);
      case UmlPackage.STRING:
        return convertStringToString(eDataType, instanceValue);
      case UmlPackage.UNLIMITED_NATURAL:
        return convertUnlimitedNaturalToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comment createComment()
  {
    CommentImpl comment = new CommentImpl();
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uml.Package createPackage()
  {
    PackageImpl package_ = new PackageImpl();
    return package_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dependency createDependency()
  {
    DependencyImpl dependency = new DependencyImpl();
    return dependency;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementImport createElementImport()
  {
    ElementImportImpl elementImport = new ElementImportImpl();
    return elementImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageImport createPackageImport()
  {
    PackageImportImpl packageImport = new PackageImportImpl();
    return packageImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Substitution createSubstitution()
  {
    SubstitutionImpl substitution = new SubstitutionImpl();
    return substitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Realization createRealization()
  {
    RealizationImpl realization = new RealizationImpl();
    return realization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstraction createAbstraction()
  {
    AbstractionImpl abstraction = new AbstractionImpl();
    return abstraction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public uml.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Generalization createGeneralization()
  {
    GeneralizationImpl generalization = new GeneralizationImpl();
    return generalization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue)
  {
    VisibilityKind result = VisibilityKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createIntegerFromString(EDataType eDataType, String initialValue)
  {
    return (Integer)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertIntegerToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Boolean createBooleanFromString(EDataType eDataType, String initialValue)
  {
    return (Boolean)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBooleanToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String createStringFromString(EDataType eDataType, String initialValue)
  {
    return (String)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertStringToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Integer createUnlimitedNaturalFromString(EDataType eDataType, String initialValue)
  {
    return (Integer)super.createFromString(eDataType, initialValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue)
  {
    return super.convertToString(eDataType, instanceValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlPackage getUmlPackage()
  {
    return (UmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UmlPackage getPackage()
  {
    return UmlPackage.eINSTANCE;
  }

} //UmlFactoryImpl
