package com.BasicConcepts.java.in;

import java.util.*;

public class CountInputsFromUser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;

        // Display instructions to the user
        System.out.println("Enter numbers. To exit, type '444'.");
        System.out.println("The program will count positive, negative, and zero numbers.");

        // Infinite loop until the user enters 444 to exit
        while (true) {
            int a = sc.nextInt();

            // Exit condition
            if (a == 444) {
                break;
            } 
            // Count positive numbers
            else if (a > 0) {
                positive++;
            } 
            // Count negative numbers
            else if (a < 0) {
                negative++;
            } 
            // Count zeros
            else {
                zero++;
            }
        }

        // Output the results
        System.out.println("The count of Negative Numbers are: " + negative);
        System.out.println("The count of Positive Numbers are: " + positive);
        System.out.println("The count of Zeros are: " + zero);

        // Close the Scanner to release resources
        sc.close();
    }
}
