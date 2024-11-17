package com.OOPS.Java.in;

class NonParametrizedCons{
    String name;
    String type;

    public void printInfo() {
        System.out.println(this.name + " "+ this.type);

    }
    NonParametrizedCons(){
        System.out.println("A object is going to be created");
    }
}
class ParametrizedConstructors{
    String name;
    String type;
    public void info(){
        System.out.println(this.name + " " + this.type);
    }
    ParametrizedConstructors(String name, String type){
        this.name = name;
       this.type = type;

    }
}
class CopyConstructors{
       String name ;
       String type;
       public void info(){
           System.out.println(this.name +" "+this.type);
       }
       CopyConstructors(CopyConstructors c2){
           this.name= c2.name;
           this.type=c2.type;

       }
       CopyConstructors(){
           //created beacuse of c1
       }

}
public class Constructors {

   public static void main(String[] args) {
       NonParametrizedCons n1 = new NonParametrizedCons();
       n1.name="Constructor";
       n1.type = "Non-parametrized";
       n1.printInfo();

       //parametrized constructor
       ParametrizedConstructors p1 = new ParametrizedConstructors("Constructor", "Parametrized");
       p1.info();
       //copy constructor

       CopyConstructors c1 = new CopyConstructors();
       c1.type="copy";
       c1.name="constructor";
       c1.info();
       //now lets copy properties of c1 in c2
       CopyConstructors c2 = new CopyConstructors(c1);
       c2.info();
   }
}
