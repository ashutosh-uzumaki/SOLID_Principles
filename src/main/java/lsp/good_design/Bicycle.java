package lsp.good_design;

public class Bicycle implements Vehicle{

    @Override
    public void start() {
        System.out.println("Starting to peddle");
    }

    @Override
    public void stop() {
        System.out.println("Stopping to peddle");
    }
}
