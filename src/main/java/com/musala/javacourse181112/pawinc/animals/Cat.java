package com.musala.javacourse181112.pawinc.animals;

/**
 * Created by Kristina Stoyanova on 5.2.2019 г.
 */
public class Cat extends Animal {
    private int intelligenceCoefficient;

    public Cat(String name, int age, String adoptionCenterName,int intelligenceCoefficient) {
        super(name, age, adoptionCenterName);
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }
    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

}
