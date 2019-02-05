package com.musala.javacourse181112.paw_inc.classes.centers;

/**
 * Created by Aykut Ismailov on 5.2.2019 г.
 */
public enum TypeOfActivity {
    ADOPTION(AdoptionCenter.class),
    CLEANSING(CleansingCenter.class),
    CASTRATION(CastrationCenter.class);

    private Class clazz;

    TypeOfActivity(Class clazz) {
        this.clazz = clazz;
    }

    public Class getClazz() {
        return clazz;
    }
}
