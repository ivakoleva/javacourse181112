package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.oop.votesexercise.model.Answer;
import com.musala.javacourse181112.oop.votesexercise.model.Person;
import com.musala.javacourse181112.oop.votesexercise.model.Poll;
import com.musala.javacourse181112.oop.votesexercise.model.Question;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Votes05DataPopulationExercise {
    public static void main(final String[] args) {
        final Person ivanIvanov = new Person();
        ivanIvanov.setName("Ivan");
        ivanIvanov.setFamily("Ivanov");
        ivanIvanov.setDateOfBirth(LocalDate.of(1990, Month.JANUARY, 1));

        final Poll coffeePoll = new Poll();
        coffeePoll.setName("Coffee poll");
        coffeePoll.setStartDateTime(LocalDateTime.of(2019, Month.JANUARY, 1, 0, 0));
        coffeePoll.setEndDateTime(LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0));
        coffeePoll.setCreatedBy(ivanIvanov);

        final List<Question> questionList = new ArrayList<>();
        coffeePoll.setQuestionList(questionList);

        final Question question1 = new Question();
        question1.setName("Do you like coffee?");
        final Answer answer1ofQuestion1 = new Answer();
        answer1ofQuestion1.setName("Yes");
        final Answer answer2ofQuestion1 = new Answer();
        answer2ofQuestion1.setName("No");
        question1.setAnswerList(new ArrayList<>());
        question1.getAnswerList().add(answer1ofQuestion1);
        question1.getAnswerList().add(answer2ofQuestion1);

        questionList.add(question1);

        final Question question2 = new Question();
        question2.setName("How do you enjoy your coffee?");
        final Answer answer1ofQuestion2 = new Answer();
        answer1ofQuestion2.setName("Milk");
        final Answer answer2ofQuestion2 = new Answer();
        answer2ofQuestion2.setName("Sugar");
        final Answer answer3ofQuestion2 = new Answer();
        answer3ofQuestion2.setName("Milk & Sugar");
        final Answer answer4ofQuestion2 = new Answer();
        answer4ofQuestion2.setName("Black");
        final Answer answer5ofQuestion2 = new Answer();
        answer5ofQuestion2.setName("None of the above");
        question2.setAnswerList(new ArrayList<>());
        question2.getAnswerList().add(answer1ofQuestion2);
        question2.getAnswerList().add(answer2ofQuestion2);
        question2.getAnswerList().add(answer3ofQuestion2);
        question2.getAnswerList().add(answer4ofQuestion2);
        question2.getAnswerList().add(answer5ofQuestion2);

        questionList.add(question2);

        final Question question3 = new Question();
        question3.setName("How many coffees do you have a day?");
        //question3.setAnswerList();

        questionList.add(question3);

        // TODO: populate 3 questions, consult tasks.md
    }
}
