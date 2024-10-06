package Service.Event;

import Model.Attendee.Attendee;
import Model.Calendar.Calendar;

public interface IEventService {
    void addAttendee(Attendee attendee);
    void setReminder(Calendar calendar);
}
