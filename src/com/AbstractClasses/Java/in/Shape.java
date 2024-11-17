package com.AbstractClasses.Java.in;

// Abstract class: A blueprint for concrete classes that cannot be instantiated directly
public abstract class Shape {
    private String name; // Name of the shape

    // Constructor to initialize the name of the shape
    public Shape(String newName) {
        this.name = newName;
    }

    // Abstract methods: Must be implemented by all subclasses.
    // These methods serve as a contract for the subclasses, ensuring they define these functionalities.
    public abstract void calculateArea(); // Method to calculate the area of the shape
    public abstract void calculatePerimeter(); // Method to calculate the perimeter of the shape (corrected from "parameter")

    // Concrete methods: These methods are optional for subclasses to use.
    // Subclasses can directly use or override these methods if needed.

    // Method to set a new name for the shape
    public void setName(String name) {
        this.name = name;
    }

    // Method to get the current name of the shape
    public String getName() {
        return this.name;
    }

    // Method to display the name of the shape
    public void displayShapeName() {
        System.out.println("Shape name: " + this.name);
    }
}
