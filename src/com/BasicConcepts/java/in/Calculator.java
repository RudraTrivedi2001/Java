package com.BasicConcepts.java.in;

import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Type the value of a and b simountensouly");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("If you want to perform addition press 1\n if you want to subtract Type 2\n If you want to divide a from b Type3\n If you want to multiply then press 4\n if you want to divide b from a then press 5\n If you want to find the reminder then pres 6");
        int Press = sc.nextInt();
        switch(Press){
            case 1 :
                System.out.println(a+b);
                break;
            case 2 :
                System.out.println(a - b );
                break;
            case 3 :
                System.out.println( a/b );
                break;
            case 4 :
                System.out.println(a*b);
                break;
            case 5 :
                System.out.println(b/a);
                break;
            case 6 :
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Input ");
        }
    }
}
