package com.BasicConcepts.java.in;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // `i` will hold the user's input in the loop condition
        int i = 1;

        // Start a do-while loop, which will run at least once and repeat as long as `i` is greater than 0
        do {
            // Read an integer input from the user
        	System.out.println("If You want to check  results type 1 ");
            int user = sc.nextInt();
           

            // Check if the user entered 1
            if (user == 1) {
            	System.out.println("Type Your Marks");
                // If user entered 1, read another integer for marks
                int marks = sc.nextInt();

                // Determine the appropriate message based on the `marks` value
                if (marks > 90) {
                    System.out.println("That is good"); // If marks are greater than 90
                } else if (marks > 60 && marks < 90) {
                    System.out.println("AVG"); // If marks are between 60 and 89
                } else {
                    System.out.println("You need to Practice"); // If marks are less than or equal to 60
                }
            }
            else {
            	System.out.println("You Have Typed Wrong Info");
            	break;
            }
        } while (i > 0); // Continue looping as long as `i` is greater than 0
    }
}
