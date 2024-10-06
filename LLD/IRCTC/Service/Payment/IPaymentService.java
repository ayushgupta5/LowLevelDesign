package Service.Payment;

import Model.Payment.Payment;

public interface IPaymentService {
    void makePayment(Payment payment);
    void processRefund(Payment payment);
}
