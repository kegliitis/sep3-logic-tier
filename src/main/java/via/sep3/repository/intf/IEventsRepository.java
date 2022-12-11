package via.sep3.repository.intf;

import via.sep3.model.CreateEvent;
import via.sep3.model.Event;

import java.util.List;

public interface IEventsRepository
{
    Event createEvent(CreateEvent createEvent, String creatorEmail);
    List<Event> getEvents(String email, String filter);
    Event getEventById(String id);
    void approveEvent(String id, boolean approve);


}
