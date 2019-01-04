package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Zadacha3;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Math.max;

public class Zadacha3 {
    public static void main(final String[] args) {

        final Monitoring monitor = new Monitoring(3, 10, 10);

        final Thread boysThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    if (monitor.isBoysTurn()) {
                        monitor.boysTurn();
                    }
                }
            }
        });
        final Thread girlsThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()) {
                    if (monitor.isGirlsTurn()) {
                        monitor.girlsTurn();
                    }
                }
            }
        });

        boysThread.start();
        girlsThread.start();

        try {
            boysThread.join();
            girlsThread.join();
        } catch (InterruptedException ignore) {
            //   e.printStackTrace();
        }

        System.out.println("Exit");
    }
}

class Monitoring {
    private final int spaceInBath;
    private final AtomicInteger boysInQueue = new AtomicInteger();
    private final AtomicInteger girlsInQueue = new AtomicInteger();
    private final Semaphore mutex = new Semaphore(1);

    Monitoring(int spaceInBath, int boysCount, int girlsCount) {
        this.spaceInBath = spaceInBath;
        this.boysInQueue.set(boysCount);
        this.girlsInQueue.set(girlsCount);
    }

    boolean isBoysTurn() {
        return boysInQueue.get() >= girlsInQueue.get();
    }

    boolean isGirlsTurn() {
        return boysInQueue.get() <= girlsInQueue.get();
    }

    void boysTurn() {
        if (boysInQueue.get() == 0) {
            Thread.currentThread().interrupt();
            System.out.println("Boys thread interrupted");
        } else {
            try {
                mutex.acquire();
                boysInQueue.set(max(0, boysInQueue.get() - spaceInBath));
                System.out.println("Boys=" + boysInQueue.get());
            } catch (InterruptedException e) {
                System.out.println("Boys thread already interrupted");
            } finally {
                mutex.release();
            }
        }
    }

    void girlsTurn() {
        if (girlsInQueue.get() == 0) {
            Thread.currentThread().interrupt();
            System.out.println("Girls thread interrupted");
        } else {
            try {
                mutex.acquire();
                girlsInQueue.set(max(girlsInQueue.get() - spaceInBath, 0));
                System.out.println("Girls=" + girlsInQueue.get());
            } catch (InterruptedException e) {
                System.out.println("Girls thread already interrupted");
            } finally {
                mutex.release();
            }
        }
    }
}