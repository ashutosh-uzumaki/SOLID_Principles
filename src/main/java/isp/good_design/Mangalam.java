package isp.good_design;

public class Mangalam implements VegRestaurant, NonVegRestaurant{
    @Override
    public void nonVegFoodOptions() {
        System.out.println("You are getting non veg food");
    }

    @Override
    public void vegFoodOptions() {
        System.out.println("You are also getting veg food");
    }
}
