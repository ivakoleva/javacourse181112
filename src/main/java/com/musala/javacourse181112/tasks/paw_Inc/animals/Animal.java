package com.musala.javacourse181112.tasks.paw_Inc.animals;

import com.musala.javacourse181112.tasks.paw_Inc.centers.AdoptionCenter;

public abstract class Animal {
    private String name;
    private int age;
    private AdoptionCenter initialAdoptionCenter;
    private boolean cleansingStatus = false;
    private boolean castratingStatus = false;

    public Animal(final String name, final int age) {
        this.name = name;
        this.age = age;
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

    public AdoptionCenter getInitialAdoptionCenter() {
        return initialAdoptionCenter;
    }

    public void setInitialAdoptionCenter(AdoptionCenter initialAdoptionCenter) {
        this.initialAdoptionCenter = initialAdoptionCenter;
    }

    public boolean isCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public boolean isCastratingStatus() {
        return castratingStatus;
    }

    public void setCastratingStatus(boolean castratingStatus) {
        this.castratingStatus = castratingStatus;
    }
}
