package com.OOPS.Java.in;


class Shape{
    String color;
    public void printColor(String color){
        System.out.println(this.color);
    }

}
class Triangle extends Shape{

}
   

public class Inheritance {
    public static void main(String[] args) {
Triangle t1 = new Triangle();
t1.color = "blue";
t1.printColor(t1.color);


    }
}
