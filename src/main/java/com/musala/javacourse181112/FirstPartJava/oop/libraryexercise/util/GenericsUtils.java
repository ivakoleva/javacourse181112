package com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.util;

import com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model.AbstractItem;

import java.lang.reflect.InvocationTargetException;

public class GenericsUtils {

    public static <T extends AbstractItem> T getAbstractItemInstace(final Class<T> inputClass) {
        assert inputClass != null;
        try {

            return inputClass.getConstructor().newInstance();

        } catch (IllegalAccessException | InvocationTargetException |
                  NoSuchMethodException | InstantiationException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
