package com.AbstractClasses.Java.in;

// Subclass Circle extending the abstract class Shape
public class Circle extends Shape {
    private double radius; // Radius of the circle

    // Constructor: Initializes the name of the circle and its radius
    public Circle(String name, double radius) {
        super(name); // Call the constructor of the parent abstract class
        this.radius = radius;
    }

    // Implementation of the abstract method to calculate the area of the circle
    @Override
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2); // Area formula: π * radius^2
        System.out.println("Area of the circle is: " + area);
    }

    // Implementation of the abstract method to calculate the perimeter of the circle
    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius; // Perimeter (circumference) formula: 2 * π * radius
        System.out.println("Perimeter of the circle is: " + perimeter);
    }

    // Main method to demonstrate the Circle class functionality
    public static void main(String[] args) {
        // Create an instance of Circle and assign it a name and radius
        Circle c1 = new Circle("Circle", 5.0);

        // Display the current name of the circle
        c1.displayShapeName(); // Output: Shape name: Circle

        // Update the name of the circle
        c1.setName("Updated Circle");

        // Display the updated name of the circle
        c1.displayShapeName(); // Output: Shape name: Updated Circle

        // Call methods to calculate area and perimeter
        c1.calculateArea(); // Output: Area of the circle is: ...
        c1.calculatePerimeter(); // Output: Perimeter of the circle is: ...
    }
}
