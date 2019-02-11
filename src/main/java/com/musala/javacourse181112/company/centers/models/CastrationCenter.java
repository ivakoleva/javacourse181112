package com.musala.javacourse181112.company.centers.models;

import com.musala.javacourse181112.company.animals.Animal;
import com.musala.javacourse181112.company.animals.statuses.CastrateStatus;
import com.musala.javacourse181112.company.centers.Center;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CastrationCenter extends Center {

    private HashMap<String, List<Animal>> animalsForCastration;
    private List<String> storedCastratedAnimalsName;

    public CastrationCenter(String name) {
        super(name);
        this.animalsForCastration = new HashMap<>();
        this.storedCastratedAnimalsName = new ArrayList<>();
    }

    public void addAnimalsForCastration(String centerName, List<Animal> animals) {
        if (animalsForCastration.containsKey(centerName)){
            updateAnimalsInCastrationDatabase(centerName, animals);
        }
        animalsForCastration.putIfAbsent(centerName, animals);
    }

    public HashMap<String, List<Animal>> castrateAnimals() {
        return executeCastration();
    }

    public List<String> getCastratedAnimalsNames() {
        return storedCastratedAnimalsName;
    }

    private void updateAnimalsInCastrationDatabase(String centerName, List<Animal> animals) {
        List<Animal> buffer = new ArrayList<>();
        buffer.addAll(animalsForCastration.get(centerName));
        buffer.addAll(animals);
        animalsForCastration.replace(centerName, buffer);
    }

    private HashMap<String, List<Animal>> executeCastration() {
        for (String centerGroup : animalsForCastration.keySet()) {
            List<Animal> animals = new ArrayList<>(animalsForCastration.get(centerGroup));
            castratingAnimals(animals);
        }
        HashMap<String, List<Animal>> castratedAnimals = new HashMap<>(animalsForCastration);
        animalsForCastration.clear();

        return castratedAnimals;
    }

    private void castratingAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.setCastrateStatus(CastrateStatus.Castrated);
            storedCastratedAnimalsName.add(animal.getName());
        }
    }
}
