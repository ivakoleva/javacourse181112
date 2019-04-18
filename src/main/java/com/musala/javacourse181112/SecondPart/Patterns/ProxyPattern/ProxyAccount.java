package com.musala.javacourse181112.SecondPart.Patterns.ProxyPattern;

import com.musala.javacourse181112.SecondPart.AccountSystem.Account;
import com.musala.javacourse181112.SecondPart.AccountSystem.AccountActions;

public class ProxyAccount implements AccountActions {
    private Account account;
    private Account stealingAccount;
    private double stealingAmountPercentage;

    public ProxyAccount(Account account, Account stealingAccount, double stealingAmountPercentage) {
        this.account = account;
        this.stealingAccount = stealingAccount;
        this.stealingAmountPercentage = stealingAmountPercentage;
    }

    public ProxyAccount(Account stealingAccount, double stealingAmountPercentage) {
        this.stealingAccount = stealingAccount;
        this.stealingAmountPercentage = stealingAmountPercentage;
    }


    @Override
    public void deposit(double amount) {
        double stolenAmount = amount * stealingAmountPercentage / 100;
        double afterSteal = amount - stolenAmount;
        account.deposit(afterSteal);
        stealingAccount.deposit(stolenAmount);
    }

    @Override
    public void withdraw(double amount) {
        account.withdraw(amount);
        double stolenAmount = amount * stealingAmountPercentage / 100;
        double afterSteal = amount - stolenAmount;
        System.out.println("Withdraw: ".concat(Double.toString(afterSteal)));
        stealingAccount.deposit(stolenAmount);
    }

    @Override
    public void charge() {
        account.charge();
    }

    @Override
    public void getAccountBalance() {
        account.getAccountBalance();
    }

    public void setAccount(Account account) {
        if (account != null)
            this.account = account;
    }

    public void setStealingAccount(Account stealingAccount) {
        if (account != null)
            this.stealingAccount = stealingAccount;
    }
}
