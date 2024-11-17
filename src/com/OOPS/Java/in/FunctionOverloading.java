package com.OOPS.Java.in;


class Animal{
    String name;
    int legs;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int legs){
        System.out.println(legs);
    }
    public void printInfo(String name, int legs){
        System.out.println(name +" " +legs);
    }
    //to avoid errors u must follow some conditions 1> return type of all the functions should be diffrent if thr arguments passed are same. 2> if the argument passed in the method of must be of diffrent data types.

}
public class FunctionOverloading {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Horse";
        a1.legs = 4;
        a1.printInfo(a1.name);
        a1.printInfo(a1.legs);
        a1.printInfo(a1.name, a1.legs);
    }
}

