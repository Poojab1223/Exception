package com.clainmanagement;

public class InvalidClaimAmountException extends RuntimeException{

	public InvalidClaimAmountException(String str) {
		super(str);
	}
}
