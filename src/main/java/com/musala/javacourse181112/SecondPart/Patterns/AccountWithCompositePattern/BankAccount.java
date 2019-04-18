package com.musala.javacourse181112.SecondPart.Patterns.AccountWithCompositePattern;

public class BankAccount extends Account implements AccountActions {
    protected String iban;

    public BankAccount(String name, String iban) {
        super(name);

        this.iban = iban;
    }

    @Override
    public void deposit() {
        System.out.println("Deposit account in Bank");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw account in Bank");
    }

    @Override
    public void charge() {
        System.out.println("Charge account in Bank");
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }
}
