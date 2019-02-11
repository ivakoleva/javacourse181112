package com.musala.javacourse181112.test1;

import java.util.function.BiFunction;

/**
 * Created by Iva Koleva on 04.02.2019
 */
public class Q2 {
    public static void main(String[] args) {
        System.out.println(
                entryTime("123456789", "123456789"));
    }

    public static int entryTime(final String s, final String keypad) {
        /*assert keypad != null;
        assert keypad.length() == 9;
        assert keypad.chars().boxed().distinct().count() == 9;
        assert keypad.chars().boxed().filter(i -> 0 >= i && i <= 9).count() == 9;*/
        int charPosition = 0;
        final int[][] keypadArray = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++, charPosition++) {
                keypadArray[i][j] = Integer.parseInt(String.valueOf(keypad.charAt(charPosition)));
            }
        }

        Coordinates previousCoordinates = null;
        int seconds = 0;
        for(int i = 0; i < s.length(); i++) {
            final int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            final Coordinates coordinates = findCoordinatesFunction.apply(keypadArray, n);

            if (i > 0) {
                assert previousCoordinates != null;

                final int xDiff = Math.abs(coordinates.getX() - previousCoordinates.getX());
                final int yDiff = Math.abs(coordinates.getY() - previousCoordinates.getY());

                assert Math.max(xDiff, yDiff) <= 2;
                seconds += Math.max(xDiff, yDiff);
            }
            previousCoordinates = coordinates;
        }
        return seconds;
    }

    private static final BiFunction<int[][], Integer, Coordinates> findCoordinatesFunction = (keypadArray, number) -> {
        // assert keypadArray dimensions
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (keypadArray[i][j] == number) {
                    return new Coordinates(i, j);
                }
            }
        }
        throw new RuntimeException();
    };

    private static class Coordinates {
        private int x;
        private int y;

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
