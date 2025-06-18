class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("The car is driving.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Creating an object of Car class
        Car myCar = new Car();

        // Accessing fields
        myCar.color = "Red";
        myCar.speed = 100;

        // Calling method
        myCar.drive();

        System.out.println("Color: " + myCar.color);
        System.out.println("Speed: " + myCar.speed + " km/h");
    }
}
