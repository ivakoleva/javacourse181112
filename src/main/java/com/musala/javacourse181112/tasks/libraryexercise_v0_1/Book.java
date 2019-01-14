package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

public class Book {
    private int isbn;
    private String author, title;

    public Book() {
        isbn = 0;
        title = null;
        author = null;
    }

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
}
