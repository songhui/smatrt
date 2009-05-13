/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see uml.UmlFactory
 * @model kind="package"
 * @generated
 */
public interface UmlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "uml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sei.pku.edu.cn/simpleUML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "uml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  UmlPackage eINSTANCE = uml.impl.UmlPackageImpl.init();

  /**
   * The meta object id for the '{@link uml.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ElementImpl
   * @see uml.impl.UmlPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__OWNED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__OWNER = 1;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT__OWNED_COMMENT = 2;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link uml.impl.CommentImpl <em>Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.CommentImpl
   * @see uml.impl.UmlPackageImpl#getComment()
   * @generated
   */
  int COMMENT = 0;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__OWNER = ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Body</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__BODY = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Annotated Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT__ANNOTATED_ELEMENT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uml.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.PackageableElementImpl
   * @see uml.impl.UmlPackageImpl#getPackageableElement()
   * @generated
   */
  int PACKAGEABLE_ELEMENT = 3;

  /**
   * The number of structural features of the '<em>Packageable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGEABLE_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uml.impl.PackageImpl <em>Package</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.PackageImpl
   * @see uml.impl.UmlPackageImpl#getPackage()
   * @generated
   */
  int PACKAGE = 2;

  /**
   * The feature id for the '<em><b>Owned Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__OWNED_TYPE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE__PACKAGED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uml.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.NamedElementImpl
   * @see uml.impl.UmlPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__OWNER = ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__VISIBILITY = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__QUALIFIED_NAME = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__CLIENT_DEPENDENCY = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAMESPACE = ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uml.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.DependencyImpl
   * @see uml.impl.UmlPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 5;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__OWNED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__OWNER = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__OWNED_COMMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__RELATED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__SOURCE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__TARGET = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__SUPPLIER = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Client</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__CLIENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link uml.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.RelationshipImpl
   * @see uml.impl.UmlPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 7;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__OWNED_ELEMENT = ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__OWNER = ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__OWNED_COMMENT = ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__RELATED_ELEMENT = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uml.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.DirectedRelationshipImpl
   * @see uml.impl.UmlPackageImpl#getDirectedRelationship()
   * @generated
   */
  int DIRECTED_RELATIONSHIP = 6;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__OWNED_ELEMENT = RELATIONSHIP__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__OWNER = RELATIONSHIP__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__OWNED_COMMENT = RELATIONSHIP__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__RELATED_ELEMENT = RELATIONSHIP__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__SOURCE = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP__TARGET = RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Directed Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uml.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.NamespaceImpl
   * @see uml.impl.UmlPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 8;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__OWNER = NAMED_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__CLIENT_DEPENDENCY = NAMED_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__ELEMENT_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__PACKAGE_IMPORT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__IMPORTED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__OWNED_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uml.impl.ElementImportImpl <em>Element Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ElementImportImpl
   * @see uml.impl.UmlPackageImpl#getElementImport()
   * @generated
   */
  int ELEMENT_IMPORT = 9;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__OWNER = DIRECTED_RELATIONSHIP__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__TARGET = DIRECTED_RELATIONSHIP__TARGET;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__VISIBILITY = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__ALIAS = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Imported Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__IMPORTED_ELEMENT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT__IMPORTING_NAMESPACE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Element Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_IMPORT_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link uml.impl.PackageImportImpl <em>Package Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.PackageImportImpl
   * @see uml.impl.UmlPackageImpl#getPackageImport()
   * @generated
   */
  int PACKAGE_IMPORT = 10;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__OWNER = DIRECTED_RELATIONSHIP__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__TARGET = DIRECTED_RELATIONSHIP__TARGET;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__VISIBILITY = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imported Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__IMPORTED_PACKAGE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importing Namespace</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT__IMPORTING_NAMESPACE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Package Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_IMPORT_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uml.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ValueSpecificationImpl
   * @see uml.impl.UmlPackageImpl#getValueSpecification()
   * @generated
   */
  int VALUE_SPECIFICATION = 11;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__OWNED_ELEMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__OWNER = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__OWNED_COMMENT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__VISIBILITY = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__QUALIFIED_NAME = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__CLIENT_DEPENDENCY = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__NAMESPACE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION__TYPE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Value Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_SPECIFICATION_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.TypedElementImpl
   * @see uml.impl.UmlPackageImpl#getTypedElement()
   * @generated
   */
  int TYPED_ELEMENT = 12;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__OWNED_ELEMENT = NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__OWNER = NAMED_ELEMENT__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__OWNED_COMMENT = NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__VISIBILITY = NAMED_ELEMENT__VISIBILITY;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__QUALIFIED_NAME = NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__CLIENT_DEPENDENCY = NAMED_ELEMENT__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__NAMESPACE = NAMED_ELEMENT__NAMESPACE;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uml.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.TypeImpl
   * @see uml.impl.UmlPackageImpl#getType()
   * @generated
   */
  int TYPE = 13;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PACKAGE = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = PACKAGEABLE_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link uml.impl.ClassifierImpl <em>Classifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ClassifierImpl
   * @see uml.impl.UmlPackageImpl#getClassifier()
   * @generated
   */
  int CLASSIFIER = 15;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__PACKAGE = TYPE__PACKAGE;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__IS_ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__FEATURE = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__INHERITED_MEMBER = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__REDEFINED_CLASSIFIER = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__GENERAL = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__SUBSTITUTION = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER__ATTRIBUTE = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Classifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASSIFIER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link uml.impl.AssociationImpl <em>Association</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.AssociationImpl
   * @see uml.impl.UmlPackageImpl#getAssociation()
   * @generated
   */
  int ASSOCIATION = 14;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__PACKAGE = CLASSIFIER__PACKAGE;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__FEATURE = CLASSIFIER__FEATURE;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__INHERITED_MEMBER = CLASSIFIER__INHERITED_MEMBER;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__REDEFINED_CLASSIFIER = CLASSIFIER__REDEFINED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__GENERAL = CLASSIFIER__GENERAL;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__SUBSTITUTION = CLASSIFIER__SUBSTITUTION;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__OWNED_ELEMENT = CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__OWNER = CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__OWNED_COMMENT = CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__RELATED_ELEMENT = CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned End</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__OWNED_END = CLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Member End</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__MEMBER_END = CLASSIFIER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Is Derived</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__IS_DERIVED = CLASSIFIER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>End Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__END_TYPE = CLASSIFIER_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Navigable Owned End</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION__NAVIGABLE_OWNED_END = CLASSIFIER_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Association</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSOCIATION_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link uml.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.FeatureImpl
   * @see uml.impl.UmlPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 16;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__IS_STATIC = 0;

  /**
   * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__FEATURING_CLASSIFIER = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uml.impl.AbstractionImpl <em>Abstraction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.AbstractionImpl
   * @see uml.impl.UmlPackageImpl#getAbstraction()
   * @generated
   */
  int ABSTRACTION = 19;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__OWNED_ELEMENT = DEPENDENCY__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__OWNER = DEPENDENCY__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__OWNED_COMMENT = DEPENDENCY__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__RELATED_ELEMENT = DEPENDENCY__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__SOURCE = DEPENDENCY__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__TARGET = DEPENDENCY__TARGET;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__SUPPLIER = DEPENDENCY__SUPPLIER;

  /**
   * The feature id for the '<em><b>Client</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION__CLIENT = DEPENDENCY__CLIENT;

  /**
   * The number of structural features of the '<em>Abstraction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACTION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.RealizationImpl <em>Realization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.RealizationImpl
   * @see uml.impl.UmlPackageImpl#getRealization()
   * @generated
   */
  int REALIZATION = 18;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__OWNED_ELEMENT = ABSTRACTION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__OWNER = ABSTRACTION__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__OWNED_COMMENT = ABSTRACTION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__RELATED_ELEMENT = ABSTRACTION__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__SOURCE = ABSTRACTION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__TARGET = ABSTRACTION__TARGET;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__SUPPLIER = ABSTRACTION__SUPPLIER;

  /**
   * The feature id for the '<em><b>Client</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION__CLIENT = ABSTRACTION__CLIENT;

  /**
   * The number of structural features of the '<em>Realization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REALIZATION_FEATURE_COUNT = ABSTRACTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link uml.impl.SubstitutionImpl <em>Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.SubstitutionImpl
   * @see uml.impl.UmlPackageImpl#getSubstitution()
   * @generated
   */
  int SUBSTITUTION = 17;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__OWNED_ELEMENT = REALIZATION__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__OWNER = REALIZATION__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__OWNED_COMMENT = REALIZATION__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__RELATED_ELEMENT = REALIZATION__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__SOURCE = REALIZATION__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__TARGET = REALIZATION__TARGET;

  /**
   * The feature id for the '<em><b>Supplier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__SUPPLIER = REALIZATION__SUPPLIER;

  /**
   * The feature id for the '<em><b>Client</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__CLIENT = REALIZATION__CLIENT;

  /**
   * The feature id for the '<em><b>Contract</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__CONTRACT = REALIZATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Substituting Classifier</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION__SUBSTITUTING_CLASSIFIER = REALIZATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Substitution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBSTITUTION_FEATURE_COUNT = REALIZATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uml.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ParameterImpl
   * @see uml.impl.UmlPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 20;

  /**
   * The feature id for the '<em><b>Operation</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__OPERATION = 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULT = 1;

  /**
   * The feature id for the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__DEFAULT_VALUE = 2;

  /**
   * The feature id for the '<em><b>Is Exception</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__IS_EXCEPTION = 3;

  /**
   * The feature id for the '<em><b>Is Stream</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__IS_STREAM = 4;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link uml.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.PropertyImpl
   * @see uml.impl.UmlPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.BehavioralFeatureImpl
   * @see uml.impl.UmlPackageImpl#getBehavioralFeature()
   * @generated
   */
  int BEHAVIORAL_FEATURE = 23;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__OWNED_ELEMENT = NAMESPACE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__OWNER = NAMESPACE__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__OWNED_COMMENT = NAMESPACE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__NAME = NAMESPACE__NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__VISIBILITY = NAMESPACE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__QUALIFIED_NAME = NAMESPACE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY = NAMESPACE__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__NAMESPACE = NAMESPACE__NAMESPACE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__ELEMENT_IMPORT = NAMESPACE__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__PACKAGE_IMPORT = NAMESPACE__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__MEMBER = NAMESPACE__MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__IMPORTED_MEMBER = NAMESPACE__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__OWNED_MEMBER = NAMESPACE__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__IS_STATIC = NAMESPACE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER = NAMESPACE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__OWNED_PARAMETER = NAMESPACE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__IS_ABSTRACT = NAMESPACE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE__RAISED_EXCEPTION = NAMESPACE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Behavioral Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEHAVIORAL_FEATURE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link uml.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.OperationImpl
   * @see uml.impl.UmlPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 22;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNED_ELEMENT = BEHAVIORAL_FEATURE__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNER = BEHAVIORAL_FEATURE__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNED_COMMENT = BEHAVIORAL_FEATURE__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = BEHAVIORAL_FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Visibility</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__VISIBILITY = BEHAVIORAL_FEATURE__VISIBILITY;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__QUALIFIED_NAME = BEHAVIORAL_FEATURE__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CLIENT_DEPENDENCY = BEHAVIORAL_FEATURE__CLIENT_DEPENDENCY;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAMESPACE = BEHAVIORAL_FEATURE__NAMESPACE;

  /**
   * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ELEMENT_IMPORT = BEHAVIORAL_FEATURE__ELEMENT_IMPORT;

  /**
   * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PACKAGE_IMPORT = BEHAVIORAL_FEATURE__PACKAGE_IMPORT;

  /**
   * The feature id for the '<em><b>Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__MEMBER = BEHAVIORAL_FEATURE__MEMBER;

  /**
   * The feature id for the '<em><b>Imported Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IMPORTED_MEMBER = BEHAVIORAL_FEATURE__IMPORTED_MEMBER;

  /**
   * The feature id for the '<em><b>Owned Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNED_MEMBER = BEHAVIORAL_FEATURE__OWNED_MEMBER;

  /**
   * The feature id for the '<em><b>Is Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_STATIC = BEHAVIORAL_FEATURE__IS_STATIC;

  /**
   * The feature id for the '<em><b>Featuring Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__FEATURING_CLASSIFIER = BEHAVIORAL_FEATURE__FEATURING_CLASSIFIER;

  /**
   * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OWNED_PARAMETER = BEHAVIORAL_FEATURE__OWNED_PARAMETER;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_ABSTRACT = BEHAVIORAL_FEATURE__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Raised Exception</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__RAISED_EXCEPTION = BEHAVIORAL_FEATURE__RAISED_EXCEPTION;

  /**
   * The feature id for the '<em><b>Class</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__CLASS = BEHAVIORAL_FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Is Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_QUERY = BEHAVIORAL_FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Ordered</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_ORDERED = BEHAVIORAL_FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Unique</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_UNIQUE = BEHAVIORAL_FEATURE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Lower</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__LOWER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Upper</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__UPPER = BEHAVIORAL_FEATURE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Redefined Operation</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__REDEFINED_OPERATION = BEHAVIORAL_FEATURE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = BEHAVIORAL_FEATURE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link uml.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ClassImpl
   * @see uml.impl.UmlPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 24;

  /**
   * The feature id for the '<em><b>Package</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__PACKAGE = CLASSIFIER__PACKAGE;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_ABSTRACT = CLASSIFIER__IS_ABSTRACT;

  /**
   * The feature id for the '<em><b>Feature</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FEATURE = CLASSIFIER__FEATURE;

  /**
   * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__INHERITED_MEMBER = CLASSIFIER__INHERITED_MEMBER;

  /**
   * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__REDEFINED_CLASSIFIER = CLASSIFIER__REDEFINED_CLASSIFIER;

  /**
   * The feature id for the '<em><b>General</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__GENERAL = CLASSIFIER__GENERAL;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUBSTITUTION = CLASSIFIER__SUBSTITUTION;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__ATTRIBUTE = CLASSIFIER__ATTRIBUTE;

  /**
   * The feature id for the '<em><b>Nested Classifier</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NESTED_CLASSIFIER = CLASSIFIER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__OWNED_OPERATION = CLASSIFIER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Class</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER_CLASS = CLASSIFIER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_ACTIVE = CLASSIFIER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__OWNED_ATTRIBUTE = CLASSIFIER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = CLASSIFIER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__GENERALIZATION = CLASSIFIER_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link uml.impl.GeneralizationImpl <em>Generalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.GeneralizationImpl
   * @see uml.impl.UmlPackageImpl#getGeneralization()
   * @generated
   */
  int GENERALIZATION = 25;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__OWNED_ELEMENT = DIRECTED_RELATIONSHIP__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__OWNER = DIRECTED_RELATIONSHIP__OWNER;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__OWNED_COMMENT = DIRECTED_RELATIONSHIP__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Related Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__RELATED_ELEMENT = DIRECTED_RELATIONSHIP__RELATED_ELEMENT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__SOURCE = DIRECTED_RELATIONSHIP__SOURCE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__TARGET = DIRECTED_RELATIONSHIP__TARGET;

  /**
   * The feature id for the '<em><b>Is Substitutable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__IS_SUBSTITUTABLE = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>General</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__GENERAL = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specific</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION__SPECIFIC = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Generalization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GENERALIZATION_FEATURE_COUNT = DIRECTED_RELATIONSHIP_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uml.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.ModelImpl
   * @see uml.impl.UmlPackageImpl#getModel()
   * @generated
   */
  int MODEL = 26;

  /**
   * The feature id for the '<em><b>Packaged Element</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PACKAGED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uml.VisibilityKind <em>Visibility Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.VisibilityKind
   * @see uml.impl.UmlPackageImpl#getVisibilityKind()
   * @generated
   */
  int VISIBILITY_KIND = 27;

  /**
   * The meta object id for the '<em>Integer</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.UmlPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 28;

  /**
   * The meta object id for the '<em>Boolean</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.UmlPackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 29;

  /**
   * The meta object id for the '<em>String</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see java.lang.String
   * @see uml.impl.UmlPackageImpl#getString()
   * @generated
   */
  int STRING = 30;

  /**
   * The meta object id for the '<em>Unlimited Natural</em>' data type.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uml.impl.UmlPackageImpl#getUnlimitedNatural()
   * @generated
   */
  int UNLIMITED_NATURAL = 31;


  /**
   * Returns the meta object for class '{@link uml.Comment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comment</em>'.
   * @see uml.Comment
   * @generated
   */
  EClass getComment();

  /**
   * Returns the meta object for the attribute '{@link uml.Comment#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Body</em>'.
   * @see uml.Comment#getBody()
   * @see #getComment()
   * @generated
   */
  EAttribute getComment_Body();

  /**
   * Returns the meta object for the reference list '{@link uml.Comment#getAnnotatedElement <em>Annotated Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Annotated Element</em>'.
   * @see uml.Comment#getAnnotatedElement()
   * @see #getComment()
   * @generated
   */
  EReference getComment_AnnotatedElement();

  /**
   * Returns the meta object for class '{@link uml.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see uml.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for the reference list '{@link uml.Element#getOwnedElement <em>Owned Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Owned Element</em>'.
   * @see uml.Element#getOwnedElement()
   * @see #getElement()
   * @generated
   */
  EReference getElement_OwnedElement();

  /**
   * Returns the meta object for the reference '{@link uml.Element#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Owner</em>'.
   * @see uml.Element#getOwner()
   * @see #getElement()
   * @generated
   */
  EReference getElement_Owner();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Element#getOwnedComment <em>Owned Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Comment</em>'.
   * @see uml.Element#getOwnedComment()
   * @see #getElement()
   * @generated
   */
  EReference getElement_OwnedComment();

  /**
   * Returns the meta object for class '{@link uml.Package <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package</em>'.
   * @see uml.Package
   * @generated
   */
  EClass getPackage();

  /**
   * Returns the meta object for the reference list '{@link uml.Package#getOwnedType <em>Owned Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Owned Type</em>'.
   * @see uml.Package#getOwnedType()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_OwnedType();

  /**
   * Returns the meta object for the attribute '{@link uml.Package#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uml.Package#getName()
   * @see #getPackage()
   * @generated
   */
  EAttribute getPackage_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Package#getPackagedElement <em>Packaged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
   * @see uml.Package#getPackagedElement()
   * @see #getPackage()
   * @generated
   */
  EReference getPackage_PackagedElement();

  /**
   * Returns the meta object for class '{@link uml.PackageableElement <em>Packageable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Packageable Element</em>'.
   * @see uml.PackageableElement
   * @generated
   */
  EClass getPackageableElement();

  /**
   * Returns the meta object for class '{@link uml.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see uml.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link uml.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uml.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for the attribute '{@link uml.NamedElement#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see uml.NamedElement#getVisibility()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Visibility();

  /**
   * Returns the meta object for the attribute '{@link uml.NamedElement#getQualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Qualified Name</em>'.
   * @see uml.NamedElement#getQualifiedName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_QualifiedName();

  /**
   * Returns the meta object for the reference list '{@link uml.NamedElement#getClientDependency <em>Client Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Client Dependency</em>'.
   * @see uml.NamedElement#getClientDependency()
   * @see #getNamedElement()
   * @generated
   */
  EReference getNamedElement_ClientDependency();

  /**
   * Returns the meta object for the reference '{@link uml.NamedElement#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Namespace</em>'.
   * @see uml.NamedElement#getNamespace()
   * @see #getNamedElement()
   * @generated
   */
  EReference getNamedElement_Namespace();

  /**
   * Returns the meta object for class '{@link uml.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see uml.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference list '{@link uml.Dependency#getSupplier <em>Supplier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Supplier</em>'.
   * @see uml.Dependency#getSupplier()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Supplier();

  /**
   * Returns the meta object for the reference list '{@link uml.Dependency#getClient <em>Client</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Client</em>'.
   * @see uml.Dependency#getClient()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Client();

  /**
   * Returns the meta object for class '{@link uml.DirectedRelationship <em>Directed Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directed Relationship</em>'.
   * @see uml.DirectedRelationship
   * @generated
   */
  EClass getDirectedRelationship();

  /**
   * Returns the meta object for the reference list '{@link uml.DirectedRelationship#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Source</em>'.
   * @see uml.DirectedRelationship#getSource()
   * @see #getDirectedRelationship()
   * @generated
   */
  EReference getDirectedRelationship_Source();

  /**
   * Returns the meta object for the reference list '{@link uml.DirectedRelationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Target</em>'.
   * @see uml.DirectedRelationship#getTarget()
   * @see #getDirectedRelationship()
   * @generated
   */
  EReference getDirectedRelationship_Target();

  /**
   * Returns the meta object for class '{@link uml.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see uml.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the reference list '{@link uml.Relationship#getRelatedElement <em>Related Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Related Element</em>'.
   * @see uml.Relationship#getRelatedElement()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_RelatedElement();

  /**
   * Returns the meta object for class '{@link uml.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see uml.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Namespace#getElementImport <em>Element Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Element Import</em>'.
   * @see uml.Namespace#getElementImport()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_ElementImport();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Namespace#getPackageImport <em>Package Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Package Import</em>'.
   * @see uml.Namespace#getPackageImport()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_PackageImport();

  /**
   * Returns the meta object for the reference list '{@link uml.Namespace#getMember <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Member</em>'.
   * @see uml.Namespace#getMember()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_Member();

  /**
   * Returns the meta object for the reference list '{@link uml.Namespace#getImportedMember <em>Imported Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Member</em>'.
   * @see uml.Namespace#getImportedMember()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_ImportedMember();

  /**
   * Returns the meta object for the reference list '{@link uml.Namespace#getOwnedMember <em>Owned Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Owned Member</em>'.
   * @see uml.Namespace#getOwnedMember()
   * @see #getNamespace()
   * @generated
   */
  EReference getNamespace_OwnedMember();

  /**
   * Returns the meta object for class '{@link uml.ElementImport <em>Element Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Import</em>'.
   * @see uml.ElementImport
   * @generated
   */
  EClass getElementImport();

  /**
   * Returns the meta object for the attribute '{@link uml.ElementImport#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see uml.ElementImport#getVisibility()
   * @see #getElementImport()
   * @generated
   */
  EAttribute getElementImport_Visibility();

  /**
   * Returns the meta object for the attribute '{@link uml.ElementImport#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see uml.ElementImport#getAlias()
   * @see #getElementImport()
   * @generated
   */
  EAttribute getElementImport_Alias();

  /**
   * Returns the meta object for the reference '{@link uml.ElementImport#getImportedElement <em>Imported Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Element</em>'.
   * @see uml.ElementImport#getImportedElement()
   * @see #getElementImport()
   * @generated
   */
  EReference getElementImport_ImportedElement();

  /**
   * Returns the meta object for the container reference '{@link uml.ElementImport#getImportingNamespace <em>Importing Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Importing Namespace</em>'.
   * @see uml.ElementImport#getImportingNamespace()
   * @see #getElementImport()
   * @generated
   */
  EReference getElementImport_ImportingNamespace();

  /**
   * Returns the meta object for class '{@link uml.PackageImport <em>Package Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package Import</em>'.
   * @see uml.PackageImport
   * @generated
   */
  EClass getPackageImport();

  /**
   * Returns the meta object for the attribute '{@link uml.PackageImport#getVisibility <em>Visibility</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Visibility</em>'.
   * @see uml.PackageImport#getVisibility()
   * @see #getPackageImport()
   * @generated
   */
  EAttribute getPackageImport_Visibility();

  /**
   * Returns the meta object for the reference '{@link uml.PackageImport#getImportedPackage <em>Imported Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Package</em>'.
   * @see uml.PackageImport#getImportedPackage()
   * @see #getPackageImport()
   * @generated
   */
  EReference getPackageImport_ImportedPackage();

  /**
   * Returns the meta object for the container reference '{@link uml.PackageImport#getImportingNamespace <em>Importing Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Importing Namespace</em>'.
   * @see uml.PackageImport#getImportingNamespace()
   * @see #getPackageImport()
   * @generated
   */
  EReference getPackageImport_ImportingNamespace();

  /**
   * Returns the meta object for class '{@link uml.ValueSpecification <em>Value Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Specification</em>'.
   * @see uml.ValueSpecification
   * @generated
   */
  EClass getValueSpecification();

  /**
   * Returns the meta object for class '{@link uml.TypedElement <em>Typed Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Element</em>'.
   * @see uml.TypedElement
   * @generated
   */
  EClass getTypedElement();

  /**
   * Returns the meta object for the reference '{@link uml.TypedElement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see uml.TypedElement#getType()
   * @see #getTypedElement()
   * @generated
   */
  EReference getTypedElement_Type();

  /**
   * Returns the meta object for class '{@link uml.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see uml.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the reference '{@link uml.Type#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Package</em>'.
   * @see uml.Type#getPackage()
   * @see #getType()
   * @generated
   */
  EReference getType_Package();

  /**
   * Returns the meta object for class '{@link uml.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Association</em>'.
   * @see uml.Association
   * @generated
   */
  EClass getAssociation();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Association#getOwnedEnd <em>Owned End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned End</em>'.
   * @see uml.Association#getOwnedEnd()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_OwnedEnd();

  /**
   * Returns the meta object for the reference list '{@link uml.Association#getMemberEnd <em>Member End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Member End</em>'.
   * @see uml.Association#getMemberEnd()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_MemberEnd();

  /**
   * Returns the meta object for the attribute '{@link uml.Association#isIsDerived <em>Is Derived</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Derived</em>'.
   * @see uml.Association#isIsDerived()
   * @see #getAssociation()
   * @generated
   */
  EAttribute getAssociation_IsDerived();

  /**
   * Returns the meta object for the reference list '{@link uml.Association#getEndType <em>End Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>End Type</em>'.
   * @see uml.Association#getEndType()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_EndType();

  /**
   * Returns the meta object for the reference list '{@link uml.Association#getNavigableOwnedEnd <em>Navigable Owned End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Navigable Owned End</em>'.
   * @see uml.Association#getNavigableOwnedEnd()
   * @see #getAssociation()
   * @generated
   */
  EReference getAssociation_NavigableOwnedEnd();

  /**
   * Returns the meta object for class '{@link uml.Classifier <em>Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Classifier</em>'.
   * @see uml.Classifier
   * @generated
   */
  EClass getClassifier();

  /**
   * Returns the meta object for the attribute '{@link uml.Classifier#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see uml.Classifier#isIsAbstract()
   * @see #getClassifier()
   * @generated
   */
  EAttribute getClassifier_IsAbstract();

  /**
   * Returns the meta object for the reference list '{@link uml.Classifier#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Feature</em>'.
   * @see uml.Classifier#getFeature()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Feature();

  /**
   * Returns the meta object for the reference list '{@link uml.Classifier#getInheritedMember <em>Inherited Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Inherited Member</em>'.
   * @see uml.Classifier#getInheritedMember()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_InheritedMember();

  /**
   * Returns the meta object for the reference list '{@link uml.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Redefined Classifier</em>'.
   * @see uml.Classifier#getRedefinedClassifier()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_RedefinedClassifier();

  /**
   * Returns the meta object for the reference list '{@link uml.Classifier#getGeneral <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>General</em>'.
   * @see uml.Classifier#getGeneral()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_General();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Classifier#getSubstitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Substitution</em>'.
   * @see uml.Classifier#getSubstitution()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Substitution();

  /**
   * Returns the meta object for the reference list '{@link uml.Classifier#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Attribute</em>'.
   * @see uml.Classifier#getAttribute()
   * @see #getClassifier()
   * @generated
   */
  EReference getClassifier_Attribute();

  /**
   * Returns the meta object for class '{@link uml.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see uml.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link uml.Feature#isIsStatic <em>Is Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Static</em>'.
   * @see uml.Feature#isIsStatic()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_IsStatic();

  /**
   * Returns the meta object for the reference list '{@link uml.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Featuring Classifier</em>'.
   * @see uml.Feature#getFeaturingClassifier()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_FeaturingClassifier();

  /**
   * Returns the meta object for class '{@link uml.Substitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substitution</em>'.
   * @see uml.Substitution
   * @generated
   */
  EClass getSubstitution();

  /**
   * Returns the meta object for the reference '{@link uml.Substitution#getContract <em>Contract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contract</em>'.
   * @see uml.Substitution#getContract()
   * @see #getSubstitution()
   * @generated
   */
  EReference getSubstitution_Contract();

  /**
   * Returns the meta object for the container reference '{@link uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Substituting Classifier</em>'.
   * @see uml.Substitution#getSubstitutingClassifier()
   * @see #getSubstitution()
   * @generated
   */
  EReference getSubstitution_SubstitutingClassifier();

  /**
   * Returns the meta object for class '{@link uml.Realization <em>Realization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Realization</em>'.
   * @see uml.Realization
   * @generated
   */
  EClass getRealization();

  /**
   * Returns the meta object for class '{@link uml.Abstraction <em>Abstraction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstraction</em>'.
   * @see uml.Abstraction
   * @generated
   */
  EClass getAbstraction();

  /**
   * Returns the meta object for class '{@link uml.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see uml.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the reference '{@link uml.Parameter#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Operation</em>'.
   * @see uml.Parameter#getOperation()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Operation();

  /**
   * Returns the meta object for the attribute '{@link uml.Parameter#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see uml.Parameter#getDefault()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Default();

  /**
   * Returns the meta object for the containment reference '{@link uml.Parameter#getDefaultValue <em>Default Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Value</em>'.
   * @see uml.Parameter#getDefaultValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_DefaultValue();

  /**
   * Returns the meta object for the attribute '{@link uml.Parameter#isIsException <em>Is Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Exception</em>'.
   * @see uml.Parameter#isIsException()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_IsException();

  /**
   * Returns the meta object for the attribute '{@link uml.Parameter#isIsStream <em>Is Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Stream</em>'.
   * @see uml.Parameter#isIsStream()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_IsStream();

  /**
   * Returns the meta object for class '{@link uml.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see uml.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the reference '{@link uml.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see uml.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link uml.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uml.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link uml.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see uml.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the container reference '{@link uml.Operation#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Class</em>'.
   * @see uml.Operation#getClass_()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Class();

  /**
   * Returns the meta object for the attribute '{@link uml.Operation#isIsQuery <em>Is Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Query</em>'.
   * @see uml.Operation#isIsQuery()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_IsQuery();

  /**
   * Returns the meta object for the attribute '{@link uml.Operation#isIsOrdered <em>Is Ordered</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Ordered</em>'.
   * @see uml.Operation#isIsOrdered()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_IsOrdered();

  /**
   * Returns the meta object for the attribute '{@link uml.Operation#isIsUnique <em>Is Unique</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Unique</em>'.
   * @see uml.Operation#isIsUnique()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_IsUnique();

  /**
   * Returns the meta object for the attribute '{@link uml.Operation#getLower <em>Lower</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lower</em>'.
   * @see uml.Operation#getLower()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Lower();

  /**
   * Returns the meta object for the attribute '{@link uml.Operation#getUpper <em>Upper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upper</em>'.
   * @see uml.Operation#getUpper()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Upper();

  /**
   * Returns the meta object for the reference list '{@link uml.Operation#getRedefinedOperation <em>Redefined Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Redefined Operation</em>'.
   * @see uml.Operation#getRedefinedOperation()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_RedefinedOperation();

  /**
   * Returns the meta object for class '{@link uml.BehavioralFeature <em>Behavioral Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Behavioral Feature</em>'.
   * @see uml.BehavioralFeature
   * @generated
   */
  EClass getBehavioralFeature();

  /**
   * Returns the meta object for the containment reference list '{@link uml.BehavioralFeature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
   * @see uml.BehavioralFeature#getOwnedParameter()
   * @see #getBehavioralFeature()
   * @generated
   */
  EReference getBehavioralFeature_OwnedParameter();

  /**
   * Returns the meta object for the attribute '{@link uml.BehavioralFeature#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see uml.BehavioralFeature#isIsAbstract()
   * @see #getBehavioralFeature()
   * @generated
   */
  EAttribute getBehavioralFeature_IsAbstract();

  /**
   * Returns the meta object for the reference list '{@link uml.BehavioralFeature#getRaisedException <em>Raised Exception</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Raised Exception</em>'.
   * @see uml.BehavioralFeature#getRaisedException()
   * @see #getBehavioralFeature()
   * @generated
   */
  EReference getBehavioralFeature_RaisedException();

  /**
   * Returns the meta object for class '{@link uml.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see uml.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Class#getNestedClassifier <em>Nested Classifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nested Classifier</em>'.
   * @see uml.Class#getNestedClassifier()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_NestedClassifier();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Class#getOwnedOperation <em>Owned Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Operation</em>'.
   * @see uml.Class#getOwnedOperation()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_OwnedOperation();

  /**
   * Returns the meta object for the reference list '{@link uml.Class#getSuperClass <em>Super Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Super Class</em>'.
   * @see uml.Class#getSuperClass()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_SuperClass();

  /**
   * Returns the meta object for the attribute '{@link uml.Class#isIsActive <em>Is Active</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Active</em>'.
   * @see uml.Class#isIsActive()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsActive();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Class#getOwnedAttribute <em>Owned Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Attribute</em>'.
   * @see uml.Class#getOwnedAttribute()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_OwnedAttribute();

  /**
   * Returns the meta object for the attribute '{@link uml.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uml.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Class#getGeneralization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Generalization</em>'.
   * @see uml.Class#getGeneralization()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Generalization();

  /**
   * Returns the meta object for class '{@link uml.Generalization <em>Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalization</em>'.
   * @see uml.Generalization
   * @generated
   */
  EClass getGeneralization();

  /**
   * Returns the meta object for the attribute '{@link uml.Generalization#isIsSubstitutable <em>Is Substitutable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Substitutable</em>'.
   * @see uml.Generalization#isIsSubstitutable()
   * @see #getGeneralization()
   * @generated
   */
  EAttribute getGeneralization_IsSubstitutable();

  /**
   * Returns the meta object for the reference '{@link uml.Generalization#getGeneral <em>General</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>General</em>'.
   * @see uml.Generalization#getGeneral()
   * @see #getGeneralization()
   * @generated
   */
  EReference getGeneralization_General();

  /**
   * Returns the meta object for the reference '{@link uml.Generalization#getSpecific <em>Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Specific</em>'.
   * @see uml.Generalization#getSpecific()
   * @see #getGeneralization()
   * @generated
   */
  EReference getGeneralization_Specific();

  /**
   * Returns the meta object for class '{@link uml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see uml.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link uml.Model#getPackagedElement <em>Packaged Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Packaged Element</em>'.
   * @see uml.Model#getPackagedElement()
   * @see #getModel()
   * @generated
   */
  EReference getModel_PackagedElement();

  /**
   * Returns the meta object for the attribute '{@link uml.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uml.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for enum '{@link uml.VisibilityKind <em>Visibility Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Visibility Kind</em>'.
   * @see uml.VisibilityKind
   * @generated
   */
  EEnum getVisibilityKind();

  /**
   * Returns the meta object for data type '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Integer</em>'.
   * @model instanceClass="int"
   * @generated
   */
  EDataType getInteger();

  /**
   * Returns the meta object for data type '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Boolean</em>'.
   * @model instanceClass="boolean"
   * @generated
   */
  EDataType getBoolean();

  /**
   * Returns the meta object for data type '{@link java.lang.String <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>String</em>'.
   * @see java.lang.String
   * @model instanceClass="java.lang.String"
   * @generated
   */
  EDataType getString();

  /**
   * Returns the meta object for data type '<em>Unlimited Natural</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for data type '<em>Unlimited Natural</em>'.
   * @model instanceClass="int"
   * @generated
   */
  EDataType getUnlimitedNatural();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  UmlFactory getUmlFactory();

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
     * The meta object literal for the '{@link uml.impl.CommentImpl <em>Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.CommentImpl
     * @see uml.impl.UmlPackageImpl#getComment()
     * @generated
     */
    EClass COMMENT = eINSTANCE.getComment();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

    /**
     * The meta object literal for the '<em><b>Annotated Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMENT__ANNOTATED_ELEMENT = eINSTANCE.getComment_AnnotatedElement();

    /**
     * The meta object literal for the '{@link uml.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ElementImpl
     * @see uml.impl.UmlPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '<em><b>Owned Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__OWNED_ELEMENT = eINSTANCE.getElement_OwnedElement();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__OWNER = eINSTANCE.getElement_Owner();

    /**
     * The meta object literal for the '<em><b>Owned Comment</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT__OWNED_COMMENT = eINSTANCE.getElement_OwnedComment();

    /**
     * The meta object literal for the '{@link uml.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackageImpl
     * @see uml.impl.UmlPackageImpl#getPackage()
     * @generated
     */
    EClass PACKAGE = eINSTANCE.getPackage();

    /**
     * The meta object literal for the '<em><b>Owned Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__OWNED_TYPE = eINSTANCE.getPackage_OwnedType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

    /**
     * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE__PACKAGED_ELEMENT = eINSTANCE.getPackage_PackagedElement();

    /**
     * The meta object literal for the '{@link uml.impl.PackageableElementImpl <em>Packageable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackageableElementImpl
     * @see uml.impl.UmlPackageImpl#getPackageableElement()
     * @generated
     */
    EClass PACKAGEABLE_ELEMENT = eINSTANCE.getPackageableElement();

    /**
     * The meta object literal for the '{@link uml.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.NamedElementImpl
     * @see uml.impl.UmlPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__VISIBILITY = eINSTANCE.getNamedElement_Visibility();

    /**
     * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__QUALIFIED_NAME = eINSTANCE.getNamedElement_QualifiedName();

    /**
     * The meta object literal for the '<em><b>Client Dependency</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT__CLIENT_DEPENDENCY = eINSTANCE.getNamedElement_ClientDependency();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMED_ELEMENT__NAMESPACE = eINSTANCE.getNamedElement_Namespace();

    /**
     * The meta object literal for the '{@link uml.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.DependencyImpl
     * @see uml.impl.UmlPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Supplier</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__SUPPLIER = eINSTANCE.getDependency_Supplier();

    /**
     * The meta object literal for the '<em><b>Client</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__CLIENT = eINSTANCE.getDependency_Client();

    /**
     * The meta object literal for the '{@link uml.impl.DirectedRelationshipImpl <em>Directed Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.DirectedRelationshipImpl
     * @see uml.impl.UmlPackageImpl#getDirectedRelationship()
     * @generated
     */
    EClass DIRECTED_RELATIONSHIP = eINSTANCE.getDirectedRelationship();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_RELATIONSHIP__SOURCE = eINSTANCE.getDirectedRelationship_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_RELATIONSHIP__TARGET = eINSTANCE.getDirectedRelationship_Target();

    /**
     * The meta object literal for the '{@link uml.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.RelationshipImpl
     * @see uml.impl.UmlPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Related Element</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__RELATED_ELEMENT = eINSTANCE.getRelationship_RelatedElement();

    /**
     * The meta object literal for the '{@link uml.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.NamespaceImpl
     * @see uml.impl.UmlPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Element Import</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__ELEMENT_IMPORT = eINSTANCE.getNamespace_ElementImport();

    /**
     * The meta object literal for the '<em><b>Package Import</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__PACKAGE_IMPORT = eINSTANCE.getNamespace_PackageImport();

    /**
     * The meta object literal for the '<em><b>Member</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__MEMBER = eINSTANCE.getNamespace_Member();

    /**
     * The meta object literal for the '<em><b>Imported Member</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__IMPORTED_MEMBER = eINSTANCE.getNamespace_ImportedMember();

    /**
     * The meta object literal for the '<em><b>Owned Member</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NAMESPACE__OWNED_MEMBER = eINSTANCE.getNamespace_OwnedMember();

    /**
     * The meta object literal for the '{@link uml.impl.ElementImportImpl <em>Element Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ElementImportImpl
     * @see uml.impl.UmlPackageImpl#getElementImport()
     * @generated
     */
    EClass ELEMENT_IMPORT = eINSTANCE.getElementImport();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_IMPORT__VISIBILITY = eINSTANCE.getElementImport_Visibility();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_IMPORT__ALIAS = eINSTANCE.getElementImport_Alias();

    /**
     * The meta object literal for the '<em><b>Imported Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_IMPORT__IMPORTED_ELEMENT = eINSTANCE.getElementImport_ImportedElement();

    /**
     * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getElementImport_ImportingNamespace();

    /**
     * The meta object literal for the '{@link uml.impl.PackageImportImpl <em>Package Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PackageImportImpl
     * @see uml.impl.UmlPackageImpl#getPackageImport()
     * @generated
     */
    EClass PACKAGE_IMPORT = eINSTANCE.getPackageImport();

    /**
     * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_IMPORT__VISIBILITY = eINSTANCE.getPackageImport_Visibility();

    /**
     * The meta object literal for the '<em><b>Imported Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_IMPORT__IMPORTED_PACKAGE = eINSTANCE.getPackageImport_ImportedPackage();

    /**
     * The meta object literal for the '<em><b>Importing Namespace</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PACKAGE_IMPORT__IMPORTING_NAMESPACE = eINSTANCE.getPackageImport_ImportingNamespace();

    /**
     * The meta object literal for the '{@link uml.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ValueSpecificationImpl
     * @see uml.impl.UmlPackageImpl#getValueSpecification()
     * @generated
     */
    EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

    /**
     * The meta object literal for the '{@link uml.impl.TypedElementImpl <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.TypedElementImpl
     * @see uml.impl.UmlPackageImpl#getTypedElement()
     * @generated
     */
    EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

    /**
     * The meta object literal for the '{@link uml.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.TypeImpl
     * @see uml.impl.UmlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__PACKAGE = eINSTANCE.getType_Package();

    /**
     * The meta object literal for the '{@link uml.impl.AssociationImpl <em>Association</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.AssociationImpl
     * @see uml.impl.UmlPackageImpl#getAssociation()
     * @generated
     */
    EClass ASSOCIATION = eINSTANCE.getAssociation();

    /**
     * The meta object literal for the '<em><b>Owned End</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__OWNED_END = eINSTANCE.getAssociation_OwnedEnd();

    /**
     * The meta object literal for the '<em><b>Member End</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__MEMBER_END = eINSTANCE.getAssociation_MemberEnd();

    /**
     * The meta object literal for the '<em><b>Is Derived</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSOCIATION__IS_DERIVED = eINSTANCE.getAssociation_IsDerived();

    /**
     * The meta object literal for the '<em><b>End Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__END_TYPE = eINSTANCE.getAssociation_EndType();

    /**
     * The meta object literal for the '<em><b>Navigable Owned End</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSOCIATION__NAVIGABLE_OWNED_END = eINSTANCE.getAssociation_NavigableOwnedEnd();

    /**
     * The meta object literal for the '{@link uml.impl.ClassifierImpl <em>Classifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ClassifierImpl
     * @see uml.impl.UmlPackageImpl#getClassifier()
     * @generated
     */
    EClass CLASSIFIER = eINSTANCE.getClassifier();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASSIFIER__IS_ABSTRACT = eINSTANCE.getClassifier_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Feature</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__FEATURE = eINSTANCE.getClassifier_Feature();

    /**
     * The meta object literal for the '<em><b>Inherited Member</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__INHERITED_MEMBER = eINSTANCE.getClassifier_InheritedMember();

    /**
     * The meta object literal for the '<em><b>Redefined Classifier</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__REDEFINED_CLASSIFIER = eINSTANCE.getClassifier_RedefinedClassifier();

    /**
     * The meta object literal for the '<em><b>General</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__GENERAL = eINSTANCE.getClassifier_General();

    /**
     * The meta object literal for the '<em><b>Substitution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__SUBSTITUTION = eINSTANCE.getClassifier_Substitution();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASSIFIER__ATTRIBUTE = eINSTANCE.getClassifier_Attribute();

    /**
     * The meta object literal for the '{@link uml.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.FeatureImpl
     * @see uml.impl.UmlPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__IS_STATIC = eINSTANCE.getFeature_IsStatic();

    /**
     * The meta object literal for the '<em><b>Featuring Classifier</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__FEATURING_CLASSIFIER = eINSTANCE.getFeature_FeaturingClassifier();

    /**
     * The meta object literal for the '{@link uml.impl.SubstitutionImpl <em>Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.SubstitutionImpl
     * @see uml.impl.UmlPackageImpl#getSubstitution()
     * @generated
     */
    EClass SUBSTITUTION = eINSTANCE.getSubstitution();

    /**
     * The meta object literal for the '<em><b>Contract</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTITUTION__CONTRACT = eINSTANCE.getSubstitution_Contract();

    /**
     * The meta object literal for the '<em><b>Substituting Classifier</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUBSTITUTION__SUBSTITUTING_CLASSIFIER = eINSTANCE.getSubstitution_SubstitutingClassifier();

    /**
     * The meta object literal for the '{@link uml.impl.RealizationImpl <em>Realization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.RealizationImpl
     * @see uml.impl.UmlPackageImpl#getRealization()
     * @generated
     */
    EClass REALIZATION = eINSTANCE.getRealization();

    /**
     * The meta object literal for the '{@link uml.impl.AbstractionImpl <em>Abstraction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.AbstractionImpl
     * @see uml.impl.UmlPackageImpl#getAbstraction()
     * @generated
     */
    EClass ABSTRACTION = eINSTANCE.getAbstraction();

    /**
     * The meta object literal for the '{@link uml.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ParameterImpl
     * @see uml.impl.UmlPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__OPERATION = eINSTANCE.getParameter_Operation();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__DEFAULT = eINSTANCE.getParameter_Default();

    /**
     * The meta object literal for the '<em><b>Default Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__DEFAULT_VALUE = eINSTANCE.getParameter_DefaultValue();

    /**
     * The meta object literal for the '<em><b>Is Exception</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__IS_EXCEPTION = eINSTANCE.getParameter_IsException();

    /**
     * The meta object literal for the '<em><b>Is Stream</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__IS_STREAM = eINSTANCE.getParameter_IsStream();

    /**
     * The meta object literal for the '{@link uml.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.PropertyImpl
     * @see uml.impl.UmlPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link uml.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.OperationImpl
     * @see uml.impl.UmlPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__CLASS = eINSTANCE.getOperation_Class();

    /**
     * The meta object literal for the '<em><b>Is Query</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IS_QUERY = eINSTANCE.getOperation_IsQuery();

    /**
     * The meta object literal for the '<em><b>Is Ordered</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IS_ORDERED = eINSTANCE.getOperation_IsOrdered();

    /**
     * The meta object literal for the '<em><b>Is Unique</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IS_UNIQUE = eINSTANCE.getOperation_IsUnique();

    /**
     * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__LOWER = eINSTANCE.getOperation_Lower();

    /**
     * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__UPPER = eINSTANCE.getOperation_Upper();

    /**
     * The meta object literal for the '<em><b>Redefined Operation</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__REDEFINED_OPERATION = eINSTANCE.getOperation_RedefinedOperation();

    /**
     * The meta object literal for the '{@link uml.impl.BehavioralFeatureImpl <em>Behavioral Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.BehavioralFeatureImpl
     * @see uml.impl.UmlPackageImpl#getBehavioralFeature()
     * @generated
     */
    EClass BEHAVIORAL_FEATURE = eINSTANCE.getBehavioralFeature();

    /**
     * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIORAL_FEATURE__OWNED_PARAMETER = eINSTANCE.getBehavioralFeature_OwnedParameter();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BEHAVIORAL_FEATURE__IS_ABSTRACT = eINSTANCE.getBehavioralFeature_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Raised Exception</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BEHAVIORAL_FEATURE__RAISED_EXCEPTION = eINSTANCE.getBehavioralFeature_RaisedException();

    /**
     * The meta object literal for the '{@link uml.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ClassImpl
     * @see uml.impl.UmlPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Nested Classifier</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__NESTED_CLASSIFIER = eINSTANCE.getClass_NestedClassifier();

    /**
     * The meta object literal for the '<em><b>Owned Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__OWNED_OPERATION = eINSTANCE.getClass_OwnedOperation();

    /**
     * The meta object literal for the '<em><b>Super Class</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

    /**
     * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_ACTIVE = eINSTANCE.getClass_IsActive();

    /**
     * The meta object literal for the '<em><b>Owned Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__OWNED_ATTRIBUTE = eINSTANCE.getClass_OwnedAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Generalization</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__GENERALIZATION = eINSTANCE.getClass_Generalization();

    /**
     * The meta object literal for the '{@link uml.impl.GeneralizationImpl <em>Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.GeneralizationImpl
     * @see uml.impl.UmlPackageImpl#getGeneralization()
     * @generated
     */
    EClass GENERALIZATION = eINSTANCE.getGeneralization();

    /**
     * The meta object literal for the '<em><b>Is Substitutable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GENERALIZATION__IS_SUBSTITUTABLE = eINSTANCE.getGeneralization_IsSubstitutable();

    /**
     * The meta object literal for the '<em><b>General</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZATION__GENERAL = eINSTANCE.getGeneralization_General();

    /**
     * The meta object literal for the '<em><b>Specific</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GENERALIZATION__SPECIFIC = eINSTANCE.getGeneralization_Specific();

    /**
     * The meta object literal for the '{@link uml.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.ModelImpl
     * @see uml.impl.UmlPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Packaged Element</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PACKAGED_ELEMENT = eINSTANCE.getModel_PackagedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '{@link uml.VisibilityKind <em>Visibility Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.VisibilityKind
     * @see uml.impl.UmlPackageImpl#getVisibilityKind()
     * @generated
     */
    EEnum VISIBILITY_KIND = eINSTANCE.getVisibilityKind();

    /**
     * The meta object literal for the '<em>Integer</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlPackageImpl#getInteger()
     * @generated
     */
    EDataType INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em>Boolean</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlPackageImpl#getBoolean()
     * @generated
     */
    EDataType BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '<em>String</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see uml.impl.UmlPackageImpl#getString()
     * @generated
     */
    EDataType STRING = eINSTANCE.getString();

    /**
     * The meta object literal for the '<em>Unlimited Natural</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uml.impl.UmlPackageImpl#getUnlimitedNatural()
     * @generated
     */
    EDataType UNLIMITED_NATURAL = eINSTANCE.getUnlimitedNatural();

  }

  /*Global utility methods are generated here*/
    
} //UmlPackage
