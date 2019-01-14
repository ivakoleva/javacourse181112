package com.musala.javacourse181112.oop.libraryexercise.model;

import java.util.*;
import java.util.stream.Collectors;

public class PersonUtils {

    public static <T extends Person> List<T> compareByDate(List<T>people){
        return people.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(person -> findValidSubscription((T)person).getDateTimeOfPayment()).reversed())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static <T extends Person>SubscriptionRenewal findValidSubscription(T person){
            if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().isEmpty()){
                return null;
            }
            Set<SubscriptionRenewal>  subscriptionRenewal = person.getSubscriptionRenewalSet();

            return subscriptionRenewal.stream().max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment)).get();
    }
}
