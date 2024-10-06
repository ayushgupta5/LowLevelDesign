package Main;

import Model.Attendee.Attendee;
import Model.Calendar.Calendar;
import Model.Event.Event;
import Model.User.User;
import Service.Attendee.AttendeeService;
import Service.Attendee.IAttendeeService;
import Service.Calendar.CalendarService;
import Service.Calendar.ICalendarService;
import Service.Event.EventService;
import Service.Event.IEventService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class GoogleCalendarApp {
    public static void main(String[] args) {
        User user = new User(1, "Ayush", "ayush@gmail.com", "password");
        Calendar calendar = new Calendar(1, "AyushCalendar", user);
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(1);
        Event event = new Event(1, "Event", "EventAyush", startTime, endTime, "location","recurrenceRule");
        Attendee attendee = new Attendee(1, "Free");

        IUserService userService = new UserService();
        userService.shareCalendar(calendar);
        userService.createEvent(event);

        ICalendarService calendarService = new CalendarService();
        calendarService.shareCalendar(calendar);

        IEventService eventService = new EventService();
        eventService.addAttendee(attendee);
        eventService.setReminder(calendar);

        IAttendeeService attendeeService = new AttendeeService();
        attendeeService.acceptEvent(event);
        attendeeService.declineEvent(event);
    }
}
