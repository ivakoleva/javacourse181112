package com.musala.javacourse181112;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class loops {
    public static void main(String[] args) {
        int value[] = {1,2,3};
        usingWhile(value);
        usingFor(value);
        usingForeach(value);
        usingDoWhile(value);
        usingLandaForeach();
        usingIterator();

    }


    public static void usingFor(int[] valueFor) {
        for(int limiterFor=0;limiterFor<valueFor.length;limiterFor++){
            System.out.println("Printing in For: " + valueFor[limiterFor]);
        }
    }

    public static void usingDoWhile(int[] valueDoWhile) {
        int limiterDoWhile=0;
        do {
            System.out.println("Printing in Do-while: " + valueDoWhile[limiterDoWhile]);
            limiterDoWhile++;


        }while(limiterDoWhile<valueDoWhile.length);{

        }


    }

    public static void usingWhile(int[] valueWhile) {
        int limiter = 0;
        while (limiter < valueWhile.length) {
            System.out.println("Printing in While: " + valueWhile[limiter]);
            limiter++;

        }
    }
    public static void usingForeach(int [] valueForeach){
        for(int limiterForeach:valueForeach) System.out.println("Printing in Foreach: " + limiterForeach);

    }
    public static void usingLandaForeach(){
        List<Integer>item=new ArrayList<>();
        item.add(5);
        item.add(4);
        item.add(3);
        item.forEach( System.out::println);
    }
    public static void usingIterator(){
        List<String>item=new ArrayList<>();
        item.add("aj");
        item.add("b");
        item.add("c");
        Iterator<String> iterator=item.iterator();
        while( iterator.hasNext()){



            if((iterator.next().length()%2==0)){
                iterator.remove();
            }

        }
        System.out.println(item);
     }
}

