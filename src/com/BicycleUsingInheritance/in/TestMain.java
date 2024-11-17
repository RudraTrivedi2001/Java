package com.BicycleUsingInheritance.in;

public class TestMain {
    public static void main(String[] args) {
        // Create a new MountainBike object with initial values
        System.out.println("Creating a new MountainBike with seat height 10, gear 2, and speed 20.");
        MountainBike mn = new MountainBike(10, 2, 20);

        // Print the initial gear
        System.out.print("Your gear has been set from ---> " + mn.gear + " to --->>> ");
        
        // Set a new gear and print the updated gear
        mn.setGear(3);
        System.out.println(mn.gear);
        
        // Apply brakes
        System.out.println("Applying brakes...");
        mn.applyBrake(5); // Apply brakes to reduce speed by 5

        // Display current speed
        System.out.println("Current speed after applying brakes: " + mn.speed + " km/h");
    }
}
