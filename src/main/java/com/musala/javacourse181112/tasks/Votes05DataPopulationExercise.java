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


        final List<Answer> answerList = new ArrayList<>();

        final Answer answerYes = new Answer();
        answerYes.setName("Yes");
        answerList.add(answerYes);

        final Answer answerNo = new Answer();
        answerNo.setName("No");
        answerList.add(answerNo);

        //question1.setAnswerList(answerList);

        questionList.add(question1);

        // TODO: populate 3 questions, consult tasks.md
        /*
        Question2: How do you enjoy your coffee?
                ***** Milk
                ***** Sugar
                ***** Milk & sugar
                ***** Black
                ***** None of the above
         */
        final Question question2 = new Question();
        question2.setName("How do you enjoy your coffee?");

        final List<Answer> answerListQuestion2 = new ArrayList<>();

        questionList.add(question2);

        final Answer milk = new Answer();
        milk.setName("Milk");
        answerListQuestion2.add(milk);

        final Answer sugar = new Answer();
        sugar.setName("Sugar");
        answerListQuestion2.add(sugar);

        final Answer milkSugar = new Answer();
        sugar.setName("Milk and Sugar");
        answerListQuestion2.add(milkSugar);

        final Answer black = new Answer();
        sugar.setName("Black");
        answerListQuestion2.add(black);

        final Answer noneOfTheAbove = new Answer();
        sugar.setName("None of the above");
        answerListQuestion2.add(noneOfTheAbove);

        //question2.setAnswerList(answerListQuestion2);

        /*
        Question3: How many coffees do you have a day?
                ***** Less or equal of 2
                ***** More than 2 but less than 5
                ***** More or equal of 5
                ***** None
         */
        final Question question3 = new Question();
        question3.setName("How do you enjoy your coffee?");

        final List<Answer> answerListQuestion3 = new ArrayList<>();

        questionList.add(question3);

        final Answer lessOrEqualOf2 = new Answer();
        milk.setName("Less or equal of 2");
        answerListQuestion3.add(lessOrEqualOf2);

        final Answer moreThanTwo = new Answer();
        sugar.setName("More than 2 but less than 5");
        answerListQuestion3.add(moreThanTwo);

        final Answer moreOrEqualsOf5 = new Answer();
        sugar.setName("More or equals of 5");
        answerListQuestion3.add(moreOrEqualsOf5);

        final Answer none = new Answer();
        sugar.setName("None");
        answerListQuestion3.add(none);

        //question3.setAnswerList(answerListQuestion3);

        final Person person1 = new Person();
        person1.setName("George");
        person1.setFamily("Gerogiev");
        person1.setDateOfBirth(LocalDate.of(1980,Month.AUGUST,10));

        final Person person2 = new Person();
        person2.setName("Petko");
        person2.setFamily("Petrov");
        person2.setDateOfBirth(LocalDate.of(1975,Month.JULY,15));
    }
}
