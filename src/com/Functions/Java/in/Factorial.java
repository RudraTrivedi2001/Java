package com.Functions.Java.in;


import java.util.Scanner;

public class Factorial {

    // Method to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        int product = 1;
        
        // Check if the input is negative, return 0 or throw an error
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;  // Indicating an error
        }

        // Calculate factorial using a loop
        for (int i = 1; i <= n; i++) {
            product *= i;  // Multiply the product by the current number
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int factorialResult = calculateFactorial(n);
        
        // Only print the result if it's valid (not -1)
        if (factorialResult != -1) {
            System.out.println("Factorial of " + n + " is " + factorialResult);
        }
    }
}
