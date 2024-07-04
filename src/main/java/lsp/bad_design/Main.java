package lsp.bad_design;

public class Main {
    public static void testDrive(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
    public static void main(String[] args) {
        testDrive(new Vehicle());
        testDrive(new Car());
        testDrive(new Bike());
        testDrive(new Bicycle());
    }
}
