package com.loan.disbursement.service;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

@Service
@Slf4j
public class LoanDisbursementService {

    public Consumer<String> output() {
        return loanStatus -> {
            log.info("Received message for loan disbursement: " + loanStatus);

//            JSONObject loanJson = new JSONObject(loanStatus);
//            log.info("Loan application ID: " + loanJson.getLong("applicationId"));
//            log.info("Applicant Name: " + loanJson.getString("applicantName"));
//
//            log.info("Disbursing loan of amount: " + loanJson.getDouble("loanAmount"));

        };
    }
}
