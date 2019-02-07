package com.musala.javacourse181112.paw_inc.classes.animals;

import com.musala.javacourse181112.paw_inc.classes.centers.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class Cat extends Animal {
    private int intelligenceCoefficient;
    private AdoptionCenter adoptionCenter;

    public Cat(final String name, final int age, final int intelligenceCoefficient, final AdoptionCenter adoptionCenter) {
        super(name, age);
        this.intelligenceCoefficient = intelligenceCoefficient;
        this.adoptionCenter = adoptionCenter;
    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(final int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(final AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}
