package com.loan.application;

import com.loan.application.domain.Loan;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class LoanApplication {

    @Autowired
    private StreamBridge streamBridge;

    public void sendLoanApplication(Loan loan) {
        // send the loan application
        JSONObject loanJson = new JSONObject();
        loanJson.put("loanId", loan.getLoanId());
        loanJson.put("applicantName", loan.getApplicantName());
        loanJson.put("loanAmount", loan.getLoanAmount());
        loanJson.put("tenureMonths", loan.getTenureMonths());
        loanJson.put("loanPurpose", loan.getLoanPurpose());

        // Send the loan information to the stream
        streamBridge.send("output-out-0", loanJson.toString());
    }
}
