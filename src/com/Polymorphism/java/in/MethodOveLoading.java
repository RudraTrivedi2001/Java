package com.Polymorphism.java.in;


//compile time polymorphism
public class MethodOveLoading {

  // functions have same name but diffrent parameters
  //functions that have same name can not have same parameters and cannot return same data type value i.e a void function and a String function of same name can not return a String value it can only return same values if the no. of paraameters are diffrent in each function

  //method overloading
  public void setName(String name){
      System.out.println(name);
  }
  public String setName(String name, String lol){
      return name + lol;
  }
  public void setName(String p, String y, String j ){
      System.out.println(p);
  }
}

