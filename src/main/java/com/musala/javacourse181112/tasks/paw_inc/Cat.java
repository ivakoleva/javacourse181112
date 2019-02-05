package com.musala.javacourse181112.tasks.paw_inc;

public class Cat extends Animal {
    private boolean cleansingStatus;
    private int amountOfCommands;

    public Cat(String name, int age, boolean cleansingStatus, int amountOfCommands) {
        super(name, age);
        this.cleansingStatus = cleansingStatus;
        this.amountOfCommands = amountOfCommands;
    }

    public boolean isCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public int getAmountOfCommands() {
        return amountOfCommands;
    }

    public void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }
}
