package com.musala.javacourse181112.tasks.paw_Inc.centers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdoptionCenter extends Center {
    public List<Animal> sendForCleansingAnimals() {
        List<Animal> listForCleanse = new ArrayList<>();
        Iterator<Animal> animalIterable = getAnimalList().iterator();
        while (animalIterable.hasNext()) {
            listForCleanse.add(animalIterable.next());
            if (!listForCleanse.get(listForCleanse.size() - 1).isCleansingStatus()) {
                animalIterable.remove();
            } else {
                listForCleanse.remove(listForCleanse.size() - 1);
            }
        }
        return listForCleanse;
    }

    public List<Animal> sendForCastratingAnimals() {
        List<Animal> listForCastrating = new ArrayList<>();
        Iterator<Animal> animalIterable = getAnimalList().iterator();
        while (animalIterable.hasNext()) {
            listForCastrating.add(animalIterable.next());
            if (!listForCastrating.get(listForCastrating.size() - 1).isCleansingStatus()) {
                animalIterable.remove();
            } else {
                listForCastrating.remove(listForCastrating.size() - 1);
            }
        }
        return listForCastrating;
    }

    public List<Animal> adoptAnimals() {
        List<Animal> listOfAdoptAnimal = new ArrayList<>();
        Iterator<Animal> animalIterator = getAnimalList().iterator();
        while (animalIterator.hasNext()) {
            listOfAdoptAnimal.add(animalIterator.next());
            if (listOfAdoptAnimal.get(listOfAdoptAnimal.size() - 1).isCleansingStatus()) {
                animalIterator.remove();
            } else {
                listOfAdoptAnimal.remove(listOfAdoptAnimal.size() - 1);
            }
        }
        return listOfAdoptAnimal;
    }
}
