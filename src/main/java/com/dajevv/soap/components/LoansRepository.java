package com.dajevv.soap.components;

import com.dajevv.soap.loaneligibility.Loan;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class LoansRepository {

    public static final Map<String, Loan> loans = new HashMap<>();

    @PostConstruct
    public void initData() {
        Loan krystian = new Loan();
        krystian.setHolder("Krystian");
        krystian.setTotalAmount(400000);
        krystian.setNoRates(120);
        krystian.setAmountLeft(350000);
        krystian.setNoRatesLeft(100);

        loans.put(krystian.getHolder(), krystian);

        Loan julia = new Loan();
        julia.setHolder("Julia");
        julia.setTotalAmount(300000);
        julia.setNoRates(120);
        julia.setAmountLeft(280000);
        julia.setNoRatesLeft(107);

        loans.put(julia.getHolder(), julia);

        Loan fifi = new Loan();
        fifi.setHolder("Filip");
        fifi.setTotalAmount(800000);
        fifi.setNoRates(240);
        fifi.setAmountLeft(300000);
        fifi.setNoRatesLeft(83);

        loans.put(fifi.getHolder(), fifi);


    }

    public Loan getLoan(String name) {
        Assert.notNull(name, "You must provide a loan's holder name");
        return loans.getOrDefault(name, null);
    }

    public void setLoan(String name, Loan editedLoan) {
        loans.replace(name, editedLoan);
    }
}
