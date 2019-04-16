package com.musala.javacourse181112.SecondPart.AccountSystem;

public abstract class Card  extends Account{
    protected String IBAN;
    protected String Holder;
    protected String CCV;
    protected String ExpireDate;

    public Card(String name, String IBAN, String holder, String CCV, String expireDate) {
        super(name);
        this.IBAN = IBAN;
        Holder = holder;
        this.CCV = CCV;
        ExpireDate = expireDate;
    }
}
