package com.musala.javacourse181112.SecondPart.AccountSystem;

public class PaypalAccount extends Account {
    protected String email;

    public PaypalAccount(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void charge() {
        System.out.println("Charge in Paypal");
    }
}
