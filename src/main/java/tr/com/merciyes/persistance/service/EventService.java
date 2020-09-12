package tr.com.merciyes.persistance.service;

import org.springframework.stereotype.Service;
import tr.com.merciyes.commons.model.Event;

import java.util.List;

public interface EventService {
    public List<Event> getEvents();
}
