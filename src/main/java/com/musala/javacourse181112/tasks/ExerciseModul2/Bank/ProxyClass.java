package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public class ProxyClass implements iDeposit  {
  private iDeposit object;

    public ProxyClass(String iban ,double balance) {

       this.object = new BankAccount(iban,balance);


    }


    @Override
    public void deposit(double sum) {
     object.deposit(sum);
    }
}
