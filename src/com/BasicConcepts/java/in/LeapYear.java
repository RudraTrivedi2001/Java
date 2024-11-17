package com.BasicConcepts.java.in;

import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        // Prompt the user to input a year
        System.out.println("Type the year:");
        
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Read the year entered by the user
        int year = sc.nextInt();
        
        // Check if the year is divisible by 4
        if (year % 4 == 0) {
            // If it is divisible by 4, check if it's also divisible by 100
            if (year % 100 == 0) {
                // If divisible by 100, check if it's also divisible by 400
                if (year % 400 == 0) {
                    System.out.println("Leap year");  // It is a leap year
                } else {
                    System.out.println("Not a leap year");  // Not a leap year
                }
            } else {
                System.out.println("Leap year");  // It is a leap year
            }
        } else {
            System.out.println("Not a leap year");  // Not a leap year
        }
    }
}
