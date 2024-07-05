package dip.good_design;

public class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment){
        this.payment = payment;
    }
    public void pay(double amount){
        payment.processPayment(amount);
    }
}
