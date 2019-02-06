package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Center {
    protected final List<Animal> animalList = new ArrayList<>();
    private String name;

    public Center(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
}
