package com.musala.javacourse181112.SecondPart.Patterns.AccountWithCompositePattern;

public class Account implements Compressible {
    protected String name;
    protected double accountBalance;

    public Account(String name) {
        this.name = name;
        this.accountBalance = 0d;
    }

    @Override
    public void compress(){
        System.out.println("Compress account in Bank");
    }
}
