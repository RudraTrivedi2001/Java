package com.CollectionFrameworks.Java.in;



import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterfaceDemo {
    public static void main(String[] args) {
        // Create a HashMap instance (implements Map interface)
        Map<Object, Object> mp = new HashMap<>();
        
        // The put() method adds key-value pairs to the map
        // In a map, keys cannot be duplicated, but values can be.
        mp.put(101, "lol");  // Key: 101, Value: "lol"
        mp.put("kk", 200);    // Key: "kk", Value: 200
        mp.put(102, "lol");   // Key: 102, Value: "lol"
        
        // Printing the entire map
        System.out.println("HashMap Contents: " + mp);

        // The clear() method removes all entries from the map
        // containsKey() returns true if the map contains the specified key, else false
        // containsValue() returns true if the map contains the specified value, else false
        System.out.println("Contains key 101: " + mp.containsKey(101)); // true
        System.out.println("Contains value 'lol': " + mp.containsValue("lol")); // true
        
        // The get() method retrieves the value associated with a specified key
        System.out.println("Value for key 101: " + mp.get(101)); // "lol"

        // The isEmpty() method returns true if the map has no entries, else false
        System.out.println("Is map empty: " + mp.isEmpty()); // false

        // The remove() method removes the entry (key-value pair) for the given key
        mp.remove(102); // Removes entry with key 102
        System.out.println("HashMap after removing key 102: " + mp);

        // The putAll() method adds all entries from one map to another map
        Map<Integer, String> ts = new TreeMap<>();
        ts.put(104, "xd");
        ts.put(106, "jssj");
        
        // Adding all entries of 'ts' to 'mp'
        mp.putAll(ts);
        System.out.println("HashMap after putAll(): " + mp);

        // The replace() method updates the value associated with a specific key
        mp.replace(101, "chal"); // Replaces value of key 101 with "chal"
        System.out.println("HashMap after replace: " + mp);

        // If a duplicate key is added, the new value replaces the previous value.
        // In this case, key 101 had "lol", now it is updated to "chal".
    }
}
