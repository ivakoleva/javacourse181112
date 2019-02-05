package com.musala.javacourse181112.tasks.paw_inc;

public class Dog extends Animal {
    private boolean cleansingStatus;
    private int amountOfCommands;
    private String tag;

    public Dog(String name, int age, int amountOfCommands, String tag) {
        super(name, age);
        this.cleansingStatus = false;
        this.amountOfCommands = amountOfCommands;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

