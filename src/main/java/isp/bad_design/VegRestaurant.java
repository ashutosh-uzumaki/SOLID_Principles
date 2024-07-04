package isp.bad_design;

public class VegRestaurant implements Restaurant{
    @Override
    public void vegOptions(){
        System.out.println("This is a veg options");
    }

    @Override
    public void nonVegOptions(){
        throw new RuntimeException("You can't get non veg food here");
    }
}
