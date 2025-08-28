package com.clainmanagement;

import java.time.LocalDate;

public class Claim {

	private int policyId;
    private double claimAmount;
    private LocalDate claimDate;
    private double coverageLimit;
    private LocalDate policyStartDate;
    private LocalDate policyEndDate;

    public Claim(int policyId, double claimAmount, LocalDate claimDate,
                 double coverageLimit, LocalDate policyStartDate, LocalDate policyEndDate) {
        this.policyId = policyId;
        this.claimAmount = claimAmount;
        this.claimDate = claimDate;
        this.coverageLimit = coverageLimit;
        this.policyStartDate = policyStartDate;
        this.policyEndDate = policyEndDate;
    }

    public int getPolicyId() {
        return policyId;
    }
    public double getClaimAmount() {
        return claimAmount;
    }
    public LocalDate getClaimDate() {
        return claimDate;
    }
    public double getCoverageLimit() {
        return coverageLimit;
    }
    public LocalDate getPolicyStartDate() {
        return policyStartDate;
    }
    public LocalDate getPolicyEndDate() {
        return policyEndDate;
    }


}
