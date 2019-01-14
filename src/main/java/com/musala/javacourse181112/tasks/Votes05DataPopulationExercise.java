package com.musala.javacourse181112.tasks;


import com.musala.javacourse181112.tasks.votingexercise.Answer;
import com.musala.javacourse181112.tasks.votingexercise.Person;
import com.musala.javacourse181112.tasks.votingexercise.Poll;
import com.musala.javacourse181112.tasks.votingexercise.Question;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

/**
 * *** Poll: Coffee poll
 *             **** Question1: Do you like coffee?
 *             **** Answers:
 *                 ***** Yes
 *                 ***** No
 *             **** Question2: How do you enjoy your coffee?
 *                 ***** Milk
 *                 ***** Sugar
 *                 ***** Milk & sugar
 *                 ***** Black
 *                 ***** None of the above
 *             **** Question3: How many coffees do you have a day?
 *                 ***** Less or equal of 2
 *  *                 ***** More than 2 but less than 5
 *  *                 ***** More or equal of 5
 *  *                 ***** None
 *             **** Persons participating: 2
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

        coffeePoll.setQuestionList(new ArrayList<>());

        final Question question1 = new Question();
        question1.setName("Do you like coffee?");
        question1.setAnswerList(new ArrayList<>());

        question1.getAnswerList().add(createAnswer("Yes"));
        question1.getAnswerList().add(createAnswer("No"));
        coffeePoll.getQuestionList().add(question1);
        coffeePoll.getQuestionList().add(createQuestion("How do you enjoy your coffee?", "Milk", "Sugar", "Milk & sugar", "Black", "None of the above"));
        coffeePoll.getQuestionList().add(createQuestion("How many coffees do you have a day?", "Less or equal of 2", " More than 2 but less than 5", "More or equal of 5", "None"));
        Person person1 = createPerson("a", "a", LocalDate.of(1234, 11, 12));
        Person person2 = createPerson("b", "b", LocalDate.of(2134, 2, 25));
        // TODO: populate 3 questions, consult tasks.md
    }

    static Person createPerson(String name, String family, LocalDate dateOfBirth) {
        Person person = new Person();
        person.setDateOfBirth(dateOfBirth);
        person.setFamily(family);
        person.setName(name);
        return person;
    }

    static Question createQuestion(String name, String... answers) {
        Question question = new Question();
        question.setName(name);
        question.setAnswerList(new ArrayList<>());
        for (String answer : answers) {
            question.getAnswerList().add(createAnswer(answer));
        }
        return question;
    }

    static Answer createAnswer(String name) {
        Answer answer = new Answer();
        answer.setName(name);
        return answer;
    }
}
