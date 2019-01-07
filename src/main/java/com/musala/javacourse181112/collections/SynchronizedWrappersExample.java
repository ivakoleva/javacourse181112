package com.musala.javacourse181112.collections;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedWrappersExample {
    private static final List<String> STRING_LIST = new ArrayList<>();
    private static final int PRODUCED_STRINGS_MAX_COUNT = 10;

    public static void main(final String[] args) {

//        final Thread producerThread = new Thread(() -> {
//            int i = 0;
////            while (!Thread.interrupted() + i++<PRODUCED_STRINGS_MAX_COUNT) {
//
//            }
//        });
//        final Thread consumerThread = new Thread();
//
//        // starting the empty run oop of the Threads
//        producerThread.start();
//        consumerThread.start();
//
//        //joining to the main thread
//        try {
//            producerThread.join();
//            consumerThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.exit(0);
//    }
//
//    private static class ProducerRunnable implements Runnable {
//        @Override
//        public void run () {
//
//        }
    }
}