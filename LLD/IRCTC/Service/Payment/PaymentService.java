package Service.Payment;

import Model.Payment.Payment;

public class PaymentService implements IPaymentService {
    @Override
    public void makePayment(Payment payment) {
        System.out.println("Making the Payment : " +payment.toString());
    }

    @Override
    public void processRefund(Payment payment) {
        System.out.println("Processing the Refund : " +payment.toString());
    }
}
