package com.CollectionFrameworks.Java.in;



import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {

        // Creating an ArrayList to add some initial elements
        List<Object> al = new ArrayList<>();
        al.add("lol");
        al.add(45);
        al.add(46);
        al.add("xd");

        // Creating a LinkedList using the constructor that accepts another collection (copy constructor)
        LinkedList<Object> ll = new LinkedList<>(al); // Copy the elements from the ArrayList to LinkedList

        // Adding more elements to the LinkedList
        ll.add("lol");
        ll.add("andy");
        ll.add(107);
        ll.add("lol");

        System.out.println("Initial LinkedList: " + ll); // Printing the LinkedList

        // Using addFirst() and addLast() to add elements at the beginning and end of the list
        ll.addFirst(22); // Adds 22 at the beginning of the LinkedList
        ll.addLast(44);  // Adds 44 at the end of the LinkedList
        System.out.println("After addFirst and addLast: " + ll); // Printing the LinkedList after adding elements

        // Using removeFirst() and removeLast() to remove elements from the beginning and end of the list
        ll.removeFirst(); // Removes the first element (22)
        ll.removeLast();  // Removes the last element (44)
        System.out.println("After removeFirst and removeLast: " + ll); // Printing the LinkedList after removal

        // Using getFirst() and getLast() to retrieve the first and last elements of the LinkedList
        System.out.println("////////////");
        System.out.println("First element: " + ll.getFirst());  // Retrieving the first element of the LinkedList
        System.out.println("Last element: " + ll.getLast());    // Retrieving the last element of the LinkedList

        // Using ListIterator to traverse the LinkedList in forward direction
        ListIterator<Object> itr = ll.listIterator(); // Creating a ListIterator for the LinkedList
        System.out.println("Forward iteration:");
        while(itr.hasNext()){
            System.out.println(itr.next()); // Printing each element in forward direction
        }

        System.out.println("//////////////////////");

        // Using ListIterator to traverse the LinkedList in reverse direction
        System.out.println("Backward iteration:");
        while(itr.hasPrevious()){
            System.out.println(itr.previous()); // Printing each element in reverse direction
        }
    }
}

