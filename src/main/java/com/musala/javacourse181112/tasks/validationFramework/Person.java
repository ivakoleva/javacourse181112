package com.musala.javacourse181112.tasks.validationFramework;

public class Person {
    @StringLengthAnnotation(
            minValue = 1,
            maxValue = 255
    )
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
