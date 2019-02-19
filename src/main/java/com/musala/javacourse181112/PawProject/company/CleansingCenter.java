package com.musala.javacourse181112.PawProject.company;



public class CleansingCenter extends Center{
    public CleansingCenter(String name) {
        super(name); // calling parent class name; //
    }

    public void cleanAnimalsAndSendAnimalsToHome() {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = this.getUncleanedAnimals().get(i);
            currentAnimal.setCleansingStatus(true);
            currentAnimal.getAnimalCenter().addCleanedAnimal(currentAnimal);
        }
        this.getUncleanedAnimals().clear();
    }
}
