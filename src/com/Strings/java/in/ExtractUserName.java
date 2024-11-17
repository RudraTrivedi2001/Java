package com.Strings.java.in;


import java.util.*;

public class ExtractUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for an email address
        System.out.println("Please enter your email address:");
        String email = sc.next();

        // Check if the email contains '@'
        if (!email.contains("@")) {
            System.out.println("Invalid email address.");
            return;
        }

        String username = "";

        // Loop through each character of the email
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                System.out.println("Username extracted from email: " + username);
                break;  // Stop the loop once the username is printed
            } else {
                username += email.charAt(i);  // Append the character to username
            }
        }
    }
}

