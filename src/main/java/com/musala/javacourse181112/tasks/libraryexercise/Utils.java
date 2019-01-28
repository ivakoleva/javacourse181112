package com.musala.javacourse181112.tasks.libraryexercise;

import com.musala.javacourse181112.tasks.libraryexercise.model.AbstractItem;
import com.musala.javacourse181112.tasks.libraryexercise.model.Person;
import com.musala.javacourse181112.tasks.libraryexercise.model.SubscriptionRenewal;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Utils {
    public static List<Person> sortPoepleByDateTimeOfPayment(List<Person> people) {

        public <T extends AbstractItem > T getInstance( final Class<T> clazz){
            T instance = null;
            try {
                instance = clazz.getConstructor().newInstance();
            } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
                e.printStackTrace();
            }
            return instance;
        }

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                SubscriptionRenewal lastSubscriptionRenewalOfPerson1 = getLastSubscription(o1.getSubscriptionRenewalSet());
                SubscriptionRenewal lastSubscriptionRenewalOfPerson2 = getLastSubscription(o2.getSubscriptionRenewalSet());
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

        List<Person> sortedPeople = new ArrayList<>();

        Collections.copy(sortedPeople, people);

        Collections.sort(sortedPeople, comparator);

        return sortedPeople;

    }

    public static SubscriptionRenewal getLastSubscription(Set<SubscriptionRenewal> subscriptionRenewalSet) {

        if (subscriptionRenewalSet == null || subscriptionRenewalSet.size() == 0) {
            return null;
        }

        Iterator<SubscriptionRenewal> iterator = subscriptionRenewalSet.iterator();
        SubscriptionRenewal lastSubscriptionRenewal = iterator.next();

        for (; iterator.hasNext(); ) {
            SubscriptionRenewal curSubscriptionRenewal = iterator.next();
            if (curSubscriptionRenewal.getDateTimeOfPayment().compareTo(lastSubscriptionRenewal.getDateTimeOfPayment()) > 0) {
                lastSubscriptionRenewal = curSubscriptionRenewal;
            }
        }

        return lastSubscriptionRenewal;
    }
}
