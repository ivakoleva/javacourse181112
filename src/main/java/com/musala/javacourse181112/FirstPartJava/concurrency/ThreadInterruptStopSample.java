package com.musala.javacourse181112.FirstPartJava.concurrency;

/**
 * Created by Iva Koleva on 21.01.2019
 */
public class ThreadInterruptStopSample {
    public static void main(final String[] args) throws InterruptedException {
        /*final CustomThread thread = new CustomThread();
        thread.start();

        Thread.sleep(1000 * 2);
        // stop is deprecated.
        thread.stop();
        System.out.println();*/

        final Thread thread = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Custom thread");
        thread.start();
        Thread.sleep(1000 * 2);
        // stop is deprecated.
        thread.interrupt();
        thread.join();
        System.out.println();
    }

    // modern way would be implementing Runnable
    private static class CustomThread extends Thread {
        @Override
        public void run() {
            while(true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
