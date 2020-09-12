package tr.com.merciyes.persistance.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tr.com.merciyes.commons.model.Event;
import tr.com.merciyes.persistance.mapper.EventMapper;
import tr.com.merciyes.persistance.persistance.manager.EventRepositoryManager;
import tr.com.merciyes.persistance.service.EventService;

import java.util.List;

public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepositoryManager persistenceManager;
    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getEvents() {
        return eventMapper.convert(persistenceManager.findAll());
    }
}
