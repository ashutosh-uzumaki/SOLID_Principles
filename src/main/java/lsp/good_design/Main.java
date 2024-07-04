package lsp.good_design;

public class Main {
    public static void main(String[] args) {
        testDrive(new Bike());
        testDrive(new Car());
        testDrive(new Bicycle());
    }
    public static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
}
