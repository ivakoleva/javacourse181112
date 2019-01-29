package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.annotations.SampleAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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

        Class<AnnotationUsageExercise> annotationUsageExerciseClass = AnnotationUsageExercise.class;
        Method[] methods = annotationUsageExerciseClass.getDeclaredMethods();
        Field[] fields = annotationUsageExerciseClass.getDeclaredFields();


        for (Field field : fields) {
            if (field.isAnnotationPresent(SampleAnnotation.class)) {
                System.out.println("Field: " + field.getName());
            }
        }

        for (Method method : methods) {
            if (method.isAnnotationPresent(SampleAnnotation.class)) {
                System.out.println("Method: " + method.getName());
            }
        }
        //annotationUsageExerciseClass.getDeclaredMethods()[0].annotation;
        // annotationUsageExerciseClass.getAnnotation(SampleAnnotation.class);

    }
}