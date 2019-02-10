package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.List;

public interface Center {


    String getName();

    void setName(String name);

    List<Animal> getStoredAnimalsList();

    void setStoredAnimalsList(List<Animal> storedAnimalsList);

}
