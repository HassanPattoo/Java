class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();
    }
}
