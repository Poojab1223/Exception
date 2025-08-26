package com;

import java.util.Scanner;

public class BankMainClass {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);

    BankAccount account = new BankAccount(5000); // initial balance

    System.out.print("Enter amount to withdraw: ");
    double amount = sc.nextDouble();

    try {
        account.withdraw(amount);
    } catch (InsufficientFundsException e) {
        System.out.println("Exception: " + e.getMessage());
    } finally {
        sc.close();
        System.out.println("Transaction completed.");
    }

	}
}
