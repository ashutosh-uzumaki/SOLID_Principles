package dip.bad_design;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("paypal", 2000);

        paymentService.pay("credit card", 2000);
    }
}
