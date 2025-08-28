package com.clainmanagement;

import java.time.LocalDate;

public class MainClass {
	public static void main(String[] args) {
        ClaimProcessingSystem system = new ClaimProcessingSystem();

        // Example claim (invalid for demo)
        Claim claim = new Claim(
                101,
                12000, // claim amount
                LocalDate.of(2025, 8, 28),
                100000, // coverage limit
                LocalDate.of(2025, 1, 1),
                LocalDate.of(2025, 12, 31)
        );

        try {
            system.processClaim(claim);
        } catch (InvalidClaimAmountException | FraudulentClaimException e) {
            System.err.println(" Claim rejected: " + e.getMessage());
           
        }
	}
}
