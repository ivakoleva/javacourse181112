package com.musala.javacourse181112.pawinc.animal;

public class Animal {
    private String name;
    private int age;
    private boolean isCleansed;
    private String adoptionCenterName;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        isCleansed = false;
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

    public boolean isCleansed() { return isCleansed; }

    public void setCleansed(boolean cleansed) { isCleansed = cleansed; }

    public String getAdoptionCenterName() {
        return adoptionCenterName;
    }

    public void setAdoptionCenterName(String adoptionCenterName) {
        this.adoptionCenterName = adoptionCenterName;
    }
}
