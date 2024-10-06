package Model.Payment;

public class Payment {
    private int paymentID;
    private double amount;
    private String status;

    public Payment(int paymentID, double amount, String status) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.status = status;
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
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
