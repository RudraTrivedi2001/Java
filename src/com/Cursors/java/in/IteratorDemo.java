package com.Cursors.java.in;


import java.util.Iterator;
import java.util.Set;

import java.util.HashSet;

public class IteratorDemo {
    public static void main(String[] args) {
        Set s  = new HashSet();
        s.add("lol");
        s.add(4);
        s.add(5);
        s.add(10);
Iterator itr = s.iterator();
while(itr.hasNext()){  // returns boolean value
    System.out.println(itr.next()); // returns object

}
        System.out.println(s);

    }
}
