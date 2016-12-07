package fr.inria.diverse.sample.petrinet.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.Step
import fr.inria.diverse.melange.annotation.Containment
import org.eclipse.emf.common.util.EList
import petrinet.Net
import petrinet.PetrinetFactory
import petrinet.Place
import petrinet.Token
import petrinet.Transition

import static extension fr.inria.diverse.sample.petrinet.semantics.PlaceAspect.*
import static extension fr.inria.diverse.sample.petrinet.semantics.TransitionAspect.*

@Aspect(className=Net)
class NetAspect {
	
	@InitializeModel
	@Step
	def void initializeModel(EList<String> args) {
		for (place : _self.places) {
			val initialTokens = place.initialTokens
			if (initialTokens > 0) {
				for (x : 1 .. place.initialTokens) {
					place.tokens.add(PetrinetFactory.eINSTANCE.createToken)
				}
			}
		}
	}

	/**
	 * Transformation rule that runs the Petri net.
	 */
	@Main
	@Step
	def void run() {
		while (true) {
			val enabledTransition = _self.transitions.findFirst[t|t.isEnabled]
			if (enabledTransition != null) {
				enabledTransition.fire
			} else {
				return
			}
		}
	}
}

@Aspect(className=Place)
class PlaceAspect {

	/**
	 * Current tokens in a Place object.
	 */
	@Containment
	public EList<Token> tokens;
	
	@Step(eventTriggerable = true)
	public def void addToken() {
		_self.tokens.add(PetrinetFactory.eINSTANCE.createToken)
	}
	
	public def boolean addToken_PreCondition() {
		_self.tokens.empty
	}
	
	@Step(eventTriggerable = true)
	public def void removeToken() {
		_self.tokens.remove(0)
	}
	
	public def boolean removeToken_PreCondition() {
		!_self.tokens.empty
	}
}

@Aspect(className=Transition)
class TransitionAspect {

	/**
	 * Query to know if the Transition is enabled.
	 * @return true if all input places have at least one token, false otherwise.
	 */
	public def boolean isEnabled() {
		return _self.input.forall[place|place.tokens.size > 0]
	}

	/**
	 * Transformation rule that fires the Transition.
	 */
	@Step
	public def void fire() {

		// Checking if input places are enabled
		if (_self.isEnabled) {

			// Removing a token from each input place
			for (Place input : _self.input)
				input.tokens.remove(input.tokens.get(0))

			// Adding a token to each output place
			for (Place output : _self.output)
				output.tokens.add(PetrinetFactory.eINSTANCE.createToken)
		}
	}
}