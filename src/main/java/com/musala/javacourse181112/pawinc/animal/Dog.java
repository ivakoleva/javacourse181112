package com.musala.javacourse181112.pawinc.animal;

public class Dog extends Animal {
    private int amountOfCommands;

    public Dog(final String name, final int age, final int amountOfCommands, final String adoptionCenterName) {
        super(name, age, adoptionCenterName);
        this.amountOfCommands = amountOfCommands;
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }
}
