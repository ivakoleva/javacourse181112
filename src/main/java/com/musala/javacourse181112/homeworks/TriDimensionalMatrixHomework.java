package com.musala.javacourse181112.homeworks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriDimensionalMatrixHomework {
    public static void main(final String[] args) {
        final int[][][] intArray =
                {
                        {
                                {1, 2, 3},
                                {1, 2, 3}
                        }
                };

        List<List<List<Integer>>> listListListInteger = new ArrayList<>();
        multiDimensionalListMaker(3, 5);
        System.out.println();

        // TODO: using List, applying generics
    }

    public static List<Object> multiDimensionalListMaker(final int n, final int n2) {
        if (n == 1) {
            List<Object> listListList = new ArrayList<>();
            for (int i = 0; i < n2; i++) {
                listListList.add(i);
            }
            return listListList;
        }
        List<Object> listListList = new ArrayList<>();
        for (int i = 0; i < n2; i++) {
            listListList.add(multiDimensionalListMaker(n - 1, n2));
            if (n == 1) ;
            return listListList;
        }

        return listListList;
    }
}
