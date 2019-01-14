package com.musala.javacourse181112.oop.libraryexercise.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonUtils {

    public static List<Person> compareByDate(List<Person>people){

        List<Person> result = new ArrayList<>();
        Collections.copy(result,people);

        result.sort(Comparator.comparing(person -> findValidSubscription(person).getDateTimeOfPayment()));
        return result;
    }

    public static SubscriptionRenewal findValidSubscription(Person person){
            if (person == null || person.getSubscriptionRenewalSet() == null || person.getSubscriptionRenewalSet().isEmpty()){
                return null;
            }
            SubscriptionRenewal subscriptionRenewal = person.getSubscriptionRenewalSet().stream().max(Comparator.comparing(SubscriptionRenewal::getDateTimeOfPayment)).get();
                assert  subscriptionRenewal.getDateTimeOfPayment() != null;
            return subscriptionRenewal;
    }
}
