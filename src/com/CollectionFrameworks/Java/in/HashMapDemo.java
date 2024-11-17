package com.CollectionFrameworks.Java.in;



import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap with Integer as the key and String as the value
        HashMap<Integer, String> hm = new HashMap<>(); // Use generics for type safety
        hm.put(100, "11");  // Adds key-value pair (100, "11")
        hm.put(101, "ll");  // Adds key-value pair (101, "ll")
        hm.put(102, "gg");  // Adds key-value pair (102, "gg")
        hm.put(102, "aaaa"); // Updates the value for key 102 (previous value "gg" is replaced by "aaaa")
        hm.put(null, "cc");  // Adds a key-value pair with a null key

        // HashMap does not preserve insertion order and does not sort the keys

        // Check if a value exists in the HashMap using containsValue()
        System.out.println(hm.containsValue("aaaa"));  // Output: true, since "aaaa" is a value in the map

        // Retrieve a value corresponding to a key using get()
        System.out.println(hm.get(100));  // Output: 11, since the value for key 100 is "11"

        // Iterating over HashMap using EntrySet and Iterator (Old way)
        // Convert HashMap to a Set of Map.Entry objects
        // Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        // Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
        // while (itr.hasNext()) {
        //     Map.Entry<Integer, String> me = itr.next();
        //     System.out.println(me.getKey() + " --> " + me.getValue());
        // }

        // PutAll() to copy all entries from one map to another
        Map<Integer, String> mp = new TreeMap<>(); // TreeMap keeps keys sorted
        mp.put(108, "fff");  // Adds key-value pair (108, "fff")
        mp.put(107, "KKK");  // Adds key-value pair (107, "KKK")
        mp.put(1, "f");      // Adds key-value pair (1, "f")

        hm.putAll(mp);  // Copies all entries from mp to hm
        System.out.println(hm);  // Prints the entire map

        // Iterating over HashMap using forEach loop (Modern way)
        // This loop iterates through each entry of the HashMap
        for (Map.Entry<Integer, String> me : hm.entrySet()) {
            System.out.println(me.getKey() + " ------> " + me.getValue());  // Prints each key-value pair
        }

        // Get the size of the HashMap (number of key-value pairs)
        System.out.println(hm.size());  // Output: the total number of key-value pairs in the map
    }
}
