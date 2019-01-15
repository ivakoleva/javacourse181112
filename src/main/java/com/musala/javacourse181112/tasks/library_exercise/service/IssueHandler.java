package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Issueable;

public class IssueHandler<T extends Issueable> {

    T item;

    public boolean hasNext() {
        return item.getIssue() != null;
    }

    public Integer next(T item) {
        Integer nextIssue = this.item.getIssue();
        setItem(item);
        return nextIssue;
    }

    private void setItem(T newItem) {
        item = newItem;
    }
}
