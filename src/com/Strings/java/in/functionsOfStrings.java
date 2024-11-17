package com.Strings.java.in;


import java.util.*;
public class functionsOfStrings {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


// length of string
System.out.println("Type a String");
        String name1 = sc.nextLine();
        System.out.println("Type a String");
        String name2 = sc.nextLine();
        System.out.println(name1.length());

        //print charaters of a string
        for(int i= 0; i < name1.length(); i++){
            System.out.println(name1.charAt(i));
        }
        //comapre two strings
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");

        } else if (name1.compareTo(name2)<0) {
            System.out.println("Name2 is greater than name 1");
        } else{
            System.out.println("Name1 is bigger than name 2");
        }
        // another way to declare strings
        System.out.println(5 + new String("Ram"));
        String a = new String ("ram") + new String("Shyam");
        System.out.println(a);
        // substring of string
        String sentence = sc.nextLine();
        String name = sentence.substring(6,sentence.length());
        System.out.println(name);
        //Strings are immutable - Meaning once the value is stored in the strings then it is hard to change.
    }}
