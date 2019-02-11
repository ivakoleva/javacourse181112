package com.musala.javacourse181112.tasks.pawIncProject.model.centers;


import com.musala.javacourse181112.tasks.pawIncProject.model.animals.Animal;

import java.util.function.Predicate;

public class CleansingCenter extends Center {

    public static final Predicate<Animal> isCleansed = Animal::isCleansed;
    public static final Predicate<Animal> isUncleansed = animal -> !animal.isCleansed();
    public static final Predicate<Animal> dontFilter= animal -> true;

    public CleansingCenter(String name, int animalsCount) {
        super(name, animalsCount);
        centerType = CenterType.CLEANSING;
    }

    /**
     * Cleanses all animals from the given Cleansing center and returns them to
     * their corresponding Adoption centers.
     * */
    public void onCleansingCommand() {
        getAnimalList().forEach(animal -> {
            assert !animal.isCleansed();
            animal.setCleansed(true);

            animal.getAdoptionCenter()
                    .getAnimalList()
                    .addAll(this.getAnimalList());
        });

        this.getAnimalList().clear();
    }
}
