package com.musala.javacourse181112.paw_inc.centers;

import com.musala.javacourse181112.paw_inc.AnimalCenterManager;
import com.musala.javacourse181112.paw_inc.animals.Animal;
import com.musala.javacourse181112.paw_inc.enums.CastrationStatus;
import com.musala.javacourse181112.paw_inc.enums.CleansingAndAdoptionStatus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdoptionCenter extends Center {
    private final List<Animal> adoptionList = new ArrayList<>();

    public AdoptionCenter(String name) {
        super(name);
    }

    public List<Animal> getAdoptionList() {
        return adoptionList;
    }

    public void sendAllForCleanse(String cleansingCenterName) {
        final Iterator<Animal> animalIterator = animalList.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (animal.getCleansingAndAdoptionStatus().equals(CleansingAndAdoptionStatus.UNCLEANSED)) {
                for (CleansingCenter cleansingCenter : AnimalCenterManager.getInstance().getCleansingCenters()) {
                    if (cleansingCenter.getName().equals(cleansingCenterName)) {
                        cleansingCenter.getAnimalList().add(animal);
                        animalIterator.remove();
                    }
                }
            }
        }
    }

    public void sendAllForCastration(String castrationCenterName) {
        final Iterator<Animal> animalIterator = animalList.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (animal.getCleansingAndAdoptionStatus().equals(CleansingAndAdoptionStatus.UNCLEANSED)
                    && animal.getCastrationStatus().equals(CastrationStatus.UNCASTRATED)) {
                for (CastrationCenter castrationCenter : AnimalCenterManager.getInstance().getCastrationCenters()) {
                    if (castrationCenter.getName().equals(castrationCenterName)) {
                        castrationCenter.getAnimalList().add(animal);
                        animalIterator.remove();
                    }
                }
            }
        }

    }

    public void adoptAll() {
        final Iterator<Animal> animalIterator = animalList.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (animal.getCleansingAndAdoptionStatus().equals(CleansingAndAdoptionStatus.CLEANSED)) {
                animal.setCleansingAndAdoptionStatus(CleansingAndAdoptionStatus.ADOPTED);
                adoptionList.add(animal);
                animalIterator.remove();
            }
        }


    }


}
