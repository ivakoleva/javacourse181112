package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

import java.util.Arrays;

/**
 * Created by Iva Koleva on 29.01.2019
 */
//@SampleAnnotation
@SampleAnnotation
public class AnnotationUsageExercise {
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

    @SampleAnnotation
    public static void main(final String[] args) {
        // TODO: implement
        /*Annotation usage exercise - using template class tasks.AnnotationUsageExercise
         *** print to stdout all annotated class members*/
        // loop over all declared fields, filtering them by annotations array not empty
        // loop over all declared methods, filtering them by annotations array not empty

        final Class<AnnotationUsageExercise> annotationUsageExerciseClass = AnnotationUsageExercise.class;
        Arrays.stream(annotationUsageExerciseClass.getDeclaredMethods())
                .filter(method ->)

        //annotationUsageExerciseClass.getDeclaredFields()[0]
        //annotationUsageExerciseClass.getMethods()[0],annotation;

    }
}