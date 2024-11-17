package com.BasicConcepts.java.in;

import java.util.*;
public class Array2d {
    public static void main(String[] args) {
        



       Scanner sc = new Scanner(System.in);
       System.out.println("Type the No of rows");
       int x = sc.nextInt();
       System.out.println("Type the no. of columns");
       int y = sc.nextInt();
      int[][] arr = new int[x][y];
        for(int i = 0; i<x; i++){
            for (int j =0; j < y; j++){
            	System.out.println("Type the no. you want to add");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i =0; i<x; i++){
            for (int j =0; j<y; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

//        int arr[][] = {{2,3,4},{4, 5, 7 }, { 8, 6,5}};
//        for(int i =0; i<3; i++){
//            for(int j=0; j< 3; j++){
//                System.out.print(arr[i][j] + " ");
//
//            }
//           System.out.println( );
//        }
    }
}
