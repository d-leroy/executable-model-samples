/**
 */
package petrinetTrace.States;

import org.eclipse.emf.common.util.EList;

import petrinetTrace.States.petrinet.TracedPlace;
import petrinetTrace.States.petrinet.TracedToken;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place tokens Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetTrace.States.Place_tokens_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link petrinetTrace.States.Place_tokens_Value#getStates <em>States</em>}</li>
 *   <li>{@link petrinetTrace.States.Place_tokens_Value#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see petrinetTrace.States.StatesPackage#getPlace_tokens_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Place_tokens_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petrinetTrace.States.petrinet.TracedPlace#getTokensSequence <em>Tokens Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedPlace)
	 * @see petrinetTrace.States.StatesPackage#getPlace_tokens_Value_Parent()
	 * @see petrinetTrace.States.petrinet.TracedPlace#getTokensSequence
	 * @model opposite="tokensSequence" required="true" transient="false"
	 * @generated
	 */
	TracedPlace getParent();

	/**
	 * Sets the value of the '{@link petrinetTrace.States.Place_tokens_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedPlace value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link petrinetTrace.States.State#getPlace_tokens_Values <em>Place tokens Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see petrinetTrace.States.StatesPackage#getPlace_tokens_Value_States()
	 * @see petrinetTrace.States.State#getPlace_tokens_Values
	 * @model opposite="place_tokens_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' reference list.
	 * The list contents are of type {@link petrinetTrace.States.petrinet.TracedToken}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tokens</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tokens</em>' reference list.
	 * @see petrinetTrace.States.StatesPackage#getPlace_tokens_Value_Tokens()
	 * @model
	 * @generated
	 */
	EList<TracedToken> getTokens();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // Place_tokens_Value
