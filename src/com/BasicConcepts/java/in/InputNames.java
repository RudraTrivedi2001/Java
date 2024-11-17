package com.BasicConcepts.java.in;



import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.println("Enter the number of names you want to input: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline character left by nextInt()

        // Declare an array to store the names
        String[] names = new String[size];

        // Prompt the user to input the names
        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        // Output the names
        System.out.println("The names you entered are:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
