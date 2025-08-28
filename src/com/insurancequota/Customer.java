package com.insurancequota;

public class Customer {
	
	private int age;
	private String name;
	private String health;
	private String vehicleType;
	private String insuranceType;
	
	public Customer(int age, String name, String health, String vehicleType) {
		this.age = age;
		this.name = name;
		this.health = health;
		this.vehicleType = vehicleType;
	}
	 Customer(CustomerBuilder builder) {
	    this.age = builder.age;
	    this.name = builder.name;
	    this.health = builder.health;
	    this.vehicleType = builder.vehicleType;
	    this.insuranceType = builder.insuranceType;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getHealth() {
		return health;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public String getInsuranceType() {
		return insuranceType;
	}	

}
