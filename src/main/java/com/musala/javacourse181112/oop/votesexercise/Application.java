package com.musala.javacourse181112.oop.votesexercise;

import com.musala.javacourse181112.oop.votesexercise.model.Answer;
import com.musala.javacourse181112.oop.votesexercise.model.Person;
import com.musala.javacourse181112.oop.votesexercise.model.Poll;
import com.musala.javacourse181112.oop.votesexercise.service.PersonService;
import com.musala.javacourse181112.oop.votesexercise.service.PollService;
import com.musala.javacourse181112.oop.votesexercise.service.exception.PersonAlreadyVotedQuestionException;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 07.01.2019
 */
public class Application {
    public static void main(final String[] args) {
        final PollService pollService = new PollService();
        final PersonService personService = new PersonService();

        final Person person1 = personService.generatePerson(
                "Ivan",
                "Ivanov",
                LocalDate.of(1990, Month.JANUARY, 1));

        final Poll coffeePoll = pollService.generatePoll(
                "Coffee poll",
                true,
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
        coffeePoll.setPersonList(new ArrayList<>());
        coffeePoll.getPersonList().add(person1);


        coffeePoll.getQuestionList().forEach(question -> {
            final List<Answer> answerAvailableList = question.getAnswerAvailableList();
            if (answerAvailableList != null && !answerAvailableList.isEmpty()) {
                try {
                    pollService.giveAnswer(
                            person1,
                            coffeePoll,
                            question,
                            answerAvailableList.get(0));
                } catch (PersonAlreadyVotedQuestionException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println();
    }
}
