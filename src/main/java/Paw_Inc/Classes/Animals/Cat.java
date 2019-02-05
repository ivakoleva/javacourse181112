package Paw_Inc.Classes.Animals;

import Paw_Inc.Classes.Centers.AdoptionCenter;

/**
 * Created by Aykut Ismailov on 4.2.2019 г.
 */
public class Cat extends Animal {
    private int intelligenceCoefficient;
    private AdoptionCenter adoptionCenter;

    public Cat(String name, int age, int inteligenceCoefficient, AdoptionCenter adoptionCenter) {
        super(name, age);
        this.intelligenceCoefficient = inteligenceCoefficient;
        this.adoptionCenter = adoptionCenter;
    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public AdoptionCenter getAdoptionCenter() {
        return adoptionCenter;
    }

    public void setAdoptionCenter(AdoptionCenter adoptionCenter) {
        this.adoptionCenter = adoptionCenter;
    }
}
