package com.customermanagement;

public class InvalidCustomerDataException extends RuntimeException{

private String message;
	
	public InvalidCustomerDataException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
