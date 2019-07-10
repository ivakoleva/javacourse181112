package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

import java.util.ArrayList;
import java.util.List;

public class ChargeProcessor {

    public static void main(String[] args) {
        List<Account> banklist = new ArrayList<>();
        banklist.add(new BankAccount("29842984724FGHJ",20000));
        banklist.add(new BankAccount("4579485798467KL",3400));
        banklist.add(new PayPalAccount("mincho@abv.bg",7800));
        banklist.add(new PayPalAccount("atanas2@abv.bg",4566));
        banklist.add(new CreditCard("26487245LP","Marin","7778","12.10.2020",900));
        banklist.add(new CreditCard("26487245LP","Stanislav","9078","14.10.2020",1300));

        for(Account a:banklist){

            a.charge();

        }
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

       if (x==y){
           System.out.println("Bravo pich");

       }
       else{
           System.out.println("Ti si idiot");
       }

       ProxyClass account1 = new ProxyClass("hesafjkrehicurh",34500);

       account1.deposit(5);
    }
}
