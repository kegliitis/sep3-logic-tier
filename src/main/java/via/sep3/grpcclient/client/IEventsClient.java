package via.sep3.grpcclient.client;

import via.sep3.model.CreateEvent;
import via.sep3.model.Event;

public interface IEventsClient
{
    Event createEvent(CreateEvent createEvent, String creatorEmail);
}
