package com.Cursors.java.in;



import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class EnumerationCursor {
    public static void main(String[] args) {
        // Using generics to specify the type of elements (Integer, String, etc.)
        Vector<Object> s = new Stack<>(); // Using Stack here directly
        s.add(100);
        s.add("lol");
        s.add("wow");
        s.add(5);
        System.out.println("Vector with Stack: " + s);

        // To retrieve the collection of Stack using Enumeration (only for legacy classes like Stack, Vector)
        Enumeration<Object> e = s.elements();
        System.out.println("Using Enumeration:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement()); // returns the next element
        }

        // Iterator can also be used for newer collections (for both forward and backward traversal)
        System.out.println("Using Iterator:");
        Iterator<Object> i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next()); // returns the next element
        }
    }
}

