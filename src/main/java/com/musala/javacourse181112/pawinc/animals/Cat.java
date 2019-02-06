package com.musala.javacourse181112.pawinc.animals;

public class Cat extends Animal {
private int intelligenceCoefficient;

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }


    public void setIntelligenceCoefficient(int intelligencecoef) {
        this.intelligenceCoefficient = intelligencecoef;
    }

    public Cat() {
        super();
    }

    public Cat(String name, int age, String adoptionCenter, int intelligenceCoefficient) {
        super(name, age,adoptionCenter);
        this.intelligenceCoefficient = intelligenceCoefficient;

    }
}
