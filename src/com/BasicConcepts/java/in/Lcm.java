package com.BasicConcepts.java.in;

import java.util.*;

public class Lcm {
    public static void main(String[] args) {
        // Prompt the user to input two numbers
        System.out.println("Type two numbers.");
        Scanner sc = new Scanner(System.in);

        // Read the two numbers from the user
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate the LCM using the correct formula
        int lcm = (a * b) / gcd(a, b);  // LCM formula using GCD

        // Output the LCM of the two numbers
        System.out.println("LCM is: " + lcm);
    }

    // Method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        // Use Euclid's algorithm to find the GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // return the GCD
    }
}
