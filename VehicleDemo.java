public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vehicle object:");
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        System.out.println("\nCar object:");
        Car car = new Car();
        car.start();
        car.drive();

        System.out.println("\nSportsCar object:");
        SportsCar sportsCar = new SportsCar();
        sportsCar.start();
        sportsCar.drive();
    }
}

class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving");
    }
}

class SportsCar extends Car {
    @Override
    public void drive() {
        System.out.println("Sports car driving fast");
    }
}
