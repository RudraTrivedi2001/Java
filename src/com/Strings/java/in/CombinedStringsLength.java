package com.Strings.java.in;


import java.util.*;

public class CombinedStringsLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the number of strings
        System.out.println("Enter the number of strings:");
        int size = sc.nextInt();

        // Create an array to store the strings
        String[] randString = new String[size];

        // Use a StringBuilder for efficient concatenation
        StringBuilder totlength = new StringBuilder();

        // Loop to take input strings and append them to totlength
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            randString[i] = sc.next();
            totlength.append(randString[i]);  // Append to StringBuilder
        }

        // Print the total length of the concatenated string
        System.out.println("Total length of all strings combined: " + totlength.length());
    }
}
