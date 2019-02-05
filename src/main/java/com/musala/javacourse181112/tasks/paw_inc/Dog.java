package com.musala.javacourse181112.tasks.paw_inc;

public class Dog extends Animal {
    private boolean cleansingStatus;
    private int intelligenceCoefficient;

    public Dog(String name, int age, boolean cleansingStatus, int intelligenceCoefficient) {
        super(name, age);
        this.cleansingStatus = cleansingStatus;
        this.intelligenceCoefficient = intelligenceCoefficient;
    }

    public boolean isCleansingStatus() {
        return cleansingStatus;
    }

    public void setCleansingStatus(boolean cleansingStatus) {
        this.cleansingStatus = cleansingStatus;
    }

    public int getIntelligenceCoefficient() {
        return intelligenceCoefficient;
    }

    public void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}

