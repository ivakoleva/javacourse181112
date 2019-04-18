package com.musala.javacourse181112.FirstPartJava.annotations;

import java.lang.annotation.Repeatable;

/**
 * Created by Iva Koleva on 29.01.2019
 */
public class RepeatableAnnotationSample {

    @CustomAnnotation
    @CustomAnnotation
    private static class CustomClass {

    }

    @Repeatable(CustomAnnotationContainer.class)
    private @interface CustomAnnotation {

    }

    private @interface CustomAnnotationContainer {
        CustomAnnotation[] value();
    }
}
