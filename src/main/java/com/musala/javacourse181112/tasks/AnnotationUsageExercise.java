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
        final Class<AnnotationUsageExercise> annotationUsageExercise = AnnotationUsageExercise.class;

        Arrays.stream(annotationUsageExercise.getDeclaredMethods())
                .filter(method ->method.getAnnotations().length!=0)
                .forEach(method -> System.out.println(method.getName()));

        Arrays.stream(annotationUsageExercise.getDeclaredFields())
                .filter(field ->field.getAnnotations().length!=0)
                .forEach(field -> System.out.println(field.getName()));
    }
}