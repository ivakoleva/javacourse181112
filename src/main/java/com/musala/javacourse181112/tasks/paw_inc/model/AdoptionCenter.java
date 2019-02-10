package com.musala.javacourse181112.tasks.paw_inc.model;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter implements Center {
    private String name;
    private List<Animal> storedAnimal = new ArrayList<>();
    private List<Animal> adoptedAnimal = new ArrayList<>();

    public List<Animal> getAdoptedAnimal() {
        return adoptedAnimal;
    }

    public void setAdoptedAnimal(List<Animal> adoptedAnimal) {
        this.adoptedAnimal = adoptedAnimal;
    }

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
        return storedAnimal;
    }

    @Override
    public void setStoredAnimal(List storedAnimal) {
        this.storedAnimal = storedAnimal;
    }
}
