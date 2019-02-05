package com.musala.javacourse181112.tasks.paw_inc.model;

import com.musala.javacourse181112.tasks.paw_inc.Center;

public class AdoptionCenter extends Center {
    private String name;
    private int storedAnimals;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStoredAnimals() {
        return storedAnimals;
    }

    public void setStoredAnimals(int storedAnimals) {
        this.storedAnimals = storedAnimals;
    }
}
