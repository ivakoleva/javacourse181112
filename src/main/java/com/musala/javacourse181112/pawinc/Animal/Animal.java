package com.musala.javacourse181112.pawinc.Animal;

public class Animal {

    private String name;
    private int age;
    private CleansingStatus cleansingStatus;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        cleansingStatus = CleansingStatus.UNCLEASED;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CleansingStatus getCleansingStatus() {
        return this.cleansingStatus;
    }

    public void setCleansingStatus(CleansingStatus cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() +
                " Age: " + this.getAge() +
                " CleansingStatus: " + this.getCleansingStatus()
        );
    }
}
