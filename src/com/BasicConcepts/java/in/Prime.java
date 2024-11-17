package com.BasicConcepts.java.in;

import java.util.*;

public class Prime {
    public static void main(String[] args) {
        // Prompt the user to input a number
        System.out.println("Type the number");
        
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Read the number entered by the user
        int n = sc.nextInt();
        
        // Handle edge case: numbers less than 2 are not prime
        if (n <= 1) {
            System.out.println("Not Prime");
        } else if (n == 2) {
            System.out.println("Prime");  // 2 is a prime number
        } else {
            boolean isPrime = true;  // Assume the number is prime initially
            // Check divisibility from 2 to sqrt(n) for optimization
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;  // If divisible by i, it's not prime
                    break;  // No need to check further once it's confirmed not prime
                }
            }
            // Output the result based on the isPrime flag
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }
}
