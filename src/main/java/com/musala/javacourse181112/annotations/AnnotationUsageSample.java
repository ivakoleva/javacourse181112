package com.musala.javacourse181112.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

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
        final Class<AnnotationUsageSample> clazz =AnnotationUsageSample.class;
int counter=0;
      final Method[] methods= clazz.getDeclaredMethods();
        final Field[] fields= clazz.getDeclaredFields();

       for (int i=0 ;i<methods.length;i++){

           if(methods[i].getAnnotation(SampleAnnotation.class)!= null){
               System.out.println(methods[i].getName()+ "Has an annotation");
           }

               Annotation[][] annotation=methods[i].getParameterAnnotations();
               for (Annotation[] annotations:annotation){
                   for(Annotation annotations1:annotations){
                       if(annotations1 instanceof SampleAnnotation){
                          counter++;
                       }
                   }
               }
               System.out.println(methods[i].getName()+" Has " +counter+" anotations in its parameters");


    }
       for(int i=0;i<fields.length;i++){
           if(fields[i].getAnnotation(SampleAnnotation.class)!=null){
               System.out.println(fields[i].getName()+" Has an annotation");
           }
       }


    }
}