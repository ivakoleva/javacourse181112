package Paw_Inc.Classes.Centers;

import Paw_Inc.Classes.Animals.Animal;

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
