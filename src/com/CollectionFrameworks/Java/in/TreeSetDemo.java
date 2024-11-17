package com.CollectionFrameworks.Java.in;



import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Using generics to specify the type (Integer in this case)
        TreeSet<Integer> ts = new TreeSet<>();

        // TreeSet stores elements in sorted order (ascending by default)
        // Elements are added in ascending order, no duplicates allowed
        ts.add(100);
        ts.add(40);
        ts.add(30);
        ts.add(60);
        
        // Display the TreeSet (Sorted order)
        System.out.println("TreeSet: " + ts); // Output: [30, 40, 60, 100]

        // Removing an element from the TreeSet
        ts.remove(100);
        System.out.println("After removing 100: " + ts); // Output: [30, 40, 60]

        // Iterator to loop through the TreeSet
        System.out.println("Using Iterator to traverse the TreeSet:");
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Prints elements in ascending order
        }

        // Note: Null values cannot be added to a TreeSet due to how sorting works with compareTo()
    }
}
