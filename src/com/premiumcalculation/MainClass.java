package com.premiumcalculation;

public class MainClass {
	public static void main(String[] args) {
	PremiumCalculator calculator = new PremiumCalculator();
	Insurance insurance = new Insurance(20, "life", "good", "car");

    try {
        double lifePremium = calculator.calculateLifeInsurance(insurance);
        System.out.println("Life Insurance Premium: " + lifePremium);

        double healthPremium = calculator.calculateHealthInsurance("Average");
        System.out.println("Health Insurance Premium: " + healthPremium);

        double vehiclePremium = calculator.calculateVehicleInsurance("car");
        System.out.println("Vehicle Insurance Premium: " + vehiclePremium);

    } catch (DataNotFoundException e) {
        System.err.println(" Data error: " + e.getMessage());
    } catch (CalculationException e1) {
        System.err.println(" Calculation error: " + e1.getMessage());
    }
	}
}


