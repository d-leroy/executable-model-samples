/**
 */
package fr.inria.diverse.sample.petrinet.xpetrinet.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getInput <em>Input</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage#getTransition_Input()
	 * @model required="true"
	 * @generated
	 */
	EList<Place> getInput();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage#getTransition_Output()
	 * @model required="true"
	 * @generated
	 */
	EList<Place> getOutput();

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
	 * @see fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fire();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean fire_PreCondition();

} // Transition
