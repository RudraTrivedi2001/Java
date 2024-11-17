package com.BasicConcepts.java.in;

import java.util.*;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the age");
        int age = sc.nextInt();
        if (age <= 13){
            System.out.println("CHILD");
        }
        else if (age<18) {
            System.out.println("Teenage");

        }
        else if (age == 18) {
            System.out.println("Adult");

        }
        else{
            System.out.println("Senior citizen");
        }
    }
}