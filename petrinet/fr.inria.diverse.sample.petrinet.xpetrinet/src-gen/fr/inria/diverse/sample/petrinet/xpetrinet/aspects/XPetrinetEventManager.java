package fr.inria.diverse.sample.petrinet.xpetrinet.aspects;

import java.util.HashSet;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PetrinetPackage;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceAddTokenEvent;
import fr.inria.diverse.sample.petrinet.xpetrinet.petrinet.PlaceRemoveTokenEvent;
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
		if (event instanceof PlaceAddTokenEvent) {
			return canSendPlaceAddTokenEvent((PlaceAddTokenEvent) event);
		} else
		if (event instanceof PlaceRemoveTokenEvent) {
			return canSendPlaceRemoveTokenEvent((PlaceRemoveTokenEvent) event);
		}
		return false;
	}
	
	@Override
	public Set<EClass> getEventClasses() {
		final Set<EClass> eventClasses = new HashSet<>();
		eventClasses.add(PetrinetPackage.eINSTANCE.getPlaceAddTokenEvent());
		eventClasses.add(PetrinetPackage.eINSTANCE.getPlaceRemoveTokenEvent());
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
		if (event instanceof PlaceAddTokenEvent) {
			handlePlaceAddTokenEvent((PlaceAddTokenEvent) event);
		} else
		if (event instanceof PlaceRemoveTokenEvent) {
			handlePlaceRemoveTokenEvent((PlaceRemoveTokenEvent) event);
		}
	}
	
	private void handlePlaceAddTokenEvent(PlaceAddTokenEvent event) {
		if (PlaceAspect.addToken_PreCondition(event.getPlace())) {
			PlaceAspect.addToken(event.getPlace());
		}
	}
	
	private void handlePlaceRemoveTokenEvent(PlaceRemoveTokenEvent event) {
		if (PlaceAspect.removeToken_PreCondition(event.getPlace())) {
			PlaceAspect.removeToken(event.getPlace());
		}
	}
	
	private boolean canSendPlaceAddTokenEvent(PlaceAddTokenEvent event) {
		return PlaceAspect.addToken_PreCondition(event.getPlace());
	}
	
	private boolean canSendPlaceRemoveTokenEvent(PlaceRemoveTokenEvent event) {
		return PlaceAspect.removeToken_PreCondition(event.getPlace());
	}
}
