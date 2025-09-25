package Inheritance_01;

class Vehicle {
    void drive() {
        System.out.println("Repairing a vehicle.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car.");
    }
}

public class Problem_02 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.drive();

        Car myCar = new Car();
        myCar.drive();
    }
}
