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

        final Person todorJivkov= new Person();
        todorJivkov.setName("Todor");
        todorJivkov.setFamily("Jivkov");
        todorJivkov.setDateOfBirth(LocalDate.of(1911,Month.SEPTEMBER,7));

        final Poll coffeePoll = new Poll();
        coffeePoll.setName("Coffee poll");
        coffeePoll.setStartDateTime(LocalDateTime.of(2019, Month.JANUARY, 1, 0, 0));
        coffeePoll.setEndDateTime(LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0));
        coffeePoll.setCreatedBy(ivanIvanov);

        final List<Question> questionList = new ArrayList<>();
        coffeePoll.setQuestionList(questionList);
    //QUESTION 1
        final Question question1 = new Question();
        question1.setName("Do you like coffee?");

        final List<Answer> answerList1=new ArrayList<>();
        question1.setAnswerList(answerList1);

        final Answer answerYes=new Answer();
        answerYes.setName("Yes");
        answerList1.add(answerYes);

        final Answer answerNo=new Answer();
        answerYes.setName("No");
        answerList1.add(answerNo);

        questionList.add(question1);
    //QUESTION 2
        final Question question2 =new Question();
        question2.setName("How do you enjoy your coffee?");

        final List<Answer> answerList2=new ArrayList<>();
        question2.setAnswerList(answerList2);

        final Answer answerMilk=new Answer();
        answerMilk.setName("Milk");
        answerList2.add(answerMilk);

        final Answer answerSugar=new Answer();
        answerSugar.setName("Sugar");
        answerList2.add(answerSugar);

        final Answer answerMilkSugar=new Answer();
        answerMilkSugar.setName("MilkSugar");
        answerList2.add(answerMilkSugar);

        final Answer answerBlack=new Answer();
        answerBlack.setName("Black");
        answerList2.add(answerBlack);

        final Answer answerNone=new Answer();
        answerNone.setName("None");
        answerList2.add(answerNone);

        questionList.add(question2);
        //QUESTION 3
        final Question question3 =new Question();
        question2.setName("How many coffees do you have a day?");

        final List<Answer> answerList3=new ArrayList<>();
        question3.setAnswerList(answerList3);

        final Answer answer1=new Answer();
        answer1.setName("Less or equal of 2");
        answerList3.add(answerMilk);

        final Answer answer2=new Answer();
        answer2.setName("More than 2 but less than 5");
        answerList3.add(answer2);

        final Answer answer3=new Answer();
        answer3.setName("More or equal of 5");
        answerList3.add(answer3);

        final Answer answer4=new Answer();
        answer4.setName("None");
        answerList3.add(answer4);



        questionList.add(question3);


        // TODO: populate 3 questions, consult tasks.md
    }
}
