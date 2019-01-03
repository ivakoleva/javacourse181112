package com.musala.javacourse181112.tasks.MethodsExercises;

/**
 * *** static method
 * **** name printPersonNamesToStdout
 * **** use appropriate access modifier (scope of visibility)
 * **** print arguments to stdout, using space discriminator then new line
 * *** non-static methods
 * **** addPerson, accepting and storing Person object to queue
 * **** handlePerson, polling one from queue then printing it to stdout (hint: method composition),
 * then returning the person polled
 * **** think of multi-threading, always in mind
 */
public class PersonService {
    static void printPersonNameToStdout(final Person person) {
        System.out.println(person.getPersonName());
    }

}
