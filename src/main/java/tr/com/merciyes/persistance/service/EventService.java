package tr.com.merciyes.persistance.service;

import tr.com.merciyes.commons.model.Event;

import java.util.List;

public interface EventService {
    List<Event> getEvents();
    Event addEvent(Event eventAdditionRequest);
}
