package com.customermanaement;

public class Customer {
	private int customerid;
	private String name;
	private String address;
	private int zipcode;
	
	
	public Customer(int customerid, String name, String address, int zipcode) {
		if (customerid <= 0) {
            throw new InvalidCustomerDataException("Customer ID must be positive.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidCustomerDataException("Name cannot be empty.");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new InvalidCustomerDataException("Address cannot be empty.");
        }
        String zipStr = String.valueOf(zipcode);
        if (zipStr.length() != 6) {
            throw new InvalidCustomerDataException("Zipcode must be 6 digits.");
        }
        this.customerid = customerid;
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
    
	}
	public int getCustomerid() {
		return customerid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", address=" + address + ", zipcode=" + zipcode
				+ "]";
	}
	

}
