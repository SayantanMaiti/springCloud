package com.loan.application.controller;

import com.loan.application.LoanApplication;
import com.loan.application.domain.Loan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanApplicationController {

    @Autowired
    private LoanApplication loanApplication;

    @PostMapping("/apply")
    public String submitLoanApplication(@RequestBody Loan loan) {
        // Loan loan = new Loan(1L, "John Doe", 50000.0, 36, "Home Renovation");

        loanApplication.sendLoanApplication(loan);
        return "Application Submitted Successfully";
    }
}
