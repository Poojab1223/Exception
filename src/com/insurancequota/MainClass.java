package com.insurancequota;

public class MainClass {
	public static void main(String[] args) {
		
		InsuranceSystemQuota insuranceSystemQuota = new InsuranceSystemQuota();
		CustomerBuilder customerBuilder = new CustomerBuilder();
		Customer customer = customerBuilder.setAge(20).setHealth("good").setInsuranceType("health").build();
	    
		int premium = insuranceSystemQuota.generateQuota(customer);
	    System.out.println("the prmium you have to pay is ₹"+ premium);
	
	}
}
