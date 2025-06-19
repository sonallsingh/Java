// Parent class
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Main class
public class Main3 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine(); // Inherited from Vehicle
        myCar.drive();       // Own method
    }
}
