package Service.Attendee;

import Model.Event.Event;

public class AttendeeService implements IAttendeeService {
    @Override
    public void acceptEvent(Event event) {
        System.out.println("Accepting the Event: " +event);
    }

    @Override
    public void declineEvent(Event event) {
        System.out.println("Declining the Event: " +event);
    }
}
