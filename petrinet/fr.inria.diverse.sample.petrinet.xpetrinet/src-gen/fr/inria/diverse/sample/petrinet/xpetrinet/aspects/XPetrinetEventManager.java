package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.TransitionFireEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.NetStopEvent;
import fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IEventManager;

public class XPetrinetEventManager implements IEventManager {

	private final Queue<EObject> eventQueue = new ConcurrentLinkedQueue<>();
	
	private boolean canManageEvents = true;
	
	@Override
	public void sendEvent(Object event) {
		if (event instanceof EObject) {
			eventQueue.add((EObject) event);
		}
	}
	
	@Override
	public boolean canSendEvent(Object event) {
		if (event instanceof TransitionFireEvent) {
			return canSendTransitionFireEvent((TransitionFireEvent) event);
		} else
		if (event instanceof NetStopEvent) {
			return true;
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(PetrinetPackage.eINSTANCE.getTransitionFireEvent());
		eventClasses.add(PetrinetPackage.eINSTANCE.getNetStopEvent());
		return eventClasses;
	}
	
	@Override
	public void manageEvents() {
		if (canManageEvents) {
			canManageEvents = false;
			EObject event = eventQueue.poll();
			while (event != null) {
				dispatchEvent(event);
				event = eventQueue.poll();
			}
			canManageEvents = true;
		}
	}
	
	private void dispatchEvent(EObject event) {
		if (event instanceof TransitionFireEvent) {
			handleTransitionFireEvent((TransitionFireEvent) event);
		} else
		if (event instanceof NetStopEvent) {
			handleNetStopEvent((NetStopEvent) event);
		}
	}
	
	private void handleTransitionFireEvent(TransitionFireEvent event) {
		if (TransitionAspect.fire_PreCondition(event.getTransition())) {
			TransitionAspect.fire(event.getTransition());
		}
	}
	
	private void handleNetStopEvent(NetStopEvent event) {
		NetAspect.stop(event.getNet());
	}
	
	private boolean canSendTransitionFireEvent(TransitionFireEvent event) {
		return TransitionAspect.fire_PreCondition(event.getTransition());
	}
}
