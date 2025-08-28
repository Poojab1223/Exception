package com.premiumcalculation;

public class DataNotFoundException extends Exception{

	private String message;
	
	public DataNotFoundException(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return this.message;
	}
}
