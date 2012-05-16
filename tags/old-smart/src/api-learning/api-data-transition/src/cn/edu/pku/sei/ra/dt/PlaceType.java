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
 * A representation of the literals of the enumeration '<em><b>Place Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see cn.edu.pku.sei.ra.dt.DtPackage#getPlaceType()
 * @model
 * @generated
 */
public enum PlaceType implements Enumerator {
	/**
	 * The '<em><b>Local Variable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VARIABLE_VALUE
	 * @generated
	 * @ordered
	 */
	LOCAL_VARIABLE(0, "LocalVariable", "LocalVariable"),

	/**
	 * The '<em><b>Field</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIELD_VALUE
	 * @generated
	 * @ordered
	 */
	FIELD(1, "Field", "Field"),

	/**
	 * The '<em><b>Parameter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARAMETER_VALUE
	 * @generated
	 * @ordered
	 */
	PARAMETER(2, "Parameter", "Parameter"),

	/**
	 * The '<em><b>Constant</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(3, "Constant", "Constant"), /**
	 * The '<em><b>Invisible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	INVISIBLE(4, "Invisible", "Invisible"), /**
	 * The '<em><b>Method End</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #METHOD_END_VALUE
	 * @generated
	 * @ordered
	 */
	METHOD_END(5, "MethodEnd", "MethodEnd");

	/**
	 * The '<em><b>Local Variable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Local Variable</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCAL_VARIABLE
	 * @model name="LocalVariable"
	 * @generated
	 * @ordered
	 */
	public static final int LOCAL_VARIABLE_VALUE = 0;

	/**
	 * The '<em><b>Field</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Field</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIELD
	 * @model name="Field"
	 * @generated
	 * @ordered
	 */
	public static final int FIELD_VALUE = 1;

	/**
	 * The '<em><b>Parameter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parameter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARAMETER
	 * @model name="Parameter"
	 * @generated
	 * @ordered
	 */
	public static final int PARAMETER_VALUE = 2;

	/**
	 * The '<em><b>Constant</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model name="Constant"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 3;

	/**
	 * The '<em><b>Invisible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invisible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVISIBLE
	 * @model name="Invisible"
	 * @generated
	 * @ordered
	 */
	public static final int INVISIBLE_VALUE = 4;

	/**
	 * The '<em><b>Method End</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Method End</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #METHOD_END
	 * @model name="MethodEnd"
	 * @generated
	 * @ordered
	 */
	public static final int METHOD_END_VALUE = 5;

	/**
	 * An array of all the '<em><b>Place Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PlaceType[] VALUES_ARRAY =
		new PlaceType[] {
			LOCAL_VARIABLE,
			FIELD,
			PARAMETER,
			CONSTANT,
			INVISIBLE,
			METHOD_END,
		};

	/**
	 * A public read-only list of all the '<em><b>Place Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PlaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Place Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Place Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PlaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Place Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PlaceType get(int value) {
		switch (value) {
			case LOCAL_VARIABLE_VALUE: return LOCAL_VARIABLE;
			case FIELD_VALUE: return FIELD;
			case PARAMETER_VALUE: return PARAMETER;
			case CONSTANT_VALUE: return CONSTANT;
			case INVISIBLE_VALUE: return INVISIBLE;
			case METHOD_END_VALUE: return METHOD_END;
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
	private PlaceType(int value, String name, String literal) {
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
	
} //PlaceType
