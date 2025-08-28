package com.premiumcalculation;

public class CalculationException extends RuntimeException {

   private String message;
	
	public  CalculationException(String msg) {
		this.message = msg;
	}
	
	public String getMessage() {
		return this.message;
	}
}
