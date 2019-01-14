package com.musala.javacourse181112.tasks.libraryexercise_v0_1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> collection;

    public Library() {
        List<Book> collection = new ArrayList<>();
    }

    public void addBook(Book book) {
        collection.add(book);
    }
}
