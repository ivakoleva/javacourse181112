package com.musala.javacourse181112.paw_inc.model;

public enum CenterType {
    ADOPTION_CENTER(AdoptionCenter.class),
    CLEANSING_CENTER(CleansingCenter.class);

    private Class clazz;

    CenterType(Class clazz){
        this.clazz = clazz;
    }
}
