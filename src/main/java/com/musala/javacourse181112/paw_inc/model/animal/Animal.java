package com.musala.javacourse181112.paw_inc.model.animal;

import com.musala.javacourse181112.paw_inc.model.center.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 *
 * Animal class
 */
public abstract class Animal {
    private boolean cleansed;
    private boolean castrated;
    private String name;
    private int age;
    protected AdoptionCenter adoptionCenter;

    protected Animal(final String name, final int age) {
        this.age = age;
        this.name = name;
        this.cleansed = false;
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
        return cleansed;
    }

    public void cleanse() {
        cleansed = true;
    }

    public abstract AdoptionCenter getAdoptionCenter();

    public abstract void setAdoptionCenter(AdoptionCenter adoptionCenter);

    public boolean isCastrated() {
        return castrated;
    }

    public void castrate() {
        this.castrated = true;
    }
}
