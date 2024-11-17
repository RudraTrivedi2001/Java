package com.BicycleUsingInheritance.in;

public class MountainBike extends Bicycle {
    int seatHeight;

    // Constructor to initialize MountainBike object
    public MountainBike(int startSeatHeight, int startGear, int startSpeed) {
        super(startGear, startSpeed); // Call the constructor of the parent class (Bicycle)
        this.seatHeight = startSeatHeight; // Initialize seat height
    }

    // Method to set the seat height
    public void setSeatHeight(int newValue) {
        this.seatHeight = newValue;
    }
}
