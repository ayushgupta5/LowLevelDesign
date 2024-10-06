package Service.Calendar;

import Model.Calendar.Calendar;

public class CalendarService implements ICalendarService {
    @Override
    public void shareCalendar(Calendar calendar) {
        System.out.println("Sharing the Calendar: " +calendar);
    }
}
