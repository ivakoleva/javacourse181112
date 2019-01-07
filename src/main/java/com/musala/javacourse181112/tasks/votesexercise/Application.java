package com.musala.javacourse181112.tasks.votesexercise;

import com.musala.javacourse181112.tasks.votesexercise.model.Answer;
import com.musala.javacourse181112.tasks.votesexercise.model.Person;
import com.musala.javacourse181112.tasks.votesexercise.model.Poll;
import com.musala.javacourse181112.tasks.votesexercise.model.Question;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(final String[] args) {
        final Person ivanIvanov = new Person();
        ivanIvanov.setName("Ivan");
        ivanIvanov.setFamily("Ivanov");
        ivanIvanov.setDateOfBirth(LocalDate.of(1990, Month.JANUARY, 1));

        final Person georgiGeorgiev =  new Person();
        georgiGeorgiev.setName("Georgi");
        georgiGeorgiev.setFamily("Georgiev");
        georgiGeorgiev.setDateOfBirth(LocalDate.of(1989,Month.APRIL,39));

        final Poll coffeePoll = new Poll();
        coffeePoll.setName("Coffee poll");
        coffeePoll.setStartDateTime(LocalDateTime.of(2019, Month.JANUARY, 1, 0, 0));
        coffeePoll.setEndDateTime(LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0));
        coffeePoll.setCreatedBy(ivanIvanov);

        final List<Question> questionList = new ArrayList<>();
        coffeePoll.setQuestionList(questionList);

        final Question question1 = new Question();
        question1.setName("Do you like coffee?");
        Answer answerQuestion1YES = new Answer();
        answerQuestion1YES.setName("YES");
        Answer answerQuestion1NO = new Answer();
        answerQuestion1NO.setName("NO");

        final List<Answer> answerListQuestion1 = new ArrayList<>();
        answerListQuestion1.add(answerQuestion1NO);
        answerListQuestion1.add(answerQuestion1YES);

        final Question question2 = new Question();
        question2.setName("How do you enjoy your coffee?");

        Answer answerQuestion2MILK = new Answer();
        answerQuestion2MILK.setName("Milk");
        Answer answerQuestion2SUGAR = new Answer();
        answerQuestion2SUGAR.setName("Sugar");
        Answer answerQuestion2MILKandSUGAR = new Answer();
        answerQuestion2MILKandSUGAR.setName("Milk & Sugar");
        Answer answerQuestion2BLACK = new Answer();
        answerQuestion2BLACK.setName("Black");
        Answer answerQuestion2NONE = new Answer();
        answerQuestion2NONE.setName("None of the above");

        final List<Answer> answerListQuestion2 = new ArrayList<>();
        answerListQuestion2.add(answerQuestion2MILK);
        answerListQuestion2.add(answerQuestion2SUGAR);
        answerListQuestion2.add(answerQuestion2MILKandSUGAR);
        answerListQuestion2.add(answerQuestion2BLACK);
        answerListQuestion2.add(answerQuestion2NONE);

        final Question question3 = new Question();
        question3.setName("How many coffees do you have every day?");

        Answer answerQuestion3LessThan2 = new Answer();
        answerQuestion3LessThan2.setName("Less or equal to 2");
        Answer answerQuestion3MoreThan2LessThan5 = new Answer();
        answerQuestion3MoreThan2LessThan5.setName("More than 2 but less than 5");
        Answer answerQuestion3MoreOr5 = new Answer();
        answerQuestion3MoreOr5.setName("More or equal to 5");
        Answer answerQuestion3None = new Answer();
        answerQuestion3None.setName("None");
        final List<Answer> answerListQuestion3 = new ArrayList<>();
        answerListQuestion3.add(answerQuestion3LessThan2);
        answerListQuestion3.add(answerQuestion3MoreThan2LessThan5);
        answerListQuestion3.add(answerQuestion3MoreOr5);
        answerListQuestion3.add(answerQuestion3None);


        //question1.setAnswerList();

        questionList.add(question1);

        // TODO: populate 3 questions, consult tasks.md


    }
}

