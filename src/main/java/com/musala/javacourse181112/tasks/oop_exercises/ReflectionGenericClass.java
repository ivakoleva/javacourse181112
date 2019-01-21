package com.musala.javacourse181112.tasks.oop_exercises;

public class ReflectionGenericClass<E> implements Cloneable {
    private E value;

    public ReflectionGenericClass() {
    }

    public ReflectionGenericClass(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public ReflectionGenericClass<E> clone() throws CloneNotSupportedException {
        final ReflectionGenericClass<E> clone = (ReflectionGenericClass<E>) super.clone();
        clone.setValue(value);
        return clone;
        //return new ReflectionGenericClass(value);
    }

    /*public <T> ReflectionGenericClass<T> clone(ReflectionGenericClass<T> reflectionGenericClass) {
        return new ReflectionGenericClass<T>(reflectionGenericClass.getValue());
    }*/
}
