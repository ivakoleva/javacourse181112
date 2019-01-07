package com.musala.javacourse181112.oop.votesexercise;

import com.musala.javacourse181112.oop.votesexercise.model.Answer;
import com.musala.javacourse181112.oop.votesexercise.model.Person;
import com.musala.javacourse181112.oop.votesexercise.model.Poll;
import com.musala.javacourse181112.oop.votesexercise.model.Question;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Application {
    public static void main(final String[] args) {
        final Person ivanIvanov = new Person();
        final Person georgiGeorgiev = new Person();


        ivanIvanov.setName("Ivan");
        ivanIvanov.setFamily("Ivanov");
        ivanIvanov.setDateOfBirth(LocalDate.of(1990, Month.JANUARY, 1));

        georgiGeorgiev.setName("Georgi");
        georgiGeorgiev.setFamily("Georgiev");
        georgiGeorgiev.setDateOfBirth(LocalDate.of(1987, Month.APRIL, 5));

        final Poll coffeePoll = new Poll();
        coffeePoll.setName("Coffee poll");
        coffeePoll.setStartDateTime(LocalDateTime.of(2019, Month.JANUARY, 1, 0, 0));
        coffeePoll.setEndDateTime(LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0));
        coffeePoll.setCreatedBy(ivanIvanov);

        final List<Question> questionList = new ArrayList<>();
        coffeePoll.setQuestionList(questionList);
        final List<Answer> answerList1 = new ArrayList<>();
        final List<Answer> answerList2 = new ArrayList<>();
        final List<Answer> answerList3 = new ArrayList<>();


        final Question question1 = new Question();
        final Question question2 = new Question();
        final Question question3 = new Question();

        question1.setName("Do you like coffee?");
        question2.setName("How do you enjoy your coffee?");
        question3.setName(" How many coffees do you have a day?");

        final Answer answer1 = new Answer();
        final Answer answer2 = new Answer();
        final Answer answer3 = new Answer();
        final Answer answer4 = new Answer();
        final Answer answer5 = new Answer();
        final Answer answer6 = new Answer();
        final Answer answer7 = new Answer();
        final Answer answer8 = new Answer();
        final Answer answer9 = new Answer();
        final Answer answer10 = new Answer();
        final Answer answer11 = new Answer();

        answer1.setName("Yes");
        answer2.setName("No");
        answer3.setName("Milk");
        answer4.setName("Sugar");
        answer5.setName("Milk & Sugar");
        answer6.setName("Black");
        answer7.setName("None of the above");
        answer8.setName("Less or equal of two");
        answer9.setName("More than 2 but less than 5");
        answer10.setName("More or equal of 5");
        answer11.setName("None");

        answerList1.add(answer1);
        answerList1.add(answer2);

        answerList2.add(answer3);
        answerList2.add(answer4);
        answerList2.add(answer5);
        answerList2.add(answer6);
        answerList2.add(answer7);

        answerList3.add(answer8);
        answerList3.add(answer9);
        answerList3.add(answer10);
        answerList3.add(answer11);


        questionList.add(question1);
        questionList.add(question2);
        questionList.add(question3);

        // TODO: populate 3 questions, consult tasks.md
        question1.setAnswerList(answerList1);
        question2.setAnswerList(answerList2);
        question3.setAnswerList(answerList3);



    }
}
