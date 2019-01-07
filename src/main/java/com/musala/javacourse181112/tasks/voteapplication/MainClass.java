package com.musala.javacourse181112.tasks.voteapplication;

import com.musala.javacourse181112.tasks.Vote;

import java.util.ArrayList;
import java.util.List;


public class MainClass {

    private static final List<Person> personList = new ArrayList<>();
    private static final List<Question> questionList = new ArrayList<>();
    private static final List<Vote> voteList = new ArrayList<>();

    //TODO
    // adding vote
    public static void main(final String[] args) {

        personList.add(new Person("123456789", "Ivan"));
        personList.add(new Person("023456789", "Ivana"));

        final Vote voteYes = Vote.YES;
        voteList.add(voteYes);

        final Vote voteNo = Vote.NO;
        voteList.add(voteNo);

        final Object[][] array = new Person[personList.size()][2];

        final Question question = new Question();
        question.setQuestion("Do you like cake");
        questionList.add(question);

        final Question question1 = new Question();
        question1.setQuestion("Do you drink coffee");
        questionList.add(question1);


        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i).getQuestion());

            for (int v = 0; v < array.length; v++) {
                array[v][0] = new Person(personList.get(v).getEgn(), personList.get(i).getName());
            }
        }
    }
}

