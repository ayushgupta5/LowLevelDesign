package Service.Event;

import Model.Attendee.Attendee;
import Model.Calendar.Calendar;

public class EventService implements IEventService {
    @Override
    public void addAttendee(Attendee attendee) {
        System.out.println("Adding the Attendee : " + attendee);
    }

    @Override
    public void setReminder(Calendar calendar) {
        System.out.println("Setting the Reminders to the Calendar : " + calendar);
    }
}
