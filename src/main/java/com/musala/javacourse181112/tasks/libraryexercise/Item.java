package com.musala.javacourse181112.tasks.libraryexercise;

public class Item {

    private Library library;
    private TypeOfItem typeOfItem;
    private String ISBN;
    private String name;
    private long id;

   /* public Item(TypeOfItem typeOfItem, String ISBN, String name, long id) {
        this.typeOfItem = typeOfItem;
        this.ISBN = ISBN;
        this.name = name;
        this.id = id;
    }
    */

    public TypeOfItem getTypeOfItem() {
        return typeOfItem;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }
    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }


    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTypeOfItem(TypeOfItem typeOfItem) {
        this.typeOfItem = typeOfItem;
    }


}
