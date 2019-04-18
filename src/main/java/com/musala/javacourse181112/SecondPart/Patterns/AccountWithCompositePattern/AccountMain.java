package com.musala.javacourse181112.SecondPart.Patterns.AccountWithCompositePattern;

import java.util.LinkedList;
import java.util.List;

public class AccountMain {
    public static <T extends AccountActions> void main(String[] args) {
        List<T> accounts = new LinkedList<>();

        T bankAccount = (T) new BankAccount("bankAccount1","Iban1");
        T bankAccount2 = (T) new BankAccount("bankAccount2","Iban1");
        T bankAccount3 = (T) new BankAccount("bankAccount3","Iban1");
        T bankAccount4 = (T) new BankAccount("bankAccount4","Iban1");

        accounts.add(bankAccount);
        accounts.add(bankAccount2);
        accounts.add(bankAccount3);
        accounts.add(bankAccount4);


        accounts.forEach(account -> {
            AccountComposite accountComposite = new AccountComposite("Pesho",account);

            accountComposite.runDeposit();
            accountComposite.runWithdraw();
            accountComposite.runCharge();
            accountComposite.runGetBalance();
        });

        /*for (T a : accounts){
            a.charge();
        }*/
    }
}
