package via.sep3.repository.implementation;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.IEventsClient;
import via.sep3.grpcclient.implementation.EventsClient;
import via.sep3.model.CreateEvent;
import via.sep3.model.Event;
import via.sep3.repository.intf.IEventsRepository;

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
}
