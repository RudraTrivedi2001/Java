package com.BasicConcepts.java.in;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.println("Type the size of the array:");
        int size = sc.nextInt();

        // Declare an array to store the numbers
        int[] numbers = new int[size];

        // Prompt the user to input the elements of the array
        System.out.println("Type the elements you want to add to the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Initialize min and max with first array element
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to find the minimum and maximum values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Output the results
        System.out.println("The maximum number in the array is: " + max);
        System.out.println("The minimum number in the array is: " + min);
    }
}
