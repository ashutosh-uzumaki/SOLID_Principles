package lsp.bad_design;

public class Bicycle extends Vehicle{
    @Override
    public void start(){
        throw new RuntimeException("Bicycle doesn't start with a key");
    }
    @Override
    public void stop(){
        System.out.println("Bicycle stopped");
    }
}
