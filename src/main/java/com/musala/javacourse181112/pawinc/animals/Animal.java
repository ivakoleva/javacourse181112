package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.CleansingStatus;
/**
 * Created by Kristina Stoyanova on 5.2.2019 г.
 */

public class Animal {
    private String name;
    private int age;
    private CleansingStatus cleansingStatus;
    private String adoptionCenterName;

    @Override
    public String toString() {
        return name;
    }

    public Animal(String name, int age, String adoptionCenterName) {
        this.name= name;
        this.age = age;
        this.adoptionCenterName = adoptionCenterName;
        this.cleansingStatus=CleansingStatus.NOT_CLEANSED;
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

    public String getAdoptionCenterName() {
        return adoptionCenterName;
    }
    public void setAdoptionCenterName(String adoptionCenterName) {
        this.adoptionCenterName = adoptionCenterName;
    }
}
