package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public class PayPalAccount extends Account {

String email;


    public PayPalAccount(String email,double balance) {
        super(balance);
        this.email = email;
    }

    @Override
   public void charge() {
        balance-=2;
    }
}
