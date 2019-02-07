package com.musala.javacourse181112.pawinc.animals;

/**
 * Created by Kristina Stoyanova on 5.2.2019 г.
 */
public class Dog extends Animal {
    private int amountOfCommandsLearned;

    public Dog(String name, int age, String adoptionCenterName,int amountOfCommandsLearned) {
        super(name, age, adoptionCenterName);
        this.amountOfCommandsLearned = amountOfCommandsLearned;
    }
    public int getAmountOfCommandsLearned() {
        return amountOfCommandsLearned;
    }
    public void setAmountOfCommandsLearned(int amountOfCommandsLearned) {
        this.amountOfCommandsLearned = amountOfCommandsLearned;
    }
}
