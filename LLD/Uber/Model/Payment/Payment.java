package Model.Payment;

import Model.Ride.Ride;

public class Payment {
    private int paymentID;
    private Ride ride;
    private double amount;
    private String status;

    public Payment(int paymentID, Ride ride, double amount, String status) {
        this.paymentID = paymentID;
        this.ride = ride;
        this.amount = amount;
        this.status = status;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", ride=" + ride +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
