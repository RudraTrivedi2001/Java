package com.Strings.java.in;

import java.util.*;

public class ReverseString {

    // Method to reverse the string using the StringBuilder's built-in reverse method
    public static void reverse(StringBuilder str) {
        // Use StringBuilder's built-in reverse method and display the result
        str.reverse();
        System.out.println("Reversed again using built-in method: " + str);
    }

    public static void main(String[] args) {
        // Create a StringBuilder object to store the string input
        StringBuilder str = new StringBuilder();

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.println("Please enter a string to reverse:");

        // Read the string from the user and append it to StringBuilder
        str.append(sc.next());

        // Print the original string entered by the user
        System.out.println("You entered: " + str);

        // Find the length of the string
        int n = str.length();

        // Reverse the string manually using character swapping
        for (int i = 0; i < n / 2; i++) {
            // Calculate the front and back character indices
            int front = i;          // Index from the start
            int back = n - 1 - i;   // Index from the end

            // Get the characters at these positions
            char charFront = str.charAt(front);
            char charBack = str.charAt(back);

            // Swap the characters
            str.setCharAt(front, charBack);
            str.setCharAt(back, charFront);
        }

        // Print the manually reversed string
        System.out.println("Manually reversed string: " + str);

        // Call the reverse method to reverse it again using the built-in reverse method
        reverse(str);
    }
}
