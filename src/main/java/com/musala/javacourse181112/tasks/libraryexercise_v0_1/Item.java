package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

public class Item {

    private Library library;
    private TypeOfItem typeOfItem;
    private String name;
    private String ISBN;
    private long id;


    /*public Item(ItemEnum itemEnum, String name, String ISBN, long id) {
        this.typeOfItem = typeOfItem;
        this.name = name;
        this.ISBN = ISBN;
        this.id = id;
    }
    */

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public TypeOfItem getTypeOfItem() {
        return typeOfItem;
    }

    public void setTypeOfItem(TypeOfItem typeOfItem) {
        this.typeOfItem = typeOfItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}