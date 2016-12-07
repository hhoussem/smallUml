/**
 */
package smalluml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Attribute#getTypedValue <em>Typed Value</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typed Value</em>' containment reference.
	 * @see #setTypedValue(Type)
	 * @see smalluml.SmallumlPackage#getAttribute_TypedValue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Type getTypedValue();

	/**
	 * Sets the value of the '{@link smalluml.Attribute#getTypedValue <em>Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typed Value</em>' containment reference.
	 * @see #getTypedValue()
	 * @generated
	 */
	void setTypedValue(Type value);

} // Attribute
