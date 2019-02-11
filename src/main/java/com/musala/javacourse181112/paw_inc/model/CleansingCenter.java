package com.musala.javacourse181112.paw_inc.model;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter implements Center {
    private String name;
    private List<Animal> animalList = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Animal> getAnimalList() {
        return animalList;
    }

    @Override
    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
