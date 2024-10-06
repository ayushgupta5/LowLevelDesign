package Service.Payment;

import Model.Payment.Payment;

public class PaymentService implements IPaymentService {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("Processing the Payment : " + payment);
    }
}
