package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Book;
import com.musala.javacourse181112.tasks.library_exercise.model.Item;
import com.musala.javacourse181112.tasks.library_exercise.model.Magazine;
import com.musala.javacourse181112.tasks.library_exercise.model.Newspaper;

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
        setItem(book, isbn, name, id, dayOfPublishing);
        return book;
    }

    public Magazine generateMagazine(String isbn, String name, String id, LocalDate dayOfPublishing) {
        assert issueHandler != null;

        Magazine magazine = new Magazine();
        setItem(magazine, isbn, name, id, dayOfPublishing);
        return magazine;
    }

    public Newspaper generateNewspaper(String isbn, String name, String id, LocalDate dayOfPublishing) {
        assert issueHandler != null;

        Newspaper newspaper = new Newspaper();
        setItem(newspaper, isbn, name, id, dayOfPublishing);
        return newspaper;
    }

    private <T extends Item> void setItem(T item, String isbn, String name, String id, LocalDate dayOfPublishing) {
        item.setId(id);
        item.setName(name);
        item.setISBN(isbn);
        item.setDayOfPublishing(dayOfPublishing);
        item.setIssue(issueHandler.getNextIssue(item.getSpecialId()));
    }
}
