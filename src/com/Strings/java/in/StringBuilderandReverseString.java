package com.Strings.java.in;



import java.util.*;
public class StringBuilderandReverseString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        for(int i = 0; i <str.length()/2; i++){
            int front = i ;
            int back = str.length()-1 - i;
            char charfront = str.charAt(front);
            char backchar = str.charAt(back);

            str.setCharAt(front, backchar);
            str.setCharAt(back, charfront);


        }
        System.out.println(str);
    }
}
