package com.insurancequota;

public class CustomerBuilder {
	public int age;
    public String name;
    public String health;
    public String vehicleType;
    public String insuranceType;

    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomerBuilder setHealth(String health) {
        this.health = health;
        return this;
    }

    public CustomerBuilder setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public CustomerBuilder setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
        return this;
    }

    
    public Customer build() {
        return new Customer(this);
    }
}

