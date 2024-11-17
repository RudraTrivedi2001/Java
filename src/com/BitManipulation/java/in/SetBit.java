package com.BitManipulation.java.in;



import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number
        System.out.println("Enter the number (n):");
        int n = sc.nextInt();
        
        // Prompt the user to enter the position of the bit to set
        System.out.println("Enter the position of the bit to set (1-indexed):");
        int position = sc.nextInt();
        
        // Convert to 0-indexed for bit manipulation
        int positionBit = position - 1;
        
        // Create the bitmask by shifting 1 to the specified position
        int bitmask = 1 << positionBit;
        
        // Use OR operation to set the bit at the specified position
        int newBit = bitmask | n;
        
        // Output the result
        System.out.println("The number after setting the bit at position " + position + " is: " + newBit);

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
