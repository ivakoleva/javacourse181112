package com.musala.javacourse181112.pawinc.animals;

public class Dog extends Animal {
    private int commandsAmount;


    public int getCommandsAmoun() {
        return commandsAmount;
    }

    public void setCommandsAmoun(int commandsAmoun) {
        this.commandsAmount = commandsAmoun;
    }

    public Dog(String name, int age, String adoptionCenter, int commandsAmoun) {
        super(name, age, adoptionCenter);
        this.commandsAmount = commandsAmoun;
    }
}
