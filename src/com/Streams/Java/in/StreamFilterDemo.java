package com.Streams.Java.in;


//Q - Get a set of strings that starts with letter p

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;


//I'd be glad to explain Stream Filter in a way that's easy for beginners to understand!
//
//     Imagine a Stream Filter as a Magic Sieve
//
//     Think of your data as a big pile of things, like fruits. A Stream Filter acts like a magic sieve that you can use to sort through them and keep only the ones that meet certain criteria.
//
//     Why Use Stream Filter?
//
//     Find specific items quickly: Instead of manually searching through all your data, you can use Stream Filter to find exactly what you need, saving you time and effort.
//     Keep your data organized: By filtering out unwanted items, you can make your data easier to work with and analyze.
//     Simplify complex tasks: Stream Filter can handle intricate sorting and filtering rules, making your code cleaner and more efficient.
//     Benefits:
//
//     Efficiency: It's faster to filter data with Stream Filter than iterating through it manually.
//     Readability: Your code becomes easier to understand and maintain when you use descriptive filter conditions.
//     Flexibility: You can create very specific or general rules to filter your data as needed.
//     How Stream Filter Works:
//
//     You define a rule: Think of this as the holes in the sieve. For example, you might say "keep only fruits that are red."
//     The sieve goes through your data: Stream Filter checks each item in your data against your rule.
//     Only matching items pass through: Items that meet your rule are kept, while others are discarded.
//     Examples of Use Cases:
//
//     Finding all the red apples: Use a rule like "color == 'red'" and "type == 'apple'".
//     Extracting numbers from text: Keep only items that can be converted to numbers.
//     Filtering out empty strings: Remove any empty values from your data.
//     Grouping customers by age: Create groups of customers based on their age range.
//     Remember:
//
//     Stream Filter is part of a larger concept called "functional programming," which emphasizes expressing your logic in terms of functions like the filter rule.
//     It's a powerful tool, but it's important to understand the basic principles before using it in your projects.
public class StreamFilterDemo {
 public static void oldMethod(List<String>al){
     List<String> ps = new ArrayList<>();
     for (String a : al
          ){ a= a.toLowerCase(); //in the oldMethod where you are attempting to convert each string to lowercase using a.toLowerCase(), but you're not updating the variable a with the result. In Java, strings are immutable, so the toLowerCase() method returns a new string, and you need to assign it back to the variable. Here's the corrected oldMethod
if(a.startsWith("p")){
 ps.add(a);
}
     }
     System.out.println(ps);

 }

 public static void streamFilter(List<String> al){
     List<String> ns = al.stream().map(a-> a=a.toLowerCase()).filter(a->a.startsWith("p")).collect(Collectors.toList());
     System.out.println(ns);

 }
 public static void main(String[] args) {
     String [] arr = {"python", "java", "pycharm","palang", "c++", "POOl"};
     List<String> al = new ArrayList(Arrays.asList(arr));
     oldMethod(al);
     System.out.println(al);
     streamFilter(al);

 }
}
