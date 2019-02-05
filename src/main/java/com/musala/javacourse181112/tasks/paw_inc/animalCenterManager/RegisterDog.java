package com.musala.javacourse181112.tasks.paw_inc.animalCenterManager;

import com.musala.javacourse181112.tasks.paw_inc.model.Dog;

public class RegisterDog {
    public Dog generateDog = new Dog(
    final String name, final int age, final int learnedCommands, final String adoptionCenterName)

    {
        final Dog dog = new Dog();
        dog.setName("Gosho");
        dog.setAge(2);
        dog.setAmountOfCommands(6);
        dog.setCleansingStatus(true);
    }

    public RegisterDog(String name, int age, int learnedCommands) {
        this.name = name;
        this.age = age;
        this.learnedCommands = learnedCommands;
    }
}
