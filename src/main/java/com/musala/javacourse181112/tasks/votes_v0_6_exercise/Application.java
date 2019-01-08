package com.musala.javacourse181112.tasks.votes_v0_6_exercise;

import com.musala.javacourse181112.tasks.votes_v0_6_exercise.model.Person;
import com.musala.javacourse181112.tasks.votes_v0_6_exercise.model.Poll;
import com.musala.javacourse181112.tasks.votes_v0_6_exercise.service.PersonService;
import com.musala.javacourse181112.tasks.votes_v0_6_exercise.service.PollService;

import java.time.LocalDate;
import java.time.Month;

/**
 *** Complete data population regarding requirements
 *** Implement PersonService, then refactor current Person instantiation
 *** Elaborate Poll with anonymous setting (true/false)
 **/
public class Application {


    public static void main(final String[] args) {
        final PollService pollService = new PollService();
        final PersonService personService = new PersonService();

        final Person person1 = new Person();
        person1.setName("Ivan");
        person1.setFamily("Ivanov");
        person1.setDateOfBirth(LocalDate.of(1990, Month.JANUARY, 1));

        final Person petarPetrov = personService.generatePerson(
                "Petar", "Petrov", LocalDate.of(1999, Month.JANUARY, 31));

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
                        () -> pollService.generateAnswer("None of the above")),
                () -> pollService.generateQuestion(
                        "How many coffees do you have a day?",
                        () -> pollService.generateAnswer("Less or equal of 2"),
                        () -> pollService.generateAnswer("More than 2 but less than 5"),
                        () -> pollService.generateAnswer("More or equal of 5"),
                        () -> pollService.generateAnswer("None")
                )
        );
        coffeePoll.setCreatedBy(person1);

        final Poll favouritesPoll = pollService.generatePoll
                ("Favourites poll",
                        () -> pollService.generateQuestion(
                                "Which do you like most?",
                                () -> pollService.generateAnswer("Cat"),
                                () -> pollService.generateAnswer("Dog"),
                                () -> pollService.generateAnswer("Fish"),
                                () -> pollService.generateAnswer("None")),
                        () -> pollService.generateQuestion(
                                "Which colour do you prefer?",
                                () -> pollService.generateAnswer("Blue/Purple"),
                                () -> pollService.generateAnswer("Red/Pink"),
                                () -> pollService.generateAnswer("Yellow/Orange"),
                                () -> pollService.generateAnswer("Green"),
                                () -> pollService.generateAnswer("Monochromatic colours"))
                );

//        final Poll birthdayMonthPoll = pollService.generatePoll(
//                true,
//                () -> pollService.generateQuestion("Were you born this millennium?",
//                        () -> pollService.generateAnswer("Yes"),
//                        () -> pollService.generateAnswer("No")),
//                () -> pollService.generateQuestion("In which season were you born?"),
//                () -> pollService.generateAnswer("Winter"),
//                () -> pollService.generateAnswer("Spring"),
//                () -> pollService.generateAnswer("Summer"),
//                () -> pollService.generateAnswer("Autumn"));

        System.out.println();
    }
}
