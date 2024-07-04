package ocp.bad_design;

public class Pen {
    private String name;
    private String color;
    private int mfgYear;
    private double price;

    public Pen(String name, String color, int mfgYear, double price) {
        this.name = name;
        this.color = color;
        this.mfgYear = mfgYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMfgYear() {
        return mfgYear;
    }

    public void setMfgYear(int mfgYear) {
        this.mfgYear = mfgYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
