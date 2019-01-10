package com.musala.javacourse181112.tasks.libraryexercise;

public class Item {

    private ItemEnum itemEnum;
    private String ISBN;
    private String name;
    private long  id;

    public Item(ItemEnum itemEnum, String ISBN, String name, long id){
        this.itemEnum = itemEnum;
        this.ISBN = ISBN;
        this.name = name;
        this.id = id;

    }

    public ItemEnum getItemEnum() {
        return itemEnum;
    }

    public void setItemEnum(ItemEnum itemEnum) {
        this.itemEnum = itemEnum;
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

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
