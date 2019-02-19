package com.musala.javacourse181112.PawProject.company;

public class Dog extends Animal{
    private int amountOfCommands;

    public Dog(String name, int age, int amountOfCommands, AdoptionCenter A) {
        super(name, age, A);
        this.setAmountOfCommands(amountOfCommands);
    }


    private void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }


    public final int getAmountOfCommands() {
        return this.amountOfCommands;
    }
}