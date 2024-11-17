package com.BasicConcepts.java.in;

import java.util.*;
public class Voting {
    public static void main(String[] args) {
    	System.out.println("Type age");
        Scanner sc = new Scanner(System.in);
        int vote = sc.nextInt();
        if (vote >=18){
            System.out.println("You can Vote");
        }
        else {
            System.out.println("You cant Vote");
        }

    }

}

