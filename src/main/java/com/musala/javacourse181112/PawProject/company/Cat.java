package com.musala.javacourse181112.PawProject.company;

public class Cat extends Animal{
    private int intelligenceCoefficient;

    public Cat(String name, int age, int intelligenceCoefficient, AdoptionCenter A) {
        super(name, age, A); // calling parent class parameters //
        this.setIntelligenceCoefficient(intelligenceCoefficient);
    }

    private void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public final int getIntelligenceCoefficient() {
        return this.intelligenceCoefficient;
    }
}

