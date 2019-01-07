package com.musala.javacourse181112.tasks.methodsExercise;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PersonService {
//    **** static method
//                ***** name printPersonNamesToStdout
//                ***** use appropriate access modifier (scope of visibility)
//                ***** print arguments to stdout, using space discriminator then new line
//    **** non-static oop
//                ***** addPerson, accepting and storing Person object to queue
//                ***** handlePerson, polling one from queue then printing it to stdout (hint: method composition),
//                      then returning the person polled
//                ***** think of multi-threading, always in mind

    private final BlockingQueue<Person> personQueue = new LinkedBlockingQueue<>();

    public static void printPersonNamesToStdout(final Person person) {
        System.out.println(person.getPersonName());
    }

    public void addPerson(final Person person) {
        personQueue.add(person);
    }

    public String handlePerson(final Person person) {
        Person personToPoll = personQueue.poll();
        printPersonNamesToStdout(personToPoll);
        return personToPoll.getPersonName();
    }

}
