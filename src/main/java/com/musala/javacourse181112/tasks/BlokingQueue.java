package com.musala.javacourse181112.tasks;

import com.musala.javacourse181112.samples.homework.RomanNumerals;

import java.util.NoSuchElementException;
import java.util.concurrent.PriorityBlockingQueue;

public  class BlokingQueue {
    public static void main(String[] args) {
        new Consumer(resourse).start();
        new Producer(resourse).start();


    }
    static PriorityBlockingQueue<Integer> resourse= new PriorityBlockingQueue<>();
    static class Producer extends Thread{
        private PriorityBlockingQueue resourse;
        public void run(){
            while(true){

                try {
                    Thread.sleep(2000);
                     resourse.add(1);
                     resourse.add(6);
                     resourse.add(55);
                     resourse.add(999);
                    System.out.println(resourse);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }
        public Producer(PriorityBlockingQueue resourse){
            this.resourse=resourse;
        }

    }
    static class Consumer extends Thread{

        private PriorityBlockingQueue resourse;
        public void run(){
            while (true){

                try {
                    Thread.sleep(2000);
                    resourse.remove();
                    System.out.println(resourse);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                catch ( NoSuchElementException  ignore){

                }
            }
        }
        public Consumer(PriorityBlockingQueue resourse){
            this.resourse=resourse;
        }
    }
}

