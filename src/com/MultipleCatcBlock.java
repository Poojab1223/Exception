package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatcBlock {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 100;
		System.out.println("enter divider");
		int divider = scanner.nextInt();
		try {
			System.out.println(number/divider);
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
			a.printStackTrace();
		}
		catch(InputMismatchException ie) {
			System.out.println(ie.getMessage());
			ie.printStackTrace();
		}
	}

}
