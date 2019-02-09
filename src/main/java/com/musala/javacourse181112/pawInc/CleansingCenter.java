package com.musala.javacourse181112.pawInc;

import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center {
    private List<Cat> cleansedCats = new ArrayList<>();
    private List<Dog> cleansedDogs = new ArrayList<>();

    public CleansingCenter(String name) {
        super(name);
    }

    public List<Cat> getCleansedCats() {
        return cleansedCats;
    }

    public void setCleansedCats(List<Cat> cleansedCats) {
        this.cleansedCats.addAll(cleansedCats);
    }

    public List<Dog> getCleansedDogs() {
        return cleansedDogs;
    }

    public void setCleansedDogs(List<Dog> cleansedDogs) {
        this.cleansedDogs.addAll(cleansedDogs);
    }

    public void addCleansedDogs(Dog cleansedDog) {
        cleansedDogs.add(cleansedDog);
    }

    public void addCleansedCats(Cat cleansedCat) {
        cleansedCats.add(cleansedCat);
    }

}
