package com.musala.javacourse181112.methods.votespackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    // TODO: elaborate object model
    protected final static List<String> QUESTIONS = new ArrayList<>();
    protected final static List<Person> PEOPLE = new ArrayList<>();
    protected final static List<String> VOTES = Arrays.asList("yes", "no", "no", "no", "yes");

    public static void main(final String[] args) {
        final NameGenerator nameGenerator = new NameGenerator();

        QUESTIONS.add("Are you happy?");
        QUESTIONS.add("Are you a morning person?");

        for (int i = 0; i < 5; i++){
            PEOPLE.add(new Person());
        }
        System.out.println(PEOPLE);
        nameGenerator.getValue();
    }
}
