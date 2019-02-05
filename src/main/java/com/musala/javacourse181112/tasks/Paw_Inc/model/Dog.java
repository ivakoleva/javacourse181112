package com.musala.javacourse181112.tasks.Paw_Inc.model;

public class Dog extends Animals {
    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }

    private int amountOfCommands;

    public Dog(String name, int age) {
        super(name, age);
    }
}
