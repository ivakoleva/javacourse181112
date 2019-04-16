package com.musala.javacourse181112.SecondPart.AccountSystem;

public abstract class Account implements AccountActions {
    protected String name;
    protected double accountBalance;

    public Account(String name) {
        this.name = name;
        this.accountBalance = 0d;
    }

    @Override
    public void deposit(){
        System.out.println("Deposit in"+ name+ "account");
    }

    @Override
    public void withdraw(){
        System.out.println("Withdraw from "+ name + "account" );
    }

    @Override
    public abstract void charge();

    @Override
    public void getAccountBalance(){
        System.out.println("account balance: "+ accountBalance);
    }
}
