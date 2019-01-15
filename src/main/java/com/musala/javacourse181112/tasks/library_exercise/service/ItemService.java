package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
    private List<IssueHandler> issueHandlers = new ArrayList<>();

    public List<IssueHandler> getIssueHandlers() {
        return issueHandlers;
    }

    public Book generateBook(String isbn, String name, String id, LocalDate dayOfPublishing) {

        Book book = new Book();
        setNotIssueableItem(book, isbn, name, id, dayOfPublishing);
        return book;
    }

    public Magazine generateMagazine(String isbn, String name, String id, LocalDate dayOfPublishing) {

        Magazine magazine = new Magazine();
        IssueHandler<Magazine> magazineIssueHandler = new IssueHandler<>();
        setIssueableItem(magazine, magazineIssueHandler, isbn, name, id, dayOfPublishing);
        return magazine;
    }

    public Newspaper generateNewspaper(String isbn, String name, String id, LocalDate dayOfPublishing) {

        Newspaper newspaper = new Newspaper();
        IssueHandler<Newspaper> newspaperIssueHandler = new IssueHandler<>();
        setIssueableItem(newspaper, newspaperIssueHandler, isbn, name, id, dayOfPublishing);
        return newspaper;
    }

    private <T extends Issueable> void setIssueableItem(T item, IssueHandler issueHandler, String isbn, String name, String id, LocalDate dayOfPublishing) {
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
