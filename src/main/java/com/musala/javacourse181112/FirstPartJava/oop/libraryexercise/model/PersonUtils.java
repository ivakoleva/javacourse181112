package com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model;

import java.util.*;
import java.util.stream.Collectors;

public class PersonUtils{

    public static <T extends Person> List<T> compareByDate(List<T>people){
        return people.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(person -> findValidSubscription((T)person).getDateTimeOfPayment()).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static <T extends Person>SubscriptionRenewal findValidSubscription(T person){

            Set<SubscriptionRenewal>  subscriptionRenewal = person.getSubscriptionRenewalSet();

            return subscriptionRenewal.stream()
                    .filter(Objects::nonNull)
                    .max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment))
                    .get();
    }
}
