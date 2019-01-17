package com.musala.javacourse181112.tasks.SampleClass;

public class Sample {
    private int age;
    private String name;

    private Sample() {
    }

    public Sample(int age) {
        this.age = age;
    }

    public Sample(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
