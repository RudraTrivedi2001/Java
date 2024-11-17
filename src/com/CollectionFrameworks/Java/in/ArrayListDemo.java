package com.CollectionFrameworks.Java.in;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList(); // this ArrayList constructor has a default capacity of 10 elements size is still 0 because i have not yet added a element in the collection obj

        ArrayList al2 = new ArrayList(6); // thge capacity of this constructor will be 6 size is still zero as no object is not added
        al2.add(100);
        al2.add("lol");
        al2.add(1);  // now the size of the AL is 3 and the capacity is 6
        System.out.println(al2);
        ArrayList al3 = new ArrayList(al2); // this works as copy constructor it will copy the elements of the collection obj mentioned inside the round brackets
        System.out.println(al3);
        al3.add(30);

// add() method  this adds elements index after index like there is no unordered adding
        al1.add(0, "xd");
        al1.add(1, 30);
        al1.add(40);
        al1.add("shdhd");

        // addAll() adds all the elements of a collection obj to another collection obj
        al1.addAll(al2);
        System.out.println(al1);


        //remove();
        al1.remove("xd");
        // al1.remove(40); will not remove 40 and it will give exception "array out of index" cuz it will consider 40 as index value so remember to tyoe tthe index value of element in case of int elements instead of writing the value of element. that only works in case of String because it treats the  value as obj not index
al1.remove(1);
        System.out.println(al1);

        //removeAll();
        al1.removeAll(al2);
        System.out.println(al1);
        al1.removeAll(al3); // removes sthe element that is present in the al3 as well
        System.out.println(al1);

        //contains
        System.out.println(al1.contains("shdhd"));

        //set()
        al1.set(0, 40);
        System.out.println(al1);

        System.out.println("//////////////////////////////////");

        //iterator
       Iterator itr =  al2.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
    }
}
