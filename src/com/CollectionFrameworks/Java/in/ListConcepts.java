package com.CollectionFrameworks.Java.in;



import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListConcepts {
    public static void main(String[] args) {
        // Creates an ArrayList to store elements in an ordered manner (index-based storage)
        List<Object> list = new ArrayList<>(); // Use generics for type safety
        list.add("aaaaaa"); // Adding a String
        list.add(44);        // Adding an Integer
        list.add(43423);     // Adding another Integer
        list.add("lll");     // Adding another String

        System.out.println("Initial List: " + list); // Printing the current list

        // Duplicacy is allowed in Lists, adding the same value multiple times
        list.add(44);  // Adding duplicate element
        list.add(44);  // Adding another duplicate element
        System.out.println("List after adding duplicates: " + list); // Printing the list after duplicates

        // Multiple null values can be stored in a List
        list.add(null); // Adding a null value
        list.add(null); // Adding another null value
        System.out.println("List after adding null values: " + list); // Printing the list after adding nulls

        // Using Iterator to iterate through the list
        Iterator<Object> itr = list.iterator(); // Creating an iterator
        System.out.println("Iterating using Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next()); // Printing each element using Iterator
        }

        // Using ListIterator to iterate through the list (ListIterator allows bidirectional iteration)
        ListIterator<Object> listItr = list.listIterator(); // Creating a ListIterator
        System.out.println("Iterating using ListIterator:");
        while (listItr.hasNext()) {
            System.out.println(listItr.next()); // Printing each element in forward direction using ListIterator
        }
    }
}
