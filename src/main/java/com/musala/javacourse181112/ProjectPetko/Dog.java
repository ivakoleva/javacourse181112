package com.musala.javacourse181112.ProjectPetko;

public class Dog extends Animal {
    private int commands;

    public Dog(String newName, int newAge, int newCommands){
        super(newName, newAge);
        setCommands(newCommands);
    }

    public void setCommands(int newCommands) {
        if (newCommands < 0) {
            System.out.println("Number of commands must be a positive value");
        } else {
            commands = newCommands;
        }
    }

    public int getCommands() {
        return commands;
    }
}
