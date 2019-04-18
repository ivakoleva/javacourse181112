package com.musala.javacourse181112.FirstPartJava.annotations;

import com.musala.javacourse181112.FirstPartJava.tasks.anotations.PrintMethodsWithAnnotationsExample;

/**
 * Created by Iva Koleva on 29.01.2019
 */
//@SampleAnnotation
@SampleAnnotation
public class AnnotationUsageSample {
    @SampleAnnotation
    private String annotatedField;
    private String anotherField;

    public String getAnnotatedField() {
        return annotatedField;
    }

    public void setAnnotatedField(String annotatedField) {
        this.annotatedField = annotatedField;
    }

    public String getAnotherField() {
        return anotherField;
    }

    public void setAnotherField(String anotherField) {
        this.anotherField = anotherField;
    }

    @SampleAnnotation
    public void annotatedMethod(final @SampleAnnotation String annotatedArgument,
                                final String anotherArgument) {

    }

    public void anotherMethod() {

    }

    public static void main(final String[] args) {
        final Class<AnnotationUsageSample> clazz = AnnotationUsageSample.class;

        PrintMethodsWithAnnotationsExample.printClassAnnotationsInfo(clazz);
    }

}