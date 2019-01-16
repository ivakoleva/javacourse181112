package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.*;
import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ItemService {
    final private List<IssueHandler> issueHandlers = new ArrayList<>();

    public List<IssueHandler> getIssueHandlers() {
        return issueHandlers;
    }

    public <T extends Issueable> void addIssueable(@NotNull final T issue) {

        if (doesHaveIssueable(issue)) {
            final IssueHandler<T> issueHandler = new IssueHandler<>();
            issueHandler.next(issue);
            issueHandlers.add(issueHandler);
        }
    }

    public <T extends Item> void checkListForNotHandledItems(@NotNull final List<T> items) {
        items.stream()
                .filter(i -> isIssuable(i))
                .filter(i -> doesHaveIssueable((Issueable) i))
                .map(i -> {
                    IssueHandler issueHandler = new IssueHandler();
                    issueHandler.next((Issueable) i);
                    return issueHandler;
                })
                .forEach(issueHandlers::add);
    }

    public Book generateBook(@NotNull final String isbn, @NotNull final String name, @NotNull final String id, @NotNull final LocalDate dayOfPublishing) {

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

    private <T extends Issueable> void setIssueableItem(@NotNull final T item, @NotNull final IssueHandler issueHandler, @NotNull final String isbn, @NotNull final String name, @NotNull final String id, @NotNull final LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
        item.setIssue(issueHandler.next(item));
    }

    private <T extends Item> void setNotIssueableItem(@NotNull final T item, @NotNull final String isbn, @NotNull final String name, @NotNull final String id, @NotNull final LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
    }

    //TODO: implement
    private <T extends Issueable> boolean doesHaveIssueable(@NotNull final T issue) {
        return false;
    }

    private <T extends Item> boolean isIssuable(@NotNull final T item) {
        return item instanceof Issueable;
    }
}
