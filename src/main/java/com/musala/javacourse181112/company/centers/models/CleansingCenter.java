package com.musala.javacourse181112.company.centers.models;

import com.musala.javacourse181112.company.animals.Animal;
import com.musala.javacourse181112.company.animals.statuses.CleansingStatus;
import com.musala.javacourse181112.company.centers.Center;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CleansingCenter  extends Center {

    private HashMap<String, List<Animal>> animalsForCleansing;
    private List<String> cleansedAnimalsNames;

    public CleansingCenter(String name) {
        super(name);
        this.animalsForCleansing = new HashMap<>();
        this.cleansedAnimalsNames = new ArrayList<>();
    }

    public int getCountOnAnimalsForCleansing() {
        return countAnimalsForCleaning();
    }

    public void addAnimalsForCleansing(String centerName, List<Animal> animals) {
        if (!animalsForCleansing.containsKey(centerName)) {
            animalsForCleansing.put(centerName, animals);
        } else {
            List<Animal> bufferList = new ArrayList<>();
            bufferList.addAll(animalsForCleansing.get(centerName));
            bufferList.addAll(animals);
            animalsForCleansing.replace(centerName, bufferList);
        }
    }

    public HashMap<String, List<Animal>> cleanseAnimals() {
        return executeCleansing();
    }

    public List<String> getCleansedAnimalsNames() {
        return cleansedAnimalsNames;
    }

    private int countAnimalsForCleaning() {
        int countAnimalsForCleaning = 0;
        for (String center : animalsForCleansing.keySet()) {
            countAnimalsForCleaning += animalsForCleansing.get(center).size();
        }
        return countAnimalsForCleaning;
    }

    private HashMap<String, List<Animal>> executeCleansing() {
        for (String centerGroup : animalsForCleansing.keySet()) {
            List<Animal> animals = new ArrayList<>(animalsForCleansing.get(centerGroup));
            cleansingAnimals(animals);
        }
        HashMap<String, List<Animal>> cleansedAnimals = new HashMap<>(animalsForCleansing);
        animalsForCleansing.clear();

        return cleansedAnimals;
    }

    private void cleansingAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.setCleansingStatus(CleansingStatus.Cleansed);
            cleansedAnimalsNames.add(animal.getName());
        }
    }
}
