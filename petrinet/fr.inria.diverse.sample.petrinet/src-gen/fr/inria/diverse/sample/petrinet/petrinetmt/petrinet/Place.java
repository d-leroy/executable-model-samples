/**
 */
package fr.inria.diverse.sample.petrinet.petrinetmt.petrinet;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place#getInitialTokens <em>Initial Tokens</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlace()
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
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place#getName <em>Name</em>}' attribute.
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
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlace_InitialTokens()
	 * @model
	 * @generated
	 */
	int getInitialTokens();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Place#getInitialTokens <em>Initial Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Tokens</em>' attribute.
	 * @see #getInitialTokens()
	 * @generated
	 */
	void setInitialTokens(int value);

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.Token}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see fr.inria.diverse.sample.petrinet.petrinetmt.petrinet.PetrinetPackage#getPlace_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean addToken_PreCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeToken();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean removeToken_PreCondition();

} // Place
