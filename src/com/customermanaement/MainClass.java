package com.customermanaement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		CustomerManagement customerManagement = new CustomerManagement();

		while(true) {
			System.out.println("1. add cusomer\n 2.update Customer \n 3.checkIfExist \n 4.delete \n 5.exist");
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch(choice) {
			case 1: customerManagement.addCustomer();
			break;
			case 2: customerManagement.updateCustomer();
			break;
			case 3: 
				System.out.println("enter cutsomer id");
				int id = scanner.nextInt();
				if(customerManagement.isExist(id)!= null) {
					System.out.println("customer present");
				}
				break;
			case 4:
				try {
					customerManagement.deleteCustomer();
				}
				catch(CustomerNotFoundException c){
					System.out.println(c.getMessage());
				}
				break;
			case 5:System.out.println("exit!!!!!!!");
			return;
			default :System.out.println("invalid choice");

			}
		}

	}
}