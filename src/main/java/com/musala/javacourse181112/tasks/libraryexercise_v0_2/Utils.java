package com.musala.javacourse181112.tasks.libraryexercise_v0_2;

import com.musala.javacourse181112.tasks.libraryexercise_v0_2.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise_v0_2.model.SubscriptionRenewal;

import java.util.*;

public final class Utils {
    /*
     *** Implement an utility class, that provides static method
     **** accepts collection of Persons & custom Comparator<Person>
     **** returns a new list of sorted Persons, based on latest to earliest dateTimeOfPayment
     */

    private Utils(Collection<Person> personCollection, Comparator<Person> personComparator) {
        Collection<Person> sortedByDateOfPayment = new LinkedList<>();
        sortedByDateOfPayment.addAll(personCollection);
        Collections.sort(sortedByDateOfPayment, Comparator.comparing(o -> o.getSubscriptionRenewalSet().dateOfPayment));
    }


}
