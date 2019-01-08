package com.musala.javacourse181112.oop.votesexercise.service;

import com.musala.javacourse181112.oop.votesexercise.model.*;
import com.musala.javacourse181112.oop.votesexercise.service.exception.PersonAlreadyVotedQuestionException;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class PollService {

    public Answer generateAnswer(final String name) {
        final Answer answer = new Answer();
        answer.setName(name);
        return answer;
    }

    public Question generateQuestion(final String name,
                                     final Supplier<Answer>... answerSuppliers) {
        final Question question = new Question();
        question.setName(name);
        question.setAnswerAvailableList(Arrays.stream(answerSuppliers)
                .map(Supplier::get)
                .collect(Collectors.toList()));
        return question;
    }

    public Poll generatePoll(final String name,
                             final boolean anonymous,
                             final Supplier<Question>... questionSuppliers) {
        final LocalDateTime startDateTime = LocalDateTime.now();
        return generatePoll(
                name,
                anonymous,
                Arrays.stream(questionSuppliers)
                        .map(Supplier::get)
                        .collect(Collectors.toList()),
                startDateTime,
                startDateTime.plus(1, ChronoUnit.YEARS),
                null);
    }

    public Poll generatePoll(final String name,
                             final boolean anonymous,
                             final List<Question> questionList,
                             final LocalDateTime startDateTime,
                             final LocalDateTime endDateTime,
                             final Person createdBy) {
        final Poll poll = new Poll();
        poll.setName(name);
        poll.setAnonymous(anonymous);
        poll.setQuestionList(questionList);
        poll.setStartDateTime(startDateTime);
        poll.setEndDateTime(endDateTime);
        poll.setCreatedBy(createdBy);
        return poll;
    }

    public void giveAnswer(final Person person,
                           final Poll poll,
                           final Question question,
                           final Answer answer) throws PersonAlreadyVotedQuestionException {
        if (question.getPersonVotedList() != null &&
                question.getPersonVotedList().contains(person)) {
            throw new PersonAlreadyVotedQuestionException("Person " + person.toString() + " already voted to question " + question.toString());
        }

        final AnswerGiven answerGiven = new AnswerGiven();
        answerGiven.setAnswer(answer);
        if (!poll.isAnonymous()) {
            answerGiven.setPerson(person);
        }

        // TODO: atomicity during multithreading
        if (question.getAnswerGivenList() == null) {
            question.setAnswerGivenList(new ArrayList<>());
        }
        question.getAnswerGivenList().add(answerGiven);

        if (question.getPersonVotedList() == null) {
            question.setPersonVotedList(new ArrayList<>());
        }
        question.getPersonVotedList().add(person);
    }
}
