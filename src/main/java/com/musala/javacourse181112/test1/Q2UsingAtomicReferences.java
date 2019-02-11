package com.musala.javacourse181112.test1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

/**
 * Created by Iva Koleva on 04.02.2019
 * <br>
 * <b>Note:</b> hackerrank had issues with atomic reference class API implementations, that is why we have both implementations -
 * using classic for loops and mutable local variables; and using lambda in combination with Atomic* instances
 */
public class Q2UsingAtomicReferences {
    private static final int KEYPAD_SQUARE_DIMENSION = 3;

    // sample test runner method
    public static void main(final String[] args) {
        System.out.println(
                entryTime("123456789", "123456789"));
    }

    private static Consumer<BiConsumer<Integer, Integer>> dimensionsConsumer = dimensionsBiConsumer -> {
        for (int i = 0; i < KEYPAD_SQUARE_DIMENSION; i++) {
            for (int j = 0; j < KEYPAD_SQUARE_DIMENSION; j++) {
                dimensionsBiConsumer.accept(i, j);
            }
        }
    };

    private static final BiFunction<int[][], Integer, Coordinates> findCoordinatesFunction = (keypadArray, number) -> {
        final AtomicReference<Coordinates> coordinatesAtomicReference = new AtomicReference<>();
        dimensionsConsumer.accept((x, y) -> {
            if (keypadArray[x][y] == number) {
                coordinatesAtomicReference.set(new Coordinates(x, y));
            }
        });
        assert coordinatesAtomicReference.get() != null;
        return coordinatesAtomicReference.get();
    };

    public static int entryTime(final String s, final String keypad) {
        /*assert keypad != null;
        assert keypad.length() == 9;
        assert keypad.chars().boxed().distinct().count() == 9;
        assert keypad.chars().boxed().filter(i -> 0 >= i && i <= 9).count() == 9;*/

        // populate keypadArray
        final int[][] keypadArray = new int[KEYPAD_SQUARE_DIMENSION][KEYPAD_SQUARE_DIMENSION];
        final AtomicInteger charPositionAtomicInteger = new AtomicInteger();
        dimensionsConsumer.accept((x, y) ->
                keypadArray[x][y] = Integer.parseInt(String.valueOf(keypad.charAt(charPositionAtomicInteger.getAndIncrement()))));

        // calculate seconds
        final AtomicReference<Coordinates> previousCoordinatesAtomicReference = new AtomicReference<>();
        final AtomicInteger secondsAtomicInteger = new AtomicInteger();
        s.chars().forEach(c -> {
            final Coordinates coordinates = findCoordinatesFunction.apply(
                    keypadArray,
                    Integer.parseInt(String.valueOf((char) c)));

            if (previousCoordinatesAtomicReference.get() != null) {
                final Coordinates previousCoordinates = previousCoordinatesAtomicReference.get();
                assert previousCoordinates != null;

                final int xDiff = Math.abs(coordinates.getX() - previousCoordinates.getX());
                final int yDiff = Math.abs(coordinates.getY() - previousCoordinates.getY());
                assert Math.max(xDiff, yDiff) <= 2;
                secondsAtomicInteger.getAndAdd(Math.max(xDiff, yDiff));
            }

            previousCoordinatesAtomicReference.set(coordinates);
        });
        return secondsAtomicInteger.get();
    }

    private static class Coordinates {
        private int x;
        private int y;

        public Coordinates(final int x, final int y) {
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
