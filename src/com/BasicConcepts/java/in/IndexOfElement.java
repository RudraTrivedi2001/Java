package com.BasicConcepts.java.in;

import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        System.out.println("Enter the size of the array:"); // Prompt the user to enter the size of the array
        int size = sc.nextInt(); // Read the size of the array from the user
        int[] numbers = new int[size]; // Declare an array of the specified size

        System.out.println("Enter the elements of the array:"); // Prompt the user to enter the array elements
        for(int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt(); // Read each element of the array from the user
        }

        System.out.println("Enter the number to find its index:"); // Prompt the user to enter the number to find
        int x = sc.nextInt(); // Read the number to find from the user

        // Display the length of the array
        System.out.println("The length of the array is: " + numbers.length);

        // Iterate through the array to find the index of the specified number
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println("The index for your variable is " + i); // Print the index if the number is found
                return; // Exit the loop once the number is found
            }
        }

        // If the number is not found, inform the user
        System.out.println("The number " + x + " is not in the array.");
    }
}
