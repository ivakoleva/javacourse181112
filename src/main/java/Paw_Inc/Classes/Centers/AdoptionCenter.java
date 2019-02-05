package Paw_Inc.Classes.Centers;

import Paw_Inc.Classes.Animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */

public class AdoptionCenter implements Center {
    private String name;
    private List<Animal> animals;

    public List<Animal> adopt() {
        List<Animal> adoptedAnimals = new ArrayList<>();
        Iterator<Animal> animalIterator = animals.iterator();

        for (; animalIterator.hasNext(); ) {
            Animal animal = animalIterator.next();
            if (animal.isCleansed()) {
                adoptedAnimals.add(animal);
                animalIterator.remove();
            }
        }
        return adoptedAnimals;
    }

    public void sendForCleansing(CleansingCenter cleansingCenter) {
        Iterator<Animal> animalIterator = animals.iterator();
        for (; animalIterator.hasNext(); ) {
            Animal animal = animalIterator.next();
            if (!animal.isCleansed()) {
                cleansingCenter.getAnimals().add(animal);
                animalIterator.remove();
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
