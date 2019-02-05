package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.*;

import java.util.List;

public class Center {
    String name;
    List<Cat> catList;
    List<Dog> dogList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public List<Dog> getDogList() {
        return dogList;
    }

    public void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }


    public Center(String name) {
        this.name = name;
    }
}
