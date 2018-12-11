package com.musala.javacourse181112.patterns;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PatternsExample {
    public static void main(String[] args) {
        final AddCountingArrayListWrapper<Integer> integerAddCountingArrayListWrapper = new AddCountingArrayListWrapper<>();

    }

    public static class AddCountingArrayListWrapper<T> {
        private ArrayList<T> arrayListWrapped = new ArrayList<>();
        private long addCounter;

        public long getAddCounter() {
            return addCounter;
        }

        public boolean add(T t) {
            final boolean result = arrayListWrapped.add(t);
            if (result) {
                addCounter++;
            }
            return result;
        }
    }

    public static class AddCountingArrayListWrapper1<T> extends ArrayList<T> {
        private ArrayList<T> arrayListWrapped = new ArrayList<>();
        private long addCounter;

        public long getAddCounter() {
            return addCounter;
        }

        @Override
        public boolean add(T t) {
            final boolean result = super.add(t);
            if (result) {
                addCounter++;
            }
            return result;
        }
//        Cant narrow down the
//        @Override
//        protected int size(){
//            return super.size();
//        }
    }
}
