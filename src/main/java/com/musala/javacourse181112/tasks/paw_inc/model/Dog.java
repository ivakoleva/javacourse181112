package com.musala.javacourse181112.tasks.paw_inc.model;

public class Dog extends Animal {

    private int amountCommands;

    public Dog(final String name, final int age, final String adoptionCenter, final int amountCommands) {
        super(name, age, adoptionCenter);
        this.amountCommands = amountCommands;
    }

    public int getAmountCommands() {
        return amountCommands;
    }

    public void setAmountCommands(int amountCommands) {
        this.amountCommands = amountCommands;
    }
}
