package tr.com.merciyes.persistance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import tr.com.merciyes.commons.constants.Services;
import tr.com.merciyes.commons.model.Event;
import tr.com.merciyes.commons.rest.response.AbstractResponse;
import tr.com.merciyes.persistance.service.EventService;

import javax.validation.Valid;

@Controller
@RequestMapping(Services.Path.EVENTS)
public class PersistenceController {

    @Autowired
    EventService eventService;

    @GetMapping
    public AbstractResponse getEvents(){
        return AbstractResponse.build(eventService.getEvents());
    }

    @PostMapping
    public AbstractResponse addEvent(@Valid @RequestBody Event event){
        return AbstractResponse.build(eventService.addEvent(event));


    }
}
