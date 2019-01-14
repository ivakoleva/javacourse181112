package com.musala.javacourse181112.tasks.calculator_exercise;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class RandomNameGenerator {

    public static Random random = new Random();

    private String charset;
    private int minNameLength;
    private int maxNameLength;

    public RandomNameGenerator(String charset, int minNameLength, int maxNameLength) {
        assert minNameLength >= 3;
        assert maxNameLength >= minNameLength;
        assert charset != null;

        this.charset = charset;
        this.maxNameLength = maxNameLength;
        this.minNameLength = minNameLength;
    }

    public String generateName() {

        StringBuilder stringBuilder = new StringBuilder();

        AtomicInteger length = new AtomicInteger(-1);
        for (int p = 0; p < 2; p++) {
            length.set(-1);
            while (!(length.get() >= minNameLength && length.get() <= maxNameLength)) {
                length.set(random.nextInt(maxNameLength));
            }
            stringBuilder.append(Character.toUpperCase(charset.charAt(random.nextInt(charset.length()))));
            for (int i = 0; i < length.get(); i++) {
                stringBuilder.append(Character.toLowerCase(charset.charAt(random.nextInt(charset.length()))));
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
