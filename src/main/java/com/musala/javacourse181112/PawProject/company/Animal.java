package com.musala.javacourse181112.PawProject.company;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansingStatus;
    private AdoptionCenter animalCenter;

    public Animal(String name, int age, AdoptionCenter center) {
        this.setName(name);
        this.setAge(age);
        this.setCleansingStatus(false);
        this.setAnimalCenter(center);
    }

    public final String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public final int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public final boolean isCleansing() {
        return this.cleansingStatus;
    }


    public final void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public final AdoptionCenter getAnimalCenter() {
        return this.animalCenter;
    }

    private void setAnimalCenter(AdoptionCenter animalCenter) {
        this.animalCenter = animalCenter;
    }
}

