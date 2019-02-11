package com.musala.javacourse181112.paw_inc.animals;

import com.musala.javacourse181112.paw_inc.enums.CastrationStatus;
import com.musala.javacourse181112.paw_inc.enums.CleansingAndAdoptionStatus;

public class Animal {
    private String name;
    private int age;
    private CleansingAndAdoptionStatus cleansingAndAdoptionStatus;
    private CastrationStatus castrationStatus;
    private String adoptionCenter;

    public Animal() {
    }

    public Animal(String name, int age, String adoptionCenter) {
        this.name = name;
        this.age = age;
        this.adoptionCenter = adoptionCenter;
        this.cleansingAndAdoptionStatus = CleansingAndAdoptionStatus.UNCLEANSED;
        this.castrationStatus = CastrationStatus.UNCASTRATED;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public CleansingAndAdoptionStatus getCleansingAndAdoptionStatus() {
        return cleansingAndAdoptionStatus;
    }

    public void setCleansingAndAdoptionStatus(CleansingAndAdoptionStatus cleansingAndAdoptionStatus) {
        this.cleansingAndAdoptionStatus = cleansingAndAdoptionStatus;
    }

    public String getAdoptionCenter() {
        return adoptionCenter;
    }

    public CastrationStatus getCastrationStatus() {
        return castrationStatus;
    }

    public void setCastrationStatus(CastrationStatus castrationStatus) {
        this.castrationStatus = castrationStatus;
    }

    @Override
    public String toString() {
        return name;
    }
}
