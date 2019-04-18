package com.musala.javacourse181112.FirstPartJava.patterns;

import java.util.ArrayList;

/**
 * Created by Iva Koleva on 10.12.2018
 */
public class WrapperExample {
    public static void main(final String[] args) {
        final AddCountingArrayListWrapper<Integer> integerAddCountingArrayListWrapper = new AddCountingArrayListWrapper<>();
        integerAddCountingArrayListWrapper.add(1);
        integerAddCountingArrayListWrapper.add(2);
        //integerAddCountingArrayListWrapper.remove <- needs to be explicitly exposed

        final AddCountingArrayList<Integer> integerAddCountingArrayList = new AddCountingArrayList<>();
        integerAddCountingArrayList.add(1);
        integerAddCountingArrayList.add(2);
        integerAddCountingArrayList.remove(0);
    }

    // adding features by wrapping an instance
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

    // classical extending approach
    public static class AddCountingArrayList<T> extends ArrayList<T> {
        private long addCounter;

        public long getAddCounter() {
            return addCounter;
        }

        @Override
        public boolean add(final T t) {
            final boolean result = super.add(t);
            if (result) {
                addCounter++;
            }
            return result;
        }

        // cannot narrow scope of visibility
        /*@Override
        protected int size() {
            return super.size();
        }*/
    }
}
