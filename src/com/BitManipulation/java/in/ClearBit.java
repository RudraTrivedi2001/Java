package com.BitManipulation.java.in;



import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number
        System.out.println("Enter the number (n):");
        int n = sc.nextInt();
        
        // Prompt the user to enter the position of the bit to clear
        System.out.println("Enter the position of the bit to clear (1-indexed):");
        int position = sc.nextInt() - 1; // Convert to 0-indexed

        // Create the bitmask by shifting 1 to the specified position
        int bitmask = 1 << position;

        // Use NOT operation to create a mask that has all bits set to 1 except for the target bit
        int notBitmask = ~bitmask;

        // Use AND operation with the number and the mask to clear the specified bit
        int clearedNumber = notBitmask & n;

        // Output the result
        System.out.println("The number after clearing the bit at position " + (position + 1) + " is: " + clearedNumber);

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}

