package com.musala.javacourse181112.tasks.calculator_exercise;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

// TODO: Generator abstraction
public class RandomNameGenerator {
    public static final Random RANDOM = new Random();

    private String charset;
    private int minNameLength;
    private int maxNameLength;

    public RandomNameGenerator(int minNameLength, int maxNameLength) {
        this(minNameLength, maxNameLength, "abc"); // TODO
    }

    public RandomNameGenerator(final int minNameLength, final int maxNameLength, final String charset) {
        assert minNameLength >= 3;
        assert maxNameLength >= minNameLength;
        assert charset != null;

        // TODO: symbol deduplication ?
        this.charset = charset;
        this.maxNameLength = maxNameLength;
        this.minNameLength = minNameLength;
    }

    public String generate() {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int p = 0; p < 2; p++) { // names
            final AtomicInteger nameLengthAtomicInteger = new AtomicInteger();
            while (!(nameLengthAtomicInteger.get() >= minNameLength &&
                    nameLengthAtomicInteger.get() <= maxNameLength)) {
                nameLengthAtomicInteger.set(RANDOM.nextInt(maxNameLength));
            }

            stringBuilder.append(Character.toUpperCase(charset.charAt(RANDOM.nextInt(charset.length()))));
            for (int i = 1; i < nameLengthAtomicInteger.get(); i++) {
                stringBuilder.append(Character.toLowerCase(charset.charAt(RANDOM.nextInt(charset.length()))));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
