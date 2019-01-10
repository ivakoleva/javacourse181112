package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

public class Item {

    private ItemEnum itemEnum;
    private String name;
    private String ISBN;
    private long id;


    public Item(ItemEnum itemEnum, String name, String ISBN, long id) {
        this.itemEnum = itemEnum;
        this.name = name;
        this.ISBN = ISBN;
        this.id = id;
    }

    public ItemEnum getItemEnum() {
        return itemEnum;
    }

    public void setItemEnum(ItemEnum itemEnum) {
        this.itemEnum = itemEnum;
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