package com.musala.javacourse181112.pawInc;

import java.util.ArrayList;
import java.util.List;

public class AdoptionCenter extends Center {
    private List<Cat> adoptedCats = new ArrayList<>();
    private List<Dog> adoptedDogs = new ArrayList<>();

    public void setAdoptedCats(List<Cat> adoptedCats) {
        this.adoptedCats = adoptedCats;
    }

    public void setAdoptedDogs(List<Dog> adoptedDogs) {
        this.adoptedDogs = adoptedDogs;
    }

    public AdoptionCenter(String name) {
        super(name);

    }

    public void addAdoptedCats(Cat AdoptedCat) {
        adoptedCats.add(AdoptedCat);
    }

    public List<Cat> getAdoptedCats() {
        return adoptedCats;
    }

    public void addAdoptedDogs(Dog AdoptedDog) {
        adoptedDogs.add(AdoptedDog);
    }

    public List<Dog> getAdoptedDogs() {
        return adoptedDogs;
    }
}
