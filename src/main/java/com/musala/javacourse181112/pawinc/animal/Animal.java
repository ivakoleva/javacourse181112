package com.musala.javacourse181112.pawinc.animal;

import com.musala.javacourse181112.pawinc.center.AdoptionCenter;

public class Animal {
    private String name;
    private int age;
    private CleansingStatus cleansingStatus;
    private AdoptionCenter adoptionCenter;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        cleansingStatus = CleansingStatus.UNCLEANSED;
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

    public CleansingStatus getCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(CleansingStatus cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}
