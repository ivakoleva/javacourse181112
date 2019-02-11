package com.musala.javacourse181112.pawinc.Center;

import com.musala.javacourse181112.pawinc.Animal.Animal;

import java.util.ArrayList;

public class Center {
    String name;
    ArrayList<Animal> storedAnimals = new ArrayList<>();

    public Center(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Animal> getStoredAnimals() {
        return this.storedAnimals;
    }

    public void setStoredAnimals(ArrayList<Animal> storedAnimals) {
        this.storedAnimals = storedAnimals;
    }

    public void addAnimal(Animal animal) {
        this.storedAnimals.add(animal);
    }

    @Override
    public String toString() {
        return ("Name: " + this.getName() +
                " Animals: " + this.getStoredAnimals()
        );
    }
}
