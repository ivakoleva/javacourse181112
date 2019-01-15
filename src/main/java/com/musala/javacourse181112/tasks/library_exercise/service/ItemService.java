package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.time.LocalDate;

public class ItemService {
    private IssueHandler issueHandler;

    public void setIssueHandler(IssueHandler issueHandler) {
        this.issueHandler = issueHandler;
    }

    public IssueHandler getIssueHandler() {
        return issueHandler;
    }

    public Book generateBook(String isbn, String name, String id, LocalDate dayOfPublishing) {
        assert issueHandler != null;

        Book book = new Book();
        setNotIssueableItem(book, isbn, name, id, dayOfPublishing);
        return book;
    }

    public Magazine generateMagazine(String isbn, String name, String id, LocalDate dayOfPublishing) {
        assert issueHandler != null;

        Magazine magazine = new Magazine();
        setIssueableItem(magazine, isbn, name, id, dayOfPublishing);
        return magazine;
    }

    public Newspaper generateNewspaper(String isbn, String name, String id, LocalDate dayOfPublishing) {
        assert issueHandler != null;

        Newspaper newspaper = new Newspaper();
        setIssueableItem(newspaper, isbn, name, id, dayOfPublishing);
        return newspaper;
    }

    private <T extends Issueable> void setIssueableItem(T item, String isbn, String name, String id, LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
        item.setIssue(issueHandler.next(item));
    }

    private <T extends Item> void setNotIssueableItem(T item, String isbn, String name, String id, LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
    }
}
