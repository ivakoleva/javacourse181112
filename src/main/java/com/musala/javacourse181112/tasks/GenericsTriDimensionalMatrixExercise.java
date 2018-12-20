package com.musala.javacourse181112.tasks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iva Koleva on 17.12.2018
 */
public class GenericsTriDimensionalMatrixExercise {
    public static void main(final String[] args) {
        final int[][][] intArray =
                {
                        {
                                {1, 2, 3},
                                {1, 2, 3}
                        }
                };

        // TODO: using List, applying generics
        // List, containing elements of List, each element is List of Integers
        final List<List<List<Integer>>> triDimensionalList = new ArrayList<List<List<Integer>>>();
    }
}
