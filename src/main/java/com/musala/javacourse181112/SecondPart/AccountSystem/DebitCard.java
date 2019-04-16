package com.musala.javacourse181112.SecondPart.AccountSystem;

public class DebitCard extends Card {

    public DebitCard(String name, String IBAN, String holder, String CCV, String expireDate) {
        super(name, IBAN, holder, CCV, expireDate);
    }

    @Override
    public void charge() {
        System.out.println("Charge in Debit Card");
    }
}
