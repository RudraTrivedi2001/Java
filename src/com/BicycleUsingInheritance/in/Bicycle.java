package com.BicycleUsingInheritance.in;

import java.util.Scanner;

public class Bicycle {
    protected int gear;
    protected int speed;
    Scanner sc = new Scanner(System.in);

    // Constructor to initialize Bicycle object
    public Bicycle(int startGear, int startSpeed) {
        System.out.println("Please enter the gear to start with (1-4): ");
        startGear = sc.nextInt();
        switch (startGear) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Your gear has been set to " + startGear);
                this.gear = startGear;
                break;
            default:
                System.out.println("Invalid: Gear does not exist");
                System.exit(0);
        }

        System.out.println("Please enter the starting speed (1-100 km/h): ");
        startSpeed = sc.nextInt();
        if (startSpeed <= 0 || startSpeed > 100) {
            System.out.println("Your starting speed cannot be " + startSpeed + " km/h");
            System.exit(0);
        } else {
            System.out.println("Your starting speed is " + startSpeed + " km/h");
            this.speed = startSpeed;
        }
    }

    // Method to change the gear
    public void setGear(int newGear) {
        System.out.println("Type the gear you want to change to (1-4): ");
        newGear = sc.nextInt();
        switch (newGear) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("You are changing gear from " + this.gear + " to " + newGear);
                this.gear = newGear;
                break;
            default:
                System.out.println("Invalid: Gear does not exist");
                System.exit(0);
        }
    }

    // Method to set the speed
    public void setSpeed(int speed) {
        System.out.println("Set the new speed (1-299 km/h): ");
        speed = sc.nextInt();
        if (speed <= 0 || speed >= 300) {
            System.out.println("Sorry, this is the limit of the bike");
        } else {
            System.out.println("Your speed has been set to " + speed + " km/h");
            this.speed = speed;
        }
    }

    // Method to apply brakes
    public void applyBrake(int decreaseSpeed) {
        System.out.println("You are applying brakes on your bike. Enter the speed to decrease (0-299 km/h): ");
        decreaseSpeed = sc.nextInt();
        if (decreaseSpeed >= 0 && decreaseSpeed < 300) {
            if (decreaseSpeed == 0) {
                System.out.println("Bike is at rest");
                this.speed = decreaseSpeed;
            } else {
                this.speed -= decreaseSpeed;
                System.out.print("Your new speed is " + speed + " km/h");
            }
        } else {
            System.out.println("Invalid Speed: Type correct information");
            applyBrake(decreaseSpeed); // Recursively prompt correct input
        }
    }

    // Method to increase speed
    public void speedUp(int incrSpeed) {
        this.speed += incrSpeed;
    }

    // Method to display current gear
    public void getGear() {
        System.out.println(this.gear);
    }
}
