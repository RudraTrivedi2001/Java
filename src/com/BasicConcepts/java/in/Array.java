package com.BasicConcepts.java.in;

public class Array {
    public static void main(String[] args) {
        int[] a = {1,23,44,55,6,7};
        System.out.println(a[0]);

        for (int i = 0; i <a.length; i++){
            System.out.println(a[i]);
        }
        for(int b : a){
            System.out.println(b);
        }
    }
}
