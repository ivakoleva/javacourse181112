package com.musala.javacourse181112.SecondPart.AccountSystem;

public class BankAccount extends Account {
    protected String iban;

    public BankAccount(String name, String iban) {
        super(name);
        this.iban = iban;
    }

    @Override
    public void charge() {
        System.out.println("Charge account in Bank");
    }
}
