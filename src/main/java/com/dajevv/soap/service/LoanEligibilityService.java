package com.dajevv.soap.service;

import com.dajevv.soap.components.LoansRepository;
import com.dajevv.soap.loaneligibility.Acknowledgement;
import com.dajevv.soap.loaneligibility.CustomerRequest;
import com.dajevv.soap.loaneligibility.Loan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanEligibilityService {

    public Acknowledgement checkLoanEligibility(CustomerRequest request) {
        Acknowledgement acknowledgement = new Acknowledgement();
        List<String> mismatchCriteriaList = acknowledgement.getCriteriaMismatch();

        if (!(request.getAge() > 30 && request.getAge() <= 60)) {
            mismatchCriteriaList.add("Person age should in between 30 to 60");
        }
        if (!(request.getYearlyIncome() > 200000)) {
            mismatchCriteriaList.add("minimum income should be more than 200000");
        }
        if (!(request.getBikScore() > 500)) {
            mismatchCriteriaList.add("Low BIK Score please try after 6 month");
        }

        if (mismatchCriteriaList.size() > 0) {
            acknowledgement.setApprovedAmount(0);
            acknowledgement.setIsEligible(false);
        } else {
            long requestedAmount = request.getRequestedAmount();
            int requestedRates = request.getRequestedRates();
            String holder = request.getCustomerName();
            if (!LoansRepository.loans.containsKey(holder)) {
                Loan newLoan = new Loan();
                newLoan.setHolder(holder);
                newLoan.setTotalAmount(requestedAmount);
                newLoan.setNoRates(requestedRates);
                newLoan.setAmountLeft(requestedAmount);
                newLoan.setNoRatesLeft(requestedRates);
                LoansRepository.loans.put(request.getCustomerName(), newLoan);
                acknowledgement.setApprovedAmount(requestedAmount);
                acknowledgement.setIsEligible(true);
                mismatchCriteriaList.clear();
            } else {
                mismatchCriteriaList.add("You already have a loan, get lost.");
            }

        }
        return acknowledgement;

    }

}
