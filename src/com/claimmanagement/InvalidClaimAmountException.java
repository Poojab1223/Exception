package com.claimmanagement;

public class InvalidClaimAmountException extends RuntimeException{

	public InvalidClaimAmountException(String str) {
		super(str);
	}
}
