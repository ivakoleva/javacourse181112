package com.musala.javacourse181112.paw_inc.model;

public class Cat extends Animal {
    private int intelligenceCoefficient;

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient( int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public Cat(String name, int age, int intelligenceCoefficient){
        super(name, age);
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
