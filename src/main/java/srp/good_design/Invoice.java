package srp.good_design;

public class Invoice {
    private Pen pen;
    private int quantity;
    private Calculator calculator;

    Invoice(Pen pen, int quantity, Calculator calculator){
        this.pen = pen;
        this.quantity = quantity;
        this.calculator = calculator;
    }

    public void invoicePrint(){
        double amount = calculator.calculatePrice(quantity, this.pen.getPrice());
        System.out.println("Invoice printed "+amount);
    }
}
