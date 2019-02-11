package com.musala.javacourse181112.paw_inc;

import com.musala.javacourse181112.paw_inc.animals.Animal;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class PawIncUtils {
    private static final CharsetEncoder encoder = Charset.forName("US-ASCII").newEncoder();
    public static Predicate<String> isASCII = encoder::canEncode;
    public static Predicate<Integer> isPositiveInt = integer -> integer > 0;

    private PawIncUtils() {
    }

    public static void printList(List<Animal> AnimalList) {
        AnimalList.sort(Comparator.comparing(Animal::getName));
        if (AnimalList.isEmpty()) {
            System.out.println("None");
        } else {
            System.out.println(AnimalList
                    .stream()
                    .map(Animal::toString)
                    .collect(Collectors.joining(", ")));

        }
        AnimalList.clear();

    }
}
