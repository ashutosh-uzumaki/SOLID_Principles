package dip.good_design;

public class Paypal implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed through paypal "+amount);
    }
}
