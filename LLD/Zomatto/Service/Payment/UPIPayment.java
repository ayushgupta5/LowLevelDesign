package Service.Payment;

import Model.Payment.Payment;

public class UPIPayment implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("UPI Payment is Happening with Payment : " +payment);
    }
}

