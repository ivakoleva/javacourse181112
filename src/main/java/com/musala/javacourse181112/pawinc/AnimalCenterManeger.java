package com.musala.javacourse181112.pawinc;

import com.musala.javacourse181112.pawinc.centers.AdoptionCenter;
import com.musala.javacourse181112.pawinc.centers.CleansingCenter;

import java.util.ArrayList;
import java.util.List;

public class AnimalCenterManeger {
    private static AnimalCenterManeger singleInstance;
    private List<AdoptionCenter> adoptionCenters = new ArrayList<>();
    private List<CleansingCenter> cleansingCenters = new ArrayList<>();


    private AnimalCenterManeger() {
    }

    public static AnimalCenterManeger getInstance() {
        if (singleInstance == null) {
            singleInstance = new AnimalCenterManeger();
        }
        return singleInstance;
    }

    public List<AdoptionCenter> getAdoptionCenters() {
        return adoptionCenters;
    }

    public List<CleansingCenter> getCleansingCenters() {
        return cleansingCenters;
    }
}
