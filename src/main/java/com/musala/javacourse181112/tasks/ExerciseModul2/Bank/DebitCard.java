package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public class DebitCard extends Account {
    String iban;
    String holder;
    String ccv;
    String expireDate;

    public DebitCard(double balance, String iban, String holder, String ccv, String expireDate) {
        super(balance);
        this.iban = iban;
        this.holder = holder;
        this.ccv = ccv;
        this.expireDate = expireDate;
    }

    @Override
    void charge() {
        balance-=2;
    }
}
