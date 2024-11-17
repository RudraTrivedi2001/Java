package com.BitManipulation.java.in;


import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.println("Enter the number (n):");
        int n = sc.nextInt();

        // Prompt the user to enter the value to update the bit (0 or 1)
        System.out.println("Enter the value of the bit to update (0 or 1):");
        int updateBit = sc.nextInt();

        // Prompt the user to enter the position of the bit to update
        System.out.println("Enter the position of the bit to update (1-indexed):");
        int position = sc.nextInt() - 1; // Convert to 0-indexed

        // If the update bit is 1, set the bit at the given position
        if (updateBit == 1) {
            int setBitmask = 1 << position;
            int newBit = setBitmask | n;
            System.out.println("The number after setting the bit is: " + newBit);
        } 
        // If the update bit is 0, clear the bit at the given position
        else {
            int clearBitmask = 1 << position;
            int not = ~clearBitmask;
            int newUpdatedBit = not & n;
            System.out.println("The number after clearing the bit is: " + newUpdatedBit);
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}

