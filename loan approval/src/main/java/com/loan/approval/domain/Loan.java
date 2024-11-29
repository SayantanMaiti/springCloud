package com.loan.approval.domain;

public class Loan {

    private Long loanId;
    private String applicantName;
    private double loanAmount;
    private int tenureMonths;
    private String loanPurpose;

    // Constructor
    public Loan(Long loanId, String applicantName, double loanAmount, int tenureMonths, String loanPurpose) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.loanAmount = loanAmount;
        this.tenureMonths = tenureMonths;
        this.loanPurpose = loanPurpose;
    }

    // Getters and Setters
    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public void setTenureMonths(int tenureMonths) {
        this.tenureMonths = tenureMonths;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }
}
