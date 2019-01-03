package com.musala.javacourse181112.tasks.calculator_exercise;

import java.util.Random;

public class RandomPersonNameGenerator {
    public static String getName(char[] charset, int minNameLength, int maxNameLength) {
        assert minNameLength >= 3;
        assert maxNameLength >= minNameLength;
        assert charset != null;

        StringBuilder name = new StringBuilder();

        int length = -1;
        Random random = new Random();
        for (int p = 0; p < 2; p++) {
            while (!(length >= minNameLength && length <= maxNameLength))
                length = random.nextInt(maxNameLength);
        }
        name.append(Character.toLowerCase(charset[random.nextInt(charset.length)]));
        for (int i = 0; i < length; i++) {
            name.append(Character.toLowerCase(charset[random.nextInt(charset.length)]));
        }
        name.append(" ");
        return name.toString();
    }
}
