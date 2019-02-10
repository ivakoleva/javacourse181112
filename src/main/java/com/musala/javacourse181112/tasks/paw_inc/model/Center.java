package com.musala.javacourse181112.tasks.paw_inc.model;

import java.util.List;

public interface Center {

    String getName();

    void setName(String name);

    List<Animal> getStoredAnimal();

    void setStoredAnimal(List storedAnimal);
}

