package com.negativenumber;

import java.util.Scanner;

public class NegativeExceptionMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            System.out.println("You entered: " + num);

        } catch (NegativeNumberException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }

}
