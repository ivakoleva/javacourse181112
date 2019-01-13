package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

public class Magazine implements Item {
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    private String title;
    private String isbn;
    private String publisher;
    private String author;
    private String id;
    private boolean issued;

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getISBN() {
        return null;
    }

    @Override
    public String getAuthor() {
        return null;
    }

    @Override
    public String getID() {
        return null;
    }

    @Override
    public String getPublusher() {
        return null;
    }

    @Override
    public boolean isIssued() {
        return false;
    }
}
