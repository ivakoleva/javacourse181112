package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
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
        final Class<AnnotationUsageExercise> annotationUsageExerciseClass = AnnotationUsageExercise.class;
        Method[] methods = annotationUsageExerciseClass.getDeclaredMethods();
        Field[] fields = annotationUsageExerciseClass.getDeclaredFields();

        Arrays.stream(methods).filter(method -> method.isAnnotationPresent(SampleAnnotation.class))
                .forEach(method -> System.out.printf("Method: %s%n", method.getName()));

        Arrays.stream(fields).filter(field -> field.isAnnotationPresent(SampleAnnotation.class))
                .map(field -> "Field: " + field.getName())
                .forEachOrdered(System.out::println);
    }
}