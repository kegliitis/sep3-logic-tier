package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.model.*;
import via.sep3.model.dtos.GetReportResponseDto;
import via.sep3.model.dtos.UpdateReportDto;
import via.sep3.repository.implementation.EventsRepository;
import via.sep3.repository.intf.IEventsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin()
public class EventsController {
    private JwtTokenUtil jwtTokenUtil;
    private IEventsRepository repository;

    public EventsController(JwtTokenUtil jwtTokenUtil, EventsRepository repository) {
        this.jwtTokenUtil = jwtTokenUtil;
        this.repository = repository;
    }

    @RequestMapping(value = "/events", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createEvent(@RequestHeader Map<String, String> headers, @RequestBody CreateEvent createEvent) {
        String token = headers.get("authorization").split(" ")[1];
        String creatorEmail = jwtTokenUtil.getEmailFromToken(token);

        try {
            Event createdEvent = repository.createEvent(createEvent, creatorEmail);

            return ResponseEntity.ok(createdEvent);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oh Shit!: " + e);
        }
    }

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getEvents() {
        try {
            List<Event> events = repository.getEvents();

            List<EventDto> eventsList = new ArrayList<>();
            for (Event event : events) {
                int[] date = new int[]{event.getDate().getYear(), event.getDate().getMonthValue(), event.getDate().getDayOfMonth()};
                int[] time = new int[]{event.getTime().getHour(), event.getTime().getMinute(), event.getTime().getSecond()};
                eventsList.add(new EventDto(event.getId(), date, time, event.getDescription(), event.getValidation(), event.getOrganiserId(), event.getUsername(), event.getReport(), event.getApproved()));
            }
            return ResponseEntity.ok(eventsList);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getEventById(@PathVariable String id) {
        try {
            Event event = repository.getEventById(id);
            int[] date = new int[]{event.getDate().getYear(), event.getDate().getMonthValue(), event.getDate().getDayOfMonth()};
            int[] time = new int[]{event.getTime().getHour(), event.getTime().getMinute(), event.getTime().getSecond()};
            return ResponseEntity.ok(new EventDto(event.getId(), date, time, event.getDescription(), event.getValidation(), event.getOrganiserId(), event.getUsername(), event.getReport(), event.getApproved()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PatchMapping("/events/{id}")
    public ResponseEntity<String> approveEvent(@PathVariable String id, @RequestBody boolean approved) {
        try {
            repository.approveEvent(id, approved);
            return ResponseEntity.ok("ok");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/events/{id}", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> attendEvent(@RequestHeader Map<String, String> headers,
                                              @RequestBody AttendEvent attendEvent,
                                              @PathVariable String id) {
        Event event = repository.getEventById(id);
//            attendEvent.setEventId(id);
            try {
                String token = headers.get("authorization").split(" ")[1];
                String creatorEmail = jwtTokenUtil.getEmailFromToken(token);
                repository.attendEvent(event.getId(), creatorEmail);
                return ResponseEntity.ok("ok");

            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oh naur!: " + e);
            }
        }
    }
