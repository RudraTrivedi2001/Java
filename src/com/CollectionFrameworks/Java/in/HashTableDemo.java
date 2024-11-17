package com.CollectionFrameworks.Java.in;



import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {
        // Create a Hashtable instance. It implements the Map interface.
        // Hashtable has an initial capacity of 11 (default) and does not allow null keys or values.
        Hashtable <Integer, String> ht = new Hashtable<>();

        // Adding key-value pairs using the put() method
        ht.put(101, "cc");   // Key 101, Value "cc"
        ht.put(111, "xd");   // Key 111, Value "xd"
        ht.put(1, "44");     // Key 1, Value "44"
        ht.put(2, "kkk");    // Key 2, Value "kkk"

        // Print the Hashtable to view its contents
        System.out.println(ht);  // Output will show key-value pairs in the form of {key=value}

        // Retrieving a value using the get() method, passing the key (111)
        System.out.println(ht.get(111));  // Output: xd

        // Iterating over the Hashtable using a for-each loop and Map.Entry
        // Map.Entry provides a way to access both the key and value from the entry set of the Hashtable
        // Using generics for type safety is recommended
        for (Map.Entry<Integer, String> map : ht.entrySet()) {
            // Printing the key and corresponding value
            System.out.println(map.getKey() + "------------------> " + map.getValue());
        }
    }
}

