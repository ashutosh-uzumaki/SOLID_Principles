package dip.bad_design;

public class PaymentService {
    private CreditCard creditCard;
    private Paypal paypal;
    private BitCoin bitCoin;

    public PaymentService(){
        this.bitCoin = new BitCoin();
        this.creditCard = new CreditCard();
        this.paypal = new Paypal();
    }

    public void pay(String mode, double amount){
        if(mode.equalsIgnoreCase("paypal")){
            paypal.processPayment(amount);
        }else if(mode.equalsIgnoreCase("credit card")){
            creditCard.processPayment(amount);
        }else{
            bitCoin.processPayment(amount);
        }

    }
}
