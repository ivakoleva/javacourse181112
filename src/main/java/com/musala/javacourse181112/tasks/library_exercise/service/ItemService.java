package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
    final private List<IssueHandler> issueHandlers = new ArrayList<>();

    public List<IssueHandler> getIssueHandlers() {
        return issueHandlers;
    }

    public <T extends Issueable> void addIssueable(final T issue) {
        if (doesHaveIssueable(issue)) {
            final IssueHandler<T> issueHandler = new IssueHandler<>();
            issueHandler.next(issue);
            issueHandlers.add(issueHandler);
        }
    }

    // TODO: rename to addItem, and complete the workflow ?
    public <T extends Item> void checkListForNotHandledItems(final List<T> items) {
        items.stream()
                .filter(this::isIssuable)
                .filter(i -> doesHaveIssueable((Issueable) i))
                .map(i -> {
                    IssueHandler issueHandler = new IssueHandler();
                    issueHandler.next((Issueable) i);
                    return issueHandler;
                }).forEach(issueHandlers::add);
    }

    // generate
    public Book generateBook(final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        final Book book = new Book();
        setNotIssueableItem(book, isbn, name, id, dayOfPublishing);
        return book;
    }

    public Magazine generateMagazine(final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        final Magazine magazine = new Magazine();
        IssueHandler<Magazine> magazineIssueHandler = new IssueHandler<>();
        setIssueableItem(magazine, magazineIssueHandler, isbn, name, id, dayOfPublishing);
        return magazine;
    }

    public Newspaper generateNewspaper(final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        final Newspaper newspaper = new Newspaper();
        IssueHandler<Newspaper> newspaperIssueHandler = new IssueHandler<>();
        setIssueableItem(newspaper, newspaperIssueHandler, isbn, name, id, dayOfPublishing);
        return newspaper;
    }


    private <T extends Issueable> void setIssueableItem(final T item, final IssueHandler issueHandler, final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
        item.setIssue(issueHandler.next(item));
    }

    private <T extends Item> void setNotIssueableItem(final T item, final String isbn, final String name, final String id, final LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
    }

    //TODO: implement
    private <T extends Issueable> boolean doesHaveIssueable(final T issue) {
        return false;
    }

    private <T extends Item> boolean isIssuable(final T item) {
        return item instanceof Issueable;
    }
}
