package com.OOPS.Java.in;



class Pen{
    String color;
    String type; //ballpoint;gel
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);

    }

        }
        class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
        }
public class ClassesAndObjects  {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.write();
        pen1.type = "gel";
        pen1.printColor();   // this will call the printcolor fn and "this." will tell which object is calling the class method
        Pen pen2 = new Pen();
        pen2.type = "ballpoint";
        pen2.color = "yellow";
        pen2.printColor(); // same goes for here



        // student ka obj
        Student s1 = new Student();
        s1.name = "aman";
        s1.age = 10;
        s1.printInfo();
    }
}
