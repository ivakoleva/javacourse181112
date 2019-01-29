package com.musala.javacourse181112.annotations;

/**
 * Created by Iva Koleva on 29.01.2019
 */
public class OverwriteAnnotationCheckSample {

    @Override
    public String toString() {
        return "OverwriteAnnotationCheckSample{}";
    }

    //@Override //<- would result in compilation error
    public void test() {
        System.out.println("test");
    }
}
