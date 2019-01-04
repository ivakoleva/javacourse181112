package com.musala.javacourse181112.PIK3.ZadachiZaKontrolno.Zadacha2;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zadacha2 {
    public static void main(String[] args) {
        int n, m, q, p;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N=");
        n = scanner.nextInt();
        System.out.print("M=");
        m = scanner.nextInt();
        System.out.print("Q=");
        q = scanner.nextInt();
        System.out.print("P=");
        p = scanner.nextInt();

        final Monitor monitor = new Monitor(n);
        AtomicInteger counter = new AtomicInteger(0);

        Runnable producerRunnable = new Runnable() {
            @Override
            public void run() {
                while (!monitor.getThreadInterrupted()) {
                    monitor.putMeal();
                    //System.out.println("Producer on " + monitor.getThreadInterrupted()+" "+Thread.currentThread().getName());
                }
                System.out.println("Producer off" + " " + Thread.currentThread().getName());
            }
        };

        Runnable consumerRunnable = new Runnable() {
            @Override
            public void run() {
                monitor.getMeals(m);
                counter.incrementAndGet();
                //System.out.println("Counter=" + counter.get());
            }
        };

        List<Thread> producerThreadList = IntStream.range(0, p).boxed().map(i -> new Thread(producerRunnable)).collect(Collectors.toList());
        List<Thread> consumerThreadList = IntStream.range(0, q).boxed().map(i -> new Thread(consumerRunnable)).collect(Collectors.toList());

        Thread controllingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (counter.get() != q) {
                    //System.out.println(counter);
                }
                monitor.setThreadInterrupted(true);
                //monitor.signalConditions();
                System.out.println("Out of while");
            }
        });
        controllingThread.start();

        for (Thread thread : Stream.concat(producerThreadList.stream(), consumerThreadList.stream()).collect(Collectors.toSet())) {
            thread.start();
        }

        try {
            if (!controllingThread.isInterrupted()) {
                System.out.println("Thread joined");
                controllingThread.join();
            }
        } catch (InterruptedException e) {
            System.out.println("Can not join controller");
        }
        for (Thread thread : consumerThreadList) {
            if (!thread.isInterrupted()) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Thread " + thread.getName() + " already stopped");
            }
        }

        while (!monitor.getThreadInterrupted()) {
        }
        for (Thread thread : producerThreadList) {
            if (!thread.isInterrupted()) {
                thread.interrupt();
            }
        }


        System.out.println("Exit");
    }
}

class Monitor {
    private ReentrantLock lock = new ReentrantLock();
    private final int n;
    private int meals;
    private int count = 0;
    private final Condition notFull = lock.newCondition();
    private final Condition notEmpty = lock.newCondition();
    private AtomicBoolean threadInterrupted;

    public Monitor(int n) {
        this.n = n;
        meals = 0;
        threadInterrupted = new AtomicBoolean(false);
    }

    public void putMeal() {
        lock.lock();
        try {
            while (!threadInterrupted.get() && meals == n) {
                notFull.await();
                //System.out.println("In while");
            }
            if (!threadInterrupted.get()) {
                meals++;
                //System.out.println("putMeals:Meals=" + meals);

            }
            notEmpty.signal();
        } catch (InterruptedException e) {
            System.out.println("Exception in putMeal.");
        } finally {
            lock.unlock();
        }
    }

    public void getMeals(int m) {
        lock.lock();
        try {
            while (meals == 0 && !threadInterrupted.get()) {
                notEmpty.await();
            }
            if (!threadInterrupted.get()) {
                meals--;
                count++;
            }
            notFull.signal();
        } catch (InterruptedException e) {
            System.out.println("Exception in getMeals.");
        } finally {
            lock.unlock();
        }
    }

    public void setThreadInterrupted(Boolean threadInterrupted) {
        this.threadInterrupted.set(threadInterrupted);
    }

    public Boolean getThreadInterrupted() {
        return threadInterrupted.get();
    }

}
