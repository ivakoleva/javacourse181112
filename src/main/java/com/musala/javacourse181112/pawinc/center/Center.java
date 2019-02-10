package com.musala.javacourse181112.pawinc.center;

import com.musala.javacourse181112.pawinc.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Center {
    String name;
    List<Animal> storedAnimals = new ArrayList<>();

    public Center(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getStoredAnimals() {
        return storedAnimals;
    }

    public void setStoredAnimals(List storedAnimals) {
        this.storedAnimals = storedAnimals;
    }
}
