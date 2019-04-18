package com.musala.javacourse181112.SecondPart.AccountSystem;

public abstract class Account implements AccountActions {
    protected String name;
    protected double accountBalance;

    public Account(String name) {
        this.name = name;
        this.accountBalance = 0d;
    }

    @Override
    public void deposit(double amount){
        if(amount>0) {
            accountBalance += amount;
            System.out.println("Deposit: "+ amount +" in " + name + " account");
        }
    }

    @Override
    public void withdraw(double amount){
        if (accountBalance - amount > 0) {
            System.out.println("Withdraw "+ amount +" from account: " + name);
        }else {
            System.out.println("Not enough money, Withdraw from " + name + " account failed");
        }
    }

    @Override
    public abstract void charge();

    @Override
    public void getAccountBalance(){
        System.out.println("Account("+ name +") balance: "+ accountBalance);
    }

    public double getBalance(){
        return accountBalance;
    }
}
