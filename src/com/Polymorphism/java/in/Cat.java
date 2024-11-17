package com.Polymorphism.java.in;

public class Cat extends Animal {

    // Constructor for Cat class
    public Cat(int age, String name) {
        super(age, name);  // Calls the constructor of the Animal class to initialize age and name
    }

    // Method overriding or runtime polymorphism
    // The setName method from the Animal class is overridden here to change its behavior
    @Override
    public void setName(String name) {
        System.out.println(name);  // Prints the name to the console instead of setting it
    }

    // Overriding the getAge method to add 3 to the age of the animal
    @Override
    public int getAge() {
        return super.age + 3;  // Adds 3 to the age of the animal from the superclass
    }

    // Static method: Static methods cannot be overridden unless the static keyword is used in the subclass
    public static void ageName(String name, int age) {
        System.out.println("lolahahaha " + name + " " + age);  // Prints the name and age with a custom message
    }

    public static void main(String[] args) {
        // Dynamic binding: At runtime, the reference type is Animal, but the actual object is Cat
        Animal animal = new Cat(34, "lulla");  // Creating an object of type Cat but referring it with Animal reference

        animal.age = 33;  // Setting the age of the animal (this is actually setting the age of Cat)
        System.out.println(animal.getAge());  // This will print the age + 3 from the Cat class' getAge method

        // Calling the static method using the class name, not the object
        Animal.ageName();  // This calls the static method in the Animal class

        // Calling the static method defined in the Cat class
        Cat.ageName("lol", 4);  // This calls the static method in the Cat class
    }
}
