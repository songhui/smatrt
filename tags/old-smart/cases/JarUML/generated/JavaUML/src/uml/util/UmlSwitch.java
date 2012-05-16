/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

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
import uml.UmlPackage;
import uml.ValueSpecification;

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
 * @see uml.UmlPackage
 * @generated
 */
public class UmlSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static UmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = UmlPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case UmlPackage.COMMENT:
      {
        Comment comment = (Comment)theEObject;
        T result = caseComment(comment);
        if (result == null) result = caseElement(comment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.PACKAGE:
      {
        uml.Package package_ = (uml.Package)theEObject;
        T result = casePackage(package_);
        if (result == null) result = casePackageableElement(package_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.PACKAGEABLE_ELEMENT:
      {
        PackageableElement packageableElement = (PackageableElement)theEObject;
        T result = casePackageableElement(packageableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = caseElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = casePackageableElement(dependency);
        if (result == null) result = caseDirectedRelationship(dependency);
        if (result == null) result = caseRelationship(dependency);
        if (result == null) result = caseElement(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.DIRECTED_RELATIONSHIP:
      {
        DirectedRelationship directedRelationship = (DirectedRelationship)theEObject;
        T result = caseDirectedRelationship(directedRelationship);
        if (result == null) result = caseRelationship(directedRelationship);
        if (result == null) result = caseElement(directedRelationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = caseElement(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.NAMESPACE:
      {
        Namespace namespace = (Namespace)theEObject;
        T result = caseNamespace(namespace);
        if (result == null) result = caseNamedElement(namespace);
        if (result == null) result = caseElement(namespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.ELEMENT_IMPORT:
      {
        ElementImport elementImport = (ElementImport)theEObject;
        T result = caseElementImport(elementImport);
        if (result == null) result = caseDirectedRelationship(elementImport);
        if (result == null) result = caseRelationship(elementImport);
        if (result == null) result = caseElement(elementImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.PACKAGE_IMPORT:
      {
        PackageImport packageImport = (PackageImport)theEObject;
        T result = casePackageImport(packageImport);
        if (result == null) result = caseDirectedRelationship(packageImport);
        if (result == null) result = caseRelationship(packageImport);
        if (result == null) result = caseElement(packageImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.VALUE_SPECIFICATION:
      {
        ValueSpecification valueSpecification = (ValueSpecification)theEObject;
        T result = caseValueSpecification(valueSpecification);
        if (result == null) result = casePackageableElement(valueSpecification);
        if (result == null) result = caseTypedElement(valueSpecification);
        if (result == null) result = caseNamedElement(valueSpecification);
        if (result == null) result = caseElement(valueSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.TYPED_ELEMENT:
      {
        TypedElement typedElement = (TypedElement)theEObject;
        T result = caseTypedElement(typedElement);
        if (result == null) result = caseNamedElement(typedElement);
        if (result == null) result = caseElement(typedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = casePackageableElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseClassifier(association);
        if (result == null) result = caseRelationship(association);
        if (result == null) result = caseType(association);
        if (result == null) result = caseElement(association);
        if (result == null) result = casePackageableElement(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.CLASSIFIER:
      {
        Classifier classifier = (Classifier)theEObject;
        T result = caseClassifier(classifier);
        if (result == null) result = caseType(classifier);
        if (result == null) result = casePackageableElement(classifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.FEATURE:
      {
        Feature feature = (Feature)theEObject;
        T result = caseFeature(feature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.SUBSTITUTION:
      {
        Substitution substitution = (Substitution)theEObject;
        T result = caseSubstitution(substitution);
        if (result == null) result = caseRealization(substitution);
        if (result == null) result = caseAbstraction(substitution);
        if (result == null) result = caseDependency(substitution);
        if (result == null) result = casePackageableElement(substitution);
        if (result == null) result = caseDirectedRelationship(substitution);
        if (result == null) result = caseRelationship(substitution);
        if (result == null) result = caseElement(substitution);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.REALIZATION:
      {
        Realization realization = (Realization)theEObject;
        T result = caseRealization(realization);
        if (result == null) result = caseAbstraction(realization);
        if (result == null) result = caseDependency(realization);
        if (result == null) result = casePackageableElement(realization);
        if (result == null) result = caseDirectedRelationship(realization);
        if (result == null) result = caseRelationship(realization);
        if (result == null) result = caseElement(realization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.ABSTRACTION:
      {
        Abstraction abstraction = (Abstraction)theEObject;
        T result = caseAbstraction(abstraction);
        if (result == null) result = caseDependency(abstraction);
        if (result == null) result = casePackageableElement(abstraction);
        if (result == null) result = caseDirectedRelationship(abstraction);
        if (result == null) result = caseRelationship(abstraction);
        if (result == null) result = caseElement(abstraction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.OPERATION:
      {
        Operation operation = (Operation)theEObject;
        T result = caseOperation(operation);
        if (result == null) result = caseBehavioralFeature(operation);
        if (result == null) result = caseNamespace(operation);
        if (result == null) result = caseFeature(operation);
        if (result == null) result = caseNamedElement(operation);
        if (result == null) result = caseElement(operation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.BEHAVIORAL_FEATURE:
      {
        BehavioralFeature behavioralFeature = (BehavioralFeature)theEObject;
        T result = caseBehavioralFeature(behavioralFeature);
        if (result == null) result = caseNamespace(behavioralFeature);
        if (result == null) result = caseFeature(behavioralFeature);
        if (result == null) result = caseNamedElement(behavioralFeature);
        if (result == null) result = caseElement(behavioralFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.CLASS:
      {
        uml.Class class_ = (uml.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseClassifier(class_);
        if (result == null) result = caseType(class_);
        if (result == null) result = casePackageableElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.GENERALIZATION:
      {
        Generalization generalization = (Generalization)theEObject;
        T result = caseGeneralization(generalization);
        if (result == null) result = caseDirectedRelationship(generalization);
        if (result == null) result = caseRelationship(generalization);
        if (result == null) result = caseElement(generalization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case UmlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComment(Comment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage(uml.Package object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageableElement(PackageableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDirectedRelationship(DirectedRelationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelationship(Relationship object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace(Namespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementImport(ElementImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackageImport(PackageImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueSpecification(ValueSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedElement(TypedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassifier(Classifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeature(Feature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Substitution</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substitution</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubstitution(Substitution object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRealization(Realization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstraction(Abstraction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOperation(Operation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBehavioralFeature(BehavioralFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(uml.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneralization(Generalization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //UmlSwitch
