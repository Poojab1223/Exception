package com.premiumcalculation;

public class Insurance {
	
	private int age;
	private String insuranceType;
	private String healthStatus;
	private String vehiclType;
	
	
	public Insurance(int age, String insuranceType, String healthStatus, String vehiclType) {

		this.age = age;
		this.insuranceType = insuranceType;
		this.healthStatus = healthStatus;
		this.vehiclType = vehiclType;
	}
	
	
	public int getAge() {
		return age;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public String getHealthStatus() {
		return healthStatus;
	}
	public String getVehiclType() {
		return vehiclType;
	}
	
	

}
