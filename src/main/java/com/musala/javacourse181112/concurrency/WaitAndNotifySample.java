package com.musala.javacourse181112.concurrency;

/**
 * Created by Iva Koleva on 21.01.2019
 */
public class WaitAndNotifySample {
    private static final Integer[] integerElementArray = new Integer[1];
    //private static final Object monitor = new Object();

    public static void main(final String[] args) {
        final Runnable consumerRunnable = () -> {
            while (!Thread.currentThread().isInterrupted()) {
                synchronized (integerElementArray) {
                    try {
                        while (integerElementArray[0] == null && !Thread.currentThread().isInterrupted()) {
                            integerElementArray.wait(1000);
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(integerElementArray[0] != null) {
                        System.out.println(integerElementArray[0]);
                        integerElementArray[0] = null;
                        integerElementArray.notify();
                    }
                }
            }
            System.out.println("Exiting consumer thread...");
        };
        final Thread consumerThread = new Thread(consumerRunnable);

        final Runnable producerRunnable = () -> {
            int count = 0;
            while (count < 10 && !Thread.currentThread().isInterrupted()) {
                synchronized (integerElementArray) {
                    while (integerElementArray[0] != null) {
                        try {
                            integerElementArray.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    integerElementArray[0] = count++;
                    integerElementArray.notify();
                }
            }
            consumerThread.interrupt();
            System.out.println("Exiting producer thread...");
        };
        final Thread producerThread = new Thread(producerRunnable);

        consumerThread.start();
        producerThread.start();

        try {
            consumerThread.join();
            producerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting...");
    }
}
