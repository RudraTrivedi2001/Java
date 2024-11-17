package com.Interface.Java.in;



public class Toyota implements Car{
    int modelYear;
    String name;
    String type;

     //constructor
    public Toyota (int modelYear, String name, String type){
        this.modelYear = modelYear;
        this.name = name;
        this.type = type;
    }

    @Override
    public void runsOn() {
        System.out.println("disel");
    }

    @Override
    public void modelName() {
        System.out.println(this.name);
    }

    //getters
    public int getModelYear() {
        return modelYear;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    //setters

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Car c1 = new Toyota(2001, "xyz", "Electric");  //c1 is instance of car interface
        c1.modelName();
        c1.runsOn();    //hence it is only able to access the properties/methods of car interface

        Toyota t1 = new Toyota(2004, "lol","automatic");
        t1.setName("hahaha");
        System.out.println(t1.getName());
        System.out.println( t1.getModelYear());
        System.out.println(t1.getType());
    }
}

