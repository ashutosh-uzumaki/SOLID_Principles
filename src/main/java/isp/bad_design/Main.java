package isp.bad_design;

public class Main {
    public static void main(String[] args) {
        getFoodOptions(new NonVegRestaurant());
        getFoodOptions(new VegRestaurant());
    }
    public static void getFoodOptions(Restaurant restaurant){
        restaurant.vegOptions();
        restaurant.nonVegOptions();
    }
}
