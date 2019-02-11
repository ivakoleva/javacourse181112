package com.musala.javacourse181112.ProjectPetko;

import java.util.Set;
import java.util.TreeSet;

public class Center {
    private String name;
    private Set<Animal> storedAnimals;

    public Center(String newName) {
        setName(newName);
        storedAnimals = new TreeSet<>();
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName () {
        return name;
    }

    public Set<Animal> getStoredAnimals() {
        return storedAnimals;
    }
}
