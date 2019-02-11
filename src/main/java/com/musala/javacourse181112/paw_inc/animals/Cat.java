package com.musala.javacourse181112.paw_inc.animals;

public class Cat extends Animal {
    private int intelligenceCoefficient;

    public Cat(String name, int age, String adoptionCenter, int intelligenceCoefficient) {
        super(name, age, adoptionCenter);
        this.intelligenceCoefficient = intelligenceCoefficient;

    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }
}
