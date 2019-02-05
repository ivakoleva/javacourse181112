package com.musala.javacourse181112.tasks.Paw_Inc.model;

import java.util.List;

public class AdoptionCenter implements Center {
    private String name;
    private List<Animals> animalsList;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAnimalList(List animalList) {
        this.animalsList = animalList;
    }

    @Override
    public List getAnimalList() {
        return animalsList;
    }
}
