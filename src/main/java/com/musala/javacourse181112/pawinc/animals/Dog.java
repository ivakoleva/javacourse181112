package com.musala.javacourse181112.pawinc.animals;

public class Dog extends Animal {
    private int commandsAmount;

    public int getCommandsAmount() {
        return commandsAmount;
    }

    public void setCommandsAmount(int commandsAmount) {
        this.commandsAmount = commandsAmount;
    }

    public Dog(String name, int age, String adoptionCenter, int commandsAmount) {
        super(name, age, adoptionCenter);
        this.commandsAmount = commandsAmount;
    }
}
