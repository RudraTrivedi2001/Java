package com.BitManipulation.java.in;



import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number
        System.out.println("Enter the number (bit):");
        int bit = sc.nextInt();
        
        // Prompt the user to enter the position of the bit to get
        System.out.println("Enter the position of the bit to get (1-indexed):");
        int position = sc.nextInt();
        
        // Convert to 0-indexed for bit manipulation
        int positionInBit = position - 1;
        
        // Create the bitmask by shifting 1 to the specified position
        int bitmask = 1 << positionInBit;

        // Use AND operation to determine if the bit at the specified position is 0 or 1
        if ((bitmask & bit) == 0) {
            System.out.println("0 is in that position");
        } else {
            System.out.println("1 is in that position");
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
