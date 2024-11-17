package com.CollectionFrameworks.Java.in;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        // Create a new HashSet (no duplicates allowed, no specific order maintained)
        HashSet hs = new HashSet();

        // HashSet does not preserve insertion order, nor does it maintain sorting order
        hs.add(10);  // Adds the element 10 to the HashSet
        hs.add(44);  // Adds the element 44 to the HashSet
        hs.add("lol");  // Adds the string "lol" to the HashSet

        // Print the HashSet (the order may not be the same as the insertion order)
        System.out.println(hs);  // Output: [10, 44, lol]

        // Demonstrating that duplicates are not allowed
        hs.add(10);  // Duplicate element, will not be added again
        hs.add(null);  // Adds a null value to the HashSet
        hs.add(null);  // Duplicated null, will not be added again

        // Print the HashSet after attempting to add duplicates
        System.out.println(hs);  // Output: [null, 10, 44, lol]

        // Using the addAll() method to add all elements from another collection
        ArrayList al = new ArrayList();  // Create an ArrayList
        al.add(5);  // Add element 5 to the ArrayList
        al.add(33);  // Add element 33 to the ArrayList

        hs.addAll(al);  // Adds all elements of the ArrayList to the HashSet
        System.out.println(hs);  // Output: [null, 5, 10, 33, 44, lol]

        // Iterating over the HashSet using an Iterator
        Iterator itr = hs.iterator();  // Get an iterator for the HashSet

        // Use the iterator to go through all elements in the HashSet
        while (itr.hasNext()) {  // Check if there is a next element
            System.out.println(itr.next());  // Print the next element
        }

        // Note: HashSet does not guarantee any specific order when iterating
    }
}

