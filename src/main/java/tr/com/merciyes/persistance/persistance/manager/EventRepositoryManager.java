package tr.com.merciyes.persistance.persistance.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.merciyes.persistance.entity.EventEntity;
import tr.com.merciyes.persistance.persistance.EventRepository;

import java.util.List;

@Service
public class EventRepositoryManager {

    @Autowired
    EventRepository eventRepository;

    public List<EventEntity> findAll(){
        return eventRepository.findAll();
    }

    public boolean existsByResourceId(Long id) { return eventRepository.existsByResourceId(id); }

    public EventEntity findByResourceId(Long id) {
        return eventRepository.findByResourceId(id);
    }

    public EventEntity save(EventEntity eventEntity) {
        return eventRepository.save(eventEntity);
    }

    public void deleteByResourceId(Long id) {
        eventRepository.deleteByResourceId(id);
    }

    public boolean existByEventTitle(String eventTitle) {
        return eventRepository.existsByEventTitle(eventTitle);
    }
}
