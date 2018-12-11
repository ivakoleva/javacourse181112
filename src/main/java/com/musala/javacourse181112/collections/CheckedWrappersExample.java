package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class CheckedWrappersExample {
//    public static void main(final String[] args) {
//        //raw
//        final Collection rawCollection = new ArrayList();
//        ((ArrayList) rawCollection).add(1);
//        ((ArrayList) rawCollection).add("asd");
//
//        //using generics
//        final Collection<Integer> integerCollection = new ArrayList<>();
//        ((ArrayList<Integer>) integerCollection).add(1);
////        ((ArrayList<Integer>) integerCollection).add("asd"); - cannot add "asd" cause Integer is expected
//
//        addIntegerToCollection(Collection.checkedCollection(integerCollection, Integer.class));
//
//        final Optional<Integer> collectionElementsSumOptional = integerCollection.stream().reduce((i1, i2) -> (i1 + i2));//get all the elements
//    }
//
//    private static void addIntegerToCollection (final Collection<Integer> integerCollection) {
//        // legit usage of the collection
//        integerCollection.add(1);
//
//        //raw collection workaround
//        final Collection collection = integerCollection;
//        collection.add("String");
//    }
}
