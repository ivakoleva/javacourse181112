package com.musala.javacourse181112.patterns;

import java.util.ArrayList;

public class PatternsExample {
    public static void main(String[] args) {

    }

    public static class ArrayListWrapper<T> { // <T> is to ensure that the field is the same type as the ArrayListWrapper
        private ArrayList<T> arrayListWrapper = new ArrayList<>();
        private long addCounter;

        //delegate add method to the wrapping collection
        public boolean add(T t) {
            final boolean result = arrayListWrapper.add(t);
            if (result) {
                addCounter++;
            }
            return result;
        }
    }

    public static class AddCountingArrayList {

    }
}
