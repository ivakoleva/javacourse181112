package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public class FasadeClass {

public void widrowForAccount (Account account,double sum){

    account.withdraw(sum);

    account.charge();
}

public void depositForAccount (Account account,double sum){

    account.deposit(sum);

    account.charge();
}

}
