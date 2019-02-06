package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.AnimalCenterManeger;
import com.musala.javacourse181112.pawinc.AnimalStatus;
import com.musala.javacourse181112.pawinc.animals.Cat;
import com.musala.javacourse181112.pawinc.animals.Dog;

public class CleansingCenter extends Center {


    public CleansingCenter(String name) {
        super(name);
    }


    public void cleanseAll() {
        for (Cat cat : catList) {
            cat.setAnimalStatus(AnimalStatus.CLEANSED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManeger.getInstance().getAdoptionCenters()){
                if (adoptionCenter.getName().equals(cat.getAdoptionCenter())) {
                    adoptionCenter.getCatList().add(cat);
                }
            }
        }
        for (Dog dog : dogList) {
            dog.setAnimalStatus(AnimalStatus.CLEANSED);
            for (AdoptionCenter adoptionCenter : AnimalCenterManeger.getInstance().getAdoptionCenters()){
                if (adoptionCenter.getName().equals(dog.getAdoptionCenter())) {
                    adoptionCenter.getDogList().add(dog);
                }
            }
        }


        catList.clear();
        dogList.clear();


    }

}
