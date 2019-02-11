package com.musala.javacourse181112.tasks.pawInc;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter extends Center {
    private List<Cat> adoptedCats = new ArrayList<>();
    private List<Dog> adoptedDogs = new ArrayList<>();

    public AdoptionCenter(String name) {
        super(name);
    }

    public List<Cat> getAdoptedCats() {
        return adoptedCats;
    }

    public void setAdoptedCats(List<Cat> adoptedCats) {
        this.adoptedCats = adoptedCats;
    }

    public List<Dog> getAdoptedDogs() {
        return adoptedDogs;
    }

    public void setAdoptedDogs(List<Dog> adoptedDogs) {
        this.adoptedDogs = adoptedDogs;
    }

    public void addAdoptedCats(Cat AdoptedCat) {
        adoptedCats.add(AdoptedCat);
    }

    public void addAdoptedDogs(Dog AdoptedDog) {
        adoptedDogs.add(AdoptedDog);
    }
}

