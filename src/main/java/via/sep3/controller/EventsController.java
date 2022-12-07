package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.model.CreateEvent;
import via.sep3.model.Event;
import via.sep3.repository.implementation.EventsRepository;
import via.sep3.repository.intf.IEventsRepository;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin()
public class EventsController
{
    private JwtTokenUtil jwtTokenUtil;
    private IEventsRepository repository;

    public EventsController(JwtTokenUtil jwtTokenUtil, EventsRepository repository)
    {
        this.jwtTokenUtil = jwtTokenUtil;
        this.repository = repository;
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createEvent(@RequestHeader Map<String, String> headers, @RequestBody CreateEvent createEvent)
    {
        String token = headers.get("authorization").split(" ")[1];
        String creatorEmail = jwtTokenUtil.getEmailFromToken(token);

        try
        {
            Event createdEvent = repository.createEvent(createEvent, creatorEmail);

            return ResponseEntity.ok(createdEvent);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oh Shit!: " + e);
        }
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getEvents()
    {
        try
        {
            List<Event> events = repository.getEvents();
            return ResponseEntity.ok(events);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
