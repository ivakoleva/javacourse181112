package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.animals.Animal;

import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class PawIncUtils {
    public static Predicate<String> isASCII = s -> Charset.forName("US-ASCII").newEncoder().canEncode(s);
    public static Predicate<Integer> isPositiveInt = integer -> integer > 0;
    public static void printList(List<Animal> tempAnimalList) {
        tempAnimalList.sort(Comparator.comparing(Animal::getName));
        if (tempAnimalList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(tempAnimalList
                    .stream()
                    .map(Animal::toString)
                    .collect(Collectors.joining(", ")));

        }
        tempAnimalList.clear();

    }

    private PawIncUtils() {
    }
}
