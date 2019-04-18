package com.musala.javacourse181112.FirstPartJava.tasks.votesystem;

import com.musala.javacourse181112.FirstPartJava.oop.votesexercise.model.Answer;
import com.musala.javacourse181112.FirstPartJava.oop.votesexercise.model.Person;
import com.musala.javacourse181112.FirstPartJava.oop.votesexercise.model.Poll;
import com.musala.javacourse181112.FirstPartJava.oop.votesexercise.model.Question;

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

        String blblblb = "Blalalal";

        coffeePoll.setStartDateTime(LocalDateTime.of(2019, Month.JANUARY, 1, 0, 0));
        coffeePoll.setEndDateTime(LocalDateTime.of(2020, Month.JANUARY, 1, 0, 0));
        coffeePoll.setCreatedBy(ivanIvanov);

        final List<Question> questionList = new ArrayList<>();
        coffeePoll.setQuestionList(questionList);

        populateQuestions(questionList,"Do you like coffee?","Yes","No");
        populateQuestions(questionList,"How do you enjoy your coffee?","Milk","Sugar","Milk & sugar","Black","None of the above");
        populateQuestions(questionList,"How many coffees do you have a day?","Less or equal of 2","More than 2 but less than 5","More or equal of 5","None of the above");
        coffeePoll.setQuestionList(questionList);
       // questionList.forEach(element-> element.getAnswerList().forEach( element2-> System.out.println(element2.getName())));

        // TODO: populateQuestions 3 questions, consult tasks.md
    }

    private static void populateQuestions(List<Question> questionList, String questName, String ... answers) {
        final Question question = new Question();
        question.setName(questName);
        //question.setAnswerList(new ArrayList<>());
        //Arrays.stream(answers).forEach(answer->getAndPopAnswer(question,answer));
        //questionList.add(question);
    }

    private static Answer getAndPopAnswer(Question question, String yes) {
        Answer answer = new Answer();
        answer.setName(yes);
        //question.getAnswerList().add(answer);
        return answer;
    }
}
