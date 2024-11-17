package com.CollectionFrameworks.Java.in;


import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class SetInterfaceConcepts {
    public static void main(String[] args) {
        // Create a HashSet instance (implements Set interface)
        Set<Object> s = new HashSet<>();
        
        // Add elements to the set
        s.add("lol");  // String value
        s.add(100);    // Integer value
        s.add(200);    // Integer value
        s.add(100);    // Duplicate value (won't be added to the set)
        
        // HashSet does not allow duplicate elements, so "100" will not be added again.
        System.out.println("HashSet after adding elements: " + s);

        // HashSet is unordered, elements are stored based on their hashcode values.
        System.out.println("Unordered HashSet: " + s);

        // Null values can be added, but only one null element is allowed.
        s.add(null);
        s.add(400);
        s.add(null); // Only one null is allowed in the set.
        System.out.println("HashSet after adding null values: " + s);

        // Use iterator to iterate over the set
        Iterator<Object> itr = s.iterator();  // Create an iterator for the set
        
        // Iterate through the set using hasNext() and next()
        while (itr.hasNext()) {  // Checks if there are more elements
            System.out.println(itr.next());  // Prints the next element and moves to the next one
        }
    }
}

