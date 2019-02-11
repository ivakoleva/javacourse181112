package com.musala.javacourse181112.paw_inc.centers;

import com.musala.javacourse181112.paw_inc.animals.Animal;

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
