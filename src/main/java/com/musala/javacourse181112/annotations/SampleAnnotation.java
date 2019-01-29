package com.musala.javacourse181112.annotations;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Iva Koleva on 29.01.2019
 */
@Retention(value=RUNTIME)
public @interface SampleAnnotation {
    //String value();
}
