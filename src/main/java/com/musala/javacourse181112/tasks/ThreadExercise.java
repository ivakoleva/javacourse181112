package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 ** spawning two threads, sharing a map instance
 *** Long key - current system millis
 *** String message
 *** when adding entries, do runtime type check of elements explicitly
 ** producer thread populating unlimited values on each 3 seconds
 ** consumer thread
 *** reads 10 map entries
 *** prints them on stdout
 *** interrupts producer thread
 ** main thread exits with 0
 */
public class ThreadExercise {
    public static void main(String[] args) {
        Map<Integer, Integer> myMap = new HashMap<>();
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!Thread.interrupted()) {
                    myMap.put(SingletonInt.getInstance() + i, SingletonInt.getInstance() + i);
                    i++;
                    try{
                        Thread.sleep(3000);
                    }catch (Exception ignore){

                    }
                }
            }
        });


        producerThread.start();
        try {
            producerThread.join();
        } catch (InterruptedException ignore) {
        }
        final Iterator myMapEntrySetIterator = myMap.entrySet().iterator();
        final Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; ; ) {
                    if(myMapEntrySetIterator.hasNext()) {
                      //  Map.Entry<Integer, Integer> l = (Map.Entry<Integer, Integer>) myMapEntrySetIterator.next();
                        //System.out.println(l.getKey() + "->" + l.getValue());
                        i++;
                    }
                    //System.out.println(2);
                }
                //producerThread.interrupt();
            }
        });
        consumerThread.start();
        try {

            consumerThread.join();
        }catch (InterruptedException ignore) {
        }
    }
}

class SingletonInt {
    private static int anInt = 0;

    private SingletonInt() {

    }

    public static int getInstance() {
        return anInt;
    }
}