package com.musala.javacourse181112.paw_inc.model;

public class Animal {
    private String name;
    private int age;
    private boolean isCleansed = false;

    private AdoptionCenter adoptionCenter;
    private CleansingCenter cleansingCenter;

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

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }

    public CleansingCenter getCleansingCenter() {
        return cleansingCenter;
    }

    public void setCleansingCenter(CleansingCenter cleansingCenter) {
        this.cleansingCenter = cleansingCenter;
    }

   // public Animal(){}

    Animal(final String name, final int age){
        this.name = name;
        this.age = age;
    }
}
