package com.CollectionFrameworks.Java.in;


import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Using generics to specify the type of elements (Integer and String in this case)
        Vector<Object> vec = new Vector<>();

        // Add elements to the Vector using addElement() and add() methods
        vec.addElement(40); // Using addElement for legacy style (specific to Vector)
        vec.addElement("lol");
        vec.add(400); // Using add() for modern approach
        vec.add(0, 34); // Add at specific index
        vec.addElement("xd"); // Using addElement

        // Print the Vector
        System.out.println("Vector: " + vec);

        // First element in the vector
        System.out.println("First Element: " + vec.firstElement());

        // Last element in the vector
        System.out.println("Last Element: " + vec.lastElement());

        // Remove element by object value
        vec.removeElement(40);
        System.out.println("After removing element 40: " + vec);

        // Remove element by index
        vec.removeElementAt(2); // Removes element at index 2
        System.out.println("After removing element at index 2: " + vec);

        // Display current capacity of the Vector
        System.out.println("Current capacity: " + vec.capacity());

        // Ensuring the Vector has enough capacity
        vec.ensureCapacity(30);
        System.out.println("Capacity after ensuring 30: " + vec.capacity());

        // Iterate over the Vector using ListIterator
        ListIterator<Object> litr = vec.listIterator();
        System.out.println("Iterating forward:");
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }

        System.out.println("Iterating backward:");
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // Remove all elements from the Vector
        vec.removeAllElements();
        System.out.println("After removing all elements: " + vec);

        // Set element at a specific index
        vec.add(44);
        vec.setElementAt(4, 0); // Set value 4 at index 0
        System.out.println("After setting element at index 0: " + vec);
    }
}
