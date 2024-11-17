package com.BasicConcepts.java.in;

import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("WELCOME TO GUESSING GAME");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a Number. If the Number is equal to the Number that system has decided then You will win a reward ");
        int guess = sc.nextInt();
        int n = 33;
        if (guess == n){
            System.out.println("You are accurate. You Won");
            }
        else{
            if (guess>n){
                System.out.println("Guess less");

                }
            else{
                System.out.println("Guess more");
            }
        }

    }
}
