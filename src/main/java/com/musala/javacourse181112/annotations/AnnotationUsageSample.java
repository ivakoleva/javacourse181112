package com.musala.javacourse181112.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
       // TODO:With lambda in exercises
        final Class<AnnotationUsageSample> clazz = AnnotationUsageSample.class;
        final Method[] methods = clazz.getDeclaredMethods();
        final Field[] fields = clazz.getDeclaredFields();

        for (final Method method : methods) {
            if (method.isAnnotationPresent(SampleAnnotation.class)) {
                System.out.println(method.getName() + " Has an annotation SampleAnnotation");
            }

            int counter = 0;
            for (final Annotation[] annotations : method.getParameterAnnotations()) {
                for (final Annotation annotation : annotations) {
                    if (annotation instanceof SampleAnnotation) {
                        counter++;
                    }
                }
            }
            System.out.println(method.getName() + " Has " + counter + " annotation SampleAnnotation in its parameters");

        }
        for (final Field field : fields) {
            if (field.isAnnotationPresent(SampleAnnotation.class)) {
                System.out.println(field.getName() + " Has an annotation SampleAnnotation");
            }
        }
    }
}