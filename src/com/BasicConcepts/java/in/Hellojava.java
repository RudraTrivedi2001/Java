package com.BasicConcepts.java.in;

import java.util.*;
public class Hellojava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the Number of times You want to print hello java");
        int n = sc.nextInt();
        for(int counter = 0; counter<n; counter = counter +1){
            System.out.println("Hello world");
        }
    }}

