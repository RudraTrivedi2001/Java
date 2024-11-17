package com.AbstractClasses.Java.in;

public class Triangle extends Shape {
    private int sideA; // First side of the triangle
    private int sideB; // Second side of the triangle
    private int sideC; // Third side of the triangle

    // Constructor to initialize triangle properties
    public Triangle(int sideA, int sideB, int sideC, String newName) {
        super(newName); // Call the constructor of the parent class
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Method to calculate and print the perimeter of the triangle
    @Override
    public void calculatePerimeter() {
        int perimeter = this.sideA + this.sideB + this.sideC;
        System.out.println("Perimeter of the triangle is: " + perimeter);
    }

    // Method to calculate and print the area of the triangle
    @Override
    public void calculateArea() {
        double semiPerimeter = (sideA + sideB + sideC) / 2.0; // Semi-perimeter
        double area = Math.sqrt(semiPerimeter * 
                                (semiPerimeter - sideA) * 
                                (semiPerimeter - sideB) * 
                                (semiPerimeter - sideC)); // Heron's formula
        System.out.println("Area of the triangle is: " + area);
    }

    // Method to print the sum of three sides (renamed for clarity)
    public void printSideSum(int sideA, int sideB, int sideC) {
        System.out.println("Sum of the sides: " + (sideA + sideB + sideC));
    }

    // Main method to demonstrate the usage of Triangle and Shape classes
    public static void main(String[] args) {
        // Create an object of Triangle using the Shape reference
        Shape tri = new Triangle(3, 3, 3, "Equilateral Triangle");
        tri.displayShapeName(); // Display the name of the shape

        // Update the name of the shape
        tri.setName("Updated Triangle");
        tri.displayShapeName(); // Display the updated name

        // Create an object of Triangle using its own class reference
        Triangle t1 = new Triangle(3, 4, 6, "Scalene Triangle");
        t1.printSideSum(4, 5, 6); // Use the Triangle-specific method

        // Demonstrate perimeter and area calculations
        t1.calculatePerimeter();
        t1.calculateArea();
    }
}
