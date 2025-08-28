package com.premiumcalculation;

public class PremiumCalculator {
	
	public int calculateLifeInsurance(Insurance insurance) throws DataNotFoundException {
		if (insurance.getAge() == 0) {
            throw new DataNotFoundException("Age data missing for life insurance calculation.");
        }
        try {
            if (insurance.getAge() < 18 || insurance.getAge() > 65) {
                throw new CalculationException("Invalid age for life insurance calculation: " + insurance.getAge());
            }
            return insurance.getAge() * 1000; // simple formula
        } catch (Exception e) {
            throw new CalculationException("Error in life insurance premium calculation: " + e.getMessage());
        }
	}
	
	// Method to calculate Health Insurance premium
    public double calculateHealthInsurance(Insurance insurance) throws DataNotFoundException {
        if (insurance == null ){
            throw new DataNotFoundException("Health condition data missing.");
        }
        try {
            if (insurance.getHealthStatus().equalsIgnoreCase("Good")) {
                return 5000;
            } else if (insurance.getHealthStatus().equalsIgnoreCase("Average")) {
                return 7000;
            } else if (insurance.getHealthStatus().equalsIgnoreCase("Poor")) {
                return 10000;
            } else {
                throw new CalculationException("Unknown health condition: " + insurance);
            }
        } catch (Exception e) {
            throw new CalculationException("Error in health insurance premium calculation: " + e.getMessage());
        }
    }
    
     // Method to calculate Vehicle Insurance premium
    public double calculateVehicleInsurance(String vehicleType) throws DataNotFoundException {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new DataNotFoundException("Vehicle type data missing.");
        }
        try {
            switch (vehicleType.toLowerCase()) {
                case "car": return 8000;
                case "bike": return 4000;
                case "truck": return 15000;
                default: throw new CalculationException("Unknown vehicle type: " + vehicleType);
            }
        } catch (Exception e) {
            throw new CalculationException("Error in vehicle insurance premium calculation: " + e.getMessage());
        }
    }


}
