package com.musala.javacourse181112.SecondPart.AccountSystem;

import java.util.LinkedList;
import java.util.List;

public class ChangeProcessor {

    public static <T extends AccountActions> void main(String[] args) {
        List<T> accounts = new LinkedList<>();

        T bankAccount = (T) new BankAccount("bankAccount1","Iban1");
        T payPalAccount =(T) new PaypalAccount("bankAccount2","Iban2");
        T debidCard = (T)new DebitCard("bankAccount3","Iban3","holder1","CCV1","12.12.2019");
        T creditCard = (T)new CreditCard("bankAccount4","Iban4","holder2","CCV2","12.12.2020");

        accounts.add(bankAccount);
        accounts.add(payPalAccount);
        accounts.add(debidCard);
        accounts.add(creditCard);

        accounts.forEach(AccountActions::charge);

        for (T a : accounts){
            a.charge();
        }
    }
}
