package com.customermanagement;

public class CustomerNotFoundException extends Exception{

	private String message;
	
	public CustomerNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
