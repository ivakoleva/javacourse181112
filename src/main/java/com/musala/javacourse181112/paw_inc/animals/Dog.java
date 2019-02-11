package com.musala.javacourse181112.paw_inc.animals;

public class Dog extends Animal {
    private int commandsAmount;

    public Dog(String name, int age, String adoptionCenter, int commandsAmount) {
        super(name, age, adoptionCenter);
        this.commandsAmount = commandsAmount;
    }

    public int getCommandsAmount() {
        return commandsAmount;
    }
}
