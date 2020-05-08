package com.dajevv.soap.api;

import com.dajevv.soap.components.LoansRepository;
import com.dajevv.soap.loaneligibility.GetLoanResponse;
import com.dajevv.soap.loaneligibility.Loan;
import com.dajevv.soap.loaneligibility.PayLoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PayLoanEndpoint {

    private static final String NAMESPACE = "http://www.dajevv.com/soap/loanEligibility";

    private LoansRepository loansRepository;

    @Autowired
    public PayLoanEndpoint(LoansRepository loansRepository) {
        this.loansRepository = loansRepository;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "payLoanRequest")
    @ResponsePayload
    public GetLoanResponse updateLoan(@RequestPayload PayLoanRequest request) {
        GetLoanResponse response = new GetLoanResponse();
        Loan editableLoan = loansRepository.getLoan(request.getName());
        if (editableLoan != null) {
            long value = editableLoan.getAmountLeft() - Math.abs(request.getValue());
            if (value < 0) {
                value = 0;
            }
            editableLoan.setAmountLeft(value);
            editableLoan.setNoRatesLeft(editableLoan.getNoRatesLeft() - 1);
            loansRepository.setLoan(request.getName(), editableLoan);
            response.setLoan(editableLoan);
        }
        return response;
    }
}
