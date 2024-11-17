package com.BasicConcepts.java.in;

import java.util.*;
public class age {
    public static void main(String[] args) {
        System.out.println("This is a age detection program");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if(age >= 18 ){
            System.out.println("Adult");
            if (age > 40 && age < 60){
                System.out.println("You are an Middle aged");

            }else if(age>=60) {
            	System.out.println("Old person");
            }
            
            else {
                System.out.println("Your are in Your Prime");
                }

        }else {
        	System.out.println("You are a minor");
        }

    }

    }
