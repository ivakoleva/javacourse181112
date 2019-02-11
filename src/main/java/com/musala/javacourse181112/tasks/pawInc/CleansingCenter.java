package com.musala.javacourse181112.tasks.pawInc;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center {
    private List<Cat> cleansedCats = new ArrayList<>();
    private List<Dog> cleansedDogs = new ArrayList<>();

    public CleansingCenter(String name) {
        super(name);
    }

    public List<com.musala.javacourse181112.pawInc.Cat> getCleansedCats() {
        return cleansedCats;
    }

    public void setCleansedCats(List<com.musala.javacourse181112.pawInc.Cat> cleansedCats) {
        this.cleansedCats.addAll(cleansedCats);
    }

    public List<com.musala.javacourse181112.pawInc.Dog> getCleansedDogs() {
        return cleansedDogs;
    }

    public void setCleansedDogs(List<com.musala.javacourse181112.pawInc.Dog> cleansedDogs) {
        this.cleansedDogs.addAll(cleansedDogs);
    }

    public void addCleansedDogs(com.musala.javacourse181112.pawInc.Dog cleansedDog) {
        cleansedDogs.add(cleansedDog);
    }

    public void addCleansedCats(com.musala.javacourse181112.pawInc.Cat cleansedCat) {
        cleansedCats.add(cleansedCat);
    }
}
