package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;

public abstract class Animal {
    private String name;
    private int age;
    private boolean cleansingStatus;
    private boolean castratedStatus;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.cleansingStatus = false;
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

    public boolean isCleansed() {
        return cleansingStatus;
    }

    public boolean isCastrated() {
        return castratedStatus;
    }

    public void setCastrationStatus(boolean castrationStatus) {
        this.castratedStatus = castrationStatus;
    }

    public void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public abstract AdoptionCenter getAdoptionCenter();

    public abstract void setAdoptionCenter(AdoptionCenter adoptionCenter);
}
