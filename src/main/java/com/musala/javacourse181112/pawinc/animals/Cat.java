package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;

public class Cat extends Animal {
    private int intelligenceCoefficient;
    private AdoptionCenter adoptionCenter;

    public Cat(String name, int age, int intelligence, AdoptionCenter adoptionCenter) {
        super(name, age);
        this.intelligenceCoefficient = intelligence;
        this.adoptionCenter = adoptionCenter;
    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    @Override
    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    @Override
    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;

    }
}
