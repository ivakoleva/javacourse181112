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
 *** Poll: Coffee poll
 **** Question1: Do you like coffee?
 **** Answers:
 ***** Yes
 ***** No
 **** Question2: How do you enjoy your coffee?
 ***** Milk
 ***** Sugar
 ***** Milk & sugar
 ***** Black
 ***** None of the above
 **** Question3: How many coffees do you have a day?
 ***** Less or equal of 2
 ***** More than 2 but less than 5
 ***** More or equal of 5
 ***** None
 **** Persons participating: 2
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

        final List<Answer> answerListQuestion1 = new ArrayList<>();
        final List<Answer> answerListQuestion2 = new ArrayList<>();
        final List<Answer> answerListQuestion3 = new ArrayList<>();

        final Question question1 = new Question();
        question1.setName("Do you like coffee?");

        final Question question2 = new Question();
        question2.setName("How do you enjoy your coffee?");

        final Question question3 = new Question();
        question2.setName("How many coffees do you have a day?");

//        question1.setAnswerList(answerList);

        final Answer answer1ToQuestion1 = new Answer();
        answer1ToQuestion1.setName("Yes");

        final Answer answer2ToQuestion1 = new Answer();
        answer2ToQuestion1.setName("No");

        final Answer answer1ToQuestion2 = new Answer();
        answer1ToQuestion1.setName("Milk");

        final Answer answer2ToQuestion2 = new Answer();
        answer2ToQuestion1.setName("Sugar");

        final Answer answer3ToQuestion2 = new Answer();
        answer1ToQuestion1.setName("Black");

        final Answer answer4ToQuestion2 = new Answer();
        answer2ToQuestion1.setName("None of the above");

        final Answer answer1ToQuestion3 = new Answer();
        answer1ToQuestion1.setName("Less or equal of 2");

        final Answer answer2ToQuestion3 = new Answer();
        answer2ToQuestion1.setName("More than 2 but less than 5");

        final Answer answer3ToQuestion3 = new Answer();
        answer1ToQuestion1.setName("More or equal of 5");

        final Answer answer4ToQuestion3 = new Answer();
        answer2ToQuestion1.setName("None");

        final Person petarPetrov = new Person();
        petarPetrov.setName("Petar");
        petarPetrov.setFamily("Petrov");
        petarPetrov.setDateOfBirth(LocalDate.of(1995, 12, 13));

        final Person georgiGeorgiev = new Person();
        petarPetrov.setName("Georgi");
        petarPetrov.setFamily("Georgiev");
        petarPetrov.setDateOfBirth(LocalDate.of(1984, 2, 25));

        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        answerListQuestion1.add(answer1ToQuestion1);
        answerListQuestion1.add(answer2ToQuestion1);
        answerListQuestion2.add(answer1ToQuestion2);
        answerListQuestion2.add(answer2ToQuestion2);
        answerListQuestion2.add(answer3ToQuestion2);
        answerListQuestion2.add(answer4ToQuestion2);
        answerListQuestion3.add(answer1ToQuestion3);
        answerListQuestion3.add(answer2ToQuestion3);
        answerListQuestion3.add(answer3ToQuestion3);
        answerListQuestion3.add(answer4ToQuestion3);

//        question1.getAnswerList();
//        question2.getAnswerList();
//        question3.getAnswerList();

    }
}
