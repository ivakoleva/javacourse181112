package com.musala.javacourse181112.PawProject.company;


import java.util.ArrayList;

public class AdoptionCenter extends Center{
    private ArrayList<Animal> cleanedAnimals;

    public AdoptionCenter(String name) {
        super(name); // name parameter from parent class//
        this.setCleanedAnimals();
    }

    public void sendAnimalsForCleaning(CleansingCenter CleansingCenter) {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            CleansingCenter.addNewAnimal(currentAnimal);
        }
        this.getUncleanedAnimals().clear();
    }


    public final ArrayList<Animal> getCleanedAnimals() {
        return this.cleanedAnimals;
    }

    private void setCleanedAnimals() {
        this.cleanedAnimals = new ArrayList<>();
    }

    public final void addCleanedAnimal(Animal animal){
        this.getCleanedAnimals().add(animal);
    }



    public void sendAnimalsForCastration(CastrationCenter CastrationCenter) {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            CastrationCenter.addNewAnimal(currentAnimal);
        }
        for (int i = 0; i < this.getCleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            CastrationCenter.addNewAnimal(currentAnimal);
        }
        this.getCleanedAnimals().clear();
        this.getUncleanedAnimals().clear();
    }

    public final void adoptAnimals() {
        this.getCleanedAnimals().clear();
    }
}
