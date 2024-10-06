package Model.Attendee;

public class Attendee {
    private int attendeeID;
    private String status;

    public Attendee(int attendeeID, String status) {
        this.attendeeID = attendeeID;
        this.status = status;
    }

    public int getAttendeeID() {
        return attendeeID;
    }

    public void setAttendeeID(int attendeeID) {
        this.attendeeID = attendeeID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "attendeeID=" + attendeeID +
                ", status='" + status + '\'' +
                '}';
    }
}
