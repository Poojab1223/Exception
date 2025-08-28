package com.customermanaement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerManagement {

	List<Customer> list = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);

	public List<Customer> getList() {
		return list;
	}
	public void setList(List<Customer> list) {
		this.list = list;
	}
	public void addCustomer() {
		System.out.println("enter name");
		String name = scanner.next();
		System.out.println("enter id");
		int id = scanner.nextInt();
		System.out.println("enter address");
		String address = scanner.next();
		System.out.println("enetr zipcode");
		int zipcode = scanner.nextInt();
		try {
		Customer customer = new Customer(id,name,address,zipcode);
		list.add(customer);
		}
		catch(InvalidCustomerDataException i) {
			System.out.println(i.getMessage());
		}
	}
	public void deleteCustomer() throws CustomerNotFoundException {
		Customer customer = null;
		System.out.println("enter customer id");
		int id = scanner.nextInt();
		boolean flag = false;
		for(int i = 0; i< list.size();i++ ) {
			if(list.get(i).getCustomerid() == id ) {
				customer = list.get(i);
				flag = true;
			}
		}
		if(flag == true) {
			list.remove(customer);
			System.out.println("deleted!!!!");
		}
		else
			throw new CustomerNotFoundException("customer is not present");
	}

	public Customer isExist(int id) {
		for (Customer c : list) {
			if (c.getCustomerid() == id) {
				return c; // directly return when found
			}
		}
		return null; // not found
	}

	public void updateCustomer( ) {
		System.out.println("enter customer id");
		int id = scanner.nextInt();
		Customer customer = isExist(id);
		if( customer!= null) {
			while(true) {
				System.out.println("what do you want to upadte");
				System.out.println("1.Name \n  2.Address \n 3. Zipcode \n 4.Exist");
				System.out.println("enter your choice");
				int choice = scanner.nextInt();

				switch(choice) {

				case 1 : 
					System.out.println("enter the new name");
					String name = scanner.next();
					customer.setName(name);
					break;

				case 2: System.out.println("enter the new Address");
				String adress = scanner.next();
				customer.setAddress(adress);
				break;

				case 3:System.out.println("enter the new zipcode");
				String zipcode = scanner.next();
				customer.setAddress(zipcode);
				break;

				case 4: System.out.println("exit!!!!!!!");
				return;

				default :System.out.println("invalid choice");
				}
			}
		}
		else {
			System.out.println("customer not found");
		}
	}

}

