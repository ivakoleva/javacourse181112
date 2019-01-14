package com.musala.javacourse181112.tasks.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise.model.SubscriptionRenewal;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Utils {
    public static List<Person> sortPeopleByLatestSubscriptionRenewalDateTimeOfPayment(final Collection<Person> people) {
        return people.stream()
                .filter(Objects::nonNull)
                .sorted((p1, p2) -> Objects.compare(
                        latestSubscriptionFunction.apply(p1),
                        latestSubscriptionFunction.apply(p2),
                        Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment).reversed()))
                .collect(Collectors.toList());


        /*final Comparator<Person> comparator = (p1, p2) -> {
            final SubscriptionRenewal lastSubscriptionRenewalOfPerson1 = latestSubscriptionFunction.apply(p1);
            final SubscriptionRenewal lastSubscriptionRenewalOfPerson2 = latestSubscriptionFunction.apply(p2);
            if (lastSubscriptionRenewalOfPerson1 == null && lastSubscriptionRenewalOfPerson2 == null) {
                return 0;
            } else if (lastSubscriptionRenewalOfPerson1 == null) {
                return 1;
            } else if (lastSubscriptionRenewalOfPerson2 == null) {
                return -1;
            } else {
                return lastSubscriptionRenewalOfPerson1.getDateTimeOfPayment().compareTo(lastSubscriptionRenewalOfPerson2.getDateTimeOfPayment());
            }
        };

        List<Person> sortedPeople = new ArrayList<>();
        Collections.copy(sortedPeople, people);
        Collections.sort(sortedPeople, comparator);

        return sortedPeople;*/

    }

    public static final Function<Person, SubscriptionRenewal> latestSubscriptionFunction = person -> {
        if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().isEmpty()) {
            return null;
    }
        return person.getSubscriptionRenewalSet().stream()
                .max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment)).get();

        /*final Iterator<SubscriptionRenewal> iterator = person.getSubscriptionRenewalSet().iterator();
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
