package com.musala.javacourse181112.paw_inc.model;

import java.util.List;

public interface Center {
    String getName();
    void setName(String name);
    List<Animal> getAnimalList();
    void setAnimalList(List<Animal> animalList);
}
