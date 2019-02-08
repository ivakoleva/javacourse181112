package com.musala.javacourse181112.paw_inc.model.animal;

import com.musala.javacourse181112.paw_inc.model.center.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 *
 * Cat class
 * Extends Animal
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
