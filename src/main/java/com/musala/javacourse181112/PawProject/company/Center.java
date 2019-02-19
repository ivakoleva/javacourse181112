package com.musala.javacourse181112.PawProject.company;


import java.util.ArrayList;

public abstract class Center {


    private String name;
    private ArrayList<Animal> uncleanedAnimals;

    Center(String name) {
        this.setName(name);
        this.setUncleanedAnimals();
    }

    public final String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public final ArrayList<Animal> getUncleanedAnimals() {
        return uncleanedAnimals;
    }

    private void setUncleanedAnimals() {
        this.uncleanedAnimals = new ArrayList<>();
    }

    public final void addNewAnimal(Animal animal) {
        this.getUncleanedAnimals().add(animal);
    }
}
