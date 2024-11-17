package com.CollectionFrameworks.Java.in;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ListInterface {
    public static void main(String[] args) {
        // Initialize the size of the ArrayList
        int size = 4;
        Scanner sc = new Scanner(System.in);

        // Create an ArrayList of Strings with the specified initial capacity
        List<String> arrayList = new ArrayList<>(size);

        // Adding elements to the ArrayList manually
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Swift");

        // Displaying the element at index 2 using get()
        System.out.println("Element at index 2: " + arrayList.get(2));

        // Filling the ArrayList using a for loop with user input
        System.out.println("Enter 4 more programming languages:");
        for (int i = 0; i < 4; i++) {
            String add = sc.next();
            arrayList.add(add);
        }
        System.out.println("Updated List: " + arrayList);

        // Displaying the size of the ArrayList
        System.out.println("Size of the ArrayList: " + arrayList.size());

        // Removing elements from the list by index
        for (int j = 6; j >= 3; j--) {
            // The loop ensures that we are removing elements starting from the last index to avoid index shifting issues
            arrayList.remove(j);
        }
        System.out.println("List after removal: " + arrayList);

        // Finding the index of the first occurrence of an element using indexOf()
        System.out.println("Index of 'Java': " + arrayList.indexOf("Java"));

        // Iterating through the list using an enhanced for loop
        System.out.print("List elements using enhanced for loop: ");
        for (String list : arrayList) {
            System.out.print(list + " ");
        }
    }
}
