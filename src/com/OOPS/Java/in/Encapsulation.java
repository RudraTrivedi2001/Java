package com.OOPS.Java.in;


//data hiding using private methods and properties
//setters and getters are used to access and change the value
//same file mai do class public nhi ho sakti


class Human{
  private String name;
  private int age;


  //constructor
  public Human(String name, int age){
      this.name = name;
      this.age = age;


  }
  //setters
  public void setName(String name){
      this.name = name;
  }
  public void setAge(int age){
      this.age = age;
  }
  //getters
  public void getName(){
      System.out.println(this.name);
  }
  public void getAge(){
      System.out.println(this.age);
  }
}
public class Encapsulation {
  public static void main(String[] args) {
      Human hm = new Human("lol",16); //hm cannot directly acces the variable i.e. properties asn they are hidden
      hm.getAge();//hence in encapsulation we difine methods by ourself to acces the data / properties without showing the user what properties or varibles are storing. only by accesseing set and get metods we can accesss the data
      hm.setAge(44);
      hm.getAge();
      hm.getName();
      hm.setName("hahaha");
      hm.getName();

  }

}

