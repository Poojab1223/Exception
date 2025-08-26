package com;

public class InvalidAgeException extends RuntimeException{
	public String messege;

	public InvalidAgeException(String messege) {
		super(messege);
		this.messege = messege;
	}
	public String getMessege() {
		return this.messege;
	}
	
}
