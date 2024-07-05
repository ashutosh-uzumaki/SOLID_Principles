package dip.good_design;

public class Phonepe implements Payment{
    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed through phone pe "+amount);
    }
}
