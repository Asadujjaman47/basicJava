package oop.variables;

public class Car {
    // Instance variables (unique to each object)
    String model;
    String color;

    // Class variable (shared by all objects)
    static int numberOfCars = 0;

    // Constructor to initialize instance variables
    Car(String model, String color) {
        this.model = model;
        this.color = color;
        numberOfCars++; // Increment the static variable each time a car is created
    }

    // Method to display instance and class variables
    void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color);
        System.out.println("Total Cars: " + numberOfCars);
    }
}

