package com.musala.javacourse181112.tasks.paw_inc.model;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleaningStatus;
    private String adoptionCenter;

    public Animal(final String name, final int age, final String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.adoptionCenter = adoptionCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCleaningStatus() {
        return cleaningStatus;
    }

    public void setCleaningStatus(boolean cleaningStatus) {
        this.cleaningStatus = cleaningStatus;
    }

    public String getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(String adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}

