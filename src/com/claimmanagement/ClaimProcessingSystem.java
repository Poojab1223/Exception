package com.claimmanagement;

public class ClaimProcessingSystem {

	public void processClaim(Claim claim) {
        // 1. Validate claim amount
        if (claim.getClaimAmount() <= 0) {
            throw new InvalidClaimAmountException("Claim amount must be positive.");
        }

        if (claim.getClaimAmount() > claim.getCoverageLimit()) {
            throw new FraudulentClaimException("Claim exceeds coverage limit.");
        }

        // 2. Validate claim date
        if (claim.getClaimDate().isBefore(claim.getPolicyStartDate()) ||
            claim.getClaimDate().isAfter(claim.getPolicyEndDate())) {
            throw new FraudulentClaimException("Claim date is outside policy coverage period.");
        }

        // If all checks pass
        System.out.println(" Claim processed successfully for Policy ID: " + claim.getPolicyId());
    }
}
