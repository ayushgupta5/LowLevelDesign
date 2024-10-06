package Service.Payment;

import Model.Payment.Payment;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Credit Card Payment is Happening with Payment : " +payment);
    }
}
