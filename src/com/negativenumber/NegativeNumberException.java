package com.negativenumber;

public class NegativeNumberException extends RuntimeException{
	public NegativeNumberException(String message) {
        super(message); // store the message in parent class
    }
}
