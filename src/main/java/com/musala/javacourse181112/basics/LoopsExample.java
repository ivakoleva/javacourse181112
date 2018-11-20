package com.musala.javacourse181112.basics;

public class LoopsExample {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println("hi");
            Thread.sleep(1000*5);
            break;
        }

        do{
            System.out.println("asd");
            Thread.sleep(1000*2);
        }while(false);
    }
}