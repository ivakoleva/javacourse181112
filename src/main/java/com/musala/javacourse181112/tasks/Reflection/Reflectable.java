package com.musala.javacourse181112.tasks.Reflection;

public class Reflectable {
    private String name;
    private int Id;
    private int increment = 0;

    public Reflectable(String name, int id) {
        this.name = name;
        Id = id;
    }

    public Reflectable(String name) {
        this.name = name;
        Id = increment;
        increment++;
    }

    public Reflectable() {
        this.name = ("Alfa" + increment);
        Id = increment;
        increment++;
    }

    public Reflectable( int id) {
        this.name =("Alfa" + increment);
        Id = id;
    }
}
