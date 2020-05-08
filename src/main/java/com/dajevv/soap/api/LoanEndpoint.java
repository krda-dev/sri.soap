package com.dajevv.soap.api;

import com.dajevv.soap.components.LoansRepository;
import com.dajevv.soap.loaneligibility.GetLoanRequest;
import com.dajevv.soap.loaneligibility.GetLoanResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LoanEndpoint {

    private static final String NAMESPACE = "http://www.dajevv.com/soap/loanEligibility";

    private LoansRepository loansRepository;

    @Autowired
    public LoanEndpoint(LoansRepository loansRepository) {
        this.loansRepository = loansRepository;
    }

    @PayloadRoot(namespace = NAMESPACE, localPart = "getLoanRequest")
    @ResponsePayload
    public GetLoanResponse getLoan(@RequestPayload GetLoanRequest request) {
        GetLoanResponse response = new GetLoanResponse();
        response.setLoan(loansRepository.getLoan(request.getName()));
        return response;
    }
}
