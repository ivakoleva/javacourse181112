package com.musala.javacourse181112.tasks.ExerciseModul2.Bank;

public interface AccountInterface extends iDeposit {

    void withdraw(double sum);
    Double getCurrentBalance();
}
