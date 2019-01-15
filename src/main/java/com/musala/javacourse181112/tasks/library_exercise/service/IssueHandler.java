package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueHandler {

    private Map<String, Integer> lastIssue = new HashMap<>();

    public int getNextIssue(String specialId) {

        if (lastIssue.containsKey(specialId)) {
            int issue = lastIssue.get(specialId) + 1;
            lastIssue.put(specialId, issue);
            return issue;
        } else {
            lastIssue.put(specialId, 1);
            return 1;
        }
    }

    public void checkAndCorrect(List<Item> items) {
        items.forEach(i -> {
            if (lastIssue.containsKey(i.getSpecialId())) {
                if (i.getIssue() > lastIssue.get(i.getSpecialId())) {
                    lastIssue.put(i.getSpecialId(), i.getIssue());
                }
            } else {
                lastIssue.put(i.getSpecialId(), i.getIssue());
            }
        });
    }

}
