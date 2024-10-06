package Service.User;

import Model.Calendar.Calendar;
import Model.Event.Event;

public interface IUserService {
    void createEvent(Event event);
    void shareCalendar(Calendar calendar);
}
