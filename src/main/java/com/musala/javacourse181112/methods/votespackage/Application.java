package com.musala.javacourse181112.methods.votespackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
    protected final static List<String> questions = new ArrayList<>();
    protected final static List<Person> people = new ArrayList<>();
    protected final static List<String> votes = Arrays.asList("yes", "no", "no", "no", "yes");
    public static void main(final String[] args) {
        Generator generator = new Generator();

        questions.add("Are you happy?");
        questions.add("Are you a morning person?");

        for (int i = 0; i < 5; i++){
            people.add(new Person());
        }
        System.out.println(people);
        generator.getValue();

    }
}
