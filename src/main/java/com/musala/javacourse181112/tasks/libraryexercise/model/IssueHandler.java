package com.musala.javacourse181112.tasks.libraryexercise.model;

import java.util.ArrayList;
import java.util.List;

public class IssueHandler {

    // private Map<String, Integer> lastIssue = new HashMap<>();
    private List<Issue> lastIssue = new ArrayList<>();

    public int getNextIssue(String specialId) {
        for (Issue issue : lastIssue) {
            if (issue.getSpecialId().equals(specialId)) {
                issue.setIssueNumber(issue.getIssueNumber() + 1);
                return issue.getIssueNumber();
            }
        }
        Issue issue = new Issue();
        issue.setIssueNumber(1);
        issue.setSpecialId(specialId);
        lastIssue.add(issue);
        return issue.getIssueNumber();
    }

}
