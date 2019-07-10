package com.musala.javacourse181112.pawinc.model.centers;

import com.musala.javacourse181112.pawinc.model.animal.Animal;

import java.util.List;
import java.util.stream.Collectors;

public class AdoptionCenter extends Center {

    public AdoptionCenter(String name) {

        super(name);

    }
    public void sendForCleansing(CleansingCenter center) {
        List<Animal> animals = this.getAnimals().stream()
                .filter(a -> !a.isCleansed())
                .collect(Collectors.toList());

        super.removeAnimals(animals);
        center.registerAll(animals);
    }

    public List<Animal> adopt() {
        List<Animal> animals = super.getAnimals().stream()
                .filter(animal -> animal.isCleansed())
                .collect(Collectors.toList());

        super.removeAnimals(animals);
        return animals;
    }

    public void sendForCastration(CastrationCenter castrationCenter) {
    }
}
