package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kristina Stoyanova on 5.2.2019 г.
 */
public class Center {
    private String name;

    protected final List<Animal> storedAnimals = new ArrayList<>();

    public Center(String name) {
        this.name = name;
    }

    public List<Animal> getStoredAnimals() {
        return storedAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
