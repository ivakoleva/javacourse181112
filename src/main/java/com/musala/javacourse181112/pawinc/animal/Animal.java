package com.musala.javacourse181112.pawinc.animal;

public class Animal {
    private String name;
    private int age;
    private boolean isCleansed;
    private boolean isCastrated;
    private String adoptionCenterName;

    public Animal(final String name, final int age, final String adoptionCenterName) {
        this.name = name;
        this.age = age;
        isCleansed = false;
        isCleansed = false;
        this.adoptionCenterName = adoptionCenterName;
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
        return isCleansed;
    }

    public void setCleansed(boolean cleansed) {
        isCleansed = cleansed;
    }

    public boolean isCastrated() {
        return isCastrated;
    }

    public void setCastrated(boolean castrated) {
        isCastrated = castrated;
    }

    public String getAdoptionCenterName() {
        return adoptionCenterName;
    }

    public void setAdoptionCenterName(String adoptionCenterName) {
        this.adoptionCenterName = adoptionCenterName;
    }
}
