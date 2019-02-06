package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.AnimalCenterManeger;
import com.musala.javacourse181112.pawinc.AnimalStatus;
import com.musala.javacourse181112.pawinc.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AdoptionCenter extends Center {
    final List<Animal> adoptionList=new ArrayList<>();

    public List<Animal> getAdoptionList() {
        return adoptionList;
    }


    public AdoptionCenter(String name) {
        super(name);
    }

    public void sendAllForCleanse(String cleansingCenterName) {
        final Iterator<Animal> animalIterator = animalList.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (animal.getAnimalStatus().equals(AnimalStatus.UNCLEANSED)) {
                for (CleansingCenter cleansingCenter : AnimalCenterManeger.getInstance().getCleansingCenters()) {
                    if (cleansingCenter.getName().equals(cleansingCenterName)) {
                        cleansingCenter.getAnimalList().add(animal);
                        animalIterator.remove();
                    }
                }
            }
        }
    }

    public void adoptAll(){
        final Iterator<Animal> animalIterator = animalList.iterator();
        while (animalIterator.hasNext()){
            Animal animal=animalIterator.next();
            if(animal.getAnimalStatus().equals(AnimalStatus.CLEANSED)){
                animal.setAnimalStatus(AnimalStatus.ADOPTED);
                adoptionList.add(animal);
                animalIterator.remove();
            }
        }


    }


}
