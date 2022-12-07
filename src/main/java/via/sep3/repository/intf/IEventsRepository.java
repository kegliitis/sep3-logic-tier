package via.sep3.repository.intf;

import via.sep3.model.CreateEvent;
import via.sep3.model.Event;

public interface IEventsRepository
{
    Event createEvent(CreateEvent createEvent, String creatorEmail);
}
