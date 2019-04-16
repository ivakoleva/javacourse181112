package com.musala.javacourse181112.SecondPart.Mobile;

public abstract class Modem implements Testable{

    private String name;

    public Modem(String name) {
        this.name = name;
    }

    /*public abstract void init(); */
    public void init(){
        System.out.println("init "+ name);
    }

    @Override
    public void test(){
        System.out.println("testing: "+ name);
    }
}

