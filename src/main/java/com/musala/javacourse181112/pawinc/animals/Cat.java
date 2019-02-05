package com.musala.javacourse181112.pawinc.animals;

import com.musala.javacourse181112.pawinc.CleanseStatus;

public class Cat extends Animal {
    int intelligencecoef;

    public int getIntelligencecoef() {
        return intelligencecoef;
    }

    public void setIntelligencecoef(int intelligencecoef) {
        this.intelligencecoef = intelligencecoef;
    }

    public Cat() {
        super();
    }

    public Cat(String name, int age, String adoptionCenter, int intelligencecoef) {
        super(name, age,adoptionCenter);
        this.intelligencecoef = intelligencecoef;
    }
}
