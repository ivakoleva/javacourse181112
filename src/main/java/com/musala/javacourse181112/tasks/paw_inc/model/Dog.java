package com.musala.javacourse181112.tasks.paw_inc.model;

import com.musala.javacourse181112.tasks.paw_inc.Animals;

public class Dog extends Animals {
    private String name;
    private int age;
    private boolean cleansingStatus;
    private int amountOfCommands;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
