package Model.Calendar;

import Model.User.User;

public class Calendar {
    private int calendarID;
    private String name;
    private User owner;

    public Calendar(int calendarID, String name, User owner) {
        this.calendarID = calendarID;
        this.name = name;
        this.owner = owner;
    }

    public int getCalendarID() {
        return calendarID;
    }

    public void setCalendarID(int calendarID) {
        this.calendarID = calendarID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "calendarID=" + calendarID +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                '}';
    }
}
