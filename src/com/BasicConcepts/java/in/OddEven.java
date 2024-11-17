package com.BasicConcepts.java.in;

import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the Number you want to find wether it is odd or even");
        int n = sc.nextInt();

        int i = 1;
        while(i<=n){
            if(i%2 == 0){
                System.out.println(i + " Even");
                i++;
            }else{
                System.out.println(i + " ODD");
                i++;
            }
        }
    }}
