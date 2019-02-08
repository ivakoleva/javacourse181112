package com.musala.javacourse181112.tasks.pawInc;

import java.util.ArrayList;
import java.util.List;

public class Center {
    private String name;
    private List<Dog> dogs = new ArrayList<>();
    private List<Cat> cats = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Dog> getDog() {
        return dogs;
    }

    public void addDog(Dog dogs) {
        this.dogs.add(dogs);
    }

    public List<Cat> getCat() {
        return cats;
    }

    public void addCat(Cat cats) {
        this.cats.add(cats);
    }

    public Center(String name) {
        this.name = name;
    }

}
