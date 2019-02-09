package com.musala.javacourse181112.pawInc;

public class Dog extends Animal {
    private boolean cleansingStatus;
    private int commands;
    private String tag;

    public Dog(String name, int age, int commands, String tag) {
        super(name, age);
        this.cleansingStatus = false;
        this.commands = commands;
        this.tag = tag;
    }

    public Boolean getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(Boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public int getCommands() {
        return commands;
    }

    public void setCommands(int commands) {
        this.commands = commands;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
