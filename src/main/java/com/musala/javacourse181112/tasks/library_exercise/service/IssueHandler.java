package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Issueable;

public class IssueHandler<T extends Issueable> {
    private T issueable;

    public boolean hasNext() {
        return issueable.getIssue() != null;
    }

    public Integer next(final T issuable) {
        final Integer nextIssue = this.issueable.getIssue();
        this.issueable = issuable;
        return nextIssue;
    }

    private void setIssueable(final T issueable) {
        assert issueable != null;
        this.issueable = issueable;
    }
}
