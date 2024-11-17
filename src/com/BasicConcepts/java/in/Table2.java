package com.BasicConcepts.java.in;
import java.util.*;
public class Table2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a no.");
        int n = sc.nextInt();  // Takes the number for the multiplication table
        int i = 1;  // Start from 1 for the table
        
        // Loop from 1 to 10 to print the multiplication table for `n`
        while(i <= 10){
            System.out.println(n + " * " + i + " = " + (n * i));  // Print multiplication result
            i++;  // Increment `i` by 1 on each iteration
        }
    }
}
