package Model.Booking;

import Model.Flight.Flight;
import Model.User.User;

import java.util.Currency;

public class Booking {
    private int bookingID;
    private Flight flight;
    private User user;
    private int seatNumber;
    private String bookingStatus;

    public Booking(int bookingID, Flight flight, User user, int seatNumber, String bookingStatus) {
        this.bookingID = bookingID;
        this.flight = flight;
        this.user = user;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", flight=" + flight +
                ", user=" + user +
                ", seatNumber=" + seatNumber +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }
}
