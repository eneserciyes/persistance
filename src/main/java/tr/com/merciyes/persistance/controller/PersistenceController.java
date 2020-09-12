package tr.com.merciyes.persistance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.merciyes.commons.constants.Services;
import tr.com.merciyes.commons.rest.response.AbstractResponse;
import tr.com.merciyes.persistance.service.EventService;

@RestController
public class PersistenceController {

    @Autowired
    EventService eventService;

    @GetMapping(Services.Path.EVENTS)
    public AbstractResponse getEvents(){
        return AbstractResponse.build(eventService.getEvents());
    }
}
