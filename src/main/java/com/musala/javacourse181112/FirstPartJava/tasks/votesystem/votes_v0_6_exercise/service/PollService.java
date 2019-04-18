package com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.service;

import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Answer;
import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Person;
import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Poll;
import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Question;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
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
        question.setAnswerList(Arrays.stream(answerSuppliers)
                .map(Supplier::get)
                .collect(Collectors.toList()));
        return question;
    }

    public Poll generatePoll(final String name, final Supplier<Question>... questionSuppliers) {
        final LocalDateTime startDateTime = LocalDateTime.now();
        return generatePoll(
                name,
                Arrays.stream(questionSuppliers)
                        .map(Supplier::get)
                        .collect(Collectors.toList()),
                startDateTime,
                startDateTime.plus(1, ChronoUnit.YEARS),
                null);
    }

    public Poll generatePoll(final String name,
                             final List<Question> questionList,
                             final LocalDateTime startDateTime,
                             final LocalDateTime endDateTime,
                             final Person createdBy) {
        final Poll poll = new Poll();
        poll.setName(name);
        poll.setQuestionList(questionList);
        poll.setStartDateTime(startDateTime);
        poll.setEndDateTime(endDateTime);
        poll.setCreatedBy(createdBy);
        return poll;
    }
}
