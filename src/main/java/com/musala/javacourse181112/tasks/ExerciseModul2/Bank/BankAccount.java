package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public  class BankAccount extends Account {
   String iban ;


public BankAccount(String iban,double balance){
    super(balance);
    this.iban = iban;

}

    @Override
   public void charge() {
        balance-=2;
    }
}
