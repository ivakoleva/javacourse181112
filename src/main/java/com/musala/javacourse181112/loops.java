package com.musala.javacourse181112;


public class loops {
    public static void main(String[] args) {
        int value[] = {1,2,3,};
        usingWhile(value);
        usingDoWhile(value);
        usingFor(value);
        usingForeach(value);

    }


    public static void usingFor(int[] valueFor) {
        for(int limiterFor=0;limiterFor<valueFor.length;limiterFor++){
            System.out.println("Printing in For: " + valueFor);
        }
    }

    private static void usingDoWhile(int[] valueDoWhile) {
        int limiterDoWhile=0;
        do {
           ++limiterDoWhile;


        }while(limiterDoWhile<valueDoWhile.length);{
            System.out.println("Printing in Do-while: " + valueDoWhile);
            limiterDoWhile++;
        }


    }

    public static void usingWhile(int[] valueWhile) {
        int limiter = 0;
        while (limiter < valueWhile.length) {
            System.out.println("Printing in While: " + valueWhile);
            limiter++;

        }
    }
    public static void usingForeach(int [] valueForeach){
        for(int limiterForeach:valueForeach){
            System.out.println("Printing in Foreach: " + valueForeach);
        }

    }
}