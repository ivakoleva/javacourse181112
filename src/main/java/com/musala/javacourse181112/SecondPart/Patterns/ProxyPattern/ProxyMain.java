package com.musala.javacourse181112.SecondPart.Patterns.ProxyPattern;

import com.musala.javacourse181112.SecondPart.AccountSystem.Account;
import com.musala.javacourse181112.SecondPart.AccountSystem.AccountActions;
import com.musala.javacourse181112.SecondPart.AccountSystem.BankAccount;

import java.util.LinkedList;
import java.util.List;

public class ProxyMain {
    public static void main(String[] args) {
        List<AccountActions> accounts = new LinkedList<>();

        Account stealAccount =  new BankAccount("stealerAccount","Iban7777");
        Account bankAccount  =  new BankAccount("bankAccount1","Iban1");
        Account bankAccount2 =  new BankAccount("bankAccount2","Iban2");
        Account bankAccount3 =  new BankAccount("bankAccount3","Iban3");

        accounts.add(bankAccount);
        accounts.add(bankAccount2);
        accounts.add(bankAccount3);

        ProxyAccount proxyAccount = new ProxyAccount(stealAccount,3);

        accounts.forEach(account -> {
            proxyAccount.setAccount((Account) account);
            proxyAccount.deposit(1000);
            proxyAccount.withdraw(200);
            proxyAccount.charge();
            proxyAccount.getAccountBalance();
        });

        System.out.println("\nYour steal amount: " + stealAccount.getBalance());
    }
}
