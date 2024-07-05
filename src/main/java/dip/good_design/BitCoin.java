package dip.good_design;

public class BitCoin implements Payment{

    @Override
    public void processPayment(double amount) {
        System.out.println("Payment processed through bitcoin "+amount);
    }
}
