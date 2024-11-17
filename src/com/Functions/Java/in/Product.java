package com.Functions.Java.in;


import java.util.*;

public class Product {
    public static double productFunction(double a , double b){
        double product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Number You wantb to find product of");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double product = productFunction(a,b);
        System.out.println("The product of the numbers is " + product);

    }}

