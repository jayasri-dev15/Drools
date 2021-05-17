package com.sample;

/*Drools Agenda Group Example

Agenda Group in Drools is special feature in Drools which contains a set of rules or a single rule within a group and it makes the knowledge session understand the activation of rules.

At a single moment of time, only one agenda group has focus that means only the rules in that group will be activated and fired.

By default every rule is associated with the MAIN agenda group.

Agenda group are useful to differentiate the set of rules from the rest of the rules in a knowledge session that apply to particular sub-process within a large process.*/

public class LoanAmount {

    private String accountId;

    private Integer bankBalance;

    private Integer monthlyInstallment;

    private boolean insufficientBalance;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(Integer bankBalance) {
        this.bankBalance = bankBalance;
    }

    public Integer getMonthlyInstallment() {
        return monthlyInstallment;
    }

    public void setMonthlyInstallment(Integer monthlyInstallment) {
        this.monthlyInstallment = monthlyInstallment;
    }

    public boolean isInsufficientBalance() {
        return insufficientBalance;
    }

    public void setInsufficientBalance(boolean insufficientBalance) {
        this.insufficientBalance = insufficientBalance;
    }
}