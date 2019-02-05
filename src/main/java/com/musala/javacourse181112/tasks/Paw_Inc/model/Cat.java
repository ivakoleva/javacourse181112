package com.musala.javacourse181112.tasks.Paw_Inc.model;

public class Cat extends Animals {
    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    private int intelligenceCoefficient;

    public Cat(String name, int age) {
        super(name, age);
    }
}
