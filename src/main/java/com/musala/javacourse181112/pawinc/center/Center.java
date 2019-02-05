package com.musala.javacourse181112.pawinc.center;

import java.util.LinkedList;
import java.util.List;

public class Center {
    String name;
    List storedAnimals = new LinkedList();

    public Center(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getStoredAnimals() {
        return storedAnimals;
    }

    public void setStoredAnimals(List storedAnimals) {
        this.storedAnimals = storedAnimals;
    }
}
