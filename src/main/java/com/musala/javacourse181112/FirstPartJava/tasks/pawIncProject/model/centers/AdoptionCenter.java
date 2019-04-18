package com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.centers;

import com.musala.javacourse181112.FirstPartJava.tasks.pawIncProject.model.animals.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptionCenter extends Center {


    public AdoptionCenter(String name, int animalsCount) {
        super(name, animalsCount);
        centerType = CenterType.ADOPTION;
    }

    /**
     * All CLEANSED animals from the given Adoption center get adopted, and
     * removed from the stored animals.
     * */
    public void onAdoptionCommand() {
        List<Animal> adoptionAnimalList = getAnimalList();
        assert adoptionAnimalList != null;
        if (adoptionAnimalList.isEmpty()) return;

        final List<Animal> forAdoptionList = adoptionAnimalList.stream()
                .filter(CleansingCenter.isCleansed)
                .peek(animal -> animal.setAdopted(true))
                .collect(Collectors.toList());

        adoptionAnimalList.removeAll(forAdoptionList);
        historyAnimalSet.addAll(forAdoptionList);
    }

    /**Sends all UNCLEANSED animals from the given Adoption center
     *  to the given Cleansing center
     */
    public void sendForCleansing(final CleansingCenter cleansingCenter) {
        final List<Animal> uncleansedAnimals = getAnimalList().stream()
                .filter(CleansingCenter.isUncleansed)
                .collect(Collectors.toList());

        getAnimalList().removeAll(uncleansedAnimals);
        cleansingCenter.getAnimalList().addAll(uncleansedAnimals);
    }

    /** Sends all uncleansed animals from the given Adoption center
     *  to the given Castration center.
     *  */
    public void sendForCastration(final CastrationCenter castrationCenter) {
        final List<Animal> uncleansedAnimals = getAnimalList().stream()
                .filter(CleansingCenter.isUncleansed)
                .collect(Collectors.toList());

        getAnimalList().removeAll(uncleansedAnimals);
        castrationCenter.getAnimalList().addAll(uncleansedAnimals);
    }
}
