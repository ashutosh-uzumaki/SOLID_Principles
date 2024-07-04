package lsp.bad_design;

public class Car extends Vehicle {
    @Override
    public void start(){
        System.out.println("Starting the car");
    }

    @Override
    public void stop(){
        System.out.println("Stopping the car");
    }
}
