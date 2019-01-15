package com.musala.javacourse181112.tasks.library_exercise.service;

import com.musala.javacourse181112.tasks.library_exercise.model.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: add model Issueable interface; make algorithm generic
// seems like Iterator
public class IssueHandler {

    private Map<String, Integer> lastIssue = new HashMap<>();

    public int getNextIssue(String specialId) {

        for (String key : lastIssue.keySet()) {
            if (key.substring(0, key.indexOf('|')).equals(specialId.substring(0, specialId.indexOf('|')))) {
                int issue = lastIssue.get(specialId);
                if (key.substring(key.indexOf('|') + 1).compareTo(specialId.substring(specialId.indexOf('|') + 1)) < 0) {
                    issue += 1;
                    lastIssue.put(specialId, issue);
                }
                return issue;
            }
        }
        lastIssue.put(specialId, 1);
        return 1;
    }

    public void checkAndCorrect(List<Item> items) {
        items.forEach(i -> {
            if (getNextIssue(i.getSpecialId()) != 1) {
                if (i.getIssue() > lastIssue.get(i.getSpecialId())) {
                    lastIssue.put(i.getSpecialId(), i.getIssue());
                }
            } else {
                lastIssue.put(i.getSpecialId(), i.getIssue());
            }
        });
    }

}
