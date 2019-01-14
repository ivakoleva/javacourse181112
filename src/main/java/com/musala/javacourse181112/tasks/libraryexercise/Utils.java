package com.musala.javacourse181112.tasks.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise.model.SubscriptionRenewal;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(List<Person> people) {
        return people.stream()
                .filter(Objects::nonNull)
                .sorted((p1, p2) -> Objects.compare(
                        latestSubscriptionFunction.apply(p1),
                        latestSubscriptionFunction.apply(p2),
                        Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment).reversed()))
                .collect(Collectors.toList());
        /*Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                SubscriptionRenewal lastSubscriptionRenewalOfPerson1 = latestSubscriptionFunction.apply(o1);
                SubscriptionRenewal lastSubscriptionRenewalOfPerson2 = latestSubscriptionFunction.apply(o2);
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

        return sortedPeople;*/

    }

    public static Function<Person, SubscriptionRenewal> latestSubscriptionFunction = person -> {

        if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().isEmpty()) {
            return null;
        }
        return person.getSubscriptionRenewalSet().stream()
                .max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment)).get();
       /* if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().size() == 0) {
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

        return lastSubscriptionRenewal;*/
    };
}
