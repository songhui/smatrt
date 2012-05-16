/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package cn.edu.pku.sei.ra.dt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Transition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.dt.DtPackage#getTransitionType()
 * @model
 * @generated
 */
public enum TransitionType implements Enumerator {
	/**
	 * The '<em><b>Initialize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALIZE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALIZE(0, "Initialize", "Initialize"),

	/**
	 * The '<em><b>Assignment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASSIGNMENT(1, "Assignment", "Assignment"),

	/**
	 * The '<em><b>Down Cast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_CAST_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN_CAST(2, "DownCast", "DownCast"),

	/**
	 * The '<em><b>Upcast</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPCAST_VALUE
	 * @generated
	 * @ordered
	 */
	UPCAST(3, "Upcast", "Upcast"),

	/**
	 * The '<em><b>Instance Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	INSTANCE_CALL(4, "InstanceCall", "InstanceCall"),

	/**
	 * The '<em><b>Static Call</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATIC_CALL_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_CALL(5, "StaticCall", "StaticCall"),

	/**
	 * The '<em><b>Parameterize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETERIZE_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETERIZE(6, "Parameterize", "Parameterize"), /**
	 * The '<em><b>Enumerate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUMERATE_VALUE
	 * @generated
	 * @ordered
	 */
	ENUMERATE(7, "Enumerate", "Enumerate"), /**
	 * The '<em><b>Intermediate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	INTERMEDIATE(8, "Intermediate", "Intermediate");

	/**
	 * The '<em><b>Initialize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Initialize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALIZE
	 * @model name="Initialize"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALIZE_VALUE = 0;

	/**
	 * The '<em><b>Assignment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assignment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSIGNMENT
	 * @model name="Assignment"
	 * @generated
	 * @ordered
	 */
	public static final int ASSIGNMENT_VALUE = 1;

	/**
	 * The '<em><b>Down Cast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Down Cast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN_CAST
	 * @model name="DownCast"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_CAST_VALUE = 2;

	/**
	 * The '<em><b>Upcast</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Upcast</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPCAST
	 * @model name="Upcast"
	 * @generated
	 * @ordered
	 */
	public static final int UPCAST_VALUE = 3;

	/**
	 * The '<em><b>Instance Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Instance Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSTANCE_CALL
	 * @model name="InstanceCall"
	 * @generated
	 * @ordered
	 */
	public static final int INSTANCE_CALL_VALUE = 4;

	/**
	 * The '<em><b>Static Call</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Static Call</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATIC_CALL
	 * @model name="StaticCall"
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_CALL_VALUE = 5;

	/**
	 * The '<em><b>Parameterize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameterize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETERIZE
	 * @model name="Parameterize"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETERIZE_VALUE = 6;

	/**
	 * The '<em><b>Enumerate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enumerate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUMERATE
	 * @model name="Enumerate"
	 * @generated
	 * @ordered
	 */
	public static final int ENUMERATE_VALUE = 7;

	/**
	 * The '<em><b>Intermediate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERMEDIATE
	 * @model name="Intermediate"
	 * @generated
	 * @ordered
	 */
	public static final int INTERMEDIATE_VALUE = 8;

	/**
	 * An array of all the '<em><b>Transition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransitionType[] VALUES_ARRAY =
		new TransitionType[] {
			INITIALIZE,
			ASSIGNMENT,
			DOWN_CAST,
			UPCAST,
			INSTANCE_CALL,
			STATIC_CALL,
			PARAMETERIZE,
			ENUMERATE,
			INTERMEDIATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Transition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransitionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransitionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransitionType get(int value) {
		switch (value) {
			case INITIALIZE_VALUE: return INITIALIZE;
			case ASSIGNMENT_VALUE: return ASSIGNMENT;
			case DOWN_CAST_VALUE: return DOWN_CAST;
			case UPCAST_VALUE: return UPCAST;
			case INSTANCE_CALL_VALUE: return INSTANCE_CALL;
			case STATIC_CALL_VALUE: return STATIC_CALL;
			case PARAMETERIZE_VALUE: return PARAMETERIZE;
			case ENUMERATE_VALUE: return ENUMERATE;
			case INTERMEDIATE_VALUE: return INTERMEDIATE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TransitionType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TransitionType
