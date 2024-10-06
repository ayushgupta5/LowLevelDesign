package Model.Rider;

import Model.User.User;

public class Rider extends User {
    private String paymentMethod;

    public Rider(int userID, String name, String email, String phone, String role, String paymentMethod) {
        super(userID, name, email, phone, role);
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
