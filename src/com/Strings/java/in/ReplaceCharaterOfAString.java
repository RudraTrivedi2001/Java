package com.Strings.java.in;


import java.util.*;

public class ReplaceCharaterOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a string");
        String original = sc.next();
        StringBuilder result = new StringBuilder();

        for (int j = 0; j < original.length(); j++) {
            if (original.charAt(j) == 'e') {
                result.append('i');  // Replace 'e' with 'i'
            } else {
                result.append(original.charAt(j));  // Append the original character
            }
        }

        System.out.println(result.toString());  // Print the modified string
    }
}
