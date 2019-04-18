package com.musala.javacourse181112.FirstPartJava.oop.libraryexercise;

import com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model.Person;
import com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model.SubscriptionRenewal;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public final class Utils {
    private Utils() {
    }

    public static Function<Person, SubscriptionRenewal> latestSubscriptionFunction = person -> {
        if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().isEmpty()) {
            return null;
        }
        return person.getSubscriptionRenewalSet().stream()
                .filter(Objects::nonNull)
                .filter(subscriptionRenewal -> subscriptionRenewal.getDateTimeOfPayment() != null)
                .max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment)).orElseGet(null);
    };

    public static List<Person> sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(final List<Person> people) {
        return people.stream()
                .filter(Objects::nonNull)
                .sorted((p1, p2) -> Objects.compare(
                        latestSubscriptionFunction.apply(p1),
                        latestSubscriptionFunction.apply(p2),
                        Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment).reversed()))
                .collect(Collectors.toList());
    }
}
