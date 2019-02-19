package com.musala.javacourse181112.PawProject.company;

public class CastrationCenter extends Center{
    public CastrationCenter(String name) {
        super(name);
    }

    public void castrateAnimals(){
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = this.getUncleanedAnimals().get(i);
            if (currentAnimal.isCleansing()) {
                currentAnimal.getAnimalCenter().addCleanedAnimal(currentAnimal);
            } else {
                currentAnimal.getAnimalCenter().addNewAnimal(currentAnimal);
            }
        }
        this.getUncleanedAnimals().clear();
    }
}
