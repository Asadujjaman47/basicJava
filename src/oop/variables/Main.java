package oop.variables;

public class Main {
    public static void main(String[] args) {
        // Creating objects of Car class
        Car car1 = new Car("Tesla Model 3", "Red");
        Car car2 = new Car("BMW X5", "Black");

        // Display details of car1 and car2
        car1.displayDetails(); // Output will show 2 cars in total after both objects are created
        car2.displayDetails();
    }
}
