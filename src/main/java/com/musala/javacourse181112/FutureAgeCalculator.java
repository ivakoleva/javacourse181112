package com.musala.javacourse181112;

public class FutureAgeCalculator {
    public static void main(final String[] args) {
       System.out.println("Input parameters: " + args[0] + " " + args[1]);

        final int age = Integer.parseInt(args[0]);
        final int yearToAdd = Integer.parseInt(args[1]);
        int i=0;
        int a=0;
        System.out.println("Future age calculated: " + (age + yearToAdd));
        do {
            a += Integer.parseInt(args [i++]);
        } while (i<args.length);
        System.out.println("The age is: " + (a));

        /*System.out.println("Future age calculated: " +
                (Integer.parseInt(args[0]) +
                        Integer.parseInt(args[1])));*/
        System.exit(0);;
    }
}
