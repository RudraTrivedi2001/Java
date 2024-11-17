package com.Streams.Java.in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 12, 23, 22};
        
        // Convert the primitive array to a List<Integer>
        List<Integer> al = new ArrayList<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        
        // Filter even numbers and square them
        List<Integer> al2 = al.stream()
                             .filter(a -> a % 2 == 0)   // Keep only even numbers
                             .map(a -> a * a)           // Square the even numbers
                             .collect(Collectors.toList());  // Collect into a new list
        
        // Print the new list of squared even numbers
        System.out.println(al2);
    }
}
