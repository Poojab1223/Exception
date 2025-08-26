package com;

import java.util.Scanner;

public class MultipleException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = null;
		System.out.println("enter number");
		int n = scanner.nextInt();
		try {
			int r = 100/n;
			System.out.println("your name is "+ name + " and it has a "+name.length()+" characters" );
		}
		catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}
		catch(NullPointerException nl) {
			System.out.println("exception "+nl.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
