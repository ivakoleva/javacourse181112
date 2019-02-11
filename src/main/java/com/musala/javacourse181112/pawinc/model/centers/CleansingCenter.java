package com.musala.javacourse181112.pawinc.model.centers;

import com.musala.javacourse181112.pawinc.model.animal.Animal;



import java.util.ArrayList;
import java.util.List;

public class CleansingCenter extends Center {

    public CleansingCenter(String name) {

        super(name);
    }

    public List<Animal> cleanse() {
        List<Animal> cleansed = new ArrayList<>();
        for (Animal a : this.getAnimals()) {
            a.cleanse();
            cleansed.add(a);
        }

        this.removeAnimals(cleansed);
        return cleansed;
    }
}
