package com.Functions.Java.in;

public class Addition {

    // Method to add two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiplication(int a, int b) {
        return a * b;
    }

    // Method to subtract two integers and return the result
    public static int subtraction(int a, int b) {
        return a - b;  // Changed name to 'subtraction' for correct spelling
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        // Call the sum method and print the result
        int d = sum(a, b);
        System.out.println("Sum: " + d);

        // Call the multiplication method and print the result
        int f = multiplication(a, b);
        System.out.println("Multiplication: " + f);

        // Call the subtraction method and print the result
        int g = subtraction(a, b);
        System.out.println("Subtraction: " + g);
    }
}
