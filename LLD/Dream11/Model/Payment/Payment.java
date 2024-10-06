package Model.Payment;

import Model.User.User;

public class Payment {
    private int paymentID;
    private double amount;
    private String transactionType;
    private User user;

    public Payment(int paymentID, double amount, String transactionType, User user) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.transactionType = transactionType;
        this.user = user;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                ", user=" + user +
                '}';
    }
}
