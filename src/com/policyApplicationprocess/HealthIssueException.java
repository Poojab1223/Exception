package com.policyApplicationprocess;

public class HealthIssueException extends Exception{

	private String message;

	public HealthIssueException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}
}
