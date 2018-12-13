package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicInteger;
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
        AtomicInteger index=new AtomicInteger(0);
        ConcurrentMap<Long,String> concurrentMap=new ConcurrentHashMap<>();
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(!Thread.interrupted()){
                    long time=System.currentTimeMillis();
                    concurrentMap.put(time,"Current time:"+time);
                    System.out.println(2);
                }
                System.out.println("Producer thread exited.");
            }
        });
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                Iterator<Map.Entry<Long, String>> mapIterator= concurrentMap.entrySet().iterator();
                for(int i=0;i<10;){
                    if(mapIterator.hasNext()){
                        Map.Entry<Long,String> element=mapIterator.next();
                        System.out.println(element.getKey()+"->"+element.getValue());
                        i++;
                    }

                    System.out.println(1);
                }
                System.out.println("Consumer thread exited.");
                producerThread.interrupt();
            }
        });
        producerThread.start();
        consumerThread.start();
        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException ignore) {
        }
    }

}
@Deprecated
class SingletonMapEntry {

    public Map<Integer, Integer> getInstance() {
        return Collections.singletonMap(1,1);
    }
}