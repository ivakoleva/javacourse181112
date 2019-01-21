package com.musala.javacourse181112.tasks.oop_exercises;

public class ReflectionGenericClass<E> {
    private E value;

    public ReflectionGenericClass() {

    }

    public ReflectionGenericClass (E value){
        this.value = value;
    }

    public E getValue(){
        return value;
    }
    public void setValue(E value){
        this.value = value;
    }
    public static <T> ReflectionGenericClass<T> copy (ReflectionGenericClass<T> reflectionGenericClass){
        return new ReflectionGenericClass<T>(reflectionGenericClass.getValue());
    }
}
