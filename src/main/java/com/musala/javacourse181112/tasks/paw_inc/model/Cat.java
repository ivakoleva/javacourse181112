package com.musala.javacourse181112.tasks.paw_inc.model;

public class Cat extends Animal {
    private int intelligenceCoefficient;

    public Cat(final String name, final int age, final String adoptionCenter, final int intelligenceCoefficient) {
        super(name, age, adoptionCenter);
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
