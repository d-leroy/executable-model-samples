/**
 */
package petrinet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Place#getName <em>Name</em>}</li>
 *   <li>{@link petrinet.Place#getInitialTokens <em>Initial Tokens</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinet.PetrinetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initial Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Tokens</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Tokens</em>' attribute.
	 * @see #setInitialTokens(int)
	 * @see petrinet.PetrinetPackage#getPlace_InitialTokens()
	 * @model
	 * @generated
	 */
	int getInitialTokens();

	/**
	 * Sets the value of the '{@link petrinet.Place#getInitialTokens <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tokens</em>' attribute.
	 * @see #getInitialTokens()
	 * @generated
	 */
	void setInitialTokens(int value);

} // Place
