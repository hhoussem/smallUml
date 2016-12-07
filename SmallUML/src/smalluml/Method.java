/**
 */
package smalluml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link smalluml.Method#getReturnTypedValue <em>Return Typed Value</em>}</li>
 *   <li>{@link smalluml.Method#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see smalluml.SmallumlPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Return Typed Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Typed Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Typed Value</em>' containment reference.
	 * @see #setReturnTypedValue(Type)
	 * @see smalluml.SmallumlPackage#getMethod_ReturnTypedValue()
	 * @model containment="true"
	 * @generated
	 */
	Type getReturnTypedValue();

	/**
	 * Sets the value of the '{@link smalluml.Method#getReturnTypedValue <em>Return Typed Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Typed Value</em>' containment reference.
	 * @see #getReturnTypedValue()
	 * @generated
	 */
	void setReturnTypedValue(Type value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link smalluml.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see smalluml.SmallumlPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getParameters();

} // Method
