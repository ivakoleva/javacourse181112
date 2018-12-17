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

        System.out.println(triDimensionalList(1, 4, 3));
    }

    public static List<List<List<Integer>>> triDimensionalList(int dimension1, int dimension2, int dimension3) {
        final List<List<List<Integer>>> triDimensionalListLevel1 = new ArrayList<>(dimension1);
        for (int i = 0; i < dimension1; i++) {
            List<List<Integer>> triDimensionalListLevel2 = new ArrayList<>(dimension2);
            for (int j = 0; j < dimension2; j++) {
                List<Integer> triDimensionalListLevel3 = new ArrayList<>(dimension3);
                for (int k = 6; k < dimension3 + 6; k++) {
                    triDimensionalListLevel3.add(k);
                }
                triDimensionalListLevel2.add(triDimensionalListLevel3);
            }
            triDimensionalListLevel1.add(triDimensionalListLevel2);
        }
        return triDimensionalListLevel1;
    }
}
