package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public class CreditCard extends Account {
    public CreditCard(String iban, String holder, String ccv, String expireDate,double balance) {
        super(balance);
        this.iban = iban;
        this.holder = holder;
        this.ccv = ccv;
        this.expireDate = expireDate;


    }

    String iban;
    String holder;
    String ccv;
    String expireDate;

    @Override
    void charge() {
        balance-=2;
    }
}
