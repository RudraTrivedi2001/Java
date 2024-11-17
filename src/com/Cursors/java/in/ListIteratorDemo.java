package com.Cursors.java.in;



import java.util.ArrayList;
import java.util.ListIterator;
import java.util.List;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add("lol");
        l.add("fuck");
        l.add(20);

        System.out.println(l);

       //for forward direction
        ListIterator itr = l.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
        //the cursor is currently is pointing at nothing after 20
        System.out.println("----------------------");
        // for backword direction
        while(itr.hasPrevious()){ //returns boolean value
            System.out.println(itr.previous()); //returns the object

        } //the cursor will again go back to before 10

        //to set

        itr.set(200); //this will remove 10 to 200 now cursor is pointing at 200
        System.out.println(l);

        //to remove
         itr.remove();//this will remove 200 because it is the first thing that the cursor is near at forward direction
        System.out.println(l);


        //to add
        itr.add("hello"); //this will add a random obj at the place the cursor is pointing at
        System.out.println(l);

        System.out.println(itr.previous());
        System.out.println(itr.next());

    }}

