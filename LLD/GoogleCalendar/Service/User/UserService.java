package Service.User;

import Model.Calendar.Calendar;
import Model.Event.Event;

public class UserService implements IUserService {
    @Override
    public void createEvent(Event event) {
        System.out.println("Creating the Event : " +event);
    }

    @Override
    public void shareCalendar(Calendar calendar) {
        System.out.println("Sharing the Calendar: " +calendar);
    }
}
