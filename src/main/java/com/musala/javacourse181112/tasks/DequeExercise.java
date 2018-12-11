package com.musala.javacourse181112.tasks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExercise {
    public static void main(String[] args) {
        arrayDeque();
        linkedList();
    }
    private static void arrayDeque(){
        Deque<Integer> integerDeque=new ArrayDeque<>();
        for(int i=0;i<10;i++){
            if(i%2==0){
                integerDeque.offerFirst(i);
            }
            else{
                integerDeque.offerLast(i);
            }
        }
        Iterator<Integer> integerDequeIterator=integerDeque.iterator();
        for(;integerDequeIterator.hasNext();){
            if(integerDequeIterator.next()>=4){
                integerDequeIterator.remove();
            }
        }
    }
    private static void linkedList(){
        Deque<Integer> integerDeque=new LinkedList<>();
        for(int i=0;i<=10;i++){
            if(i%2==0){
                integerDeque.offerFirst(i);
            }
            else{
                integerDeque.offerLast(i);
            }
        }
        Iterator<Integer> integerDequeIterator=integerDeque.iterator();
        for(;integerDequeIterator.hasNext();){
            if(integerDequeIterator.next()<=4){
                integerDequeIterator.remove();
            }
        }
    }
}
