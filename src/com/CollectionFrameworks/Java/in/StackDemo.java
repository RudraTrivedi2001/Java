package com.CollectionFrameworks.Java.in;




import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Stack is a legacy class from JDK 1.0, modified after the introduction of the Collection Framework in JDK 1.2
        // It is a subclass of Vector, designed to work on the basis of LIFO (Last In, First Out) principle.
        // Elements are inserted using push() and removed using pop().

        Stack<Object> s = new Stack<>();  // Using generics for type safety

        // Push elements onto the stack. The elements are inserted in the order they are added.
        s.push("lol");  // Adds the string "lol" to the stack
        s.push(400);    // Adds the integer 400 to the stack
        s.push(44);     // Adds the integer 44 to the stack
        s.push("xd");   // Adds the string "xd" to the stack

        System.out.println("Stack after pushing elements: " + s);

        // Pop operation removes and returns the topmost element of the stack
        System.out.println("Popped element: " + s.pop());  // Removes and prints "xd"
        System.out.println("Stack after pop: " + s);

        // Peek operation returns the topmost element without removing it
        System.out.println("Top element (peek): " + s.peek());  // Prints the topmost element, which is 44

        // Search operation returns the position of an object in the stack (1-based index from the top)
        System.out.println("Search for 400: " + s.search(400));  // Returns 2, as 400 is the second element from the top
        
        System.out.println("Search for 'xd': " + s.search("xd"));  // Returns -1 because "xd" is not in the stack anymore

        // Empty operation checks if the stack is empty
        System.out.println("Is stack empty? " + s.empty());  // Returns false, as the stack is not empty yet
    }
}

