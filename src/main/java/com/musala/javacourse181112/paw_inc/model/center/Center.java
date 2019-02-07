package com.musala.javacourse181112.paw_inc.model.center;

import com.musala.javacourse181112.paw_inc.model.animal.Animal;

import java.util.List;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public interface Center {
    String getName();

    void setName(String name);

    List<Animal> getAnimals();

    void setAnimals(List<Animal> animals);
}
