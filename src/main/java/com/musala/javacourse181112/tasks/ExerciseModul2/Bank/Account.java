package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public abstract class Account implements AccountInterface {

    protected double balance;

    protected Account(double balance) {
        this.balance= balance;
    }


    public void deposit(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        balance -= sum;
    }

    public Double getCurrentBalance(){
        return balance;

    }
    abstract void charge();
}
