package com.musala.javacourse181112.tasks.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise.model.SubscriptionRenewal;

import java.util.*;
import java.util.function.Function;

public class Utils {
    public static List<Person> sortPeopleByDateTimeOfPayment(List<Person> people) {

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                SubscriptionRenewal lastSubscriptionRenewalOfPerson1 = getLastSubscription.apply(o1);
                SubscriptionRenewal lastSubscriptionRenewalOfPerson2 = getLastSubscription.apply(o2);
                if (lastSubscriptionRenewalOfPerson1 == null && lastSubscriptionRenewalOfPerson2 == null) {
                    return 0;
                } else if (lastSubscriptionRenewalOfPerson1 == null) {
                    return 1;
                } else if (lastSubscriptionRenewalOfPerson2 == null) {
                    return -1;
                } else {
                    return lastSubscriptionRenewalOfPerson1.getDateTimeOfPayment().compareTo(lastSubscriptionRenewalOfPerson2.getDateTimeOfPayment());
                }
            }
        };

        List<Person> sortedPeople = new ArrayList<>(people);


        Collections.sort(sortedPeople, comparator);

        return sortedPeople;

    }

    public static Function<Person, SubscriptionRenewal> getLastSubscription = person -> {

        if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().size() == 0) {
            return null;
        }

        Iterator<SubscriptionRenewal> iterator = person.getSubscriptionRenewalSet().iterator();
        SubscriptionRenewal lastSubscriptionRenewal = iterator.next();

        for (; iterator.hasNext(); ) {
            SubscriptionRenewal curSubscriptionRenewal = iterator.next();
            if (curSubscriptionRenewal.getDateTimeOfPayment().compareTo(lastSubscriptionRenewal.getDateTimeOfPayment()) > 0) {
                lastSubscriptionRenewal = curSubscriptionRenewal;
            }
        }

        return lastSubscriptionRenewal;
    };
}
