package com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise;

import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Person;
import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.model.Poll;
import com.musala.javacourse181112.FirstPartJava.tasks.votesystem.votes_v0_6_exercise.service.PollService;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Application {


    public static void main(final String[] args) {
        final PollService pollService = new PollService();

        // TODO: implement PersonService, and generatePerson() method
        final Person person1 = new Person();
        person1.setName("Ivan");
        person1.setFamily("Ivanov");
        person1.setDateOfBirth(LocalDate.of(1990, Month.JANUARY, 1));

        final Poll coffeePoll = pollService.generatePoll(
                "Coffee poll",
                () -> pollService.generateQuestion(
                        "Do you like coffee?",
                        () -> pollService.generateAnswer("Yes"),
                        () -> pollService.generateAnswer("No")),
                () -> pollService.generateQuestion(
                        "How do you enjoy your coffee?",
                        () -> pollService.generateAnswer("Milk"),
                        () -> pollService.generateAnswer("Sugar"),
                        () -> pollService.generateAnswer("Milk & sugar"),
                        () -> pollService.generateAnswer("Black"),
                        () -> pollService.generateAnswer("None of the above"))
                // TODO: implement the rest of the questions & answers
        );
        coffeePoll.setCreatedBy(person1);

        System.out.println();
    }
}
