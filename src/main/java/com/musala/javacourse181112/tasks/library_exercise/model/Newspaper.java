package com.musala.javacourse181112.tasks.library_exercise.model;

public class Newspaper implements Item {
    private String ISBN;
    private String name;


    /* public Newspaper(String ISBN, String name) {
         this.ISBN = ISBN;
         this.name = name;
     }
    public Newspaper(String ISBN) {
        this.ISBN = ISBN;
    }
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
