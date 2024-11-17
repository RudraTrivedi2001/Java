package com.BasicConcepts.java.in;


import java.util.Scanner; // Import the Scanner class to read input

public class Table {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
              System.out.println("Type the Number you want to find table of");
        // Read an integer input from the user
        int n = sc.nextInt();

        // First loop: Print the multiplication table for the number n (from n*0 to n*9)
        for(int i = 0; i < 10; i++) {
            // Print the multiplication equation: n * i = n*i
            System.out.println(n + "*" + i + "=" + n * i);
        }

     
    }
}
