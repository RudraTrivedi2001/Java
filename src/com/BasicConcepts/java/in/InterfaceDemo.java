package com.BasicConcepts.java.in;



//Define an interface 'Lol' with two methods
interface Lol {
 // Abstract method 'name' with no return type
 void name();

 // Abstract method 'percentage' that accepts a double and an int and returns a double
 double percentage(double x, int y);
}

//Implementing the 'Lol' interface in the 'Calc' class
class Calc implements Lol {
 // Implement the 'name' method from 'Lol' interface
 @Override
 public void name() {
     System.out.println("Rudra"); // Prints "Rudra" when called
 }

 // Implement the 'percentage' method from 'Lol' interface
 @Override
 public double percentage(double x, int y) {
     // Calculates the percentage of x with respect to y (x/y)*100
     double c = (x / y) * 100;
     return c; // Returns the calculated percentage
 }
}

public class InterfaceDemo {
 public static void main(String[] args) {
     // Creating an object of the 'Calc' class
     Calc c = new Calc();
     
     // Calling the 'name' method on the 'Calc' object
     c.name(); // This will print "Rudra"

     // Calling the 'percentage' method on the 'Calc' object and storing the result in 'b'
     double b = c.percentage(10, 100); // This will calculate 10% of 100
     System.out.println(b); // This will print 10.0
 }
}
