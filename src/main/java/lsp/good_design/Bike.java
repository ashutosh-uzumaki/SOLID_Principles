package lsp.good_design;

public class Bike implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting the engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the engine");
    }
}
