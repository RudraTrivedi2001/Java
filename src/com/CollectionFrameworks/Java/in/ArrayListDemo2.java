package com.CollectionFrameworks.Java.in;


import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // Create a new ArrayList to store elements
        ArrayList<Object> al = new ArrayList<>();  // Using generics to ensure type safety

        // add() method: Adds elements to the ArrayList
        al.add("lol");   // Adds a String
        al.add(100);      // Adds an Integer
        al.add(200);      // Adds an Integer
        al.add("xd");     // Adds a String

        // Print the ArrayList to see the added elements
        System.out.println("ArrayList after additions: " + al);

        // remove() method: Removes elements by object or by index
        al.remove("lol");  // Removes the first occurrence of the object "lol"
        al.remove(1);      // Removes the element at index 1 (100)
        System.out.println("ArrayList after removals: " + al);

        // size() method: Returns the number of elements in the ArrayList
        System.out.println("Size of ArrayList: " + al.size());

        // isEmpty() method: Checks if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + al.isEmpty());

        // contains() method: Checks if a particular element exists in the ArrayList
        System.out.println("Does the ArrayList contain 100? " + al.contains(100));

        // addAll() method: Adds all elements from another collection to the current ArrayList
        ArrayList<Object> al2 = new ArrayList<>();
        al2.add("lol");    // Adds a String "lol"
        al2.add("400");    // Adds a String "400"
        al2.add("aqaaa");  // Adds a String "aqaaa"

        // Add all elements from al2 into al
        al.addAll(al2);
        System.out.println("ArrayList after addAll operation: " + al);

        // containsAll() method: Checks if all elements in the specified collection are in the current ArrayList
        System.out.println("Does the ArrayList contain all elements from al2? " + al.containsAll(al2));

        // removeAll() method: Removes all elements in the specified collection from the ArrayList
        al.removeAll(al2);
        System.out.println("ArrayList after removeAll operation: " + al);

        // clear() method: Removes all elements from the ArrayList
        al.clear();
        System.out.println("ArrayList after clear operation: " + al);  // Should print an empty list
    }
}

