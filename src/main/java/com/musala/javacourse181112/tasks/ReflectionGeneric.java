package com.musala.javacourse181112.tasks;

public class ReflectionGeneric<E> {
    private E value;

    public ReflectionGeneric() {

    }

    public ReflectionGeneric(E value) {
        this.value = value;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
