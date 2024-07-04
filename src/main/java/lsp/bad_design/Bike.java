package lsp.bad_design;

public class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting the bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the bike");
    }
}
