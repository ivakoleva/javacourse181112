package com.musala.javacourse181112;

public class LoopsExample {
    public static void main(final String[] args) throws InterruptedException {

        /*while (true) {
            System.out.println("hi");
            Thread.sleep(1000 * 5); //1 second == 1000 ms
        }*/
        do{
            System.out.println("asd");
            Thread.sleep(1000*5);
        }while(true); //while(false) ще се изпълни поне веднъж
    }
}