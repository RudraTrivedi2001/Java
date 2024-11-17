package com.CollectionFrameworks.Java.in;



import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // Using generics for type safety (Integer as key, String as value)
        TreeMap<Integer, String> tm = new TreeMap<>();
        
        // Adding key-value pairs to the TreeMap
        tm.put(106, "lol");
        tm.put(109, "kk");
        tm.put(103, "88");
        tm.put(11, "lol");

        // Display the TreeMap (Sorted by keys)
        System.out.println("TreeMap: " + tm);

        // ceilingEntry() returns the key-value pair with the smallest key greater than or equal to the given key
        System.out.println("Ceiling entry for 106: " + tm.ceilingEntry(106)); // Returns (106, "lol")
        System.out.println("Ceiling entry for 104: " + tm.ceilingEntry(104)); // Returns (106, "lol") because 106 is the next higher key

        // Using iterator to iterate over the TreeMap entries
        Set<Map.Entry<Integer, String>> entrySet = tm.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
        System.out.println("Using Iterator to iterate over TreeMap:");
        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("-----==================== Using For-Each loop ====================-----");

        // Using for-each loop to iterate over TreeMap entries
        for (Map.Entry<Integer, String> entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // firstEntry() returns the first (smallest) entry in the TreeMap
        System.out.println("First entry: " + tm.firstEntry());

        // floorEntry() returns the entry with the greatest key less than or equal to the specified key
        System.out.println("Floor entry for 107: " + tm.floorEntry(107)); // Returns (106, "lol") because 106 is the highest key <= 107

        // get() retrieves the value for a given key, returns null if the key is not present
        System.out.println("Value for key 106: " + tm.get(106)); // Returns "lol"
        System.out.println("Value for key 1011: " + tm.get(1011)); // Returns null as 1011 is not in the map

        // pollFirstEntry() removes and returns the first (smallest) entry
        System.out.println("Before pollFirstEntry(): " + tm);
        tm.pollFirstEntry(); // Removes the smallest entry (key 11)
        System.out.println("After pollFirstEntry(): " + tm);

        // remove() removes the entry associated with the specified key
        tm.remove(106); // Removes the entry with key 106
        System.out.println("After removing key 106: " + tm);
    }
}
