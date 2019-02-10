package com.musala.javacourse181112.tasks.validation_framework;

class Person {
    @StringLengthAnnotation(minValue = 1, maxValue = 255)
    String name;

    public Person() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
