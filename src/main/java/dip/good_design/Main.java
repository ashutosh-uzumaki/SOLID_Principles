package dip.good_design;



public class Main {
    public static void main(String[] args) {
        Payment method1 = new Phonepe();
        PaymentService paymentService = new PaymentService(method1);
        paymentService.pay(100);
    }
}
