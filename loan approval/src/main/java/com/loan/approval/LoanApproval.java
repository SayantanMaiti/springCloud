package com.loan.approval;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Function;

@Slf4j
@Component
public class LoanApproval {
    
    public Function<String, String> output() {
        return loanData -> {
            log.info("Received loan application data: " + loanData);
            JSONObject loanJson = new JSONObject(loanData);

            Long loanId = loanJson.getLong("loanId");
            String applicantName = loanJson.getString("applicantName");
            double loanAmount = loanJson.getDouble("loanAmount");
            int tenureMonths = loanJson.getInt("tenureMonths");
            String loanPurpose = loanJson.getString("loanPurpose");

            log.info("Loan Application ID: " + loanId);
            log.info("Applicant Name: " + applicantName);
            log.info("Loan Amount: " + loanAmount);
            log.info("Tenure: " + tenureMonths + " months");
            log.info("Purpose: " + loanPurpose);

            // Simulate loan approval logic
            if (loanAmount <= 50000) {
                return "Loan of Rs "+ loanAmount + " approved for applicant: " + applicantName;
            } else {
                return "Loan of Rs "+ loanAmount + " denied for applicant: " + applicantName;
            }
        };
    }
    
}
