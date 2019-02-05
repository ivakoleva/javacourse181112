package com.musala.javacourse181112.tasks.paw_inc.model;

import com.musala.javacourse181112.tasks.paw_inc.Animals;

public class Cat extends Animals {
    private String name;
    private int age;
    private boolean cleansingStatus;
    private int intelligenceCoefficient;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
