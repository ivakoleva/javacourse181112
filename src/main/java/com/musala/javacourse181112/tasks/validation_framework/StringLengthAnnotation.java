package com.musala.javacourse181112.tasks.validation_framework;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ElementType.FIELD)
@Retention(RUNTIME)
public @interface StringLengthAnnotation {
    /*
    implement custom StringLength annotation, accepting min and max int values
     **** applicable to fields only
     **** available at runtime
     * */
    int minValue();
    int maxValue();
}
