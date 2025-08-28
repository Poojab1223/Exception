package com.insurancequota;

public class InsuranceSystemQuota {

	int basepremium = 7000;
	int estimated;
	public int generateQuota(Customer customer){
       if(customer.getInsuranceType().equalsIgnoreCase("health"))
              estimated = calculateQuotaBasedOnHealth(customer);
	
       else
    	     estimated = calculateQuotaBasedOnVehicleType(customer);
       
       return estimated;
	}

	public int calculateQuotaBasedOnAge(Customer customer) {
		try {
			if(customer.getAge() < 18) {
				throw new InvalidInputException("you are not eligible as you are under 18");
			}
		}
		catch(InvalidInputException i){
			System.out.println(i.getMessage());
		}
		if(customer.getAge() >= 50 ) {
			return  7000;
		}
		else 
			return  4000;
	}

	public int calculateQuotaBasedOnHealth(Customer customer) {
		int premium = 0;
		int basedOnAge = calculateQuotaBasedOnAge(customer);
		if(customer.getHealth().equalsIgnoreCase("good")) {
			premium = basedOnAge + basepremium + 1000;
		}
		else if(customer.getHealth().equalsIgnoreCase("average")) {
			premium = basedOnAge + basepremium + 3000;
		}
		else {
			try {
				throw new InvalidInputException("invalide input");
			}
			catch(InvalidInputException i) {
				System.out.println(i.getMessage());
			}
		}
		return premium;
	}
	public int calculateQuotaBasedOnVehicleType(Customer customer) {
		int premium = 0;
		if(customer.getVehicleType().equalsIgnoreCase("car")) {
			premium = basepremium + 3000;
		}
		else if(customer.getVehicleType().equalsIgnoreCase("car")) {
			premium = basepremium + 1000;
		}
		else {
			try {
				throw new InvalidInputException("invalide input");
			}
			catch(InvalidInputException i) {
				System.out.println("wrong input");
			}
		}
		return premium;
	}
}
