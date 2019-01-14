package com.musala.javacourse181112.tasks;

import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.max;

public class PriorityBlockingQueueExercise {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> integerPriorityBlockingQueue=new PriorityBlockingQueue<>();
        AtomicInteger numberOfProducer=new AtomicInteger(0);
        AtomicInteger numberOfConsumer=new AtomicInteger(0);
        AtomicBoolean producerBoolean=new AtomicBoolean(true);
        AtomicBoolean consumerBoolean=new AtomicBoolean(true);
        Runnable producerRunnable= () -> {
            int num=numberOfProducer.getAndIncrement();
            Thread.currentThread().setName("Producer Thread "+num);
            while(producerBoolean.get()){
                int offering = max((int)(Math.random()*100000),1);
                integerPriorityBlockingQueue.offer(offering);
                try {
                    integerPriorityBlockingQueue.forEach(i->System.out.println(i+" "+Thread.currentThread().getName()));
                    Thread.sleep(2000);

                } catch (InterruptedException ignore) {
                }
            }
            System.out.println("Exiting "+Thread.currentThread().getName()+".");
        };
        Runnable consumerRunnable= () -> {
            int num=numberOfConsumer.getAndIncrement(),i=0;
            Thread.currentThread().setName("Consumer Thread "+num);
            while (consumerBoolean.get()){
                if(!integerPriorityBlockingQueue.isEmpty())
                {
                    System.out.print(integerPriorityBlockingQueue.poll()+" ");
                }
                if(i%10==0){
                    System.out.println();
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ignore) {
                }
                i++;
            }
            System.out.println("Exiting "+Thread.currentThread().getName()+".");
        };
        BiFunction<Runnable,Integer, List<Thread>> populateListThreads= new BiFunction<Runnable, Integer, List<Thread>>() {
            public List<Thread> apply(Runnable runnable, Integer count) {
                List<Thread> threads=new LinkedList<>();
                for(int i=0;i<count;i++){
                    threads.add(new Thread(runnable));
                }
                return threads;
            }
        };
        List<Thread> producers= populateListThreads.apply(producerRunnable,2);
        List<Thread> consumers= populateListThreads.apply(consumerRunnable,2);
        Consumer<List<Thread>> doMethodsStartAndJoinListOfThreads= (threads) -> {
            Iterator<Thread> threadIterable=threads.iterator();
            for(;threadIterable.hasNext();){
                Thread currentThread=threadIterable.next();
                currentThread.start();
            }
        };
        doMethodsStartAndJoinListOfThreads.accept(producers);
        doMethodsStartAndJoinListOfThreads.accept(consumers);

    }
}
