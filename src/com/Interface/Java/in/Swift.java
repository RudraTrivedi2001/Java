package com.Interface.Java.in;




public class Swift extends Toyota implements Car{
    //constructor
    public Swift(int modelYear, String name, String type){
        super(modelYear, name, type);

    }
    //


    @Override
    public void runsOn() {
        System.out.println("loda");
    }

    @Override
    public void modelName() {
        System.out.println("best");
    }

    public static void main(String[] args) {


        Swift s1 = new Swift(2003, "ehehe", "kya bolti public");
        System.out.println( s1.getName());
        s1.setName("hehesjek");
        System.out.println(s1.getName());

    }
}

