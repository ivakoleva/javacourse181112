package com.musala.javacourse181112.tasks.votesystem.votes_v0_6_exercise.model;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Poll {
    private String name;
    private List<Question> questionList;
    // TODO: add personList

    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    private Person createdBy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Person getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Person createdBy) {
        this.createdBy = createdBy;
    }
}
