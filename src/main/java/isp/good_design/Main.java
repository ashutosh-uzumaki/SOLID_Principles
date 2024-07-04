package isp.good_design;

public class Main {
    public static void main(String[] args) {
        getVegFoodOptions(new ATwoB());
        getVegFoodOptions(new Mangalam());
        getNonVegFoodOptions(new Mangalam());
    }

    public static void getVegFoodOptions(VegRestaurant vegRestaurant){
        vegRestaurant.vegFoodOptions();
    }

    public static void getNonVegFoodOptions(NonVegRestaurant nonVegRestaurant){
        nonVegRestaurant.nonVegFoodOptions();
    }
}
