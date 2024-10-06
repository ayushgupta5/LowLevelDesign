package Service.Attendee;

import Model.Event.Event;

public interface IAttendeeService {
    void acceptEvent(Event event);
    void declineEvent(Event event);
}
