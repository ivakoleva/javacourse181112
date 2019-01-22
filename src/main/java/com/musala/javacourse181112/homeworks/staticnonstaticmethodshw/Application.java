package com.musala.javacourse181112.homeworks.staticnonstaticmethodshw;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Application {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Ivan");
        person1.setJob("Strugar");
        person1.setYearsOld(47);

        Person person2 = new Person();
        person1.setName("Gosho");
        person1.setJob("Montior");
        person1.setYearsOld(33);

        Queue<Person> personQueue = new LinkedBlockingQueue<>();
        personQueue.add(person1);
        personQueue.add(person2);

        PersonService personService = new PersonService();

        personService.pollPrintRetur(personQueue);

//TODO FINISH 10 Person Instances , 2 PersonService Instances,
// Call The static and the non-Static methods
    }
}
