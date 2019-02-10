package com.musala.javacourse181112.tasks.paw_inc.model;

public abstract class Animals {

    private String name;
    private int age;
    private boolean cleaningStatus;


    public Animals(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public Boolean isCleaningStatus(){return cleaningStatus; }

    public void setCleaningStatus(boolean cleaningStatus){
        this.cleaningStatus = cleaningStatus;
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
}
