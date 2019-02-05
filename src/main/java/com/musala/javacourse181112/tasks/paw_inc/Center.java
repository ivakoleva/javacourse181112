package com.musala.javacourse181112.tasks.paw_inc;

import java.util.List;

public class Center {
    private String name;
    private List<Dog> dogs;
    private List<Cat> cats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void addDogs(Dog dogs) {
        this.dogs.add(dogs);
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void addCats(Cat cats) {
        this.cats.add(cats);
    }

    public Center(String name) {
        this.name = name;
    }
}
