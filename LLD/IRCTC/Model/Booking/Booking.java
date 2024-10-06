package Model.Booking;

import java.time.LocalDateTime;

public class Booking {
    private int bookingID;
    private int pnrNumber;
    private int userID;
    private int trainID;
    private LocalDateTime bookingDate;
    private String status;

    public Booking(int bookingID, int pnrNumber, int userID, int trainID, LocalDateTime bookingDate, String status) {
        this.bookingID = bookingID;
        this.pnrNumber = pnrNumber;
        this.userID = userID;
        this.trainID = trainID;
        this.bookingDate = bookingDate;
        this.status = status;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(int pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTrainID() {
        return trainID;
    }

    public void setTrainID(int trainID) {
        this.trainID = trainID;
    }

    public LocalDateTime getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", pnrNumber=" + pnrNumber +
                ", userID=" + userID +
                ", trainID=" + trainID +
                ", bookingDate=" + bookingDate +
                ", status='" + status + '\'' +
                '}';
    }
}
