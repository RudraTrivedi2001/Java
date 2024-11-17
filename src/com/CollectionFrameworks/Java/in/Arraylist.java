package com.CollectionFrameworks.Java.in;



import java.util.List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList to hold elements of any type (no type safety due to lack of generics)
        List<Object> l = new ArrayList<>();  // Using Object as the generic type to store any type of data

        // Add different types of elements to the list
        l.add("lol");  // Adds a String element
        l.add(4);      // Adds an Integer element
        l.add('z');    // Adds a Character element

        // Print the entire list
        System.out.println(l);  // Output: [lol, 4, z]
    }
}
