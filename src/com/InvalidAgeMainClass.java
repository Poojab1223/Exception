package com;

import java.util.Scanner;

public class InvalidAgeMainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        
        try {
            int age = scanner.nextInt();

            if (age >= 18) {
                System.out.println("Valid age! You are eligible.");
            } else {
                throw new InvalidAgeException("You have to turn 18 to be eligible.");
            }

        } catch (InvalidAgeException ie) {
            System.out.println("Custom Exception: " + ie.getMessage());
        } 
	}
}		
