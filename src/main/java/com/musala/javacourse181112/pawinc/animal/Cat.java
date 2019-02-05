package com.musala.javacourse181112.pawinc.animal;

import com.musala.javacourse181112.pawinc.center.AdoptionCenter;

public class Cat extends Animal {
    private int intelligenceCoefficient;

    public Cat(String name,
               int age,
               int intelligenceCoefficient) {
        super(name, age);
        this.intelligenceCoefficient = intelligenceCoefficient;
    }


    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
