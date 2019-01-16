package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Issueable;
import com.sun.istack.internal.NotNull;

public class IssueHandler<T extends Issueable> {

    T item;

    public boolean hasNext() {
        return item.getIssue() != null;
    }

    public Integer next(@NotNull final T item) {
        final Integer nextIssue = this.item.getIssue();
        setItem(item);
        return nextIssue;
    }

    private void setItem(final T newItem) {
        item = newItem;
    }
}
