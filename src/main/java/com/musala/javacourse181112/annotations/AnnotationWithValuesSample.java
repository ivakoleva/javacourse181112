package com.musala.javacourse181112.annotations;

/**
 * Created by Iva Koleva on 29.01.2019
 */
public @interface AnnotationWithValuesSample {
    String sampleValue();
    int sampleIntValue();
}

@interface AnnotationWithValueSample {
    String value();
    //int intValue(); <- if we have another parameter, both names should be explicitly specified
}

@AnnotationWithValueSample("asd") // only for one parameter, named value
@AnnotationWithValuesSample(sampleValue = "Asd", sampleIntValue = 0)
class AnnotationWithValuesUsageClass {

}