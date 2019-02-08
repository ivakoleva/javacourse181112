package com.musala.javacourse181112.tasks.pawInc;

public class Cat extends Animal {
    private boolean cleansingStatus;
    private int intelligenceCoefficient;
    private String tag;

    public Cat(String name, int age, int intelligenceCoefficient, String tag) {
        super(name, age);
        this.cleansingStatus = false;
        this.intelligenceCoefficient = intelligenceCoefficient;
        this.tag = tag;
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

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
