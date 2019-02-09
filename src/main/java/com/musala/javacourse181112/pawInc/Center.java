package com.musala.javacourse181112.pawInc;

import java.util.ArrayList;
import java.util.List;

public class Center {
    private String name;
    private List<Cat> cats = new ArrayList<>();
    private List<Dog> dogs = new ArrayList<>();

    public Center(String name) {
        this.name = name;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void addCats(Cat cats) {
        this.cats.add(cats);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setCats(List<Cat> cats) {
        this.cats.addAll(cats);
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs.addAll(dogs);
    }

    public void addDogs(Dog dogs) {
        this.dogs.add(dogs);
    }

}
