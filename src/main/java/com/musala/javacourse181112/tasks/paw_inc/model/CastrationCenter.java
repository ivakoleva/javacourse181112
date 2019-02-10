package com.musala.javacourse181112.tasks.paw_inc.model;

import java.util.ArrayList;
import java.util.List;

public class CastrationCenter implements Center {
    private String name;
    private List<Animal> storedAnimals = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Animal> getStoredAnimal() {
        return storedAnimals;
    }

    @Override
    public void setStoredAnimal(List storedAnimal) {
        this.storedAnimals = storedAnimal;
    }
}
