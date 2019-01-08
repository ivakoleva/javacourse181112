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
        questionList.add(question1);

        final List<Answer> answerList = new ArrayList<>();

        final Answer answer1OfQuestion1 = new Answer();
        answer1OfQuestion1.setName("Yes");
        answerList.add(answer1OfQuestion1);

        final Answer answer2OfQuestion1 = new Answer();
        answer2OfQuestion1.setName("No");
        answerList.add(answer2OfQuestion1);

        question1.setAnswerList(answerList);


        final Question question2 = new Question();
        question2.setName("How do you enjoy your coffee?");
        questionList.add(question2);

        final List<Answer> answerListQuestion2 = new ArrayList<>();

        final Answer answer1OfQuestion2 = new Answer();
        answer1OfQuestion2.setName("Milk");
        answerListQuestion2.add(answer1OfQuestion2);

        final Answer answer2OfQuestion2 = new Answer();
        answer2OfQuestion2.setName("Sugar");
        answerListQuestion2.add(answer2OfQuestion2);

        final Answer answer3OfQuestion2 = new Answer();
        answer3OfQuestion2.setName("Milk & Sugar");
        answerListQuestion2.add(answer3OfQuestion2);

        question2.setAnswerList(answerListQuestion2);




        final Question question3 = new Question();
        question3.setName("How many coffees do you have a day?");
        questionList.add(question3);

        final List<Answer> answerListQuestion3 = new ArrayList<>();

        final Answer answer1OfQuestion3 = new Answer();
        answer1OfQuestion3.setName("Less or equal of 2");
        answerListQuestion3.add(answer1OfQuestion3);

        final Answer answer2OfQuestion3 = new Answer();
        answer2OfQuestion3.setName("More than 2 but less than 5");
        answerListQuestion3.add(answer2OfQuestion3);

        question3.setAnswerList(answerListQuestion3);


    }
}
