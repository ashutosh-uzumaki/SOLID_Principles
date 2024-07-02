package srp.bad_design;

public class Pen {
    String name;
    String color;
    String company;
    double price;

    Pen(String name, String color, String company, double price){
        this.name = name;
        this.color = color;
        this.company = company;
        this.price = price;
    }

    public void printInvoice(double amount, Pen[] pen){
        System.out.println("Printing Invoice");
        System.out.println(calculateSalary(4));
    }

    public double calculateSalary(int quantity){
        return this.price * quantity;
    }

    public void save(Pen pen){
        System.out.println("Saving to DB!!");
    }
}
