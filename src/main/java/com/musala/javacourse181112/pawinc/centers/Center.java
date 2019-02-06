package com.musala.javacourse181112.pawinc.centers;

import com.musala.javacourse181112.pawinc.animals.*;

import java.util.ArrayList;
import java.util.List;

public class Center {
    private String name;
   protected final List<Cat> catList=new ArrayList<>();
   protected final List<Dog> dogList=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public List<Dog> getDogList() {
        return dogList;
    }




    public Center(String name) {
        this.name = name;
    }
}
