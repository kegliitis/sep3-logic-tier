package via.sep3.repository.implementation;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.IEventsClient;
import via.sep3.grpcclient.implementation.EventsClient;
import via.sep3.model.AttendEvent;
import via.sep3.model.CreateEvent;
import via.sep3.model.Event;
import via.sep3.repository.intf.IEventsRepository;

import java.util.List;

@Repository
public class EventsRepository implements IEventsRepository
{
    private IEventsClient client;

    public EventsRepository(EventsClient client)
    {
        this.client = client;
    }

    @Override
    public Event createEvent(CreateEvent createEvent, String creatorEmail)
    {
        try
        {
            return client.createEvent(createEvent, creatorEmail);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Event> getEvents()
    {
        try
        {
            return client.getEvents();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Event getEventById(String id) {
        try
        {
            return client.getEventById(id);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void approveEvent(String id, boolean approve) {
        try
        {
            client.approveEvent(id, approve);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void attendEvent(String eventId, String creatorEmail) {
        try
        {
             client.attendEvent(eventId, creatorEmail);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
    }
}
