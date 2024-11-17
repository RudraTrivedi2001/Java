package com.Polymorphism.java.in;



public class Animal {
    protected  String name;
    protected int age;

    //const
    public Animal(int age , String name){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public static void ageName(){
        System.out.println("lol");
    }
}
