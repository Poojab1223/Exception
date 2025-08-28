package com.basic;

import java.util.Scanner;

public class InputBasedException {
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
	}

}
