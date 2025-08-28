package com.policyApplicationprocess;

public class User {

	private String name;
	private int age;
	private String  healthStatus;
	private String drivingRecords;
	
	public User(String name, int age,String healthStatus, String drivingRecords ) {
	
		this.name = name;
		this.healthStatus = healthStatus;
		this.drivingRecords = drivingRecords;
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return name;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public String getDrivingRecords() {
		return drivingRecords;
	}	
}
