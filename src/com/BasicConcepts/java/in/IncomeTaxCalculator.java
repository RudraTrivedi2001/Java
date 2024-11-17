package com.BasicConcepts.java.in;

import java.util.*;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
    	System.out.println("Type your salary");
        Scanner sc = new Scanner(System.in);
        long inc = sc.nextLong();
        if (inc <= 500000){
            System.out.println("your salary is "+inc+  " so you have to pay zero percent tax");
            System.out.println(inc);
            
        }
        else if (inc > 500000 && inc <1000000) {
            System.out.println("your salary is " +inc+  " so you have to pay 20 percent tax");
            System.out.println("your salary deduction is " + inc*0.2);
            System.out.println("Now Your salary is " +  (inc-inc*0.2));


        }
        else{
            System.out.println("your salary is "+inc+ " so you have to pay 30 percent tax");
            System.out.println("your sal deduction " + inc*0.3);
            System.out.println("Now Your salary is " +  (inc-inc*0.3));
        }

    }
}

