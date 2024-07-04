package isp.bad_design;

public class NonVegRestaurant implements Restaurant{
    @Override
    public void vegOptions() {
        System.out.println("These are veg options");
    }

    @Override
    public void nonVegOptions() {
        System.out.println("These are non veg options");
    }
}
