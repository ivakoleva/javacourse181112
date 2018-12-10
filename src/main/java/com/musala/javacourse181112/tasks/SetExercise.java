package com.musala.javacourse181112.tasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*
     ** Populate an instance per general-purpose collection implementations
         *** Set (HashSet, TreeSet, LinkedHashSet
     ** Loop a collection/map and modify (remove an element/entry while looping)
     ** Apply add/put remove contains size isEmpty etc.
 */
public class SetExercise {
    public static void main(String[] args) {
        //HashSetExercise();
        //TreeSetExercise();
        LinkedHashSetExercise();
    }
    private static void HashSetExercise(){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int i=0;i<=10;i++){
            hashSet.add(i);
        }
        System.out.println("HashSet Populated:");
        hashSet.forEach(i->System.out.print(i+" "));
        System.out.println(System.lineSeparator()+"After filtering elements:");
        final Predicate<Integer> predicate=(i)-> i%2==0;
        hashSet=(HashSet<Integer>) hashSet.stream().filter(predicate).collect(Collectors.toSet());
        hashSet.forEach(i-> System.out.print(i+" "));
        System.out.println(System.lineSeparator()+"After removing elements:");
        Iterator<Integer> hashSetIterator=hashSet.iterator();
        for(;hashSetIterator.hasNext();){

            if(hashSetIterator.next()%3==0){
                hashSetIterator.remove();
            }
        }
        hashSet.forEach(i->System.out.print(i+" "));
        System.out.println();
        return;
    }
    private static void TreeSetExercise(){
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int i=0;i<10;i++){
            treeSet.add(i);
        }
        System.out.println("TreeSet Populated:");
        treeSet.forEach(i->System.out.print(i+" "));
        System.out.println(System.lineSeparator()+"After removing elements:");
        Iterator<Integer> treeSetIterattor=treeSet.iterator();
        for(;treeSetIterattor.hasNext();){
            if(treeSetIterattor.next()%4==0){
                treeSetIterattor.remove();
            }
        }
        treeSet.forEach(i-> System.out.print(i+" "));
        System.out.println();
        return;
    }
    private static void LinkedHashSetExercise(){
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        for(int i=1;i<=10;i++){
            linkedHashSet.add(i);
        }
        System.out.println("LinkedHashSet populated:");
        linkedHashSet.forEach(i-> System.out.print(i+" "));
        System.out.println(System.lineSeparator()+"After removing elements:");
        Iterator<Integer> linkedHashSetIterator=linkedHashSet.iterator();
        boolean l=true;
        for(Object o = (linkedHashSetIterator.hasNext()) ? linkedHashSetIterator.next() : (l=false); linkedHashSetIterator.hasNext()&&l; o=linkedHashSetIterator.next()){
            if(o instanceof Integer&&(int)o %5==0){
                linkedHashSetIterator.remove();
            }
        }
        linkedHashSet.forEach(i-> System.out.print(i+" "));
        System.out.println();
        return;
    }
}
